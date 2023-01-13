package fundamentos;
import java.util.Scanner;
public class DesafioCalculadora {
  
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
  System.out.println("informe o primeiro valor:");
  double num1 = entrada.nextDouble();
  System.out.println("informe o segundo valor:");
  double num2 = entrada.nextDouble();
  
    System.out.println("informe uma operacao:\n + Soma \n - Subtracao \n * Multiplicacao \n / divisao \n % modulo");
    String op = entrada.next();

    double resultado = "+".equals(op) ? num1 + num2 : 0;
 resultado = "-".equals(op) ? num1 - num2 : resultado;
 resultado = "*".equals(op) ? num1 * num2 : resultado;
resultado = "/".equals(op) ? num1 / num2 : resultado;
resultado = "%".equals(op) ? num1 + num2 : resultado ;
System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2,resultado);
    
    entrada.close();
      
  }
}