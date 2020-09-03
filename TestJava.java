
package testjava;

import static java.lang.System.out;
import java.util.Scanner;


public class TestJava {

    
    public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);

out.println(" total number of holes, N ");
   int totalNumOfHoles= sc.nextInt();
//done1
out.println("N space separated integers denoting the diameters of N holes, from bottom to top ");

   int totalNumOfHolesDie[]=new int[totalNumOfHoles];
for( int i=0; i<totalNumOfHoles;i++)
{
totalNumOfHolesDie[i]=sc.nextInt();
}
//done2
///
out.println("total number of balls, M ");
    int totalNumOfBall= sc.nextInt();
//done3
out.println(" M space separated integers denoting the diameters of balls in the order of release");

    int totalNumOfBallDie[]=new int[totalNumOfBall];
for( int i=0; i<totalNumOfBall;i++)
{
totalNumOfBallDie[i]=sc.nextInt();
}
//done4
int finalOutput[]=new int[totalNumOfBall];
//INPUT DONE
int n = totalNumOfHoles;
int m = totalNumOfBall;
int f = 0;
for(int i=0;i<m;i++)
{
   for(int j=0;j<n;i++){ 
if(totalNumOfHolesDie[n-j-1] ==totalNumOfBallDie[i])
{
f=n-(1+j);
finalOutput[i]=f;
}
else
{
finalOutput[i]=0;
}
   }
}
out.println("Answer");
for(int i=0;i<finalOutput.length;i++)
{
out.println(finalOutput[i]);
}
} 
}
