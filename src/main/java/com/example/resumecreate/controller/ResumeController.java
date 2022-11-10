package com.example.resumecreate.controller;

import com.example.resumecreate.domains.Picture;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
import com.example.resumecreate.service.resume.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author "Tojaliyev Asliddin"
 * @since 10/11/22 23:30 (Thursday)
 * ResumeCreate/IntelliJ IDEA
 */
@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService service;

    @PostMapping(value = "/create", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<ResumeDTO> generateResume(@RequestBody ResumeCreateDTO dto) {
        ResumeDTO response = service.create(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(value = "/uploadPicture",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Picture> uploadPicture(@RequestParam("file")MultipartFile file,@RequestParam Long resumeId){
        Picture picture=service.attachPicture(file,resumeId);
        return new ResponseEntity<>(picture,HttpStatus.CREATED);
    }
}
