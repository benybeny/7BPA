import java.util.Scanner;
public class Ejer3Terreno{
  public static void main(String[] args) {
  Scanner AT = new Scanner (System.in);
  System.out.println(" ingrese la Altura del triangulo");
  double AT1 = AT.nextDouble();
  Scanner BT = new Scanner(System.in);
  System.out.println("ingrese la base del triangulo");
  double BT1 = BT.nextDouble();

  Scanner AR =new Scanner(System.in);
  System.out.println("ingrese la altura del rectangulo");
  double AR1=AR.nextDouble();

  Scanner BR =new Scanner(System.in);
  System.out.println("ingrese la base del rectangulo");
  double BR1 =BR.nextDouble();

  double AreaT= ((BT1 * AT1) / 2) + (AR1 * BR1);
System.out.println("el area total del terreno es: " + AreaT);

  }
}
