package com.diegobufalo.chatbot.chatbot.dto;

import java.util.List;

public class MensagemIndexadaDTO {
	
	private Integer idAtendimento;
	
	private List<String> mensagem;
	

	public Integer getIdAtendimento() {
		return idAtendimento;
	}

	public void setIdAtendimento(Integer idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public List<String> getMensagem() {
		return mensagem;
	}

	public void setMensagem(List<String> mensagem) {
		this.mensagem = mensagem;
	}

}
