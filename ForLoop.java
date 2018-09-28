import javax.swing.JOptionPane;
public  class ForLoop{
  public static void main(String[] args) {
//inocializar variable de control,,, condicion,,, incremento
int T=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese le numero de la tabla que desea consultar"));

do {
  String Salida="";
  for ( int i=0 ;i<=9 ;i++ ) {
  Salida +=T + " x " + (i + 1)+ "=" +(i+1)*T +"\n";
  }
  JOptionPane.showMessageDialog(null,Salida);
 T=Integer.parseInt(JOptionPane.showInputDialog(null,"desea consultar otra tabla "));
} while (T!=0);

  }
}
