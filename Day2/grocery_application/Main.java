package Day2.grocery_application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Cart c=new Cart();
        String[] names={"apple","banana","orange","pineapple","papaya","grapes","kiwi"};
        double[] prices={25.0,32.0,45.2,81.0,52.3,54.6,54.9};
        
        System.out.println("---------------------");
        System.out.println("Welcome to the grocery store!");
        boolean running=true;
        while(running){
            System.out.println("0.view available products\n"+"1.add products to cart\n"+"2.remove a product from cart\n"+"3.view the cart\n"+"4.calculate the price\n"+"5.exit\n");
            System.out.println("please select your choice:");
            int choice=s.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Available items list:");
                    System.out.println("---------------------");
                    System.out.println("ID"+" | "+"NAME"+"       "+"PRICE");
                    System.out.println("--------------------");
                    for(int i=0;i<names.length;i++){
                        System.out.println(i+"  | "+names[i]+" ".repeat((9-(names[i]).length()+2))+prices[i]);
                    }
                    System.out.println("---------------------");
                    break;
                case 1:
                    s.nextLine();
                    System.out.println("enter space seperated id's of the products:");
                    String[] x=s.nextLine().split(" ");
                    int size=x.length;
                    for(int i=0;i<size;i++){
                        int temp_index=Integer.parseInt(x[i]);
                        String temp_name=names[temp_index];
                        double temp_price=prices[temp_index];
                        Items cart_obj=new Items(temp_name, temp_price);
                        c.addItem(cart_obj);
                    }
                    System.out.println("---------------------");
                    break;
                    case 2:
                    System.out.println("enter the index of the product to remove:");
                    int temp_index=s.nextInt();
                    c.removeItem(temp_index);
                    System.out.println("---------------------");
                    break;
                case 3:
                    c.displayCart();
                    break;
                case 4:
                    double totalPrice=c.calculateTotalPrice();
                    System.out.println("The total price is:"+totalPrice);
                    System.out.println("---------------------");
                    break;
                case 5:
                    System.out.println("Thank you.");
                    running=false;
            }
        }
        s.close();
    }
}