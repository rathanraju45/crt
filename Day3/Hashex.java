package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashex {
    public static void main(String[] args) {
        Map<String, Integer> studentScores=new HashMap<>();
        studentScores.put("rathan raju", 100);
        studentScores.put("prashanth", 100);
        studentScores.put("sunny", 95);
        studentScores.put("raja",99);
        studentScores.put("neeraj",65);
        Set<String> keys=studentScores.keySet();
        for(String k:keys){
            System.out.println("score of "+k+"is"+studentScores.get(k));
        }

        for(Map.Entry<String, Integer> entry:studentScores.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        if(studentScores.containsKey("charly")){
            System.out.println("key in hashmap");
        }
    }
}
