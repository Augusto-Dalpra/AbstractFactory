package Test.java.AbstractFactory;

import main.java.AbstractFactory.AbstractFactory;
import main.java.AbstractFactory.Aplicacao;
import main.java.AbstractFactory.FabricaCarroGasolina;
import main.java.AbstractFactory.FabricaMotoEletrico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    @Test
    void DeveAbastecerGasolina() {
        AbstractFactory fabrica = new FabricaCarroGasolina();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Abastecer com gasolina", aplicacao.apresentarAbastecer());
    }
    @Test
    void DeveAbastecerEletrico() {
        AbstractFactory fabrica = new FabricaMotoEletrico();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Carregando com energia elétrica.", aplicacao.apresentarAbastecer());
    }
    @Test
    void DeveAcelerarCarro() {
        AbstractFactory fabrica = new FabricaCarroGasolina();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Acelerar o carro", aplicacao.apresentarAcelerar());
    }
    @Test
    void DeveAcelerarMoto() {
        AbstractFactory fabrica = new FabricaMotoEletrico();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Acelerando a moto.", aplicacao.apresentarAcelerar());
    }
}