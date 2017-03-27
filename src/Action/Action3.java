package action;

/**
 * Created by Taron on 03/25/17.
 */
public class Action3 extends Action {

    @Override
    public int doAction(int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0;i < numbers.length;i++){
            if(numbers[i] % 2 == 0){
                evenSum += numbers[i];
            }
            else oddSum += numbers[i];
        }
        System.out.println("After action 3: ");
        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);
        return 0;
    }

}
