import java.util.Scanner;
public class cal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        String operation, Operation = "";

        while (true) {
            cal.first = 0;
            cal.second = 0;

            System.out.print("Enter operation \n  \'+\' \n  \'-\' \n  \'*\' \n  \'/\' \n  \'M\' \nif you want to exit, print - \'exit\'\n >: ");
            operation = sc.next();
            if (!operation.equalsIgnoreCase("M") &&
                    !operation.equalsIgnoreCase("exit") &&
                    !operation.equalsIgnoreCase("+") &&
                    !operation.equalsIgnoreCase("-") &&
                    !operation.equalsIgnoreCase("*") &&
                    !operation.equalsIgnoreCase("/")
                    )
            {
                System.out.println("      Error:\n  \'" + operation + "\' isn't operation\n");
                continue;
            }

            if (operation.equalsIgnoreCase("M")) {
                System.out.print("Enter next operation: ");
                Operation = sc.next();

                if (!Operation.equalsIgnoreCase("+") &&
                        !Operation.equalsIgnoreCase("-") &&
                        !Operation.equalsIgnoreCase("*") &&
                        !Operation.equalsIgnoreCase("/")
                        )
                {
                    System.out.println("      Error:\n  \'" + Operation + "\' is not operation\n");
                    continue;
                }
            }
            else if(operation.equalsIgnoreCase("exit"))
            {
                break;
            }
            
            System.out.print("Enter first number (\'M\' - " + cal.res + " ) \n >: ");
            String firstNum = sc.next();

            if (!firstNum.equalsIgnoreCase("M") && !cal.checkString(firstNum))
            {
                System.out.println("      Error \n\'" + firstNum + "\' is not number or \'M\'\n");
                continue;
            }
            
            System.out.print("Enter second number (\'M\' - " + cal.res + " ) \n >: ");
            String secNum = sc.next();
           if (!secNum.equalsIgnoreCase("M") && !cal.checkString(secNum)){
                System.out.println("      Error \n\'" + secNum + "\' is not number or \'M\'\n");
                continue;
            }

            if (operation.equalsIgnoreCase("M")){
                System.out.println("Result: " + cal.operWithM(Operation, firstNum, secNum));
            }
            else if (!operation.equalsIgnoreCase("M")){
                System.out.println("Result: " + cal.operNotM(operation, firstNum, secNum));
            }
            System.out.println();
            }

    }
}


class Calculator{
    double res = 0;
    double first = 0;
    double second = 0;

    double operNotM(String operation, String firstNum, String secNum){
            switch (operation) {
                case "+": return plusNotM(firstNum,secNum);
                case "-": return minusNotM(firstNum,secNum);
                case "*": return multiplyNotM(firstNum,secNum);
                case "/": return divideNotM(firstNum,secNum);
        }
        return 0;
    }
    double operWithM(String operTwo, String firstNum, String secNum){
        switch (operTwo) {
            case "+": return plusM(firstNum,secNum);
            case "-": return minusM(firstNum,secNum);
            case "*": return multiplyM(firstNum,secNum);
            case "/": return divideM(firstNum,secNum);
        }
        return 0;
    }
    private void checkM(String firstNum, String secNum){
    if (firstNum.equalsIgnoreCase("M") &&
                !secNum.equalsIgnoreCase("M")){
            first = res;
            second = Double.parseDouble(secNum);
        }
        else if (!firstNum.equalsIgnoreCase("M") &&
                secNum.equalsIgnoreCase("M")){
            first = Double.parseDouble(firstNum);
            second = res;
        }
        else if(firstNum.equalsIgnoreCase("M") &&
                secNum.equalsIgnoreCase("M")){
            first = res;
            second = res;
        }
        else {
            first = Double.parseDouble(firstNum);
            second = Double.parseDouble(secNum);
        }
}
    private double plusNotM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        return first + second;
    }
    private double minusNotM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        return first - second;
    }
    private double multiplyNotM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        return first * second;
    }
    private double divideNotM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        return first / second;
    }
    private double plusM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        res = first + second;
        return res;
    }
    private double minusM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        res = first - second;
        return res;
    }
    private double multiplyM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        res = first * second;
        return res;
    }
    private double divideM(String firstNum, String secNum){
        checkM(firstNum, secNum);
        res = first / second;
        return res;
    }
    public boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;
        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }
        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
