import java.util.Scanner;
public class NumerosOrdenados{
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Ingrese tres numeros");
System.out.println("primer numero");
int Num1=input.nextInt();
System.out.println("segundo numero");
int Num2=input.nextInt();
System.out.println("tercer numero");
int Num3=input.nextInt();


if (Num1>Num2 &&  Num1 > Num3) {
  System.out.println("\n" + Num1+"\n" + Num2 + "\n"+ Num3);
}else {
  if (Num1>=Num3 && Num3>=Num2) {
    System.out.println("\n" + Num1+"\n" + Num3 + "\n"+ Num2);
  }else {
    if (Num2>=Num1 && Num1>=Num3) {
      System.out.println("\n" + Num2+"\n" + Num1 + "\n"+ Num3);
    }else {
      if (Num2>=Num3 && Num3>=Num1) {
        System.out.println("\n" + Num2+"\n" + Num3 + "\n"+ Num1);
      }else {
        if (Num3>=Num1 && Num1>=Num2) {
          System.out.println("\n" + Num3+"\n" + Num1 + "\n"+ Num2);
        }else {
          System.out.println("\n" + Num1+"\n" + Num2 + "\n"+ Num3);
        }
      }
    }
  }
}




}
}
