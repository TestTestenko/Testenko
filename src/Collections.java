import java.util.*;

public class Collections {

    public static void main(String[] args) throws InterruptedException {


        Random random = new Random();

      //  List<Integer> list = new ArrayList<>();
      //  Set<Integer> set = new HashSet<>();
     //   Map<String, Integer> map = new HashMap<String, Integer>();


        ColList list = new ColList();
        list.filling();
        list.print();
        System.out.print("list size: ");
        System.out.println(list.size());

        ColSet set = new ColSet();
        set.filling();
        set.print();
        System.out.print("set size: ");
        System.out.println(set.size());

        ColMap map = new ColMap();
        map.filling();
        map.print();
        System.out.print("map size: ");
        System.out.println(map.size());
    }
}
