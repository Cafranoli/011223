package attFOREACH;

import java.util.*;

public class att2 {            //sortear nome de matriz pré-definida (amigo secreto)                >>dica: Random range = new Random();<<
    public static void main(String[] args) {
        //String[] pessoasSorteio = {"Naninha","Lucélio","Fermino","Valdemiro","José","Hélio","Naida","Bispo","Bandeirante","Inocêncio"};
            //for (String rand : pessoasSorteio) { 
                //System.out.println("O nome do amigo secreto sorteado foi: " + rand);
        String[] nomes = {"Igor","Josy","Henrique","Paulo","Gustavo","Julio","Carol","Ana","Victor","Luiz Miguel","Jefferson","Caio","Rodrigo"};
        boolean pararSorteio = false;
        Scanner scnContinuar = new Scanner(System.in);
        String continuar;
        int minimo = 0;
        int maximo = nomes.length;
        while (pararSorteio == false) {
            int numeroSorteado = minimo + (int)(Math.random() * (maximo - minimo));

            System.out.println("O nome sorteado foi " + nomes[numeroSorteado] + " - numeroSorteado: " + numeroSorteado);
            System.out.println("Deseja sortear outro? (digite sim ou nao)");
            continuar = scnContinuar.nextLine();
            if (continuar.toUpperCase().equals("NAO")) {
                pararSorteio = true;
            }
        }
        scnContinuar.close();
    }
}
