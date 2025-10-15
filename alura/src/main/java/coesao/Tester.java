package coesao;

public class Tester extends Funcionario{
    @Override
    public Double calcularSalario() {
        if(salarioBase > 2000.0) {
            return salarioBase * 0.75;
        }
        else {
            return salarioBase * 0.85;
        }
    }
}
