package Day9;

import java.util.ArrayList;

public class Task1Sol {
    public static ArrayList<Integer> findIndexes(int arr[],int x){
        ArrayList<Integer> result=new ArrayList<>();
        int firstIndex=-1;
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(firstIndex==-1){
                    firstIndex=i;
                }
                lastIndex=i;
            }
        }
        return result;
    }
}
