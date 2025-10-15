package coesao;

public class Desenvolvedor extends Funcionario{
    @Override
    public Double calcularSalario() {
        if(salarioBase > 3000.0) {
            return salarioBase * 0.8;
        }
        else {
            return salarioBase * 0.9;
        }
    }
}
