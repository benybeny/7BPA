import javax.swing.JOptionPane;
public class Ejer1Triangulocopia{
  public static void main(String[] args) {
int Altura = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese la altura del triangulo "));
int Base = Integer.parseInt(JOptionPane.showInputDialog(null, " introduce la base del triangulo "));
double Area = (Base * Altura) ;
JOptionPane.showMessageDialog(null, "Area del triangulo  es "+ Area/2);
  }
}
