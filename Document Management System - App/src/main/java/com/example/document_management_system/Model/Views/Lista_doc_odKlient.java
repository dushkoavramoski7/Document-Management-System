package com.example.document_management_system.Model.Views;


import com.example.document_management_system.Model.Composite_Primary_Keys.DokumentId;
import org.hibernate.annotations.Immutable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Immutable
@IdClass(DokumentId.class)
@Table(name = "lista_doc_odklient")
public class Lista_doc_odKlient {
    @Id
    private int id_klient;
    @Id
    private int id_dokument;
    private String predmet_na_dokument;
    private LocalDateTime datum_primen;
    private LocalDateTime posledna_napravena_promena;
    private String status_dokument;

    public int getId_klient() {
        return id_klient;
    }

    public int getId_dokument() {
        return id_dokument;
    }

    public String getPredmet_na_dokument() {
        return predmet_na_dokument;
    }

    public LocalDateTime getDatum_primen() {
        return datum_primen;
    }

    public LocalDateTime getPosledna_napravena_promena() {
        return posledna_napravena_promena;
    }

    public String getStatus_dokument() {
        return status_dokument;
    }
}
