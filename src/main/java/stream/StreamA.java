package stream;

import java.util.stream.Stream;

public class StreamA {
    public static void main(String[] args) throws Exception {
        test();
    }

    static void test(){

        Stream.of("Will I eat the apple?".split(" "))
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }

//    public static void test() {
//        //PS:这里的FileToWords是一个可以将文本文件转换成单词流的类
//        FileToWords.stream("Cheese.dat")
//                .skip(10)
//                .limit(10)
//                .sorted(Comparator.reverseOrder())
//                .map(w -> w + " ")
//                .forEach(System.out::print);
//    }
}
