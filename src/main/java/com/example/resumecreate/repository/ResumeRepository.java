package com.example.resumecreate.repository;

import com.example.resumecreate.domains.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:52 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
