import java.util.Scanner;
public class condition {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a<=40) {
      System.out.println("fail");
    }
    else if(a<=80) {
      System.out.println("pass");
    }
    else {
      System.out.println("first class");
    }
  }
}
