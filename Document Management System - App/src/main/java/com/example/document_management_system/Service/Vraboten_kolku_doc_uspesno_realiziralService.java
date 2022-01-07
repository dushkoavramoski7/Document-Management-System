package com.example.document_management_system.Service;

import com.example.document_management_system.Model.Views.Vraboten_kolku_doc_uspesno_realiziral;

import java.util.Optional;

public interface Vraboten_kolku_doc_uspesno_realiziralService {

    public Optional<Vraboten_kolku_doc_uspesno_realiziral> findbyId(Integer id_vraboten);

}
