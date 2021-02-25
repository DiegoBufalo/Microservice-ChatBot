package com.diegobufalo.chatbot.chatbot.repository;

import com.diegobufalo.chatbot.chatbot.model.ChatMessage;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

/**
 * ChatMessageRepository
 */
@Repository
public interface ChatMessageRepository extends ReactiveCrudRepository<ChatMessage, Integer> {
	
	Mono<ChatMessage> findByMensagemContainingIgnoringCase(String palavra);
}