package attFOREACH;

public class att4 {
    public static void main(String[] args) {             //iniciar contagem de número do for depois de 5 segundos
        String[] cursos = {"Java","JavaScript","JavaFX","JavaX","Javé"};
        int segundosContando = 5;
        for (short c = 1; c <= segundosContando; c++) {
            try {
                System.out.println("Contando... Foram " + c + " segundos.");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Ops! o contador falhour. Erro: " + e);
            }
        }

        System.out.println("Os cursos são:");

        for (short n = 0; n < cursos.length; n++) {
            System.out.println(cursos[n]);
        }
    }
}
