package Day2.grocery_application;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    Scanner s=new Scanner(System.in);
    ArrayList<Items> items=new ArrayList<>();

    public void displayCart(){
        if(items.isEmpty()){
            System.out.println("Your cart is empty.");
        }
        else{
            System.out.println("Your cart:");
            for(Items k:items){
                System.out.println("name:"+k.getName());
                System.out.println("Price:"+k.getPrice());
                System.out.println("");
            }

        }
    }
    
    public void addItem(Items item){
        items.add(item);
        System.out.println(item.getName()+" is added to the cart.");
    }

    public void removeItem(int index){
        if(index>=0 && index<items.size()){
            Items removedItem=items.remove(index);
            System.out.println(removedItem+"removed form cart.");
        }
        else{
            System.out.println("Invalid Product.");
        }
    }

    public double calculateTotalPrice(){
        double price=0;
        for(Items k:items){
            price=price+k.getPrice();
        }
        return price;
    }
}
