public class Main {
    public static void main(String[] args) {
        int nota1 = 0, nota2 = 1, nota3 = 1, nota4 = 1, media;

        media = pegarMedia(nota1, nota2, nota3, nota4);
        resultado(media);
    }

    private static void resultado(int media) {
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    private static int pegarMedia(int valor1, int valor2, int valor3, int valor4) {
        int media = (valor1 + valor2 + valor3 + valor4) / 4;
        return media;
    }

}