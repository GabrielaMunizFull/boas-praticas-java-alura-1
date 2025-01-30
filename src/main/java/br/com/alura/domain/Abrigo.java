package br.com.alura.domain;

public class Abrigo {

    public Abrigo(){

    }

    public Abrigo(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Pet[] pets;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Pet[] getPets() {
        return pets;
    }
}
