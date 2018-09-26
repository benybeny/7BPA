import javax.swing.JOptionPane;
public class Ejer3Terrenocopia{
  public static void main(String[] args) {
double  AT = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese la altura del triangulo "));
double BT = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese la base del triangulo "));
double AR = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese la altura del rectangulo "));
double BR = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese la base del triangulo "));
  double AreaT= ((BT * AT) / 2) + (AR * BR);
JOptionPane.showMessageDialog(null, "Area total es  "+ AreaT);
  }
}
