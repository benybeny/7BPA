import java.util.Scanner;
public class Ejer1Triangulo{
  public static void main(String[] args) {
    Scanner Altura = new Scanner (System.in);
    System.out.println(" ingrese la Altura del triangulo");
  double Altura1 = Altura.nextDouble();

  Scanner Base = new Scanner(System.in);
  System.out.println("ingrese la base del triangulo");
  double Base1 = Base.nextDouble();

double Area = (Base1 * Altura1) / 2 ;
System.out.println("el area del triangulo es : " + Area);



  }

}
