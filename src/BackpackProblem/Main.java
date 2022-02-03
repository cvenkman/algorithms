package BackpackProblem;

/**
 * created by cvenkman on 2/3/22 inside the package - BackpackProblem
 */
public class Main {
    public static void main(String[] args) {
        try {
            /*
                Item[] items = new Item[1]; // exception
            */
            Item[] items = new Item[3];
            items[0] = new Item(20, 4);
            items[1] = new Item(18, 3);
            items[2] = new Item(14, 2);
            Backpack backpack = new Backpack(items, 7);
            System.out.println(backpack.findMaxValueFitsInTheBackpack());
        }
        catch(Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
