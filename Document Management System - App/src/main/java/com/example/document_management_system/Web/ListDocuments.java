package com.example.document_management_system.Web;


import com.example.document_management_system.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(name = "List documents controller", value = "/home")
public class ListDocuments {
    private final List_doc_odKlientService list_doc_odKlientService;
    private final ListaKlientiService listaKlientiService;
    private final PromeniGrupiraniPoMesecService promeniGrupiraniPoMesecService;
    private final PromeniVoTekovenMesecService promeniVoTekovenMesecService;
    private final VrabotenService vrabotenService;
    private final Vraboten_kolku_doc_uspesno_realiziralService vraboten_kolku_doc_uspesno_realiziralService;


    public ListDocuments(List_doc_odKlientService list_doc_odKlientService, ListaKlientiService listaKlientiService, PromeniGrupiraniPoMesecService promeniGrupiraniPoMesecService, PromeniVoTekovenMesecService promeniVoTekovenMesecService, VrabotenService vrabotenService, Vraboten_kolku_doc_uspesno_realiziralService vraboten_kolku_doc_uspesno_realiziralService) {
        this.list_doc_odKlientService = list_doc_odKlientService;
        this.listaKlientiService = listaKlientiService;
        this.promeniGrupiraniPoMesecService = promeniGrupiraniPoMesecService;
        this.promeniVoTekovenMesecService = promeniVoTekovenMesecService;
        this.vrabotenService = vrabotenService;
        this.vraboten_kolku_doc_uspesno_realiziralService = vraboten_kolku_doc_uspesno_realiziralService;
    }

    @GetMapping
    public String getHomePage(Model model, HttpServletRequest req, HttpServletResponse resp)
    {
        model.addAttribute("clients", listaKlientiService.findAll());
        model.addAttribute("vraboteni", vrabotenService.findAll());
        return "Home";
    }

    @PostMapping("/client")
    public String getHomePagePostClient(Model model, HttpServletRequest req, HttpServletResponse resp) {


        String client = req.getParameter("client"); // sesija za klient
        HttpSession httpSession = req.getSession(); // ako postoi sesija ja zema, ako ne, ja kreira
        httpSession.setAttribute("client", client);

        model.addAttribute("list_dokuemts_klient", list_doc_odKlientService.filterDocumentsByClinet(client));
        model.addAttribute("clients", listaKlientiService.findAll());
        model.addAttribute("promeni", promeniGrupiraniPoMesecService.filterByMonthYear(client));
        model.addAttribute("tekovni_promeni", promeniVoTekovenMesecService.filterTekovniPromeniByClient(client));
        model.addAttribute("client", client);
        return "ListDocuments";
    }

    @PostMapping("/employee")
    public String getHomePagePostEmployee(Model model, HttpServletRequest req, HttpServletResponse resp)
    {

        String employee = req.getParameter("employee"); // sesija za klient
        HttpSession httpSession = req.getSession(); // ako postoi sesija ja zema, ako ne, ja kreira
        httpSession.setAttribute("employee", employee);
        model.addAttribute("clients", listaKlientiService.findAll());
        model.addAttribute("vraboteni", vrabotenService.findAll());
        model.addAttribute("employee", employee);
        model.addAttribute("dokumenti", vraboten_kolku_doc_uspesno_realiziralService.findbyId(Integer.parseInt(employee)));
        return  "ListDocumentsEmployee";
    }


}
