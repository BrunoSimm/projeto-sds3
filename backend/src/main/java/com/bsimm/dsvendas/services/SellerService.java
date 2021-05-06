package com.bsimm.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsimm.dsvendas.dto.SellerDTO;
import com.bsimm.dsvendas.entities.Seller;
import com.bsimm.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = sellerRepository.findAll();
		return result.stream()
				.map(seller -> new SellerDTO(seller))
				.collect(Collectors.toList());
	}
	
	
}
