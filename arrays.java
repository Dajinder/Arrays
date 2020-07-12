import java.util.List;
import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        solve();
    }
    public static void solve(){
        // span(); 
        // findElement();
        // barChart();
        // sumOfArrays();
        // diffOfArrays();
        // maxInArray();
        // prefixSumArray();
        milkman();
    }

    public static void span(){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i]; 
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        int span = max-min;

        System.out.println(span);

    }

    public static void findElement(){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        System.out.println(idx);

    }

    public static void barChart(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=max;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void sumOfArrays(){
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scn.nextInt();
        }

        int[] arr3;
        if(n1>n2){
            arr3 = new int[n1];
        }
        else{
            arr3 = new int[n2];
        }

        int c = 0;
        
        for(int i=arr1.length-1,j=arr2.length-1,k=arr3.length-1 ; k>=0 ; i--,j--,k--){
            int d = c;

            if(i>=0){
                d += arr1[i];
            }

            if(j>=0){
                d += arr2[j];
            }

            c = d/10;

            d = d%10;

            arr3[k] = d;
        }

        if(c != 0){
            System.out.println(c);
        }

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        
    }

    public static void diffOfArrays(){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scn.nextInt();
        }

        int[] arr3 = new int[n2];

        int c = 0;
        for(int i=arr1.length-1,j=arr2.length-1,k=arr3.length-1 ; k>=0 ; i--,j--,k--){
            int d = 0;
            int a1v = 0;
            if(i>=0){
                a1v = arr1[i];
            }
            else{
                a1v = 0;
            }
            if(arr2[j] + c >= a1v){
                d = arr2[j] + c - a1v;
                c = 0;
            }
            else{
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }

            arr3[k] = d;
        }

        int idx = 0;
        while(idx<arr3.length){
            if(arr3[idx] == 0){
                idx++;
            }else{
                break;
            }
        }

        while(idx < arr3.length){
            System.out.print(arr3[idx]);
            idx++;
        }
        
    }
    
    public static void maxInArray(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int idx = -1;
        for(int i = 0;i<arr.length;i++){
            if(x == arr[i]){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }


    public static void prefixSumArray(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int[] preSumArr = new int[n+1];
        preSumArr[0] = 0;
        for(int i=1,j=0;i<preSumArr.length ;i++,j++){
            preSumArr[i] = preSumArr[i-1] + arr[j] ;
        }

        for(int i=0;i<preSumArr.length;i++){
            System.out.println(preSumArr[i]);
        }

    }

    public static void milkman(){
        
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[7];

        
        String str = "";
        for(int i=0;i<7;i++){
            str += scn.nextLine();
        }

        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i)+"->"+i);
        // }

                if(str.charAt(0)=='W'){
                    arr[0] = 1;
                }else{
                    arr[0] = 0;
                }

                if(str.charAt(1)=='W'){
                    arr[1] = 1;
                }else{
                    arr[1] = 0;
                }

                if(str.charAt(2)=='B'||str.charAt(2)=='W'){
                    arr[2] = 1;
                }

                if(str.charAt(3)=='W'){
                    arr[3] = 1;
                }else{
                    arr[3] = 0;
                }

                if(str.charAt(4)=='B'||str.charAt(4)=='W'){
                    arr[4] = 1;
                }

                if(str.charAt(5)=='B'||str.charAt(5)=='W'){
                    arr[5] = 1;
                }

                if(str.charAt(6)=='W'){
                    arr[6] = 1;
                }else{
                    arr[6] = 0;
                }

        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // System.out.println(arr[i]);
        }
        System.out.println(sum);

    }

}