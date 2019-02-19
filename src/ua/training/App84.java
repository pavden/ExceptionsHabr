
package ua.training;

public class App84 {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Error e) {
            // ...
        }
    }

}
