import java.util.Scanner;

public class intento_de_calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora sencilla en Java");
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Elige la operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: división entre cero");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
