package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int id;
    private Passageiro passageiro;
    private String situacao = "Aberta";
    private List<Voo> voos = new ArrayList<>();
    private double valorTotalReserva;
    private int somaTempoTotal;
    private boolean temId = false;

    public Reserva(int id, Passageiro passageiro) {
        this.id = id;
        this.passageiro = passageiro;
    }

    public boolean buscarVooNaLista(int idVoo){

        for (Voo v : this.voos) {
            //criar a busca pelo id na lista
            if (v.getId() == idVoo) {
                temId = true;
            }
        }
        return temId;
    }

    public void adicionarVoo(Voo voo){

        // Não permite adicionar voo duplicado (mesmo ID) Deve lançar IllegalStateException
        if (buscarVooNaLista(voo.getId())){
            throw new IllegalStateException("Não é permitido adicionar voos duplicados");
        }

        // Voo nulo não é permitido
        this.voos.add(voo);

    }

    public void removerVoo(int idVoo){
        // Remove o voo pelo ID
        this.voos.remove(idVoo);
    }


    public void confirmarReserva(){

        // Deve haver pelo menos 1 voo → senão: IllegalStateException

        if (voos.isEmpty()){
            throw new IllegalStateException("Deve haver pelo menos um voo");
        }
        // Reserva já confirmada não pode ser confirmada novamente

        if (situacao == "Confirmada"){
            throw new IllegalStateException("Essa reserva já foi confirmada");
        }

        this.situacao = "Confirmada";



    }

    public double valorTotalReserva(){

        //Retorna a soma de todos os voos.

        this.voos.forEach(v -> {
            valorTotalReserva += v.getPrecoPassagem();
        });

        return valorTotalReserva;
    }

    public int tempoTotalViagem(){

        //Retorna a soma da duração de todos os voos em minutos

        this.voos.forEach(v -> {
            somaTempoTotal += v.getDuracaoMinutos();
        });
        return somaTempoTotal;
    }

}
