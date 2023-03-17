
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int temp, largest;
        temp = number1 > number2 ? number1 : number2;
        largest = number3 > temp ? number3 : temp;
        return largest;
    }   

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
