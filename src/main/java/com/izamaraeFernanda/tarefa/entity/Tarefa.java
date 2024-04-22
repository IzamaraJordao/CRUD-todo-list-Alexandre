package com.izamaraeFernanda.tarefa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tarefas")
@NoArgsConstructor
@Getter
@Setter
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "status", nullable = false)
    private String status;
    
    @Column(name = "observacao", nullable = false)
    private String observacao;
    
    @Column(name = "data_criacao", nullable = false)
    private String data_criacao;
    
    @Column(name = "data_atualizacao", nullable = false)
    private String data_atualizacao;

    @Builder
    public Tarefa(String nome, String descricao, String status, String observacao, String data_criacao, String data_atualizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.observacao = observacao;
        this.data_criacao = data_criacao;
        this.data_atualizacao = data_atualizacao;
    }

}
