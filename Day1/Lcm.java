import java.util.Scanner;

public class Lcm {
    int a;
    int b;
    static int n1;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Lcm l=new Lcm();
        l.a=s.nextInt();
        l.b=s.nextInt();
        s.close();
        n1=(l.a>l.b) ? l.a:l.b;
        for(int i=n1;i<l.a*l.b;i=i+n1){
            if (i%l.a==0 && i%l.b==0){
                break;
            }
        }
        System.out.println("lcm of the numbers is:"+n1);
    }     
}
