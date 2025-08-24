/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacaAoTesouro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EDU
 */
public class criadorMatriz {

    Scanner leia = new Scanner(System.in);
    Random rand = new Random();
    
    public int[][] criarMatriz(){
            
    System.out.println("digite o tamanho do tabuleiro");
    int n = leia.nextInt();
    int[][] mapa = new int[n][n];//cria um array
    boolean a=false;//cria um verificador pra ver se o numero random ja foi sorteado
    int numrand = n*n-1;//cria um num base por exmplo 63
    while(a==false){                              //
        for(int i=0;i<n;i++){                     //cria um laço que percorre toda a matriz
            for(int cont =0;cont<n;cont++){          //
                int numloc= rand.nextInt(n*n)+1;  //
                if (numloc>numrand&&a==false){
                    a = true;
                    mapa[i][cont]=1;
                }
                else{
                    mapa[i][cont]=0;
                }
                
            }
        
        }
    }
    
    return mapa;
    }
}
