package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SeniorTest {


    @Test
    void deveRetomarSeniorLojaFisica() {
        CanalVenda canal = new LojaFisica() ;
        Senior senior = new Senior();
        senior.setCanalVenda(canal);
        assertEquals(1090.0f, senior.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarSeniorLojaOnline() {
        CanalVenda canal = new LojaOnline() ;
        Senior senior = new Senior();
        senior.setCanalVenda(canal);
        assertEquals(1070.0f, senior.calcularComissao(1000), 0.01);
    }

    @Test
    void deveRetomarSeniorLojaTelefone() {
        CanalVenda canal = new LojaTelefone() ;
        Senior senior = new Senior();
        senior.setCanalVenda(canal);
        assertEquals(1080.0f, senior.calcularComissao(1000), 0.01);
    }




}