
package ua.training;

public class App50 {

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }
    }

}
