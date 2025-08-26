package br.edu.ifpr.todo.todo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Tarefas")//só se a tabela tiver nome diferente no bd
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 120)
    private String nome;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Status status;
    
    private Date criacao;
    private Date entrega;

    public Tarefa() {
    }

    public Tarefa(Integer id, String nome, String descricao, Status status, Date criacao, Date entrega) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.criacao = criacao;
        this.entrega = entrega;
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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Date getCriacao() {
        return criacao;
    }
    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }
    public Date getEntrega() {
        return entrega;
    }
    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }
}
