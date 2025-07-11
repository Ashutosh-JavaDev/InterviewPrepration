package BasicQuestions;

public class minimumOccurence {
    public static char Pass(String str){
        int arr[]=new int [256];
        for(int i=0;i<str.length()-1;i++){
            arr[str.charAt(i)]+=1;
        }
        int min=Integer.MAX_VALUE;
        char c=' ';
        for(int i=0;i<str.length()-1;i++){
            if(arr[str.charAt(i)]<min&&arr[str.charAt(i)]>0){
                min=arr[str.charAt(i)];
                c=str.charAt(i);
            }
        }
        return c;
    }
    public static void main(String[]args){
        String str="RaRRRjaRam";
        char ch=Pass(str);
        System.out.println(ch);
    }
}
