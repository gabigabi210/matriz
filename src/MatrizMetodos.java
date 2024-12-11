//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ProjetoManel;

public class MatrizMetodos {
    public MatrizMetodos() {
    }

    static void mostraMatrizA(int[][] matrizA, int l, int c) {
        System.out.println("\nElementos da Matriz A:");

        for(int i = 0; i < l; ++i) {
            for(int j = 0; j < c; ++j) {
                System.out.printf("%5d  ", matrizA[i][j]);
            }

            System.out.println();
        }

        System.out.println("========================================");
    }

    static void mostraMatrizB(int[][] matrizB, int l2, int c2) {
        System.out.println("\nElementos da Matriz B:");

        for(int i = 0; i < l2; ++i) {
            for(int j = 0; j < c2; ++j) {
                System.out.printf("%5d  ", matrizB[i][j]);
            }

            System.out.println();
        }

        System.out.println("========================================");
    }

    static void somarMatrizes(int[][] matrizA, int[][] matrizB, int l, int l2, int c, int c2) {
        if (l == l2 && c == c2) {
            int[][] matrizResultado = new int[l][c];

            int i;
            int j;
            for(i = 0; i < l; ++i) {
                for(j = 0; j < c; ++j) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

            System.out.println("\nElementos da Matriz Soma:");

            for(i = 0; i < l; ++i) {
                for(j = 0; j < c; ++j) {
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

    static void subtrairMatrizes(int[][] matrizC, int[][] matrizD, int lc, int ld, int cc, int cd) {
        if (lc == ld && cc == cd) {
            int[][] matrizResultado = new int[lc][cc];

            int i;
            int j;
            for(i = 0; i < lc; ++i) {
                for(j = 0; j < cc; ++j) {
                    matrizResultado[i][j] = matrizC[i][j] - matrizD[i][j];
                }
            }

            System.out.println("\nElementos da Matriz Subtraida:");

            for(i = 0; i < lc; ++i) {
                for(j = 0; j < cc; ++j) {
                    System.out.printf("%5d  ", matrizResultado[i][j]);
                }

                System.out.println();
            }

            System.out.println("========================================");
        } else {
            System.out.println("Condições para realizar subtração inválidas");
        }

    }

    static void multipliacacaoMatrizez(int[][] matrizM1, int[][] matrizM2, int lm, int lm2, int cm, int cm2) {
        if (cm == lm2) {
            int[][] matrizResultado = new int[lm][cm2];

            int i;
            int j;
            for(i = 0; i < lm; ++i) {
                for(j = 0; j < cm2; ++j) {
                    for(int k = 0; k < lm2; ++k) {
                        matrizResultado[i][j] += matrizM1[i][k] * matrizM2[k][j];
                    }
                }
            }

            System.out.println("\nElementos da Matriz Multiplicada:");

            for(i = 0; i < lm; ++i) {
                for(j = 0; j < cm2; ++j) {
                    System.out.printf("%5d  ", matrizResultado[i][j]);
                }

                System.out.println();
            }

            System.out.println("========================================");
        } else {
            System.out.println("As condições para realizar a mutiplicação de matrizes não foram atendidas");
        }

    }

    static void transpostaMatriz(int[][] matrizT, int lt, int ct) {
        int[][] transposta = new int[ct][lt];

        int i;
        int j;
        for(i = 0; i < lt; ++i) {
            for(j = 0; j < ct; ++j) {
                transposta[j][i] = matrizT[i][j];
            }
        }

        System.out.println("\nElementos da Matriz Transposta:");

        for(i = 0; i < ct; ++i) {
            for(j = 0; j < lt; ++j) {
                System.out.printf("%5d  ", transposta[i][j]);
            }

            System.out.println();
        }

    }

    static void multiplicacaoEscalarMatrizez(int[][] matrizME, int lme, int cme, int escalar) {
        int[][] matrizResultado = new int[lme][cme];

        int i;
        int j;
        for(i = 0; i < lme; ++i) {
            for(j = 0; j < cme; ++j) {
                matrizResultado[i][j] += escalar * matrizME[i][j];
            }
        }

        System.out.println("\nElementos da Matriz Multiplicada:");

        for(i = 0; i < lme; ++i) {
            for(j = 0; j < cme; ++j) {
                System.out.printf("%5d  ", matrizResultado[i][j]);
            }

            System.out.println();
        }

        System.out.println("========================================");
    }

    static void obtercofator(int[][] matriz, int[][] apoio, int p, int q, int n) {
        int j = 0;
        int i = 0;

        for(int linha = 0; linha < n; ++linha) {
            for(int coluna = 0; coluna < n; ++coluna) {
                if (linha != p && coluna != q) {
                    apoio[i][j++] = matriz[linha][coluna];
                    if (j == n - 1) {
                        j = 0;
                        ++i;
                    }
                }
            }
        }

    }

    static int determinanteMatriz(int[][] matriz, int n) {
        int determinante = 0;
        if (n == 1) {
            return matriz[0][0];
        } else {
            int[][] apoio = new int[n][n];
            int multiplicador = 1;

            for(int k = 0; k < n; ++k) {
                obtercofator(matriz, apoio, 0, k, n);
                determinante += multiplicador * matriz[0][k] * determinanteMatriz(apoio, n - 1);
                multiplicador = -multiplicador;
            }

            return determinante;
        }
    }

    static void matrizCofatores(int[][] matriz, int[][] cofatores, int n) {
        int[][] apoio = new int[n][n];
        int multiplicador = 1;

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                obtercofator(matriz, apoio, i, j, n);
                cofatores[i][j] = multiplicador * determinanteMatriz(apoio, n - 1);
                multiplicador = -multiplicador;
            }
        }

    }

    static void matrizAdjunta(int[][] cofatores, int n) {
        int[][] transposta = new int[n][n];

        int i;
        int j;
        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                transposta[j][i] = cofatores[i][j];
            }
        }

        System.out.println("\nElementos da Matriz Transposta:");

        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                System.out.printf("%5d  ", transposta[i][j]);
            }

            System.out.println();
        }

    }

    static void matrizInversa(int[][] matrizIn, int[][] matrizOriginal, int n) {
        System.out.println("\nElementos da Matriz Inversa:");

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.printf(matrizIn[i][j] + "/" + determinanteMatriz(matrizOriginal, n) + "   ");
            }

            System.out.println();
        }

        System.out.println("========================================");
    }
}
