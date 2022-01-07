package com.example.document_management_system.Repository.jpa;


import com.example.document_management_system.Model.vraboten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VrabotenRepository extends JpaRepository<vraboten, Integer> {

    @Query("select a from vraboten as a")
    List<vraboten> findAllVraboteni();
}
