import java.util.Scanner;

class MatrizMetodos {


    static void mostraMatrizA(int matrizA[][], int l,int c) {

        System.out.println("\nElementos da Matriz A:");
        for (int i = 0; i < l; i += 1) {
            for (int j = 0; j < c; j += 1) {
                System.out.printf("%5d  ", matrizA[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================================");

    }

    static void mostraMatrizB(int matrizB[][], int l2,int c2) {
        // mostra matriz b
        System.out.println("\nElementos da Matriz B:");
        for (int i = 0; i < l2; i += 1) {
            for (int j = 0; j < c2; j += 1) {
                System.out.printf("%5d  ", matrizB[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================================");

    }

    static void somarMatrizes(int matrizA[][],int matrizB[][],int l,int l2,int c,int c2) {
        // faz a soma "_"
        if (l == l2 && c == c2) {
            int[][] matrizResultado = new int[l][c];
            for (int i = 0; i < l; i += 1) {
                for (int j = 0; j < c; j += 1) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            // mostra a soma
            System.out.println("\nElementos da Matriz Soma:");
            for (int i = 0; i < l; i += 1) {
                for (int j = 0; j < c; j += 1) {
                    System.out.printf("%5d  ", matrizResultado[i][j]);
                }
                System.out.println();
            }
            System.out.println("========================================");
        } else {
            System.out.println("Condições para realizar soma inválidas");
            System.out.println();
        }
    }

    static void subtrairMatrizes(int matrizC[][],int matrizD[][],int lc,int ld,int cc,int cd){
        //faz subtração
        if (lc == ld && cc == cd) {
            int[][] matrizResultado = new int[lc][cc];
            for (int i = 0; i < lc; i += 1) {
                for (int j = 0; j < cc; j += 1) {
                    matrizResultado[i][j] = matrizC[i][j] - matrizD[i][j];
                }
            }
            // mostra a soma
            System.out.println("\nElementos da Matriz Subtraida:");
            for (int i = 0; i < lc; i += 1) {
                for (int j = 0; j < cc; j += 1) {
                    System.out.printf("%5d  ", matrizResultado[i][j]);
                }
                System.out.println();
            }
            System.out.println("========================================");

        } else {
            System.out.println("Condições para realizar subtração inválidas");
        }
    }

    static void multipliacacaoMatrizez(int matrizM1[][],int matrizM2[][],int lm,int lm2, int cm, int cm2){
        //multiplicação
        if (cm == lm2) {
            int[][] matrizResultado = new int[lm][cm2];
            for (int i = 0; i < lm; i += 1) {
                for (int j = 0; j < cm2; j += 1) {
                    for (int k = 0; k < lm2; k += 1) {
                        matrizResultado[i][j] += matrizM1[i][k] * matrizM2[k][j];
                    }
                }
            }
            // mostra a multiplicação
            System.out.println("\nElementos da Matriz Multiplicada:");
            for (int i = 0; i < lm; i += 1) {
                for (int j = 0; j < cm2; j += 1) {
                    System.out.printf("%5d  ", matrizResultado[i][j]);
                }
                System.out.println();
            }
            System.out.println("========================================");
        } else {
            System.out.println("As condições para realizar a mutiplicação de matrizes não foram atendidas");
        }
    }

    static void transpostaMatriz(int matrizT[][],int lt,int ct){
        //transposta
        int[][] transposta = new int[ct][lt];
        for (int i = 0; i < lt; i++) {
            for (int j = 0; j < ct; j++) {
                transposta[j][i] = matrizT[i][j];
            }
        }
        //mostra a transposta
        System.out.println("\nElementos da Matriz Transposta:");
        for (int i = 0; i < ct; i++) {
            for (int j = 0; j < lt; j++) {
                System.out.printf("%5d  ", transposta[i][j]);
            }
            System.out.println();
        }
    }

    static void multiplicacaoEscalarMatrizez(int matrizME[][],int lme, int cme, int escalar){
        //multiplicação
        int[][] matrizResultado = new int[lme][cme];
        for (int i = 0; i < lme; i += 1) {
            for (int j = 0; j < cme; j += 1) {
                matrizResultado[i][j] += escalar * matrizME[i][j];

            }
        }
        // mostra a multiplicação
        System.out.println("\nElementos da Matriz Multiplicada:");
        for (int i = 0; i < lme; i += 1) {
            for (int j = 0; j < cme; j += 1) {
                System.out.printf("%5d  ", matrizResultado[i][j]);
            }
            System.out.println();
        }
        System.out.println("========================================");

    }

    static void obtercofator(int matriz[][], int apoio[][],int p,int q,int n){
        int j = 0, i = 0;
        for(int linha = 0; linha < n; linha++){
            for(int coluna = 0; coluna < n; coluna++){
                if(linha != p && coluna != q){
                    apoio[i][j++] = matriz[linha][coluna];
                    if(j == n -1 ){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    } // Termina os cofatores

    //calcula o det
    static int determinanteMatriz(int matriz[][], int n){
        int determinante = 0;
        if(n == 1){
            return matriz[0][0];
        }
        int apoio[][]= new int[n][n];
        int multiplicador = 1;

        for(int k = 0; k < n; k++){
            obtercofator(matriz,apoio,0,k,n);
            determinante += multiplicador * matriz[0][k] * determinanteMatriz(apoio,n-1);
            multiplicador = -multiplicador;
        }
        return determinante;
    } // determinante

    static void matrizCofatores(int matriz[][],int cofatores[][], int n) {
        int apoio[][] = new int[n][n];
        int multiplicador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                obtercofator(matriz, apoio, i, j, n);
                cofatores[i][j] = multiplicador * determinanteMatriz(apoio, n - 1);
                multiplicador = -multiplicador;
            }
        }
    }//cofatores

    static void matrizInversa(int matrizIn[][],int matrizOriginal[][],int n){
        // mostrar inversa
        System.out.println("\nElementos da Matriz Inversa:");
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                System.out.printf(matrizIn[i][j] + "/" + determinanteMatriz(matrizOriginal,n)+"   ");
            }
            System.out.println();
        }
        System.out.println("========================================");

    }
}
