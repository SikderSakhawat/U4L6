import java.util.Scanner;
public class U4L6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");
        System.out.print("\nEnter your secure password: ");
        String password = scanner.nextLine();
        SecurePassword security = new SecurePassword(password);
        System.out.println(security.status());
    }
}
