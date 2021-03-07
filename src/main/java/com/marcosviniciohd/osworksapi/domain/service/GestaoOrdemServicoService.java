package com.marcosviniciohd.osworksapi.domain.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcosviniciohd.osworksapi.domain.model.OrdemServico;
import com.marcosviniciohd.osworksapi.domain.model.StatusOrdemServico;
import com.marcosviniciohd.osworksapi.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(LocalDateTime.now());
		
		return ordemServicoRepository.save(ordemServico);
	}
	

}
