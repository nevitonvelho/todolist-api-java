package com.gerenciado_de_tarefas.gerenciado_de_tarefas.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tarefas")
public class TarefasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 500)
    private String description;

    // Construtor vazio
    public TarefasModel() {
    }

    // Construtor sem ID (gerado automaticamente)
    public TarefasModel(String nome, String description) {
        this.nome = nome;
        this.description = description;
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
