import org.example.Passageiro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PassageiroTest {


    Passageiro passageiro1 = new Passageiro(1, "Gabriel", 22, "011.111.111.09");

    // Criar passageiro com idade ≤ 0 → exceção
    @Test
    public void criarPassageiroComIdadeMenorQueZero(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Passageiro passageiro2 = new Passageiro(2, "Gabriel", 0, "011.111.111.09");
        });
    }


    @Test
    public void alterarIdadeParaValorInvalido(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            passageiro1.setIdade(-1);
        });
    }
    @Test
    public void criarPassageiroComCpfVazio(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            passageiro1.setCpf("");
        });
    }


}
