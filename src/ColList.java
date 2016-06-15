import java.util.*;
public class ColList {

    List<Integer> list;
    private int size=0;
    Random random;

    public int size(){
        return this.size;
    }

    public void filling(){
        random = new Random();
        list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(10) + 1);
        }

    }
    public void print(){

        for(int i=0; i<this.list.size(); i++){
            System.out.println(this.list.get(i));
        }
        this.size=this.list.size();
    }



}
