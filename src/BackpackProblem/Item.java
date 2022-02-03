package BackpackProblem;

/**
 * created by cvenkman on 2/3/22 inside the package - BackpackProblem
 */
public class Item {
    private final int value;
    private final int weight;
    private final int specific_value;
    private int how_much_in_backpack;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        how_much_in_backpack = 0;
        specific_value = value / weight;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public int getHowMuchInBackpack() {
        return how_much_in_backpack;
    }

    public void setHowMuchInBackpack(int how_much_in_backpack) {
        this.how_much_in_backpack = how_much_in_backpack;
    }

    public int getSpecificValue() {
        return specific_value;
    }
}
