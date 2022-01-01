package com.example.document_management_system.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //klasa koja se povrzuva so baza na podatoci
@Data
@Table(name = "oddel")
public class oddel {

    @Id
    private char  id_oddel;
    private String ime_oddel;

}
