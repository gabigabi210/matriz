import javax.swing.*;
import java.util.Scanner;

public class MatrizTeste2 extends MatrizMetodos {
    public static void main(String[] args){

        ///parte que eu to mexendo
        Controlador controlador = new Controlador();
        Interface inter = new Interface(controlador);
        JFrame janela = new JFrame("Calculadora de Matrizes");
        janela.setContentPane(inter.getPrincipal());
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setVisible(true);
        //acaba
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de matrizez!!");
        System.out.println("Qual operação você deseja realiza?");
        System.out.println("1= Soma                          2= Subtração         3= Multiplicação entre matrizez      4= Multiplicação por escalar ");
        System.out.println("5= Transposta   6= Determinante      7= Matriz Inversa");

        int respostaMenu = sc.nextInt();
        switch (respostaMenu) {
            case 1:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int l = sc.nextInt();
                int c = sc.nextInt();
                System.out.print("Digite o tamanho da segunda matriz (linhas x colunas): ");
                int l2 = sc.nextInt();
                int c2 = sc.nextInt();
                //cria matirz com tamanho desejado
                int[][] matrizA = new int[l][c];
                int[][] matrizB = new int[l2][c2];
                // colaca nuemros de a
                System.out.println("\nDigite os elementos da Matriz A:");
                for (int i = 0; i < l; i += 1) {
                    for (int j = 0; j < c; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizA[i][j] = sc.nextInt();
                    }
                }
                // coloca numeros de b
                System.out.println("\nDigite os elementos da Matriz B:");
                for (int i = 0; i < l2; i += 1) {
                    for (int j = 0; j < c2; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizB[i][j] = sc.nextInt();
                    }
                }
                mostraMatrizB(matrizA, l, c);
                mostraMatrizB(matrizB, l2, c2);
                somarMatrizes(matrizA, matrizB, l, l2, c, c2);
                break;
            case 2:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lc = sc.nextInt();
                int cc = sc.nextInt();
                System.out.print("Digite o tamanho da segunda matriz (linhas x colunas): ");
                int ld = sc.nextInt();
                int cd = sc.nextInt();
                //cria matirz com tamanho desejado
                int[][] matrizC = new int[lc][cc];
                int[][] matrizD = new int[ld][cd];
                // colaca nuemros de a
                System.out.println("\nDigite os elementos da Matriz A:");
                for (int i = 0; i < lc; i += 1) {
                    for (int j = 0; j < cc; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizC[i][j] = sc.nextInt();
                    }
                }
                // coloca numeros de b
                System.out.println("\nDigite os elementos da Matriz B:");
                for (int i = 0; i < ld; i += 1) {
                    for (int j = 0; j < cd; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizD[i][j] = sc.nextInt();
                    }
                }

                mostraMatrizB(matrizC, lc, cc);
                mostraMatrizB(matrizD, ld, cd);
                subtrairMatrizes(matrizC, matrizD, lc, ld, cc, cd);
                break;

            case 3:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lm = sc.nextInt();
                int cm = sc.nextInt();
                System.out.print("Digite o tamanho da segunda matriz (linhas x colunas): ");
                int lm2 = sc.nextInt();
                int cm2 = sc.nextInt();
                //cria matirz com tamanho desejado
                int[][] matrizM1 = new int[lm][cm];
                int[][] matrizM2 = new int[lm2][cm2];
                // colaca nuemros de a
                System.out.println("\nDigite os elementos da Matriz A:");
                for (int i = 0; i < lm; i += 1) {
                    for (int j = 0; j < cm; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizM1[i][j] = sc.nextInt();
                    }
                }
                // coloca numeros de b
                System.out.println("\nDigite os elementos da Matriz B:");
                for (int i = 0; i < lm2; i += 1) {
                    for (int j = 0; j < cm2; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizM2[i][j] = sc.nextInt();
                    }
                }
                mostraMatrizB(matrizM1, lm, cm);
                mostraMatrizB(matrizM2, lm2, cm2);
                multipliacacaoMatrizez(matrizM1, matrizM2, lm, lm2, cm, cm2);
                break;

            case 4:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lme = sc.nextInt();
                int cme = sc.nextInt();
                System.out.print("Digite o escalar a qual você deseja multiplicar pela matriz: ");
                int escalar = sc.nextInt();
                //cria atirz com tamanho desejado
                int[][] matrizME = new int[lme][cme];
                // colaca nuemros de a
                System.out.println("\nDigite os elementos da Matriz A:");
                for (int i = 0; i < lme; i += 1) {
                    for (int j = 0; j < cme; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizME[i][j] = sc.nextInt();
                    }
                }
                mostraMatrizB(matrizME, lme, cme);
                multiplicacaoEscalarMatrizez(matrizME, lme, cme, escalar);
                break;

            case 5:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lt = sc.nextInt();
                int ct = sc.nextInt();
                //cria atirz com tamanho desejado
                int[][] matrizT = new int[lt][ct];
                // colaca nuemros de a
                System.out.println("\nDigite os elementos da Matriz A:");
                for (int i = 0; i < lt; i += 1) {
                    for (int j = 0; j < ct; j += 1) {
                        System.out.printf("Elemento [%d][%d]: ", i, j);
                        matrizT[i][j] = sc.nextInt();
                    }
                }
                mostraMatrizB(matrizT, lt, ct);
                transpostaMatriz(matrizT, lt, ct);
                break;

            case 6:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lde = sc.nextInt();
                int cde = sc.nextInt();
                if (lde == cde) {
                    //cria atirz com tamanho desejado
                    int[][] matrizDE = new int[lde][cde];
                    // colaca nuemros de a
                    System.out.println("\nDigite os elementos da Matriz A:");
                    for (int i = 0; i < lde; i += 1) {
                        for (int j = 0; j < cde; j += 1) {
                            System.out.printf("Elemento [%d][%d]: ", i, j);
                            matrizDE[i][j] = sc.nextInt();
                        }
                    }
                    mostraMatrizB(matrizDE, lde, cde);
                    System.out.println(determinanteMatriz(matrizDE, lde));
                } else {
                    System.out.println("Impossível calcular o determinante de uma matriz não quadrada");
                }

            case 7:
                System.out.print("Digite o tamanho da primeira matriz (linhas x colunas): ");
                int lin = sc.nextInt();
                int cin = sc.nextInt();
                if (lin == cin) {
                    //cria atirz com tamanho desejado
                    int[][] matrizIV = new int[lin][cin];
                    // colaca nuemros de a
                    System.out.println("\nDigite os elementos da Matriz A:");
                    for (int i = 0; i < lin; i += 1) {
                        for (int j = 0; j < cin; j += 1) {
                            System.out.printf("Elemento [%d][%d]: ", i, j);
                            matrizIV[i][j] = sc.nextInt();
                        }
                    }
                    mostraMatrizB(matrizIV, lin, cin);
                    // cofatores
                    System.out.println("O determinante dessa matriz é = " + determinanteMatriz(matrizIV, lin));
                    int[][] cofatores = new int[lin][cin];
                    matrizCofatores(matrizIV, cofatores, lin);
                    System.out.println("\nMatriz dos Cofatores:");
                    for (int i = 0; i < lin; i++) {
                        for (int j = 0; j < cin; j++) {
                            System.out.printf("%5d  ", cofatores[i][j]);
                        }
                        System.out.println();
                    }
                    int[][] transposta = new int[lin][cin];
                    for (int i = 0; i < lin; i++) {
                        for (int j = 0; j < cin; j++) {
                            transposta[j][i] = cofatores[i][j];
                        }
                    }
                    //mostra a transposta
                    System.out.println("\nElementos da Matriz Adjunta:");
                    for (int i = 0; i < lin; i++) {
                        for (int j = 0; j < cin; j++) {
                            System.out.printf("%5d  ", transposta[i][j]);
                        }
                        System.out.println();
                    }

                    matrizInversa(transposta,matrizIV,lin);

                } else {
                    System.out.println("Impossível calcular o determinante de uma matriz não quadrada");
                }

        }
    }
}
