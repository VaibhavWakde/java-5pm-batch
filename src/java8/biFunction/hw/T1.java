package java8.biFunction.hw;

public interface T1 {
    default void display() {
        System.out.println("T1 display method");
    }
}

interface T2{
    default void display() {
        System.out.println("T2 display method");
    }
}

class TestInterface implements T1,T2{
    public static void main(String[] args) {
        T1 t1 = new TestInterface();
        T2 t2 = new TestInterface();

        t1.display();
        t2.display();
    }


    @Override
    public void display() {
        T1.super.display();
    }
}
