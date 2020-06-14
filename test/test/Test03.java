package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        Functionss fuctionss=(A,B)->A+B;
        System.out.println(fuctionss.voidmain(88,88));
//        ThreadLocal;
//        Stream;
        List<String> collected=Stream.of("a","b","c").collect(Collectors.toList());
//        assertEquals();
//        assert(Arrays.asList("a","b","c"),collected);
//        assert(Arrays.asList("a","b","c"),collected);
//        assertEquals;
    }
}
@FunctionalInterface
interface Functionss<Long>{
    Long voidmain(long aa,long bb);
}
