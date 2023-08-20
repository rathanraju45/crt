package Day9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<String, Integer> count=new HashMap<>();
        System.out.println("Enter the space separated array elements:");
        String[] arr=s.nextLine().split(" ");
        int n=arr.length;
        for (String k:arr){
            if (!count.containsKey(k)){
                count.put(k,1);
            }
            else {
                int value=count.get(k);
                count.replace(k,value+1);
            }
        }
        boolean flag=false;
        for (Map.Entry<String, Integer> k:count.entrySet()){
            int temp_value=k.getValue();
            if(temp_value>n/2){
                System.out.println("Majority element is:"+k.getKey());
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("Majority Element do no exist in the given array.");
        }
    }
}
