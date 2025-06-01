// Figura 2.3: Welcome.java 
// Printing one line of text with multiple instructions

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome\nto\nthe\nJava!");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ha\n");
        }
        System.out.println("!");

        System.out.printf("%s%n%s%n",
         "Testing format", "Another line buh");

        System.out.println("\"commas\"");
    }
}
