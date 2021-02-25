package com.diegobufalo.chatbot.chatbot.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "atendimento")
public class Atendimento {
	
	@Id
	private Integer id;
	
	private Integer usuario;
	
	private List<String> mensagem;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getMensagem() {
		return mensagem;
	}

	public void setMensagem(List<String> mensagem) {
		this.mensagem = mensagem;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer idUsuario) {
		this.usuario = idUsuario;
	}

}
