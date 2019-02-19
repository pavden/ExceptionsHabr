
package ua.training;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent1 {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child1 extends Parent1 {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}
