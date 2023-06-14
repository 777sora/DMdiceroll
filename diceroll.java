import java.util.Random;
import java.util.Scanner;
class diceroll{

public static void main(String[] a){

Random rand = new Random();

Scanner sc = new Scanner(System.in);
System.out.println("What is your name?");
String name = sc.next();
System.out.println("Hello, " + name + "!");


int d1 = rand.nextInt(6)+1;
int d2 = rand.nextInt(6)+1;
int sum = d1 + d2;


System.out.println("Rolling dice...");
System.out.println("Dice 1: " + d1);
System.out.println("Dice 2: " + d2);
System.out.println("Total value: " + sum);

if(sum>7)System.out.println(name +" won");
else System.out.println(name +" lost");




}
}
