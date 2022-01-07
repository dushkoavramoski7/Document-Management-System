package com.example.document_management_system.Service.Implementation;

import com.example.document_management_system.Model.Views.Lista_doc_odKlient;
import com.example.document_management_system.Repository.jpa.List_doc_odKlientRepository;
import com.example.document_management_system.Service.List_doc_odKlientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class List_doc_od_KlientImpl implements List_doc_odKlientService {
    private final List_doc_odKlientRepository list_doc_odKlientRepository;

    public List_doc_od_KlientImpl(List_doc_odKlientRepository list_doc_odKlientRepository) {
        this.list_doc_odKlientRepository = list_doc_odKlientRepository;
    }

    @Override
    public List<Lista_doc_odKlient> findAll() {
        return list_doc_odKlientRepository.findAll();
    }

    @Override
    public List<Lista_doc_odKlient> getDocumentsFromClient(Integer id_klient) {
        return list_doc_odKlientRepository.getDocumentsFromClient(id_klient);
    }

    @Override
    public List<Lista_doc_odKlient> filterDocumentsByClinet(String client) {

        if (client == null || Integer.parseInt(client)==0)
        {
            return findAll();
        }
        else {
            return getDocumentsFromClient(Integer.parseInt(client));
        }
    }

    @Override
    public List<Lista_doc_odKlient> findAllbyEmployee(String employee) {
        Integer id_vraboten = Integer.parseInt(employee);
        return list_doc_odKlientRepository.findAllbyEmployee(id_vraboten);
    }

    @Override
    public List<String> findAllclientsbyEmployee(String employee) {
        Integer id_vraboten = Integer.parseInt(employee);
        return list_doc_odKlientRepository.findAllclientsbyEmployee(id_vraboten);
    }
}
