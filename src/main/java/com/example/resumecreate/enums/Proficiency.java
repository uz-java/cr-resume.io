package com.example.resumecreate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:51 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@AllArgsConstructor
public enum Proficiency {

    ELEMENTARY("Elementary proficiency"),
    LIMITED("Limited working proficiency"),
    PROFESSIONAL("Professional working proficiency"),
    FULL_PROFESSIONAL("Full professional working proficiency"),
    NATIVE("Native or bilingual proficiency");
    private String description;
}
