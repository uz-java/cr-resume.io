package com.example.resumecreate.dtos;

import lombok.*;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:42 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceCreateDTO {
    private String date;
    private String company;
    private String description;
}
