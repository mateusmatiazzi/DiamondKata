import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamanteTeste {

    Diamante diamante = new Diamante();
    String diamanteEsperado = "";

    @Test
    void deveCriarUmDiamanteComUmaLetra() {
        diamanteEsperado = "A";

        assertEquals(diamanteEsperado, diamante.retornaDiamante('A'));
    }

    @Test
    void deveCriarUmDiamanteComDuasLetras() {
        diamanteEsperado = " A \n" +
                           "B B\n" +
                           " A ";

        assertEquals(diamanteEsperado, diamante.retornaDiamante('B'));
    }

    @Test
    void deveCriarUmDiamanteComTresLetras() {
        diamanteEsperado = "  A  \n" +
                           " B B \n" +
                           "C   C\n" +
                           " B B \n" +
                           "  A  ";
        assertEquals(diamanteEsperado, diamante.retornaDiamante('C'));

    }
}
