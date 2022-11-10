package com.example.resumecreate.domains;

import lombok.*;

import javax.persistence.*;

/**
 * @author "Tojaliyev Asliddin"
 * @since 10/11/22 23:29 (Thursday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
}
