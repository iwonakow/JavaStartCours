import java.util.Random;

public class OperetionsOnVariables {
    public static void main(String[]args){
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        System.out.println("x=" +x+ "y=" + y);
        boolean result = x>y;
        System.out.println("Czy x jest większe od y: " + result);
        result = x*2>y ;
        System.out.println("Czy x pomnożone przez 2 jest większe od y? "+ result);
        result = (x+3)<y && (x-2)>y;
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? "+result);
        result = ((x*y)%2==0);
        System.out.println("Czy x*y jest parzyste? " + result);



    }
}
