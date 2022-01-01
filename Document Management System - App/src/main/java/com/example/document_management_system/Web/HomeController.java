package com.example.document_management_system.Web;


import com.example.document_management_system.Service.List_doc_odKlientService;
import com.example.document_management_system.Service.Vraboten_kolku_doc_uspesno_realiziralService;
import com.example.document_management_system.Service.detailedView_logService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "Home controller", value = {"/home", ""})
public class HomeController {
    private final List_doc_odKlientService list_doc_odKlientService;
    private final detailedView_logService detailedView_logService;
    private final Vraboten_kolku_doc_uspesno_realiziralService vraboten_kolku_doc_uspesno_realiziralService;

    public HomeController(List_doc_odKlientService list_doc_odKlientService, com.example.document_management_system.Service.detailedView_logService detailedView_logService, Vraboten_kolku_doc_uspesno_realiziralService vraboten_kolku_doc_uspesno_realiziralService) {
        this.list_doc_odKlientService = list_doc_odKlientService;
        this.detailedView_logService = detailedView_logService;
        this.vraboten_kolku_doc_uspesno_realiziralService = vraboten_kolku_doc_uspesno_realiziralService;
    }

    @GetMapping
    public String getHomePage(Model model)
    {
            model.addAttribute("list_dokuemts_klient", list_doc_odKlientService.findAll());
            model.addAttribute("detailedVew_log", detailedView_logService.findAll());
            model.addAttribute("detailedView_log_idRekord", detailedView_logService.findById_rekord(3));
            model.addAttribute("douments_from_oneClient", list_doc_odKlientService.getDocumentsFromClient(1));
            model.addAttribute("Izvestaj_aktivnost_vraboteni", vraboten_kolku_doc_uspesno_realiziralService.findAll());
            return "ListDocuments";
    }
}
