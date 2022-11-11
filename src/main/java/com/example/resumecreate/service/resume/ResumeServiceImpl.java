package com.example.resumecreate.service.resume;

import com.example.resumecreate.domains.Picture;
import com.example.resumecreate.domains.Resume;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
import com.example.resumecreate.mappers.ResumeMapper;
import com.example.resumecreate.repository.ResumeRepository;
import com.example.resumecreate.service.file.FileService;
import com.example.resumecreate.utils.TemplateUtils;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:55 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService{
    private final ResumeMapper resumeMapper;
    private final ResumeRepository repository;
    private final FileService fileService;
    @Override
    public ResumeDTO create(ResumeCreateDTO dto) {
        Resume resume = resumeMapper.fromCreateDTO(dto);
        Resume save = repository.save(resume);
        ResumeDTO resumeDTO = resumeMapper.fromResume(save);
        return resumeDTO;
    }

    @Override
    public Picture attachPicture(MultipartFile file, Long resumeId) {
        Picture picture = fileService.uploadPicture(file);
        Resume resume = repository.findById(resumeId).orElseThrow(() -> new RuntimeException("Resume not found id: " + resumeId));
        resume.setPicture(picture);
        repository.save(resume);
        return picture;
    }

    @Override
    public byte[] generateAsPDF(Long resumeId) {
        Resume resume = repository.getReferenceById(resumeId);
        Template template = TemplateUtils.getTemplate(resume.getTemplateName());
        try(FileOutputStream pdfStream=new FileOutputStream("resume.pdf")) {
            String responsePage = FreeMarkerTemplateUtils.processTemplateIntoString(template, Map.of("resume", resume));
            System.out.println(responsePage);
            PdfWriter pdfWriter=new PdfWriter(pdfStream);
            PdfDocument document=new PdfDocument(pdfWriter);
            document.setDefaultPageSize(new PageSize(850f,1200f));
            ConverterProperties converterProperties=new ConverterProperties();
            converterProperties.setFontProvider(new DefaultFontProvider(true,true,true));
            HtmlConverter.convertToPdf(responsePage,document,converterProperties);
            FileInputStream fileInputStream=new FileInputStream("resume.pdf");
            byte[] response = fileInputStream.readAllBytes();
            fileInputStream.close();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Oops something went wrong");
        } catch (TemplateException e) {
            e.printStackTrace();
            throw new RuntimeException("Template not found");
        } finally {
            try {
                Files.deleteIfExists(Path.of("resume.pdf"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
