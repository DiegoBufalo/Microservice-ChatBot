package com.diegobufalo.chatbot.chatbot.model;

public class Usuario {

	
	private Integer id;
	private String nome;
	private Integer idade;
	private Character sexo;
	
	
	public Usuario() {
		this.id = 1;
		this.nome = "Diego Bufalo";
		this.idade = 22;
		this.sexo = 'M';
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	
}
