package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        float divided = toBeDivided / 5f;
        System.out.println(toBeDivided + " divided by 5 is " + divided);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        int gasayofi = 12;
        divider.divide(gasayofi);
    }
}
