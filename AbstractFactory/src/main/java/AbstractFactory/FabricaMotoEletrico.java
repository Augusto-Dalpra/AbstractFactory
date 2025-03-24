package main.java.AbstractFactory;
public class FabricaMotoEletrico implements AbstractFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }

    @Override
    public Combustivel criarCombustivel() {
        return new Eletrico();
    }
}
