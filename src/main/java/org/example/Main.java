package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro(1, "Gabriel", 22, "011.111.111.09");
        Passageiro passageiro2 = new Passageiro(2, "Jefte", 50, "011.111.222.09");

        Voo voo1 = new Voo(1, "Groelandia", 21.0, 50);
        Voo voo2 = new Voo(2, "Nepal", 31.0, 30);

        Reserva reserva = new Reserva(1, passageiro1);
        reserva.adicionarVoo(voo1);
        reserva.adicionarVoo(voo2);

        // Valor total da reserva deve estar correto

        System.out.println(reserva.valorTotalReserva());

        // Tempo total da viagem deve ser calculado corretamente

        System.out.println(reserva.tempoTotalViagem());

        reserva.removerVoo(3);






        }


    }
