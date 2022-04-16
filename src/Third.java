
public class Third {
    public static void main(String[] args){
        int prog;
        prog = (int) (Math.random()*102);
        if(prog <= 9){
            System.out.println(prog + " Одна");
        }else if(prog <= 99){
            System.out.println(prog + " Дві");
        }else {
            System.out.println(prog + " Три");
        }
    }
}
