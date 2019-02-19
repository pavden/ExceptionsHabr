
package ua.training;

public class App51 {

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }

}
