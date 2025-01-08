import javax.swing.*;

public class GenericClass<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}


class Main {
    public static void main(String[] args) {
        GenericClass<String> stringBox = new GenericClass<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println(stringBox.getValue());

        GenericClass<Integer> integerBox = new GenericClass<>();
        integerBox.setValue(49);
        System.out.println(integerBox.getValue());
    }
}