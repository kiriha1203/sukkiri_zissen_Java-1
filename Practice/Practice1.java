package Practice;

public class Practice1 {
  public static void main(String[] args) {
    var sb = new StringBuilder();
    for(int i = 1; i < 101; i++) {
      sb.append(i).append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
    
  }

}