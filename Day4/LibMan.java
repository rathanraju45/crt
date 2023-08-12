package Day4;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class LibMan {
    Map<Integer, Book> book=new HashMap<>();
    public static void main(String[] args) {
        int counter=0;
        Scanner s=new Scanner(System.in);
        LibMan l=new LibMan();
        Collection<Book> temp_book = l.book.values();
        boolean running=true;
        System.out.println("Library Management:");
        while(running){
            System.out.println("1.Add a book\n2.display the books\n3.lend a book\n4.accept a book or increase stock\n5.exit");
            System.out.print("Enter your choice:");
            int choice=s.nextInt();
            s.nextLine();
            switch(choice){
                case 1:
                    System.out.print("\nEnter book title: ");
                    String title=s.nextLine();
                    System.out.println("\nenter the book author: ");
                    String author=s.nextLine();
                    System.out.print("Enter the quantity of the book: ");
                    int count=s.nextInt();
                    Book b=new Book(title, author, count);
                    l.book.put(counter,b);
                    counter++;
                    System.out.println("\n"+b.getName()+" is added to library.");
                    break;
                case 2:
                    System.out.println("Books in the library:");
                    for(Map.Entry<Integer, Book> entry:l.book.entrySet()){
                        System.out.println("ID:"+entry.getKey());
                        System.out.println(entry.getValue().toString());
                    }
                    break;
                case 3:
                    boolean book_lended=false;
                    System.out.print("Enter book name to lend:");
                    String book_name=s.nextLine();
                    for(Book k:temp_book){
                        if(k.getName().equals(book_name) && k.getCount()>0){
                            int current_count=k.getCount();
                            k.setCount(current_count-1);
                            System.out.println("\nBook lended.");
                            book_lended=true;
                            break;
                        }
                    }
                    if(!book_lended){
                        System.out.println("Book is not in library.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the book name to accept or to increase the stock: ");
                    String book_accept=s.nextLine();
                    boolean accepted_value=false;
                    for(Book k:temp_book){
                        int accept_count=k.getCount();
                        if(k.getName().equals(book_accept)){
                            k.setCount(accept_count+1);
                            System.out.println("Book accepted");
                            accepted_value=true;
                        }
                    }
                    if(!accepted_value){
                        System.out.println("Book is not in library try adding as a new book.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you.");
                    running=false;
                    break;
                default:
                    System.out.println("enter correct input.");
                    break;
            }
        }
        s.close();
    }
}
