package gen;
//设定上界，需为上界类型或其子类
//此时类型擦除会设置为他的边界类型
public class NumPair<U extends  Number, V extends Number> extends Pair2<U,V> {

    public NumPair(U first, V second) {
        super(first, second);
    }
}

//上界为某个接口，如Compareable，限定类型必须实现某个接口
//public static  <T extends Comparable<T>> T max(T[] arr){};

//Integer是 Number的子类，但是 DynamicArray<Integer>不是DynamicArray<Number>的子类，
//即DynamicArray<Integer> 不能赋值给DynamicArray<Number>