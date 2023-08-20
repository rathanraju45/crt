package Day9;

import java.util.Scanner;

public class Task3 {

    public boolean containsInteger(String password){
        boolean intflag=false;
        for (int i=1;i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                intflag=true;
                break;
            }
        }
        return intflag;
    }

    public boolean oneCap(String password){
        boolean capflag=false;
        for (int i=0;i<password.length();i++){
            if (Character.isUpperCase(password.charAt(i))){
                capflag=true;
                break;
            }
        }
        return capflag;
    }
    public int checkPassword(String password){
        char temp=password.charAt(0);
        if (password.length()>=4 && containsInteger(password) && oneCap(password) && !password.contains(" ") && !password.contains("/") && !Character.isDigit(temp)){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Task3 t=new Task3();
        System.out.print("Enter the Password to validate: ");
        String password=s.next();
        s.nextLine();
        int result=t.checkPassword(password);
        if (result==0){
            System.out.println("Password is not Valid.");
        }
        else {
            System.out.println("Password is valid.");
        }
    }
}
