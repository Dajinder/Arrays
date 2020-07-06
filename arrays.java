import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        solve();
    }
    public static void solve(){
        // span(); 
        // findElement();
        // barChart();
        sumOfArrays();
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

    // public static void sumOfArrays(){
    //     Scanner scn = new Scanner(System.in);
        
    //     int n1 = scn.nextInt();
    //     int[] arr1 = new int[n1];
    //     for(int i=0;i<arr1.length;i++){
    //         arr1[i] = scn.nextInt();
    //     }

    //     int n2 = scn.nextInt();
    //     int[] arr2 = new int[n2];
    //     for(int i=0;i<arr2.length;i++){
    //         arr2[i] = scn.nextInt();
    //     }

    //     int[] arr3;
    //     if(n1>n2){
    //         arr3 = new int[n1];
    //     }
    //     else{
    //         arr3 = new int[n2];
    //     }

    //     for(int k=arr3.length-1;k>=0;k--){
    //         for(int i=arr1.length-1,j=arr2.length-1;i>=0||j>=0;i--,j--){
    //             arr3[k] = arr1[i]+arr2[j];
    //         }

    //         System.out.print(arr3[k]);
    //     }
    //     System.out.println();
        
        
    // }

}