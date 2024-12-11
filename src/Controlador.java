import java.util.Objects;

public class Controlador {
    private Interface interfacePrincipal;
    public void OperacaoPressionada(String operacao){
        if (Objects.equals(operacao, "Soma")) {
            System.out.println("OK soma");
        } else if (Objects.equals(operacao, "Subtração")) {
            System.out.println("OK subtraçao");
        } else if (Objects.equals(operacao, "Multiplicação entre matrizes")) {
            System.out.println("OK multi1");
        } else if (Objects.equals(operacao, "Multiplicação por escalar")) {
            System.out.println("OK multi2");
        } else if (Objects.equals(operacao, "Transposta")) {
            System.out.println("OK transposta");
        } else if (Objects.equals(operacao, "Determinante")) {
            System.out.println("OK det");
        } else if (Objects.equals(operacao, "Inversa")) {
            System.out.println("OK inv");
        }
    }
}
