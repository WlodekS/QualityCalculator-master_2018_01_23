package pl.edu.agh.qualitycalculator;

public class Calculations {

    public float calculate(Operation op, float operand1, float operand2) throws Exception {
        if (op.equals(Operation.SUM)) {
            return sum(operand1, operand2);
        } else if (op.equals(Operation.SUBTRACT)) {
            return subtract(operand1, operand2);
        } else if (op.equals(Operation.DIVIDE)) {
            return divide(operand1, operand2);
        } else if (op.equals(Operation.MULTIPLY)) {
            return multiply(operand1, operand2);
        } else {
            throw new Exception("Unknown operation");
        }
    }

    private float sum(float operand1, float operand2) {
        return operand1 + operand2;
    }

    private float subtract(float operand1, float operand2) {
        return operand1 - operand2;
    }

    private float multiply(float operand1, float operand2) {
        return operand1 * operand2;
    }

    private float divide(float operand1, float operand2) {
        if (operand2 == 0)
        {
            return 0;
        }
        else {return operand1 / operand2;}

    }


}
