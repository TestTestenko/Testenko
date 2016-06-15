import java.util.*;


public class ColMap {

    Map<Integer, Integer> map;
    private int size=0;
    Random random;



    public int size(){
        return this.size;
    }

    public void filling(){
        random = new Random();
        map = new HashMap<Integer, Integer>();



        for (int i = 0; i < 100; i++) {
            map.put(random.nextInt(i), random.nextInt(i)+1);
        }

    }
    public void print(){

        for ( Integer key: map.keySet()) {
            System.out.println("Key: " + key);
        }

        for ( Integer value: map.values()) {
            System.out.println("Key: " + value);
        }
        
        this.size=this.map.size();
    }
}
