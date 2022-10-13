/** Natalia Arcilla Requena
 * date: 13/10/2022
 * purpose: ASSESSMENT- Summative Sums
 */

public class SummativeSums {

    public static void main(String[] args){

        //initialising an array, calling method to sum it, sum returned and printed
        int[] numbers = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int numbersSum = sumArrayElements(numbers);
        System.out.println("Array sum: "+ numbersSum);

        int secondSum = sumArrayElements(new int[]{ 999, -60, -77, 14, 160, 301 });
        System.out.println("Array Sum: " + secondSum);

        int thirdSum = sumArrayElements(new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 } );
        System.out.println("Array Sum: " + thirdSum);

    }

    public static int sumArrayElements(int[] array){

        //initialising a sum variable
        int sum = 0;

        //looping through the array and summing the elements
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        return sum;
    }

}
