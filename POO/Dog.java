public class Dog{
  //properties or attributes
public String color;
public  String eyesColor;
public  double height;
public  double lenght;
public double weight;
//methods o behavios
//void significa que solo se ocupa adentro sin salida
public String sit (){
  return "estoy sentado";
  //System.out.println("estoy sentado");
}
public  void bark(){
  System.out.println("wauf wauf wauf");
}
public void layDown(String name){
  System.out.println(name + "estoy recostado");
}
public  void eat(){
  System.out.println("estoy comiendo");
}
public void sleep(){
  System.out.println("zzzzzZZZZZ");
}
}
