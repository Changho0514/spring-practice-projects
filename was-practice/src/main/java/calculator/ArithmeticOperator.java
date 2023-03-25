package calculator;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }
    , SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithmeticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public static int calculate(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values()) // values() -> 모든 ENUM 값
                .filter(v -> v.operator.equals(operator)) // ArithmeticOperator(String operator) 에서 들어갔음. ex) ADDITION("+")
                .findFirst() //같은 것을 가져온다.
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
        //arithmeticOperator 는 ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION 중 하나
        return arithmeticOperator.arithmeticCalculate(operand1, operand2);
    }

    public abstract int arithmeticCalculate(final int operand1, final int operand2);
}

