package br.com.alura.domain;

import jakarta.validation.constraints.NotBlank;

public class Pet {

    public Pet() {
    }

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    private Long id;

    @NotBlank(message = "O tipo do pet não pode estar em branco")
    private String tipo;

    @NotBlank(message = "O nome do pet não pode estar em branco")
    private String nome;

    @NotBlank(message = "A raça do pet não pode estar em branco")
    private String raca;

    private int idade;

    @NotBlank(message = "A cor do pet não pode estar em branco")
    private String cor;

    private Float peso;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}
