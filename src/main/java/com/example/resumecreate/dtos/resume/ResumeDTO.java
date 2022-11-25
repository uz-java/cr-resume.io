package com.example.resumecreate.dtos.resume;

import com.example.resumecreate.domains.*;
import lombok.*;

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
public class ResumeDTO {

    private Long id;
    private Header header;
    private String templateName;
    private String about;
    private List<Skill> skills;
    private List<SocialMediaAccount> socialMediaAccounts;
    private List<Education> educations;
    private List<Experience> experiences;
}
