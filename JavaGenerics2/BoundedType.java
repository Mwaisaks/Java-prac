public class BoundedType<T extends Number> {
    private T value;
    public BoundedType(T value){
        this.value = value;
    }

    public double getDoubleValue(){
        return  value.doubleValue();
    }
}

//Bounded Type Parameters: Restrict the type parameter to a certain type or its subclasses.

//Wildcard (?): Used when the exact type isn't important.
//
//? extends T: Accepts T or its subclasses.
//? super T: Accepts T or its superclasses.

/*
public static void printNumbers(List<? extends Number> numbers) {
    for (Number num : numbers) {
        System.out.println(num);
    }
}

 */