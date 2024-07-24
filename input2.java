import java.util.Scanner ;

public class input2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
        System.out.println("Enter your city");
        String city = sc.next();
        
        System.out.println("Enter your trade");
        String trade = sc.next();
        
        System.out.println("Enter your phn");
        int phn = sc.nextInt();
        
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        
        System.out.println("City : " + city);
        
        System.out.println("trade : " + trade);
        
        System.out.println("phn : " + phn);

    }
}
