package org.example;

public class Voo {
    private int id;
    private String destino;
    private double precoPassagem;
    private int duracaoMinutos;

    public Voo(int id, String destino, double precoPassagem, int duracaoMinutos) {

        this.id = id;

        if(destino.isEmpty()) {
            throw new IllegalArgumentException("O destino não pode estar vazio");
        }

        this.destino = destino;

        if(precoPassagem <= 0){
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }

        this.precoPassagem = precoPassagem;

        if(duracaoMinutos <= 0){
            throw new IllegalArgumentException("A duração da viagem deve ser maior que 0");
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if(destino.isEmpty()) {
            throw new IllegalArgumentException("O destino não pode estar vazio");
        }
        this.destino = destino;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        if(precoPassagem <= 0){
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
        this.precoPassagem = precoPassagem;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if(duracaoMinutos <= 0){
            throw new IllegalArgumentException("A duração da viagem deve ser maior que 0");
        }
        this.duracaoMinutos = duracaoMinutos;
    }


}
