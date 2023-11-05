package src.test.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CadastroTest {

    @Test
    public void testGetNomeDaFamilia() {
        Cadastro cadastro = new Cadastro();
        assertEquals("Rogerio", cadastro.getNomeDaFamilia(), "O nome da família deve ser Rogerio");
    }
}
