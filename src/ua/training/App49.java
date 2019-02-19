
package ua.training;

public class App49 {

    public static void main(String[] args) {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }

}
