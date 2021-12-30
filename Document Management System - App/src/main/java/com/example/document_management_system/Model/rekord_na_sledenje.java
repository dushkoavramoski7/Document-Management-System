package com.example.document_management_system.Model;


import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity  //klasa koja se povrzuva so baza na podatoci
@Data
@Table(name = "rekord_na_sledenje")
public class rekord_na_sledenje {
    @Id
    private int id_rekord;
    @ManyToOne
    @JoinColumn(name="id_dokument", nullable = false)
    private dokument id_dokument;
    @ManyToOne
    @JoinColumn(name="id_klient", nullable = false)
    private klient id_klient;
    @ManyToOne
    @JoinColumn(name="id_vraboten", nullable = true)
    private vraboten id_vraboten;
    private LocalDateTime datum_dostavuvanje;
    private LocalDateTime datum_promena;
    @Column(nullable = false)
    private String status_dokument;
    private String odgovor_file;
    private String komentar;
    private String promena;
}
