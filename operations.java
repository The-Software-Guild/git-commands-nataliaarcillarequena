//operations and operands

public class operations {
    public static void main(String[] args){
        //declare vars to use
        int result;
        int operand1;
        int operand2;
        int operand3;

        //assignment

        //initialising result as 0
        result = 0;

        //initialise the operands
        operand1 = 5;
        operand2 = 7;

        //set operand2 to same value as operand 2
        operand3 = operand2;

        //addition
        result = 42+ 45;
        result = 2;
        result += 4; //result = 6 (2+4)
        result += operand1; //result = 6+5 (11)

        //subtraction
        result -= 4; //result is result - 4

        //division
        result = 245 / operand1 / operand2;  //division in a chain; 245/5 then ans/7

        // /= operator
        result = 40;
        result /= 4; // 40/4 = 10 = result
        result /= operand1; // result/operand1 (10/5=2)
    }
}
