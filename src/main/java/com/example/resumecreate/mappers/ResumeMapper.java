package com.example.resumecreate.mappers;

import com.example.resumecreate.domains.Resume;
import com.example.resumecreate.dtos.resume.ResumeCreateDTO;
import com.example.resumecreate.dtos.resume.ResumeDTO;
import org.mapstruct.Mapper;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:52 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface ResumeMapper {

    Resume fromCreateDTO(ResumeCreateDTO dto);
    ResumeDTO fromResume(Resume resume);
}
