import java.util.Scanner;
import java.util.Random;

public class JuegoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1; // Número entre 1 y 100
        int intento;
        int contador = 0;

        System.out.println("=== JUEGO DEL NÚMERO SECRETO ===");
        System.out.println("He pensado un número entre 1 y 100.");
        System.out.println("Nuevo mensaje");
        System.out.println("¡Intenta adivinarlo!");

        do {
            System.out.print("###############");
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número era " + numeroSecreto);
                System.out.println("Lo lograste en " + contador + " intentos.");
            }
        } while (intento != numeroSecreto);

        sc.close();
        System.out.println("Gracias por jugar.");
        System.out.println(":)");
    }
}
