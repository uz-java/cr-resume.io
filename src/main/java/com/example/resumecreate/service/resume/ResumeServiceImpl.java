package com.example.resumecreate.service.resume;

import com.example.resumecreate.domains.Picture;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
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
    @Override
    public ResumeDTO create(ResumeCreateDTO dto) {
        return null;
    }

    @Override
    public Picture attachPicture(MultipartFile file, Long resumeId) {
        return null;
    }

    @Override
    public byte[] generateAsPDF(Long resumeId) {
        return new byte[0];
    }
}
