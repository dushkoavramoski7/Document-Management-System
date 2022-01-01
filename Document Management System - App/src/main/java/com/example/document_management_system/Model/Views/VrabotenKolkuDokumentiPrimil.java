package com.example.document_management_system.Model.Views;

import javax.persistence.*;

@Entity
@Table(name = "vraboten_kolku_dokumenti_primil", schema = "dms_project", catalog = "Document Managment System - Project BNP")
public class VrabotenKolkuDokumentiPrimil {

    @Id
    @Column(name = "ime_vraboten")
    private String imeVraboten;
    @Column(name = "prezime_vraboten")
    private String prezimeVraboten;
    @Column(name = "ime_oddel")
    private String imeOddel;
    @Column(name = "vraboten_primil_dokumenti")
    private Long vrabotenPrimilDokumenti;

    public String getImeVraboten() {
        return imeVraboten;
    }

    public String getPrezimeVraboten() {
        return prezimeVraboten;
    }

    public String getImeOddel() {
        return imeOddel;
    }

    public Long getVrabotenPrimilDokumenti() {
        return vrabotenPrimilDokumenti;
    }
}
