public class Calculator {

    static int calc (int a, int b, String act){
        int result = 0;
        switch (act) {
            case "+":
                result = Calculator.sum(a, b);
                break;
            case "-":
                result = Calculator.diff(a, b);
                break;
            case "*":
                result = Calculator.mult(a, b);
                break;
            case "/":
                result = Calculator.div(a, b);
                break;
        }
        return result;
    }
    
    static int sum(int a, int b){
        return a + b;
    }

    static int mult(int a, int b){
        return a * b;
    }

    static int div(int a, int b){
        return a / b;
    }

    static int diff(int a, int b){
        return a - b;
    }
}
