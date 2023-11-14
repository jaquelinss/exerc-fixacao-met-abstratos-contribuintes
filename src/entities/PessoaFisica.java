package entities;

public class PessoaFisica extends Contribuintes {

    private double gastosComSaude;

    public PessoaFisica(String nome, Double renda, double gastosComSaude) {
        super(nome, renda);
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {
        double imp = 0;
        if (renda <= 20000.00) {
            imp = 0.15;

        } else {
            imp = 0.25;
        }

        double descontoSaude = (gastosComSaude > 0) ? gastosComSaude * 0.5 : 0;
        return renda * imp - descontoSaude;

    }
}
