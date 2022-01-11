package com.example.document_management_system.Service.Implementation;

import com.example.document_management_system.Model.*;
import com.example.document_management_system.Repository.jpa.*;
import com.example.document_management_system.Service.DocumentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Service
public class DocumentImpl implements DocumentService {
    private final KlientRepository klientRepository;
    private  final VrabotenRepository vrabotenRepository;
    private final DocumentRepository documentRepository;
    private final RNSRepository rnsRepository;
    private final OddelRepository oddelRepository;

    public DocumentImpl(KlientRepository klientRepository, VrabotenRepository vrabotenRepository, DocumentRepository documentRepository, RNSRepository rnsRepository, OddelRepository oddelRepository) {
        this.klientRepository = klientRepository;
        this.vrabotenRepository = vrabotenRepository;
        this.documentRepository = documentRepository;
        this.rnsRepository = rnsRepository;
        this.oddelRepository = oddelRepository;
    }


    @Transactional
    @Override
    public dokument save(Integer id_klient,String id_oddel, String dostaven_file, String tip_na_dokument, String predmet_na_dokument, MultipartFile file) throws Exception {
        klient klient = this.klientRepository.findById(id_klient).orElseThrow(() -> new NoSuchElementException());
        oddel oddel =  this.oddelRepository.findById(id_oddel).stream().findFirst().get();
        vraboten vraboten = this.vrabotenRepository.findAllById_oddel(oddel).stream().findFirst().get();
        dokument dokument = new dokument(klient, vraboten, dostaven_file, tip_na_dokument,predmet_na_dokument,LocalDateTime.now(), file.getBytes() );
        this.documentRepository.save(dokument);
        rekord_na_sledenje rns = new rekord_na_sledenje(dokument, klient, vraboten,null,LocalDateTime.now(), "Podneseno baranje", null,null,null,null, null);
        this.rnsRepository.save(rns);
        return dokument;
    }


    @Override
    public dokument findByid(Integer id) {
        return this.documentRepository.findById(id).stream().findFirst().get();
    }
}
