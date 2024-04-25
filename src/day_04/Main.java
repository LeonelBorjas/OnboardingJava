package day_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorOperations calculator = new Calculator();
        CalculatorMenu calculatorMenu = new CalculatorWithMenu(calculator);
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            calculatorMenu.mostrarMenu();
            int opcion = scanner.nextInt();
            calculatorMenu.ejecutarOperacion(opcion);
            if (opcion == 5){
                salir = true;
            }
        }
        scanner.close();
    }
}
