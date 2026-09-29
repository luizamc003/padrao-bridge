package padroesestruturais.bridge;

public abstract class Vendedor {

    protected CanalVenda canal;


    public Vendedor() {
    }

    public void setCanalVenda(CanalVenda canal) {
        this.canal = canal;
    }

    public abstract double getPercentualVendedor();

    public double calcularComissao(float valorVenda) {
        return valorVenda * (1 + getPercentualVendedor() + canal.percentualVenda());
    }

}
