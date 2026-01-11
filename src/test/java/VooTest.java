import org.example.Passageiro;
import org.example.Voo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VooTest {



    @Test
    public void testarPrecoNegativo(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Voo voo1 = new Voo(1, "Groelandia", -21.0, 50);
        });
    }
    @Test
    public void testarDuracaoMenorIgualZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Voo voo1 = new Voo(1, "Groelandia", 21.0, 0);
        });
    }
    @Test
    public void testarDestinoVazio(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Voo voo1 = new Voo(1, "", 21.0, 50);
        });
    }
}
