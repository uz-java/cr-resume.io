package com.example.resumecreate.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:32 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private byte progress;
}
