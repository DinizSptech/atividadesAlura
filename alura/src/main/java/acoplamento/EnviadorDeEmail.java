package acoplamento;

public class EnviadorDeEmail implements GeradorDeNotaListener{
    public void AcaoAposGerarNota(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
