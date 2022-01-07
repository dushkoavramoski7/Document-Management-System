package com.example.document_management_system.Service.Implementation;

import com.example.document_management_system.Model.Views.Vraboten_kolku_doc_uspesno_realiziral;
import com.example.document_management_system.Repository.jpa.Vraboten_kolku_doc_uspesno_realiziralRepository;
import com.example.document_management_system.Service.Vraboten_kolku_doc_uspesno_realiziralService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Vraboten_kolku_doc_uspesno_realiziralImpl implements Vraboten_kolku_doc_uspesno_realiziralService {
    private final Vraboten_kolku_doc_uspesno_realiziralRepository vraboten_kolku_doc_uspesno_realiziralRepository;

    public Vraboten_kolku_doc_uspesno_realiziralImpl(Vraboten_kolku_doc_uspesno_realiziralRepository vraboten_kolku_doc_uspesno_realiziralRepository) {
        this.vraboten_kolku_doc_uspesno_realiziralRepository = vraboten_kolku_doc_uspesno_realiziralRepository;
    }


    @Override
    public Optional<Vraboten_kolku_doc_uspesno_realiziral> findbyId(Integer id_vraboten) {
        return vraboten_kolku_doc_uspesno_realiziralRepository.findById(id_vraboten);
    }
}
