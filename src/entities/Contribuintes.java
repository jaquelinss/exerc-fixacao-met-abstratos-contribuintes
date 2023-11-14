package entities;

public abstract class Contribuintes {
    protected String nome;
    protected Double renda;

    public Contribuintes(String nome, Double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public abstract double imposto();

    @Override
    public String toString() {
        return nome + ": R$" +
                String.format("%.2f", imposto());
    }
}
