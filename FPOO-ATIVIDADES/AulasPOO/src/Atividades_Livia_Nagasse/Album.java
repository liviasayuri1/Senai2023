package Atividades_Livia_Nagasse;

import java.util.Iterator;
import java.util.Scanner;

import java.util.Scanner;

public class Album {

 

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int n = entrada.nextInt();

        int m = entrada.nextInt();

        

        Boolean[] ja_tenho = new Boolean[n];

        int x = 0;

        

        for (int i = 0; i < n; i ++)

        ja_tenho[i] = false;

        

        for (int i = 0; i < n; i ++) {

            x = entrada.nextInt();

            ja_tenho[x] = true;

        }

        int repetidas = 0;

        for(int i = 0; i < n; i++)

            if(ja_tenho[i])

                repetidas = repetidas+1;

        

        System.out.println("quantidade de figs repetidas=" + (n - repetidas));

        System.out.println("tamanho do album=" + n);

        System.out.println("quantidade de figurinhas=" + m);

    }

 

}
