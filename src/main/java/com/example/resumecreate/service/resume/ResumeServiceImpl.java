package com.example.resumecreate.service.resume;

import com.example.resumecreate.domains.Picture;
import com.example.resumecreate.domains.Resume;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
import com.example.resumecreate.mappers.ResumeMapper;
import com.example.resumecreate.repository.ResumeRepository;
import com.example.resumecreate.service.file.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

        return new byte[0];
    }
}
