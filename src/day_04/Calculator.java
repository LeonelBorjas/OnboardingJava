package day_04;

public class Calculator implements CalculatorOperations {

    @Override
    public void calculadora() {
        
    }

    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("¡Error! División por cero no permitida.");
        }
        return num1 / num2;
    }
}
