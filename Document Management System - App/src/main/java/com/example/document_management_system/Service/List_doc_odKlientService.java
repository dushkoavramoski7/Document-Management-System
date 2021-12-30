package com.example.document_management_system.Service;

import com.example.document_management_system.Model.Views.Lista_doc_odKlient;

import java.util.List;

public interface List_doc_odKlientService {

    public List<Lista_doc_odKlient> findAll();

    public List<Lista_doc_odKlient> getDocumentsFromClient(Integer id_klient);


}
