package com.example.document_management_system.Service;

import com.example.document_management_system.Model.Views.detailedView_log;

import java.util.List;

public interface detailedView_logService {

    public List<detailedView_log> findAll();

    public detailedView_log findById_rekord(Integer id_rekord);
}
