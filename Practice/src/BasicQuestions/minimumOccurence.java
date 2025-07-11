package BasicQuestions;

public class minimumOccurence {
    public static char Pass(String str){
        int arr[]=new int [256];
        for(int i=0;i<str.length()-1;i++){
            arr[str.charAt(i)]+=1;
        }
        int min=-1;
        char c=' ';
        for(int i=0;i<str.length()-1;i++){
            if(arr[str.charAt(i)]<min){
                min=arr[str.charAt(i)];
                c=str.charAt(i);
            }
        }
        return c;
    }
    public static void main(String[]args){
        String str="RajaRam";
        char ch=Pass(str);
        System.out.println(ch);
    }
}
