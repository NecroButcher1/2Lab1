import java.util.Scanner;

public class Arr {
    static Scanner in = new Scanner(System.in);
    public static  void readAndOutputArray(){          //8-9
        int array[],N;
        System.out.printf("Press number:");
        N = in.nextInt();
        array = new int[N];
        for(int i=0;i<N;i++){
            array[i]=in.nextInt();
        }
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void sumArray( int arr[]){        //10
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        System.out.println(sum);
    }
    public static void evenSumArray(int arr[]){      //11
        int evenNum=0;
        for(int num: arr){
            if(num%2==0){
                evenNum+=num;
            }
        }
        System.out.println(evenNum);
    }
    public static void searhElemInArray(int arr[],int a,int b){ //12
        boolean temp = false;
        for(int i=a;i<b;i++){
            if(i==arr[i]){
                temp = true;
            }
        }
        if(temp){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void positiveElemInArray(int arr[]){      //13
        boolean positive=true;
        for(int num:arr){
            if(num<0){
                positive=false;
            }
        }
        if(positive==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void invertArray(int arr[]){        //14
        for(int i=0;i<arr.length /2;i++){
            int tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }
    }
}
