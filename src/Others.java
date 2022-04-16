import java.util.Scanner;

public class Others {
    public static void main(String[] args){
        Scanner can = new Scanner(System.in);
        System.out.println("Введіть першу Гіпотинузу:");
        int p1 = can.nextInt();
        System.out.println("Введіть другу стророну: ");
        int p2 = can.nextInt();
        System.out.println("Введіть третю стророну: ");
        int p3 = can.nextInt();
        if(3==p2 && 4==p3 ){
            System.out.println("P = "+(p1+p2+p3));
            System.out.println("S = "+ (p2*p3)*0.5);
        }else if(4==p2 && 3==p3){
            System.out.println("P = "+(p1+p2+p3));
            System.out.println("S = "+ (p2*p3)*0.5);
        }else {
            System.out.println("Введено не існуюче значення !");
        }
    }
}

