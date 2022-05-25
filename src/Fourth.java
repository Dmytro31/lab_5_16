import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        int a = 0;
        int i = (int) (Math.random() * 2 + 1);
        System.out.println(i);
        System.out.println("Вгадай число із 3 спроб");
        while (a != 3) {
            Scanner sc = new Scanner(System.in);
            int name = sc.nextInt();
            a++;
            if (name == i) {
                System.out.println("win");
                break;
            } else if (name == i) {
                System.out.println("win");
                break;
            } else if (name == i) {
                System.out.println("win");
                break;
            }else {
                System.out.println("loss");
            }

        }  
    }
}

        
