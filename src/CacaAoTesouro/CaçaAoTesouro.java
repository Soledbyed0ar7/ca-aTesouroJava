/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacaAoTesouro;

import java.util.Scanner;

/**
 *
 * @author EDU
 */
public class CaçaAoTesouro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner leia = new Scanner(System.in);
        criadorMatriz cria = new criadorMatriz();
        int[][] mapa = cria.criarMatriz();
        boolean b = false;
        int n = mapa.length;
        int colc = 0;
        int lnc = 0;
        for (int i = 0; i < n; i++) {                     //cria um laço que percorre toda a matriz
            for (int cont = 0; cont < n; cont++) {
                if (mapa[i][cont] == 1) {
                    lnc = i;
                    colc = cont;

                }
            }

        }
        while (b == false) {
            System.out.println("digite a linha");
            int ln = leia.nextInt() - 1;
            System.out.println("digite a coluna");
            int col = leia.nextInt() - 1;
            if (ln == lnc && col == colc) {
                b = true;
                System.out.println("parabens vc conseguiu");
            } else {
                if (ln == lnc) {
                    System.out.println("a linha esta certa");
                } else {
                    if (col == colc) {
                        System.out.println("a coluna esta certa");
                    } else {
                        System.out.println("nada esta certo");
                    }
                }
            }
        }
         for (int i = 0; i < n; i++) {                     //cria um laço que percorre toda a matriz
            for (int cont = 0; cont < n; cont++) {
                System.out.print(mapa[i][cont]+" ");

                
                
            }
             System.out.println("");
        }
    }

}
