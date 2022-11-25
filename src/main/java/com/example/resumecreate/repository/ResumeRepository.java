package com.example.resumecreate.repository;

import com.example.resumecreate.domains.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:52 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Repository
public interface ResumeRepository extends JpaRepository<Resume,Long> {

}
