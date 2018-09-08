import java.util.Scanner;
public class Ejer6Sueldo{
  public static void main(String[] args) {
  Scanner Hrs = new Scanner(System.in);
  System.out.println("ingrese el numero de horas tabajadas");
  double HT = Hrs.nextDouble();
  Scanner Pag = new Scanner(System.in);
  System.out.println("ingrese el pago por hora");
  double PH = Pag.nextDouble();
//sueldo semanal
double SS= HT*PH;

System.out.println("El sueldo semanal es: " + SS);


  }
}
