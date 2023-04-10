import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double downloade;
        double velocidade;
        double tempo;

        System.out.println("Insira o tamanho do arquivo em MB: ");
        Scanner teclado = new Scanner(System.in);
        downloade = teclado.nextDouble();
        System.out.println("Insira a velocidade do link da internet: ");
        velocidade = teclado.nextDouble();

        tempo = ((downloade / velocidade) * 60);
        System.out.println("Tempo aproximado de donwload do arquivo é de " + tempo + "minutos");
    }
}
