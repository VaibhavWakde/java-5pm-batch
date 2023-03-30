package java8.methodReference;


interface Sayable {
    void say();
}
public class InstanceMethodReferenceDemo {
    public void saySomething(){
        System.out.println("Hello, this is non-static method");
    }
    public static void main(String[] args) {
        InstanceMethodReferenceDemo instanceMethodReferenceDemo = new InstanceMethodReferenceDemo();

        Sayable sayable = instanceMethodReferenceDemo::saySomething;

        sayable.say();

        Sayable sayable1 = new InstanceMethodReferenceDemo()::saySomething;
        sayable1.say();

    }
}
