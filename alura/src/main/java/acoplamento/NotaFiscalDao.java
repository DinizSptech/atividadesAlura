package acoplamento;

public class NotaFiscalDao implements GeradorDeNotaListener{

    @Override
    public void AcaoAposGerarNota(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

}
