public class mainClass {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 10;

        mainClass mainClass = new mainClass();

        System.out.println(mainClass.plus(x,y));
        System.out.println(mainClass.minus(x,y));
        
        
        

    }

    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    public int minus(int number1, int number2) {
        return number1 - number2;
    }


}
