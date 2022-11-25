package com.example.resumecreate.dtos.resume;

import com.example.resumecreate.dtos.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:41 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResumeCreateDTO {

    private HeaderCreateDTO header;
    private String templateName;
    private String about;
    private List<SkillCreateDTO> skills;
    private List<SocialMediaAccountCreateDTO> socialMediaAccounts;
    private List<EducationCreateDTO> educations;
    private List<ExperienceCreateDTO> experiences;
    private List<LanguageCreateDTO> languages;
    private MultipartFile file;
}
