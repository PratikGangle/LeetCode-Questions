//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean palindrom(int number){
        
        int num = number;
        int rev = 0;
        
        while(num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num/10;
        }
        if(rev == number){
            return true;
        }
        else{
            return false;
        }
        
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i = 0; i < n ; i++){
                      if(!palindrom(a[i])){
                          return 0;
                      }
                  }
                  return 1;
           }
}