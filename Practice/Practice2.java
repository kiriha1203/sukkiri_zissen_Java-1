package Practice;

public class Practice2 {
  public static void main(String folder, String file) {
    if(!folder.endsWith("¥¥")) {
      folder += "¥¥";
    }
    return folder + file;
  }
  
}