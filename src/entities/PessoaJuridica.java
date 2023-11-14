package entities;

public class PessoaJuridica extends Contribuintes{

    private Integer numeroDeFuncionarios;


    public PessoaJuridica(String nome, Double renda, Integer numeroDeFuncionarios) {
        super(nome, renda);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double imposto() {
        double imp = 0;
        if (numeroDeFuncionarios>10){
            imp = renda*0.14;
        }
        else {
            imp = renda*0.16;
        }
        return imp;
    }
}
