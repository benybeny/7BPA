//conversion de galon a litros
import javax.swing.JOptionPane;
public class Ejer5copia{
  public static void main(String[] args) {
    //solicitar el numeros de litros y el presio
int Ga=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de litros por dia "));
int  Pre=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el precio por galon "));
 //calcular el numero de galones
    double TG = Ga / 3.785 ;
    //calcular las ganancias
    double GN =TG* Pre;
      JOptionPane.showMessageDialog(null, " ganancias del dia   " + GN);
  }
}
