
package ua.training;

public class App47 {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }

}
