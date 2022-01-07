package com.example.document_management_system.Web;


import com.example.document_management_system.Service.PromeniVoCelPeriodService;
import com.example.document_management_system.Service.detailedView_docService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping(name = "Document controller", value = "/document")
public class DetailedViewDocument {

    private final detailedView_docService detailedView_docService;
    private final PromeniVoCelPeriodService promeniVoCelPeriodService;

    public DetailedViewDocument(com.example.document_management_system.Service.detailedView_docService detailedView_docService, PromeniVoCelPeriodService promeniVoCelPeriodService) {
        this.detailedView_docService = detailedView_docService;
        this.promeniVoCelPeriodService = promeniVoCelPeriodService;
    }

    @GetMapping("/{id}")
    public String getDetaildViewDocClient(Model model, @PathVariable int id, HttpServletRequest req, HttpServletResponse resp){
        String client = (String) req.getSession().getAttribute("client");
        model.addAttribute("cel_period", promeniVoCelPeriodService.filterCelPeriodPromeniByClient(client));
        model.addAttribute("DetailedViewDocument", detailedView_docService.findAllbyDocument_Id(id));

        return "Detailed_View_Document";
    }

    @GetMapping("/employee/{id}")
    public String getDetaildViewDocEmployee(Model model, @PathVariable int id, HttpServletRequest req, HttpServletResponse resp){

      model.addAttribute("DetailedViewDocument", detailedView_docService.findAllbyDocument_Id(id));
      return "Detailed_View_DocumentEmployee";
    }


}
