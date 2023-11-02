package com.uploadanddownload.file;

import com.uploadanddownload.file.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@SpringBootApplication
public class UploadAndDownloadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadAndDownloadFileApplication.class, args);
	}

}
