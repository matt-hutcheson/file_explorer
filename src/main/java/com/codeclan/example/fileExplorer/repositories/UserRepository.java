package com.codeclan.example.fileExplorer.repositories;

import com.codeclan.example.fileExplorer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
