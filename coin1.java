import java.util.Random;
public class coin1 {
    public static void main(String[] args){
        
        System.out.println("Tossing a coin...");
        int head = 0;
        int tail = 0;
        for(int i = 1; i <= 3; i++){
            Random coin = new Random();
            int num = coin.nextInt(2);
            if(num == 0){
                System.out.println("Round " + i + ": Heads");
                head++;
            }       
            else if(num == 1){
                System.out.println("Round " + i + ": Tails"); 
                 tail++;                 
            }
        }   
    System.out.println("Heads: " + head + ", Tails: " + tail);
    }   
}
