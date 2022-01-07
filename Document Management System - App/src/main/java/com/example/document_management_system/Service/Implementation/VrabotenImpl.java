package com.example.document_management_system.Service.Implementation;

import com.example.document_management_system.Model.vraboten;
import com.example.document_management_system.Repository.jpa.VrabotenRepository;
import com.example.document_management_system.Service.VrabotenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VrabotenImpl implements VrabotenService {
    private final VrabotenRepository vrabotenRepository;

    public VrabotenImpl(VrabotenRepository vrabotenRepository) {
        this.vrabotenRepository = vrabotenRepository;
    }

    @Override
    public List<vraboten> findAll() {
        return vrabotenRepository.findAllVraboteni();
    }
}
