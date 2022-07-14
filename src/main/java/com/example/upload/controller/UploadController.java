package com.example.upload.controller;

import com.example.upload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController

public class UploadController {
@Autowired
    UploadService uploadService;
    @PostMapping
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
    uploadService.uploadFile(file);
    }
}
