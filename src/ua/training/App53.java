
package ua.training;

public class App53 {

    public static void main(String[] args) {
        try {
            System.err.println("try");
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }

}
