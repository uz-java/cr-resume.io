package com.example.resumecreate.domains;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:32 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Header header;
    private String templateName;
    @Column(columnDefinition = "text")
    private String about;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SocialMediaAccount> socialMediaAccounts;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Education> educations;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Language> languages;

    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;
}
