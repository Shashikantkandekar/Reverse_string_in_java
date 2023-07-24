import java.util.Scanner;
class revers
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String : ");
        String sk = sc.next();

        StringBuffer sb=new StringBuffer(sk);
        sb.reverse();

        System.out.println("reverse string is :"+sb);
    }
}
