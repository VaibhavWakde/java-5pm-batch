package generics;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericsEx ex = new GenericsEx("Rs. 10");
        System.out.println(ex.getData());

        GenericsEx ex1 = new GenericsEx<>(10);
        System.out.println(ex.getData());
    }
}

class GenericsEx <T>{
    private T n;
    public GenericsEx(T n){
        this.n = n;
    }

    public T getData(){
        return n;
    }
}
