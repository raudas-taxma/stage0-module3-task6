package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float flag = numberToBeRounded - (int) numberToBeRounded;
        int result = flag >= 0.5 ? (int) numberToBeRounded + 1 : (int) numberToBeRounded;
        System.out.println(result);
    }
}
