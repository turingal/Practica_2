import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        String name, email;
        char gender;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter author's data");
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("Email");
        email = sc.nextLine();
        System.out.println("Gender");
        gender = sc.next().charAt(0);
        Autor a1 = new Autor(name, email, gender);
        System.out.println(a1.toString());

    }
}
