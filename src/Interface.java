import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private JTextField titulo;
    private JButton soma;
    private JButton subtracao;
    private JButton multiplicacaoEscalar;
    private JButton multiplicacaoMatrizes;
    private JButton determinante;
    private JButton transposta;
    private JButton inversa;
    private JPanel principal;

    private Controlador controlador;
    public Interface(Controlador controlador) {
        this.controlador = controlador;
        soma.addActionListener(new BotaoOperacaoHandler("Soma", controlador));
        subtracao.addActionListener(new BotaoOperacaoHandler("Subtração", controlador));
        multiplicacaoMatrizes.addActionListener(new BotaoOperacaoHandler("Multiplicação entre matrizes", controlador));
        multiplicacaoEscalar.addActionListener(new BotaoOperacaoHandler("Multiplicação por escalar", controlador));
        transposta.addActionListener(new BotaoOperacaoHandler("Transposta", controlador));
        determinante.addActionListener(new BotaoOperacaoHandler("Determinante", controlador));
        inversa.addActionListener(new BotaoOperacaoHandler("Inversa", controlador));
    }

    public JPanel getPrincipal() {
        return principal;
    }

    public void setPrincipal(JPanel principal) {
        this.principal = principal;
    }

    public JButton getDeterminante() {
        return determinante;
    }

    public void setDeterminante(JButton determinante) {
        this.determinante = determinante;
    }

    public JButton getInversa() {
        return inversa;
    }

    public void setInversa(JButton inversa) {
        this.inversa = inversa;
    }

    public JButton getMultiplicacaoEscalar() {
        return multiplicacaoEscalar;
    }

    public void setMultiplicacaoEscalar(JButton multiplicacaoEscalar) {
        this.multiplicacaoEscalar = multiplicacaoEscalar;
    }

    public JButton getMultiplicacaoMatrizes() {
        return multiplicacaoMatrizes;
    }

    public void setMultiplicacaoMatrizes(JButton multiplicacaoMatrizes) {
        this.multiplicacaoMatrizes = multiplicacaoMatrizes;
    }

    public JButton getSoma() {
        return soma;
    }

    public void setSoma(JButton soma) {
        this.soma = soma;
    }

    public JButton getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(JButton subtracao) {
        this.subtracao = subtracao;
    }

    public JTextField getTitulo() {
        return titulo;
    }

    public void setTitulo(JTextField titulo) {
        this.titulo = titulo;
    }

    public JButton getTransposta() {
        return transposta;
    }

    public void setTransposta(JButton transposta) {
        this.transposta = transposta;
    }
}
