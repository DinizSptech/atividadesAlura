package acoplamento;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeNotaFiscal {
    private final List<GeradorDeNotaListener> listeners;

    public GeradorDeNotaFiscal(List<GeradorDeNotaListener> listeners) {
        this.listeners = listeners;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (GeradorDeNotaListener listener : listeners){
            listener.AcaoAposGerarNota(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
