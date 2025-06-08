import java.util.Scanner;
public class PalindromeNumberUptoN{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter n value"); //This program checks n numbers and displays palindrome numbers present till n
        int n=snr.nextInt();
        int sum=0,rem;
	System.out.println("The palindrome numbers present till " + n + " are: ");
        for(int i=0;i<n;i++){
            int num=i;
            while(num>0){
                rem=num%10;
                sum=sum*10+rem;
                num=num/10;
            }
            if(i==sum){
                System.out.println(i);
            }
            sum=0;
        }
        
    }
}