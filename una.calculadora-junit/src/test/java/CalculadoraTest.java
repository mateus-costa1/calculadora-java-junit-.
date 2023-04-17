import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
class CalculadoraTest {
	
		@Test
        Scanner console = new Scanner(System.in);
 
        System.out.print("n1: ");
        double n1 = Double.parseDouble(console.nextLine());
        System.out.print("n2: ");
        double n2 = Double.parseDouble(console.nextLine());
 
        Calculadora aut = new Calculadora(n1, n2);
 
        System.out.println("Soma.........: " + aut.soma());
        System.out.println("Subtração....: " + aut.subtracao());
        System.out.println("Multiplicação: " + aut.multiplicacao());
        System.out.println("Divisão......: " + aut.divisao());
  }

