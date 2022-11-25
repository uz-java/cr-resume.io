package com.example.resumecreate.dtos;

import com.example.resumecreate.enums.Proficiency;
import lombok.*;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:43 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LanguageCreateDTO {

    private String name;
    private Proficiency proficiency;
}
