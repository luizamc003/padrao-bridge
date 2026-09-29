package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JuniorTest {


    @Test
    void deveRetomarJuniorLojaFisica() {
        CanalVenda canal = new LojaFisica() ;
        Junior junior = new Junior();
        junior.setCanalVenda(canal);
        assertEquals(1070.0f, junior.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarJuniorLojaOnline() {
        CanalVenda canal = new LojaOnline() ;
        Junior junior = new Junior();
        junior.setCanalVenda(canal);
        assertEquals(1050.0f, junior.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarJuniorLojaTelefone() {
        CanalVenda canal = new LojaTelefone() ;
        Junior junior = new Junior();
        junior.setCanalVenda(canal);
        assertEquals(1060.0f, junior.calcularComissao(1000), 0.01);
    }

}