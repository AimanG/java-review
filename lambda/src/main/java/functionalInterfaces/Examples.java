package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //PREDICATE

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);

        Predicate<Integer> lesserthan = b -> b<18; //Implementation of test method that belongs to Predicate interfaces
        boolean result = lesserthan.test(50);
        System.out.println(result);

        //CONSUMER
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //BICONSUMER
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100, 200);

        //FUNCTION
        Function<String, String> fun = s -> "Hello " + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);

        //SUPPLIER
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



        Predicate<Integer> pred = (p) -> p%2 == 0 ? true :false;
        System.out.println(pred.test(10));

        BiConsumer<Integer, String>bn = (x,y) -> System.out.println(x+y);
        bn.accept(5, "apple");









    }
}









