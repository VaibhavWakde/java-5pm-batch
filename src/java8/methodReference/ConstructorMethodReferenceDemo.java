package java8.methodReference;


interface Messageable{
    Message getMessage(String msg);
}

class Message{
    Message(String msg){
        System.out.println(msg);
    }
}

public class ConstructorMethodReferenceDemo {
    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.getMessage("Hello");
    }
}
