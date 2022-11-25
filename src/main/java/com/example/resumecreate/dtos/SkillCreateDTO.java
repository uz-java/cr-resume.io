package com.example.resumecreate.dtos;

import lombok.*;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:44 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillCreateDTO {

    private String name;
    private byte progress;
}
