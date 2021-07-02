import java.util.Scanner;

public class Aula01_NP_02 {

public static void main(String[] args) {
double cel;
System.out.println("Digite a temperatura em grau Celsius (°C): ");
cel = new Scanner(System.in).nextDouble();
double fahrenheit = (9 * cel + 160) / 5;
System.out.println("A temperatura em Fahrenheit é: " +fahrenheit+ "°F");
}

}