package main.java.AbstractFactory;

public class Aplicacao {
    private Combustivel combustivel;
    private Veiculo veiculo;

    public Aplicacao (AbstractFactory fabrica) {
        this.combustivel = fabrica.criarCombustivel();
        this.veiculo = fabrica.criarVeiculo();
    }

    public String apresentarAbastecer() {
        return this.combustivel.abastecer();
    }

    public String apresentarAcelerar() {
        return this.veiculo.acelerar();
    }
}