package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlenoTest {

    @Test
    void deveRetomarPlenoLojaFisica() {
        CanalVenda canal = new LojaFisica() ;
        Pleno pleno = new Pleno();
        pleno.setCanalVenda(canal);
        assertEquals(1080.0f, pleno.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarPlenoLojaOnline() {
        CanalVenda canal = new LojaOnline() ;
        Pleno pleno = new Pleno();
        pleno.setCanalVenda(canal);
        assertEquals(1060.0f, pleno.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarPlenoLojaTelefone() {
        CanalVenda canal = new LojaTelefone() ;
        Pleno pleno = new Pleno();
        pleno.setCanalVenda(canal);
        assertEquals(1070.0f, pleno.calcularComissao(1000), 0.01);
    }


}