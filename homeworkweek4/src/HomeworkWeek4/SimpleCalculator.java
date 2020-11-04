package HomeworkWeek4;

public class SimpleCalculator {
    double firstNumber, secondNumber;

    public static void main(String[] args) {
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
        System.out.println("add" + calculator.getAdditionResult());
        System.out.println("subtract" + calculator.getSubstractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

    }

    public double getFirstNumber (){
        return this.firstNumber;

    }
    public double getSecondNumber (){
        return this.secondNumber;
    }

    public double setFirstNumber (double number1){
        this.firstNumber = number1;
        return number1;
    }

    public double setSecondNumber (double number2){
        this.secondNumber = number2;
        return number2;

    }

    public double getAdditionResult (){
        double add;
        add = this.firstNumber + this.secondNumber;
        return add;
    }
    public double getSubstractionResult (){
        double sub;
        sub = this.firstNumber - this.secondNumber;
        return sub;

    }
public double getMultiplicationResult (){
        double multi;
        multi = this.firstNumber * this.secondNumber;
        return multi;
}
public double getDivisionResult (){
        double div;
        div = this.firstNumber/this.secondNumber;
        if (secondNumber ==0){
        return 0;
    } else {
            return div;
        }
}

}
