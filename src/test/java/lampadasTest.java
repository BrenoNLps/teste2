import org.example.lampadas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class lampadasTest {

    @Test
    public void entradaValida(){
        final lampadas lamp = new lampadas();
        final boolean value= lamp.verificador("0 0 0 1");
        assertEquals(true, value);
    }

    @Test
    public void entradaInvalidaComEntradaDeTexto(){
        final lampadas lamp = new lampadas();
        final boolean value= lamp.verificador("um dois tres quatro");
        assertEquals(false, value);
    }

    @Test
    public void entradaInvalidaComEntradaDeNumerosDiferentesDe0e1(){
        final lampadas lamp = new lampadas();
        final boolean value= lamp.verificador("0 2 0 1");
        assertEquals(false, value);
    }

    @Test
    public void verificarQuantosInterruptoresParaEscolhaSemAlteracao(){
        final lampadas lamp = new lampadas();
        lamp.verificador("0 0 0 0");
        int value=lamp.quantosInterruptores();
        assertEquals(0, value);
    }

    @Test
    public void verificarQuantosInterruptoresParaQuandoSoHaAlteracaoNaPrimeiraLampada(){
        final lampadas lamp = new lampadas();
        lamp.verificador("1 0 0 0");
        int value=lamp.quantosInterruptores();
        assertEquals(1, value);
    }

    @Test
    public void verificarQuantosInterruptoresParaQuandoSoHaAlteracaoNasDuasLampadas(){
        final lampadas lamp = new lampadas();
        lamp.verificador("1 0 0 1");
        int value=lamp.quantosInterruptores();
        assertEquals(1, value);
    }

    @Test
    public void verificarQuantosInterruptoresParaQuandoSoHaAlteracaoNaSegundaLampada(){
        final lampadas lamp = new lampadas();
        lamp.verificador("1 0 1 1");
        int value=lamp.quantosInterruptores();
        assertEquals(2, value);
    }



}
