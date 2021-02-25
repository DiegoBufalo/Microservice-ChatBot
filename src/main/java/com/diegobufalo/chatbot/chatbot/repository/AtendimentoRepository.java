package com.diegobufalo.chatbot.chatbot.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.diegobufalo.chatbot.chatbot.model.Atendimento;

import reactor.core.publisher.Flux;

@Repository
public interface AtendimentoRepository extends ReactiveCrudRepository<Atendimento, Integer>{

	Flux<Atendimento> findByUsuario(Integer id);

}
