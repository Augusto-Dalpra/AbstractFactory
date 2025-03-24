package main.java.AbstractFactory;

public class FabricaCarroGasolina implements AbstractFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }

    @Override
    public Combustivel criarCombustivel() {
        return new Gasolina();
    }
}
