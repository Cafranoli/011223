package attFOREACH;

import java.util.Scanner;

public class att3 {               //selecionar fruta de matriz de frutas
    public static void main(String[] args) {
        String[] frutas = {"Manga","Abacaxi","Laranja","Pera","Uva","Maçã"};
        Scanner scnFruta = new Scanner(System.in);
        for (short f = 0; f < frutas.length; f++) {
            System.out.println("Fruta [ " + f + " ] - " + frutas[f]);
        }
        System.out.println("Digite o código de uma fruta acima");
        short fruta = scnFruta.nextShort();
        System.out.println("Você selecionou a fruta " + frutas[fruta]);
    }
}
