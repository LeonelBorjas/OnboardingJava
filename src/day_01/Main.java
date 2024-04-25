package day_01;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        // Ejercicio 1
//        String nombre = "Leonel";
//        String apellido = "Borjas";
//        int edad = 23;
//        System.out.println("Mi nombre es: " + nombre + ", mi apellido es: " + apellido + ", y mi edad es: " + edad);

//        // Ejercicio 2
//        System.out.println(saludar());

//        // Ejercicio 3
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Escriba el primer numero");
//        byte num1 = scanner.nextByte();
//
//        System.out.println("Escriba el segundo numero");
//        byte num2 = scanner.nextByte();
//
//        System.out.println("Escriba el tercer numero");
//        byte num3 = scanner.nextByte();
//
//        byte max = num1;
//
//        if (num2 > max){
//            max = num2;
//        }
//
//        if (num3 > max){
//            max = num3;
//        }
//
//        System.out.println("El numero mayor es: " + max);

        // Ejercicio 4

        System.out.println("Escriba un numero");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }


        // Ejercicio 5
        System.out.println("Ingresa el primer String");
        String string1 = scanner.next();

        System.out.println("Ingresa el segundo String");
        String string2 = scanner.next();

        if (string1.equals(string2)){
            System.out.println("Los string son iguales");
        } else  {
            System.out.println("Los string no son iguales.");
        }


        // Ejercicio 6
        int numeroPrim = 19;
        if (esPrimo(numeroPrim)) {
            System.out.println(numeroPrim + " es primo.");
        } else {
            System.out.println(numeroPrim + " no es primo.");
        }

        // Ejercicio 7 y 8
        int[] arrayNumbers = { 2, 3, 6, 8, 9, 1 };

        int sum = 0;

        for (int number : arrayNumbers) {
            if (number % 2 == 0) {
                System.out.println("Los numeros pares: " + number);
            } else {
                sum += number;
            }
        }

        System.out.println("La suma de los numeros impares es: " + sum);

        // Ejercicio 9
        System.out.println("Calculator Menu:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        System.out.println("0. Exit");

        int choice;

        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Realizar operación de suma...");
                    break;
                case 2:
                    System.out.println("Realizar operación de resta...");
                    break;
                case 3:
                    System.out.println("Realizar operación de multiplicación...");
                    break;
                case 4:
                    System.out.println("Realizar operación de división...");
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (choice != 0);

        // Ejercicio 10
        int choice1;

        do {
            printMenu();
            System.out.print("Escribe tu eleccion ");
            choice1 = scanner.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Realizar operación de suma...");
                    break;
                case 2:
                    System.out.println("Realizar operación de resta...");
                    break;
                case 3:
                    System.out.println("Realizar operación de multiplicación...");
                    break;
                case 4:
                    System.out.println("Realizar operación de división...");
                    break;
                case 0:
                    System.out.println("Saliste de la calculadora!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (choice1 != 0);

        // Ejercicio 11

        int choice2;

        do {
            printAMenu();
            System.out.print("Enter your choice: ");
            choice2 = scanner.nextInt();

            switch (choice2) {
                case 1:
                    dataEntry(scanner);
                    break;
                case 2:
                    checkAvailableCapacity();
                    break;
                case 3:
                    checkMoneyRaised();
                    break;
                case 4:
                    System.out.println("Saliste del sistema, hasta luego!");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Por favor ingresa una opcion valida.");
                    break;
            }
        } while (choice2 != 4);


    }



    public static int availableCapacity = 100;
    public static double moneyRaised = 0.0;

//    public static String saludar () {
//        return "Bienvenido a la consola.";
//    }
    // Ejercicio 6
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    // método del ejercicio 9:
    public static void printMenu() {
        System.out.println("Menu Calculadora:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("0. Exit");
    }
    // métodos del ejercicio 11:
    public static void printAMenu() {
        System.out.println("\nAdministrador de Bolera:");
        System.out.println("1. Entrada de Datos");
        System.out.println("2. Verificar Capacidad Disponible");
        System.out.println("3. Verificar Dinero Recaudado");
        System.out.println("4. Cerrar Sesión");
    }

    public static void dataEntry(Scanner scanner) {
        System.out.print("Ingrese el número de personas que entran: ");
        int personasEntrando = scanner.nextInt();
        availableCapacity -= personasEntrando;

        System.out.print("Ingrese la cantidad de dinero recaudado: $");
        double cantidadRecaudada = scanner.nextDouble();
        moneyRaised += cantidadRecaudada;

        System.out.println("Registro de datos exitoso.");
    }

    public static void checkAvailableCapacity() {
        System.out.println("Capacidad Disponible: " + availableCapacity);
    }

    public static void checkMoneyRaised() {
        System.out.println("Dinero Recaudado: $" + moneyRaised);
    }


    // 12
    public class Main2 {
        private static int capacidad = 500;
        private static int dineroRecaudado = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("1. Registrar participante");
                System.out.println("2. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        registrarParticipante(scanner);
                        break;
                    case 2:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                }
            } while (opcion != 2);

            scanner.close();
        }

        private static void registrarParticipante(Scanner scanner) {
            if (capacidad <= 0) {
                System.out.println("Lo siento, el evento ya está completo.");
                return;
            }

            System.out.println("Ingresa tu nombre:");
            String nombre = scanner.next();
            System.out.println("Ingresa tu edad:");
            int edad = scanner.nextInt();
            System.out.println("Ingresa tu ID:");
            String id = scanner.next();
            System.out.println("¿Tienes un pase VIP? (sí/no):");
            String paseVip = scanner.next();

            if (edad < 21) {
                System.out.println("Lo siento, debes tener al menos 21 años para entrar.");
                return;
            }

            int precioEntrada = 1500;
            if (paseVip.equalsIgnoreCase("sí")) {
                precioEntrada = 0;
            } else {
                System.out.println("¿Tienes un pase con descuento? (sí/no):");
                String paseDescuento = scanner.next();
                if (paseDescuento.equalsIgnoreCase("sí")) {
                    precioEntrada /= 2; // Mitad de precio
                }
            }

            System.out.println("Selecciona el tipo de entrada:");
            System.out.println("1. Entrada normal (1500)");
            System.out.println("2. Entrada VIP (2000)");
            int opcionEntrada = scanner.nextInt();

            if (opcionEntrada == 1 && precioEntrada != 1500) {
                System.out.println("Lo siento, no puedes comprar una entrada normal con descuento.");
                return;
            }

            if (opcionEntrada == 2 && precioEntrada == 1500) {
                System.out.println("Lo siento, necesitas pagar el precio completo por una entrada VIP.");
                return;
            }

            capacidad--;
            dineroRecaudado += precioEntrada;
            System.out.println("¡Bienvenido, " + nombre + "! Disfruta del evento.");
        }
    }

}

