package com.diegobufalo.chatbot.chatbot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("bot_message")
public class ChatMessage {

    @Id
    private Integer id;

    @Column("mensagem")
    private String mensagem;

    public ChatMessage(Integer id, String mensagem){
        this.id = id;
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Integer getId(){
        return id;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}