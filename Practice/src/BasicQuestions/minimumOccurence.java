package BasicQuestions;

public class minimumOccurence {
    public static int Pass(int arr[],int size){
        // int arr[]=new int [256];
        // for(int i=0;i<str.length()-1;i++){
        //     arr[str.charAt(i)]+=1;
        // }
        // int min=arr[0];
        // char c=' ';
        // for(int i=0;i<str.length()-1;i++){
        //     if(min<arr[str.charAt(i)]){
        //         min=arr[str.charAt(i)];
        //         c=str.charAt(i);
        //     }
        // }
        // return c;
        int min=arr[0];
            for(int i=0;i<size;i++){
               for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    min=arr[i];
                }
               }
            }
            return min;
    }
    public static void main(String[]args){
        // String str="RaRRRjaRam";
        int arr[]={21,233,12,312,1,32,42,3};
        // char ch=Pass(str);
        // System.out.println(ch);
        int d=Pass(arr, arr.length);
        System.out.println(d);
    }
}
