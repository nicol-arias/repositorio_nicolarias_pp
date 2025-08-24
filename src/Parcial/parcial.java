package Parcial;
import java.util.Scanner;

public class parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nombre de empleado: ");
        String nombre = sc.nextLine();

        System.out.print("horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("tarifa por hora: ");
        double tarifa = sc.nextDouble();

        // Fórmulas
        double sueldoBruto = horas * tarifa;
        double descuento = sueldoBruto * 0.15;   // ONP 13%
        double sueldoNeto = sueldoBruto - descuento;

        // Resultados (con 1 decimal como en el enunciado)
        System.out.println("\nResultados:");
        System.out.printf("  sueldo bruto: %.1f%n", sueldoBruto);
        System.out.printf("  descuento: %.1f%n", descuento);
        System.out.printf("  sueldo Neto: %.1f%n", sueldoNeto);

        sc.close();
    }
}