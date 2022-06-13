package gen;


//擦除类型T，替换为Object，加上强制转换
public class Main {
    public static void main(String[] args) {
        Pair<Integer> minmax = new Pair<>(1,100);
        Integer min = minmax.getFirst();
        System.out.println(min);

        Pair2<Integer,String> minmax2 = new Pair2<>(2,"100");
        Integer min2 = minmax2.getFirst();
        System.out.println(min2);

        int j = Utils.indexof(new Integer[]{1,3,5},3);
        System.out.println(j);
        Pair2<Integer,Integer> k = Utils.makePair2(1000,3);
        System.out.println(k.getFirst());

    }
}
