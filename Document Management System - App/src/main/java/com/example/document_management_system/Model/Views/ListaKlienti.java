package com.example.document_management_system.Model.Views;

import javax.persistence.*;

@Entity
@Table(name = "lista_klienti", schema = "dms_project", catalog = "Document Managment System - Project BNP")
public class ListaKlienti {
    @Id
    @Column(name = "id_klient")
    private Integer idKlient;
    @Column(name = "kompanija")
    private String kompanija;
    @Column(name = "ime")
    private String ime;

    public Integer getIdKlient() {
        return idKlient;
    }

    public String getKompanija() {
        return kompanija;
    }

    public String getIme() {
        return ime;
    }
}
