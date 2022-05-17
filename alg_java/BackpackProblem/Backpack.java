package BackpackProblem;

/**
 * created by cvenkman on 2/3/22 inside the package - BackpackProblem
 */
public class Backpack {
    private final Item[] items;
    private final int capacity;
    private int weight;
    private int value;

    public Backpack(Item[] items, int capacity) {
        this.items = items;
        this.capacity = capacity;
        this.weight = 0;
        this.value = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    private Item findMaxItemSpecificValue() {
        int max = items[0].getSpecificValue();
        Item tmp = items[0];
        for (Item item: this.items) {
            if (item.getSpecificValue() > max &&
                item.getHowMuchInBackpack() != item.getWeight()) {
                max = item.getSpecificValue();
                tmp = item;
            }
        }
        return tmp;
    }

    public int findMaxValueFitsInTheBackpack() {
        int max = items[0].getSpecificValue();
        Item tmp_item;
        while (weight < capacity) {
            tmp_item = findMaxItemSpecificValue();
            if (weight + tmp_item.getWeight() < capacity) {
                weight += tmp_item.getWeight();
                value += tmp_item.getValue();
                tmp_item.setHowMuchInBackpack(tmp_item.getWeight());
            }
            else {
                value += (capacity - weight) * tmp_item.getSpecificValue();
                weight = capacity;
            }
        }
        return value;
    }

}
