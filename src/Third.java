
public class Third {
    public static void main(String[] args){
        int number;
        number = (int) (Math.random()*102);
        System.out.println(number);
        if (0 < number &&  number  < 9){
            System.out.println("Один знак");
        }else if (10 < number && number < 99){
            System.out.println("Складається з двох знаків");
        }else {
            System.out.println("Складається з трьох знаків");
        }
}
