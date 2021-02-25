package com.diegobufalo.chatbot.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegobufalo.chatbot.chatbot.model.Atendimento;
import com.diegobufalo.chatbot.chatbot.repository.AtendimentoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class AtendimentoService {

	@Autowired
	private AtendimentoRepository atendimentoRepository;

	public Mono<Atendimento> novoAtendimento() {
		Atendimento atendimento = new Atendimento();
		atendimento.setUsuario(1);
		
		return atendimentoRepository.save(atendimento);
	}

	public Mono<Atendimento> respostasAtendimento(Atendimento atendimento){
		return atendimentoRepository.save(atendimento);
	}

	public Mono<Atendimento> buscaAtendimentos(Integer id) {
		return atendimentoRepository.findById(id);
	}

	public Flux<Atendimento> buscaAtendimentosUsuario(Integer id) {
		return atendimentoRepository.findByUsuario(id);
	}

}
