import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        int attempts = 0;
        int[] cam = new int[3];
        int a = 0;
        while(a < cam.length) {
            a++;
            int i = (int) (Math.random() * 2 + 1);
            System.out.println(i);
        }
        int[] s = new int[3];
        while (attempts != 2){
            attempts++;
            int f = 0;
            while (f < s.length){
                f++;
                Scanner san = new Scanner(System.in);
                System.out.println("Числа");
                s[f] = san.nextInt();
            }
            if (cam == s){
                System.out.println("v");
                break;
            }else {
                System.out.println("dfd");
            }
        }
    }
}
