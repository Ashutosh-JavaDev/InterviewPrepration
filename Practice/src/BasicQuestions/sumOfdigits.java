package BasicQuestions;
import java.util.Scanner;
public class sumOfdigits {
    int sum=0;
  public int Sum(int number,int num){
    // if(num%10)
    sum+=number%10;
    Sum(number/10,num);
    return sum;
  }  
}
