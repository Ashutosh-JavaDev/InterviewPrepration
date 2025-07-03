package BasicQuestions;
import java.util.Scanner;
public class sumOfdigits {
   static int sum=0;
  public static int Sum(int number,int num){
   if(num==0){
    return sum;
   }
    sum+=num%10;
    Sum(number, num/10);
    return sum;
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int temp=num;
    int res=Sum(num,temp);
    System.out.println(res);
  }
}
