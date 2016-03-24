import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MMAA-local on 3/24/2016.
 */
public class StreamsDriver {
    static List<String> list = populateList();
    static Map<String, String> map = populateMap();

    public static void main(String[] args) {
        System.out.println("Driver Started" );
        System.out.println("-------------------------Obtain Stream from List---------------------");
        list.stream().forEach(x->System.out.println(x));
        System.out.println("-------------------------Obtain Stream from Map using entrySet--------");
        System.out.println("-------------------------Obtain Stream from Map using keySet----------");
        System.out.println("-------------------------Obtain Stream from Map using values----------");
        System.out.println("-------------------------Obtain Stream from a String using chars()----");
        System.out.println("-------------------------Obtain Stream from a String using split()----");
        System.out.println("-------------------------Obtain Stream from an array------------------");
        System.out.println("-------------------------Obtain Stream of values----------------------");
        System.out.println("-------------------------Obtain Stream from function generate---------");
        System.out.println("-------------------------Obtain Stream from function iterate----------");
        System.out.println("-------------------------Obtain Stream from Builder-------------------");
        System.out.println("-------------------------Obtain Stream from another Stream------------");
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
