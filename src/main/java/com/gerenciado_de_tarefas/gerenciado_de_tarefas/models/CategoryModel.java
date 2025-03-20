package com.gerenciado_de_tarefas.gerenciado_de_tarefas.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "categorias")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nome;

    public CategoryModel(){

    }

    public  CategoryModel(String nome){
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }


    public String getNome(){
        return nome;
    }

    public void setId(String nome){
        this.nome = nome;
    }


}
