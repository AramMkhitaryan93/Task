package emailApplication;

public class Main {
    public static void main(String[] args) {
        EmailApp email = new EmailApp("FirstName", "LastName");
        EmailApp email1 = new EmailApp("FirstName", "LastName");
        System.out.println(email.showInfo());

    }
}
