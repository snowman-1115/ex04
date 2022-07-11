import java.util.Random;
import java.util.Scanner;
public class coin2{
    public static void main(String[] args){

	System.out.println("Who are you?");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	System.out.println("Hello, " + name + "!");
        System.out.println("Tossing a coin...");

	int head = 0;
        int tail = 0;
        for(int i = 1; i <= 3; i++){
            Random coin = new Random();
            int num = coin.nextInt(5);
            if(num%2 == 0){
                System.out.println("Round " + i + ": Heads");
                head++;
            }       
            else if(num%2 == 1){
                System.out.println("Round " + i + ": Tails"); 
		tail++;                 
            }
        }   
	System.out.println("Heads: " + head + ", Tails: " + tail);
    }   
}
