public class Demo{
  public static String demo(int a){
    int print = 1;
    String ns = "";
    for (int i = 0; i<=a-1; i++){
      for (int j = 1; j <= a-i; j++){
        ns = ns + String.valueOf(print);
      }
      print = print + 1;
      ns = ns + "\n";
    }
    return ns;
  }
  public static void main(String[] args){
    System.out.print(Demo_.dem(5));
  }
}
