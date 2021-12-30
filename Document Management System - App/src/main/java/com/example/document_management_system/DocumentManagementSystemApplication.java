package com.example.document_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DocumentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocumentManagementSystemApplication.class, args);
    }

}
