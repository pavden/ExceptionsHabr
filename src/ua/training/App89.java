
package ua.training;

public class App89 {

    // пугаем Exception
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }

}
