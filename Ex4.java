public class Ex4 {
  public static void main(String[] args) {
    var sb = new StringBuilder();
    for(int i = 0; i < 10000; i++) {
      sb.append("java");
    }
    String s = sb.toString();
  }
}