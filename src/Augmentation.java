/**
 * Created by Богдан on 03.02.2015.
 */
public class Augmentation implements IFunction {
    @Override
    public String operation(int operand1, int operand2) {
        return "" + (operand1 +  operand2);
    }
}
