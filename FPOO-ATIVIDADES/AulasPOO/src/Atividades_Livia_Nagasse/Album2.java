package Atividades_Livia_Nagasse;

import java.util.Arrays;

public class Album2 {

    public static void main(String[] args) {
        int tamanhoalbum = 50; // Tamanho do álbum 
        
        //  números das figurinhas que ele possui
        int[] figurinhaspossuidas = {1, 5, 12, 15, 25, 32, 48};

        // quantidade de figurinhas possuídas
        int quantidadeFigurinhasPossuidas = figurinhaspossuidas.length;

        // lista de todas as figurinhas possíveis (de 1 até o tamanho do álbum)
        int[] todasFigurinhas = new int[tamanhoalbum];
        for (int i = 0; i < tamanhoalbum; i++) {
            todasFigurinhas[i] = i + 1;
        }

 

        // Identificando as figurinhas faltantes
        int[] figurinhasFaltantes = new int[tamanhoalbum - quantidadeFigurinhasPossuidas];
        int index = 0;
        for (int i = 0; i < todasFigurinhas.length; i++) {
            int figurinhaAtual = todasFigurinhas[i];
            if (!contains(figurinhaspossuidas, figurinhaAtual)) {
                figurinhasFaltantes[index++] = figurinhaAtual;
            }

        }

        // Exibindo as informações
        System.out.println("Quantidade de figurinhas possuídas: " + quantidadeFigurinhasPossuidas);
        System.out.println("Figurinhas possuídas: " + Arrays.toString(figurinhaspossuidas));
        System.out.println("Figurinhas faltantes: " + Arrays.toString(figurinhasFaltantes));
    }

 

    // Método auxiliar para verificar se um valor está presente no array
    public static boolean contains(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}

 