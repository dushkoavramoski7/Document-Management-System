package com.example.document_management_system.Model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity  //klasa koja se povrzuva so baza na podatoci
@Data
@Table(name = "dokument")
public class dokument {
    @Id
    private int id_dokument;
    @ManyToOne
    @JoinColumn(name="id_klient", nullable = false)
    private klient id_klient;
    @ManyToOne
    @JoinColumn(name="id_vraboten", nullable = false)
    private vraboten id_vraboten;
    private String tip_na_dokument;
    private String predmet_na_dokument;
    private LocalDateTime datum_primen;
}
