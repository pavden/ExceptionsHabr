
package ua.training;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App76 {

    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

}
