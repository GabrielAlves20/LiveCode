import org.example.Passageiro;
import org.example.Reserva;
import org.example.Voo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReservaTest {

    Passageiro passageiro1 = new Passageiro(1, "Gabriel", 22, "011.111.111.09");
    Voo voo1 = new Voo(1, "Groelandia", 21.0, 50);

    @Test
    public void adicionarVooDuplicado() {
        Reserva reserva = new Reserva(1, passageiro1);
        reserva.adicionarVoo(voo1);

        Assertions.assertThrows(IllegalStateException.class, () -> {
            reserva.adicionarVoo(voo1);
        });
    }

    @Test
    public void confirmarReservaSemVoo(){
        Reserva reserva = new Reserva(1, passageiro1);

        Assertions.assertThrows(IllegalStateException.class, () -> {
            reserva.confirmarReserva();
        });

    }
    @Test
    public void confirmarReservaDuasVezes(){
        Reserva reserva = new Reserva(1, passageiro1);
        Voo voo1 = new Voo(1, "Groelandia", 21.0, 50);
        reserva.adicionarVoo(voo1);

        reserva.confirmarReserva();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            reserva.confirmarReserva();
        });

    }

    @Test
    public void confirmarValorTotalReserva(){

        Reserva reserva = new Reserva(1, passageiro1);

        Voo voo1 = new Voo(1, "Groelandia", 21.0, 50);
        Voo voo2 = new Voo(2, "Nepal", 31.0, 30);

        reserva.adicionarVoo(voo1);
        reserva.adicionarVoo(voo2);

        reserva.confirmarReserva();

        Assertions.assertEquals(52.0, reserva.valorTotalReserva());
    }

    @Test
    public void confirmarTempoTotalReserva(){

        Reserva reserva = new Reserva(1, passageiro1);

        Voo voo1 = new Voo(1, "Groelandia", 21.0, 50);
        Voo voo2 = new Voo(2, "Nepal", 31.0, 30);

        reserva.adicionarVoo(voo1);
        reserva.adicionarVoo(voo2);

        reserva.confirmarReserva();

        Assertions.assertEquals(80, reserva.tempoTotalViagem());
    }
    

};




