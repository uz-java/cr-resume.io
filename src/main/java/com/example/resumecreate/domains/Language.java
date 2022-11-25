package com.example.resumecreate.domains;

import com.example.resumecreate.enums.Proficiency;
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
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Proficiency proficiency;
}
