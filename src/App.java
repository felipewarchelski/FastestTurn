import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Crie um codigo capaz de armazenar 10 tempos de voltas de veiculos que estao em uma corrida
        //Deverá ser informado a volta mais rápida
        //A segunda volta mais rapida
        //A terceira volta mais rapida
        //A media de todas as voltas

        int numeroCarros = 10;
        int[] voltas = new int[numeroCarros];
        Scanner scanner = new Scanner(System.in);
        int media = 0;

        for (int i = 0; i < numeroCarros; i++) {
            System.out.print("Digite o tempo de volta: ");
            int tempoVoltas = scanner.nextInt();
            voltas[i] = tempoVoltas;
            media = media + tempoVoltas;
        }

        int voltaMaisRapida = 999999999;
        for (int i = 0; i < numeroCarros; i++) {
            int volta1 = voltas[i];
            if(voltaMaisRapida > volta1) {
                voltaMaisRapida = volta1;
            }
        }

        int voltaMaisRapida2 = 999999999;
        for (int i = 0; i < numeroCarros; i++) {
            int volta2 = voltas[i];
            if (voltaMaisRapida2 > volta2 && volta2 > voltaMaisRapida) {
                voltaMaisRapida2 = volta2;
            }
        }

        int voltaMaisRapida3 = 999999999;
        for (int i = 0; i < numeroCarros; i++) {
            int volta3 = voltas[i];
            if (voltaMaisRapida3 > volta3 && volta3 > voltaMaisRapida2) {
                voltaMaisRapida3 = volta3;
            }
        }

        System.out.println("A volta mais rapida é: " + voltaMaisRapida);
        System.out.println("A segunda volta mais rapida é: " + voltaMaisRapida2);
        System.out.println("A terceira volta mais rapida é: " + voltaMaisRapida3);
        System.out.println("A média de tempo das voltas é: " + media / numeroCarros);


        scanner.close();
    }
}
