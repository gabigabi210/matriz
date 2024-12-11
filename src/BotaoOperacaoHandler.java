import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoOperacaoHandler implements ActionListener {
    private final String operacao;
    private Controlador controlador;
    public BotaoOperacaoHandler(String op, Controlador controlador){
        this.operacao = op;
        this.controlador = controlador;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        controlador.OperacaoPressionada(this.operacao);
    }
}
