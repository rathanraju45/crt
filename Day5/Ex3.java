package Day5;
import java.util.Set;
import java.util.TreeSet;
public class Ex3 {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        for(int i=30;i>0;i--){
            set.add("A"+i);
        }
        for(String i:set){
            System.out.println(i);
        }
    }
}
