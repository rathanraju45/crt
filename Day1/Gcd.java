import java.util.Scanner;
class Gcd{
    int a;
    int b;
    static int n1;
    static int n2;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Gcd g=new Gcd();
        g.a=s.nextInt();
        g.b=s.nextInt();
        s.close();
        if (g.a>g.b){
            n1=(g.a-g.b);
        }
        else if(g.a<g.b){
            n1=(g.b-g.a);
        }
        else{

        }
        System.out.println("gcd of the numbers is:"+n1);
    }
}
