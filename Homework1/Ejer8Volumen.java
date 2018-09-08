import java.util.Scanner;
public class Ejer8Volumen{
 public static void main(String[] args) {
  Scanner ALT = new Scanner(System.in);
  System.out.println("Ingrese la altura de la alverca");
  double A= ALT.nextDouble();

  Scanner LAR = new Scanner(System.in);
  System.out.println("Ingrese lo largo de la alverca");
  double L= LAR.nextDouble();

  Scanner ANC = new Scanner(System.in);
  System.out.println("Ingrese lo anchura de la alverca");
  double N= ANC.nextDouble();

  Scanner COS = new Scanner(System.in);
  System.out.println("Ingrese el costo por metro cubico");
  double CM= COS.nextDouble();

  double V= (A * L * N)* CM;

   System.out.println("Pago a realizar por el consumo : "+ V);
}
}
