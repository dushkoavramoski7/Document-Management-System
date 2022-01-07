package com.example.document_management_system.Model.Views;


import com.example.document_management_system.Model.Composite_Primary_Keys.DokumentId;
import org.hibernate.annotations.Immutable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Immutable
@IdClass(DokumentId.class)
@Table(name = "lista_doc_odklient")
public class Lista_doc_odKlient {
    private static final String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss";
    @Id
    private int id_klient;
    private String ime;
    @Id
    private int id_dokument;
    private String predmet_na_dokument;
    private LocalDateTime datum_primen;
    private LocalDateTime posledna_napravena_promena;
    private String status_dokument;

    public String getIme() {
        return ime;
    }

    public int getId_klient() {
        return id_klient;
    }

    public int getId_dokument() {
        return id_dokument;
    }

    public String getPredmet_na_dokument() {
        return predmet_na_dokument;
    }

    public String getDatum_primen() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(datum_primen);
    }
    public DayOfWeek getDatum_primenDen() {
        return datum_primen.getDayOfWeek();
    }
    public DayOfWeek getPosledna_napravena_promenaDen() {
        return posledna_napravena_promena.getDayOfWeek();
    }

    public String getPosledna_napravena_promena() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(posledna_napravena_promena);
    }

    public String getStatus_dokument() {
        return status_dokument;
    }
}
