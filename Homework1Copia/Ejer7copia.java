//calcular la cantidad depulgadas en metros
import javax.swing.JOptionPane;
public class Ejer7copia{
public static void main(String[] args) {
double CM=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de metros de tela que requiera "));
  //pulgadas que debe pedir
double PG = CM / 0.0254;
JOptionPane.showMessageDialog(null," total de pulgadas de   " + CM + " metros es : " + PG," convertir metros a pulgadas ",JOptionPane.WARNING_MESSAGE);
}
}
