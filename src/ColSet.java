import java.util.*;


public class ColSet {

    Set<Integer> set;
    private int size=0;
    Random random;

    public int size(){
        return this.size;
    }

    public void filling(){
        random = new Random();
        set = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            set.add(random.nextInt(10) + 1);
        }

    }
    public void print(){

        for(int i=0; i<set.size(); i++){
            System.out.println(set.toArray()[i]);
        }
        this.size=set.size();
    }


}
