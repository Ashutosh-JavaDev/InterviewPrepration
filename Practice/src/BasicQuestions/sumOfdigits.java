package BasicQuestions;
import java.util.Scanner;
public class sumOfdigits {
    int sum=0;
  public int Sum(int number,int num){
   if(num<0){
    return sum;
   }
   return Sum(number, num%10)+Sum(number, num/10);
  }  
}
