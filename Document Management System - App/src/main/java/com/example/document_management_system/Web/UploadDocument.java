package com.example.document_management_system.Web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(name = "List documents controller", value = "/upload")
public class UploadDocument {

    @GetMapping
    public String getUploadDocumentPage(){


        return "UploadDocument";
    }

}
