package Day3;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Wordcounter {
    Map<String, Integer> wordMap=new HashMap<>();
    String regex = "[\\p{Punct}]";
    public void wordcounter(String line){
        String no_punct = line.replaceAll(regex, " ");
        String[] final_line=no_punct.split("\\s+");
        for(String k:final_line){
            if (wordMap.containsKey(k)){
                wordMap.put(k, wordMap.get(k)+1);
            }
            else{
                wordMap.put(k, 1);
            }
        }
    }
    public static void main(String[] args) {
       Wordcounter w=new Wordcounter();
       String filePath="/home/greyhat_rr_007/Desktop/crt/Day3/hashmap.txt";
       try{
        List<String> lines=Files.readAllLines(Paths.get(filePath));
        for(String line:lines){
            w.wordcounter(line);
        }
       }
       catch(IOException e){
            e.printStackTrace();
       }
       System.out.println("Word map:");
       for(Map.Entry<String,Integer> k:w.wordMap.entrySet()){
            System.out.println(k.getKey()+":"+k.getValue());
       }
    }
}
