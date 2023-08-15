package Day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        for(int i=30;i>0;i--){
            set.add("A"+i);
        }
        for(String i:set){
            System.out.println(i);
        }
    }

}
