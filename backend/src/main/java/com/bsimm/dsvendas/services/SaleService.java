package com.bsimm.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bsimm.dsvendas.dto.SaleDTO;
import com.bsimm.dsvendas.dto.SaleSuccessDTO;
import com.bsimm.dsvendas.dto.SaleSumDTO;
import com.bsimm.dsvendas.entities.Sale;
import com.bsimm.dsvendas.repositories.SaleRepository;
import com.bsimm.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = saleRepository.findAll(pageable);
		return result.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> sucessGroupedBySeller(){
		return saleRepository.sucessGroupedBySeller();
	}
	
}
