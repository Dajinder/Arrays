import java.util.Scanner;
public class arrays_2d{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        // printMatrix();

        // int[][] arr1 = {{2,3,4},{5,6,7}};
        // int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // matrixMultiplication(arr1,arr2);

        // int[][] arr = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
        // waveTraversal(arr);
        
    }

    public static void printMatrix(){
        Scanner scn = new Scanner(System.in);
        int nrows = scn.nextInt();
        int ncolumns = scn.nextInt();

        int[][] arr = new int[nrows][ncolumns];
        for(int i=0;i<nrows;i++){
            for(int j=0;j<ncolumns;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void matrixMultiplication(int[][] arr1, int[][] arr2){
        
        int[][]res = new int[arr1.length][arr2[0].length];
        int nr1 = arr1.length; 
        int nc1 = arr1[0].length;
        int nr2 = arr2.length;
        int nc2 = arr2[0].length;
        if(arr1[0].length != arr2.length){
            System.out.print("Invalid Inputs");
        }else{
            
            for(int i=0;i<res.length;i++){
                for(int j=0;j<res[i].length;j++){
                    for(int k=0;k<nc1;k++){
                        res[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void waveTraversal(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}