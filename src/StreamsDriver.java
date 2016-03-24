import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by MMAA-local on 3/24/2016.
 */
public class StreamsDriver {
    static List<String> list = populateList();
    static Map<String, String> map = populateMap();

    public static void main(String[] args) {
        System.out.println("Driver Started");
        System.out.println("-------------------------Obtain Stream from List---------------------");
        list.stream().forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from Map using entrySet--------");
        map.entrySet().stream().forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from Map using keySet----------");
        map.keySet().stream().forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from Map using values----------");
        map.values().stream().forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from a String using chars()----");
        "1234567abcdefg".chars().forEach(x -> System.out.println(Character.toChars(x)));

        System.out.println("-------------------------Obtain Stream from a String using split()----");
        Stream.of("A,B,C".split(",")).forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from an array------------------");
        Integer[] array = {01,2,3,4,5,6,7};
        Stream.of(array).forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream of values----------------------");
        Stream.of("one", "two", "three").forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from function generate---------");
        Stream.generate(()->{return Math.random();}).limit(20).forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from function iterate----------");
        Stream.iterate(0,i->i+1).limit(20).forEach(System.out::println);

        System.out.println("-------------------------Obtain Stream from Builder-------------------");
        Stream.builder().add("one").add("two").add("three").build().forEach(x -> System.out.println(x));

        System.out.println("-------------------------Obtain Stream from another Stream------------");
        list.stream().distinct().limit(2).sorted().forEach(x -> System.out.println(x));
    }

    private static List<String> populateList(){
        List<String> list = new ArrayList<String>();
        list.add("listval1");
        list.add("listval2");
        list.add("listval3");
        list.add("listval4");
        list.add("listval5");
        list.add("listval6");

        return list;
    }
    private static Map<String, String> populateMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("mapkey1", "mapvalue1");
        map.put("mapkey2", "mapvalue2");
        map.put("mapkey3", "mapvalue3");
        map.put("mapkey4", "mapvalue4");
        return map;
    }
}
