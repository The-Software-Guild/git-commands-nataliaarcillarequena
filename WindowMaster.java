import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args){

        //declare vars
        float height;
        float width;

        //declare string vars to hold  users height and width input
        String stringWidth;
        String stringHeight;

        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        //declare and initialise scanner- just need to do this once
        Scanner myScanner = new Scanner(System.in);

        //prompt user for height and width of window (square feet)
        System.out.println("What is the height of the window in feet?");
        stringHeight = myScanner.nextLine();

        System.out.println("What is the width of the window in feet?");
        stringWidth = myScanner.nextLine();

        //need to parse the string inputs into float inputs
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        //calculating the display area of the window
        areaOfWindow = height * width;

        //display the area- output
        System.out.println("area of window in square feet: " + areaOfWindow);

        //calc perimeter
        perimeterOfWindow = (2*width) + (2*height);

        //display perimeter
        System.out.println("perimeter of window in feet: "+ perimeterOfWindow);

        //user input for the cost per trim and square foot of window, then square foot cost
        String footCost;
        float footcostf;
        System.out.println("please enter glass cost per square foot");
        footCost = myScanner.nextLine();
        footcostf = Float.parseFloat(footCost);

        String trimCost;
        float trimcostf;
        System.out.println("please enter trim cost per foot");
        trimCost = myScanner.nextLine();
        trimcostf = Float.parseFloat(trimCost);

        //calcing the cost- need to add f onto the numbers otherwise its a double and conflicts with
        //the float types
        cost = (footcostf*areaOfWindow) + (trimcostf*perimeterOfWindow);

        //display the cost
        System.out.println("Total cost: " + cost);

    }

    public static class DogGenetics {
    }
}
