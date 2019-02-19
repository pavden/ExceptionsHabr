
package ua.training;

// НЕ КОМПИЛИРУЕТСЯ! ИССЛЕДУЕМ ГИПОТЕТИЧЕСКУЮ СИТУАЦИЮ!
public class App88 {

    public static void f0(Throwable t) throws Exception {
        throw t;
    }
    public static void f1(Object ref){
        char c = ref.charAt(0);
    }

}
