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
  public static String arrToString(int[] arr){
    String ns = "{";
    for (int i = 0; i < arr.length; i++){
      if (i == arr.length-1) ns = ns + String.valueOf(arr[i]);
      else ns = ns + String.valueOf(arr[i]) + ", ";
    }
    ns = ns + "}";
    return ns;
  }
  public static String arrDeepToString(int[][] darr){
    String ns = "{";
    for (int i = 0; i < darr.length; i++){
      for (int a = 0; a < darr[i].length; a++){
        if (a == 0) ns = ns + "{";
        if (a == darr[i].length-1) ns = ns + String.valueOf(darr[i][a]) + "} ";
        else ns = ns + String.valueOf(darr[i][a]) + ", ";
      }
    }
    ns = ns + "}";
    return ns;
    }
  public static int[][] create2DArray(int rows, int clmns, int maxValue){
    int[][] na = new int[rows][clmns];
    for(int i = 0; i < rows; i++){
      for(int a = 0; a < clmns; a++){
        na[i][a] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return na;
  }
  public static int[][] create2DArrayRandomized(int rows, int clmns, int maxValue){
    int[][] na = new int[rows][];
    for(int i = 0; i < rows; i++){
      int randC = (int) (Math.random() * (clmns + 2));
      na[i] = new int[randC];
      for(int a = 0; a < randC; a++){
          na[i][a] = (int) (Math.random() * (maxValue + 1));
        }
    }
    return na;
}
