package gen;

public class Utils {
    public static <T> int indexof(T[] arr, T ele){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(ele)){
                return i;
            }
        }
        return -1;
    }

    public static <U,V> Pair2<U,V> makePair2(U first,V second){
        Pair2<U,V> pair2 = new Pair2<>(first,second);
        return pair2;
    }

}
