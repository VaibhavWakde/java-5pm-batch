package generics;


/**
 * get only number input or allow only data type related to number ex. float,double, int etc.
 */
public class GenericBoundedType<T extends Number> {
    void display(){
        System.out.println();
    }

    public static void main(String[] args) {
        GenericBoundedType<Integer> boundedType = new GenericBoundedType();
        GenericBoundedType<Double> boundedType1 = new GenericBoundedType();
        GenericBoundedType<Float> boundedType2 = new GenericBoundedType();
//        GenericBoundedType<String> boundedType3 = new GenericBoundedType(); // not allow this string
    }
}
