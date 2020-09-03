import java.util.Scanner;
import static java.lang.System.out;

class Petrol
{
static public void main(String...ar)
{
Scanner sc = new Scanner(System.in);
out.println("welcome /n enter the average of your vehical in liters");
int average= sc.nextInt();
out.println("enter the total liters of petrole in your vehical");
int totalPetrol= sc.nextInt();
out.println("enter the total KM RUN by the vehical daily");
int km= sc.nextInt();

int totalDays=(average*km)/totalPetrol;
out.println("your vechial will run out of petrol after"+totalDays+"days" ); 
}}