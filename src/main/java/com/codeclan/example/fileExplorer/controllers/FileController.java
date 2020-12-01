package com.codeclan.example.fileExplorer.controllers;

import com.codeclan.example.fileExplorer.models.File;
import com.codeclan.example.fileExplorer.repositories.FileRespoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {
    @Autowired
    FileRespoitory fileRespoitory;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRespoitory.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity<Optional<File>> getFileMyID(@PathVariable Long id){
        return new ResponseEntity<>(fileRespoitory.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> addFile(@RequestBody File file){
        return new ResponseEntity<>(fileRespoitory.save(file), HttpStatus.CREATED);
    }
}
