import java.util.Scanner;
public class Ejer3Lapices{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("**cantidad a pagar por lapices**");
System.out.println("ingrese el numero de lapices ");
int X=input.nextInt();
System.out.println("-----------------------------");
if (X>=1000) {
  double PAG=X*0.85;
  System.out.println("Total a pagar: "+ PAG);
}else {
  double PAG=X*0.90;
  System.out.println("Total a pagar: " + PAG);
}


  }
}
