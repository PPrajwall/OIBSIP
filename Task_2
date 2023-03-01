import java.util.Random;
import java.util.Scanner;

class NumGuess 
{ 
    public NumGuess(int x,int y,int i)
        {

            if(y==x)
	            {
                    System.out.println("CONGRATULATIONS YOU WON 33THIS GAME in"+" "+i+" "+"chance");
                    System.exit(i);
	            }
            else if(y>x)
                {
                    System.out.println("Number is Greater");
                }
            else 
                {
                    System.out.println("Number is Smaller");
                }
        } 
}

class Main 
{

    public static void main(String[] args)
        {
            System.out.println("===============================( WELCOME TO NUMBER GUESSING GAME )=============================");
            Random r=new Random();
            int s1=r.nextInt(100);
            NumGuess s2[]=new NumGuess[30];
            Scanner sc=new Scanner(System.in);
            System.out.println("\n HOW MANY NUMBER OF GUESSES YOU WILL NEED TO FIND IT OUT??");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
                {	
		            int a=n-i;
		            //System.out.println();
		            System.out.println("\n Enter the number For "+i+ " "+"guess and your"+" "+a+" "+" guess remaining");
		            int num=sc.nextInt();
		            s2[i]= new NumGuess(num,s1,i);
                }
            System.out.println("===================================( YOU LOST THIS GAME )=====================================");
            System.out.println("\n Number is:"+s1);
            System.out.println("\n Your Score is :"+ n*10);
        } 
}
