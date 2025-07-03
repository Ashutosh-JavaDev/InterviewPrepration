package BasicQuestions;
import java.util.Scanner;
public class sumOfdigits {
   static int sum=0;
  public static int Sum(int num){
   if(num==0){
    return 0;
   }
    return (num%10)+Sum(num/10);
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int res=Sum(num);
    System.out.println(res);
  }
}
