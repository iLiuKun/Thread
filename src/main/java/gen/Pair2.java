package gen;

public class Pair2<U, V> {
    U first;
    V second;

    public Pair2(U first, V second){
        this.first = first;
        this.second = second;
    }
    public U getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

}
