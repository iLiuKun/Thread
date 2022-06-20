package stream;


import java.util.stream.LongStream;
//distinct()：最开始的代码中的 distinct() 可用于消除流中的重复元素。相比创建一个 Set 集合，该方法的效率要高很多。
//filter(Predicate)：过滤操作则会留下使过滤器方法返回值为 true的元素
//熟识了 sorted() 的无参数方法。其实它还有另一种形式的实现：传入一个 Comparator 参数
//peek() 操作的目的是帮助调试。它允许你无修改地查看流中的元素
//map(Function)：将原来流中的每个元素都调用参数里的方法，其返回值汇总起来产生一个新的流
//toArray()：将流转换成适当类型的数组
//toArray(generator)：在特殊情况下，生成器用于分配自定义的数组存储
//forEach(Consumer)：你已经看到过很多次 System.out::println 作为 Consumer 函数
//forEachOrdered(Consumer)： 确保按照原始流的顺序执行
//看着这两种形式，似乎forEach方法并不会按顺序输出，但其实在没有调用parallel()方法之前这两个方法的输出结果都是一样的
//collect(Collector)：使用 Collector 收集流元素到结果集合中
//collect(Supplier, BiConsumer, BiConsumer)：收集流元素到结果集合中，
//第一个参数用于创建一个新的结果集合，第二个参数用于将下一个元素加入到现有结果合集中，第三个参数用于将两个结果合集合并

public class Prime {

    public static Boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
        //如果流中所有元素调用上述方法都返回false，则noneMatch()返回true
    }

    public LongStream numbers() {
        return LongStream.iterate(2, i -> i + 1)
                .filter(Prime::isPrime);
    }

    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        new Prime().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }
}
