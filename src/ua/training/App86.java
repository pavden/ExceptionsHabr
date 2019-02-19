
package ua.training;

public class App86 {

    // пугаем Exception
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        throw t; // но тут ошибка компиляции
    }

}
