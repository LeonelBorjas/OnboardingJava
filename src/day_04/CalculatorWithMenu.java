package day_04;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu{
    public CalculatorOperations calculadora;
    public Scanner scanner;

    public CalculatorWithMenu(CalculatorOperations calculadora) {
        this.calculadora = calculadora;
        this.scanner = new Scanner(System.in); // Inicializar el atributo scanner
    }

    @Override
    public void mostrarMenu() {
        System.out.println("-- Menú de la Calculadora --");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    @Override
    public void ejecutarOperacion(int opcion) {
        double num1, num2, resultado;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = calculadora.sumar(num1, num2);
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = calculadora.restar(num1, num2);
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = calculadora.multiplicar(num1, num2);
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                try {
                    resultado = calculadora.dividir(num1, num2);
                    System.out.println("Resultado de la división: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("¡Error! " + e.getMessage());
                }
                break;
            case 5:
                System.out.println("Saliendo de la calculadora...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}
