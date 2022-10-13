  public class Fibonacci {
    public static void main(String args[]){
    System.out.println(fib(6));
    }

    public static int fib(int n){
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }  
        return arr[n];
    }
}