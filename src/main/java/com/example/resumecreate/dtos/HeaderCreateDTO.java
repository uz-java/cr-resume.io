package com.example.resumecreate.dtos;

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
public class HeaderCreateDTO {
    private String fullName;
    private String address;
    private String country;
    private String job;
    private String phoneNumber;
    private String email;
    private String site;
}
