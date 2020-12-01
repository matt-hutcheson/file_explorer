package com.codeclan.example.fileExplorer.repositories;

import com.codeclan.example.fileExplorer.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
