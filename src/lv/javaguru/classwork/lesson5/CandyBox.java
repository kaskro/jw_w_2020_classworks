package lv.javaguru.classwork.lesson5;

public class CandyBox {

    private String name;
    private int amount;

    public CandyBox(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        CandyBox thatCandyBox = (CandyBox) that;
        boolean isNameEquals = thatCandyBox.name.equals(name);
        boolean isAmountEquals = thatCandyBox.amount == amount;

        return isAmountEquals
                && isNameEquals;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "name='" + name + "'" +
                ", amount='" + amount + "'" +
                "}";
    }
}
