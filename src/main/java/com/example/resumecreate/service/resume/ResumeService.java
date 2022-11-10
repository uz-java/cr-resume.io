package com.example.resumecreate.service.resume;

import com.example.resumecreate.domains.Picture;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:55 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Service
public interface ResumeService {
    ResumeDTO create(ResumeCreateDTO dto);

    Picture attachPicture(MultipartFile file, Long resumeId);

    byte[] generateAsPDF(Long resumeId);
}
