public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        while(beginning<=end){
            if (beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning++;
        }
    }
}
