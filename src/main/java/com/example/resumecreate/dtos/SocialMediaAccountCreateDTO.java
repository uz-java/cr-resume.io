package com.example.resumecreate.dtos;

import lombok.*;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:45 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialMediaAccountCreateDTO {
    private String name;
    private String url;
}
