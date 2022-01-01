package com.example.document_management_system.Repository.jpa;


import com.example.document_management_system.Model.Views.Vraboten_kolku_doc_uspesno_realiziral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Vraboten_kolku_doc_uspesno_realiziralRepository extends JpaRepository<Vraboten_kolku_doc_uspesno_realiziral, Integer> {

    // prikaz samo za vrabotenite
    @Override
    List<Vraboten_kolku_doc_uspesno_realiziral> findAll();

}
