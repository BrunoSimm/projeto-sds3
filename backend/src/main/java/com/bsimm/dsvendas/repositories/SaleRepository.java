package com.bsimm.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsimm.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
