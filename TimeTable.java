/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *.
 * @author ASUS
 */
public class TimeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

out.println("enter total num of subjects");
int numOfSubjects= sc.nextInt();
out.println("enter total num of classes per day");
int numOfClassesPerDay = sc.nextInt();
out.println("enter total num of working days");
int numOfWorkingDays = sc.nextInt();
int numOfClassWeekly= numOfClassesPerDay*numOfWorkingDays;
out.println("total numer of classes weekly ="+numOfClassWeekly);
out.println("mention the number of classes you want per subjects");
out.println("sum should be equal to"+numOfClassWeekly);
int value= numOfSubjects+1;
int subjectClassDistribution[]= new int[value];
subjectClassDistribution[0]= 0;
for(int i=0;i<numOfSubjects;i++)
{
out.println("number of classes you want for subject "+(i+1));
subjectClassDistribution[i+1]=sc.nextInt();
}
java.util.Arrays.sort(subjectClassDistribution);
///number of classes entered per subject  
//out.println("number of classes entered per subject");
//for(int i=0;i<value;i++)
//{
//out.println(subjectClassDistribution[i]);}
int sum=0;
for(int i=1;i<value;i++)
{
sum= sum + subjectClassDistribution[i];
}
//out.println("summm="+sum);
if(sum==numOfClassWeekly )  //coding of timetable
{

int a[][]= new int[numOfWorkingDays][numOfClassesPerDay];  //main timetable

int classesToDisplay[]= new int[numOfClassWeekly];        //array for selecting values
int sum1=0;
int sum2=0;
for(int i=0; i<numOfSubjects;i++)             //array for selecting values
{
//out.println("number of times loop is running"+(i+1));
sum1= sum1+subjectClassDistribution[i];
sum2= sum2+subjectClassDistribution[i+1];
for(int j=sum1;j<sum2;j++)
{
   // out.println(subjectClassDistribution[i]+"number of times loop is workink j"+(j+1)+"  "+subjectClassDistribution[(i+1)] );
classesToDisplay[j] = (i+1); 
}

}
public static void again()
{
///////////////////////////////////////////shuffling
int temp,random;
for( int i=0; i<classesToDisplay.length;i++)
{
    
random = (int)(Math.random()*(classesToDisplay.length-1));
temp= classesToDisplay[i];
classesToDisplay[i]=classesToDisplay[random];
classesToDisplay[random]=temp;
}

////////////inserting of subjects in table
int num1=0;
for(int i=0;i<numOfWorkingDays;i++)
{
for(int j=0;j<numOfClassesPerDay;j++)
{
a[i][j] = classesToDisplay[(num1)];
num1++;
}}


//printing of class
for(int i=0;i<numOfWorkingDays;i++)
{
for(int j=0;j<numOfClassesPerDay;j++)
{
out.print(" "+a[i][j]);
}
out.println("  ");
}
//out.println("array for selecting values");
//for(int i=0;i< numOfClassWeekly;i++)
//{
//out.print(" "+classesToDisplay[i]);
//}
out.println("to see a different timetable press 1");
int again= sc.nextInt();
if(again==1)
{
again();
}}
}//end of first if(sum)
else{                                     
out.println("the sum is incorrect"); 
}
    }}
    

