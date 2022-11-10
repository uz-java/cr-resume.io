package com.example.resumecreate.service.file;

import com.example.resumecreate.domains.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:54 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService{
    @Override
    public Picture uploadPicture(MultipartFile picture) {
        return null;
    }
}
