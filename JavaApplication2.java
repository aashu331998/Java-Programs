import static java.lang.System.out;
import java.util.Scanner;


public class JavaApplication2 {

    
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

        out.println(" First line contains an integer N, denoting the length of string.");
        int n= sc.nextInt();
        out.println(" Second line contains string S itself consists of small case alphabets only ('a' - 'z'). ");
        String s = sc.next();
        out.println(" Third line contains an integer Q denoting number of queries that will be asked. ");
        int q= sc.nextInt();
        out.println(" Next Q lines contains an integer P (1 <= P <= N) for which you need to find the number occurrence of character present at the Pth location preceeding P. ");
        int p[]=new int[q];
        for( int i=0; i<q;i++)
        {
        p[i]=sc.nextInt();
        }
        //input done
        int ans[]=new int[q];
        int count = 0;
        for (int i = 0; i < q; i++) { 
            count = 0;
            char s1 = s.charAt(p[i]-1);
            
            for (int b = 0; b < p[i]-1; b++)
            {
            if(s1==s.charAt(b))
            {
            count++;
            }
        
            }
            ans[i]=count;
        }
        out.println("answer");
        for(int i=0;i<ans.length;i++)
        {
        out.println(ans[i]);
        }
  
    }
    
}
    