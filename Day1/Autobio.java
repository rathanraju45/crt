import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Autobio {
    public static void main(String[] args){
        ArrayList<Integer> arr_lst=new ArrayList<>();
        Map<Integer, Integer> dict=new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String N=s.next();
        s.close();
        int size=N.length();
        for(int i=0;i<size;i++){
            String temp=Character.toString(N.charAt(i));
            arr_lst.add(Integer.parseInt(temp));
            dict.put(Integer.parseInt(temp),0);
        }
        for(int k:arr_lst){
            int prev_count=dict.get(k);
            dict.put(k,prev_count+1);
        }
    }
}
