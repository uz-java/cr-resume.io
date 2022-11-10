package com.example.resumecreate.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author "Tojaliyev Asliddin"
 * @since 10/11/22 23:47 (Thursday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String address;
    private String country;
    private String job;
    private String phoneNumber;
    private String email;
    private String site;
}
