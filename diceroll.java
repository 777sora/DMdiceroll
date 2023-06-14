import java.util.Random;
import java.util.Scanner;
class diceroll{

public static void main(String[] a){

Random rand = new Random();


int d1 = rand.nextInt(6)+1;
int d2 = rand.nextInt(6)+1;
int sum = d1 + d2;


System.out.println("Rolling dice...");
System.out.println("Dice 1: " + d1);
System.out.println("Dice 2: " + d2);
System.out.println("Total value: " + sum);

if(sum>7)System.out.println("You won");
else System.out.println("You lost");




}
}
