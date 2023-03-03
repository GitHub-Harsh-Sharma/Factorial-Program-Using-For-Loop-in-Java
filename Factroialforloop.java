import java.io.*;
class Factroialforloop 
{
    public static void main(String args[])throws IOException
    {
        int fact=1,num,i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the Factroial no: ");
        num=Integer.parseInt(br.readLine());
        for(i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.print("Factorial value="+fact);
    }
}    

