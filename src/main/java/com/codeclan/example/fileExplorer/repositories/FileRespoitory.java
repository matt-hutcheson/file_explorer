package com.codeclan.example.fileExplorer.repositories;

import com.codeclan.example.fileExplorer.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRespoitory extends JpaRepository<File, Long> {
}
