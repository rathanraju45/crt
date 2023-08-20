package Day7;

import java.util.LinkedList;

public class LinkedListEx {
    LinkedList<String> countries=new LinkedList<>();
    public static void main(String[] args) {
        LinkedListEx l=new LinkedListEx();
        l.countries.add("India");
        l.countries.add("USA");
        l.countries.add("UK");
        l.countries.add("Egypt");
        l.countries.add("Russia");
        l.add(1,"poland");
        l.display(l.countries);
        l.countries.set(1,"canada");
        l.display(l.countries);
        l.countries.remove("poland");
        l.countries.remove(1);
        l.display(l.countries);
    }
    public void display(LinkedList<String> list)
    {
        for(String k:list)
            System.out.println(k);
    }

    public void add(int index,String item){
        countries.add(index,item);
    }
}
