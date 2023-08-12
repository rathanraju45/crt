import java.util.ArrayList;
import java.util.Scanner;
public class Contact {
    static ArrayList<String> name=new ArrayList<>();
    static ArrayList<String> number=new ArrayList<>();
    static ArrayList<String> email=new ArrayList<>();

    void Display(){
        int size=name.size();
        for(int i=0;i<size;i++){
            System.out.print(name.get(i)+"          ");
            System.out.print(number.get(i)+"          ");
            System.out.print(email.get(i)+"         ");
        }
    }

    void Add(String x,String y,String z){
        name.add(x);
        number.add(y);
        email.add(z);
    }
    
    void Remove(String x){
        if(name.contains(x)){
            int index=name.indexOf(x);
            name.remove(x);
            number.remove(index);
            email.remove(index);
        }
    }

    void ModifyName(String x,String y){
        if (name.contains(x)){
            int index=name.indexOf(x);
            name.add(index, y);
        }
    }

    void ModifyNumber(String x,String y){
        if (name.contains(x)){
            int index=name.indexOf(x);
            number.add(index,y);
        }
    }

    void ModifyEmail(String x,String y){
        if (name.contains(x)){
            int index=name.indexOf(x);
            email.add(index,y);
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Contact c=new Contact();
        System.out.println("Enter your choice:");
        System.out.println("1.Display all\n2.Add and entry\n3.modify name\n4.modify numer\n5.modify email\n6.remove and entry");
        int choice=s.nextInt();
        switch(choice){
            case 1:c.Display();break;
            case 2:System.out.print("enter the name:");String var1=s.next(); 
                   System.out.print("\nenter the number:");String var2=s.next();
                   System.out.print("\nenter the email:");String var3=s.next();
                   c.Add(var1, var2, var3);
            case 3:System.out.print("\nenter the name you want to modify:");String var4=s.next();
                   System.out.print("\nenter the new name:");String var5=s.next();
                   c.ModifyName(var4, var5);
            case 4: 
        }
        s.close();
    }
}
