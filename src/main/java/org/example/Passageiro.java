package org.example;

public class Passageiro {
    private int id;
    private String nome;
    private int idade;
    private String cpf;

    public Passageiro(int id, String nome, int idade, String cpf) {

        if(id <= 0) {
            throw new IllegalArgumentException("O id tem que ser maior que 0");
        }
        this.id = id;

        this.nome = nome;

        if(idade <= 0) {
            throw new IllegalArgumentException("A idade tem que ser maior que 0");
        }
        this.idade = idade;

        if(cpf.isEmpty()) {
            throw new IllegalArgumentException("O documento não pode estar vazio");
        }
        this.cpf = cpf;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {

        // Id deve ser maior que zero.
        if(this.id <= 0) {
            throw new IllegalArgumentException("O id tem que ser maior que 0");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        // Idade deve ser > 0

        if(idade <= 0) {
            throw new IllegalArgumentException("A idade tem que ser maior que 0");
        }

        this.idade = idade;


    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        // Documento não pode ser nulo nem vazio.

        if(cpf.isEmpty()) {
            throw new IllegalArgumentException("O documento não pode estar vazio");
        }

        //Falta adicionar pra ver se é nulo

        this.cpf = cpf;
    }
}
