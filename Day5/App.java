package Day5;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        //adding values to set
        names.add("Rathan Raju");
        names.add("sunny");
        names.add("prashanth");
        names.add("neeraj");
        names.add("balu");
        //iterating through set
        for(String k:names){
            System.out.println(k);
        }
        //retriveing through set
        System.out.println(names.contains("sunny"));
    }
}
