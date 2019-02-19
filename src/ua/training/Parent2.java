
package ua.training;

import java.io.IOException;

public class Parent2 {
    public void f() throws IOException, InterruptedException {}
}

class Child2 extends Parent2 {
    @Override
    public void f() throws Exception {}
}
