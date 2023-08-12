import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        names.add("rathan raju");
        names.add("prasanth");
        names.add("neeraj");
        names.add("subbu");
        names.add("balu");
        names.add("gupta");
        names.add("deefuck");
        names.add("chandu");
        System.out.println("initial ArrayList:"+names);
        String myname=names.get(0);
        names.set(6, "deepak");
        int size=names.size();
        System.out.println(names);
        names.clear();
        s.close();
        System.out.println(size+myname);
    }
}
