package coesao;

import java.util.Calendar;

public abstract class Funcionario {

    protected int id;
    protected String nome;
    protected Calendar dataDeAdmissao;
    protected double salarioBase;

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Calendar getDataDeAdmissao() {
        return dataDeAdmissao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeAdmissao(Calendar dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public abstract Double calcularSalario();
}
