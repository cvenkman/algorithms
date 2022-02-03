package BackpackProblem;

import java.util.HashMap;

/**
 * created by cvenkman on 2/3/22 inside the package - BackpackProblem
 */
public class Item {
    public static int findMaxValueFitsInTheBackpack(int capacity,
                                                    HashMap<Integer, Integer> value_weight) {
        /*
            входные данные: веса предметов (second in HashMap),
            их ценность (first in HashMap),
            вместимость рюкзака (capacity), количество объектов n
            выход: максимальное значение ценности, которое помещвется
            в рюкзак вместимостью capacity
            note: объекты можно делить
         */
//        ArrayList<Integer> specific_value_of_each = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> item: value_weight.entrySet()) {
//            specific_value_of_each.add(item.getKey() / item.getValue());
//        }
        int weight = 0;
//        while (weight < capacity) {
//            int max = Collections.max(specific_value_of_each);
//            weight += max * value_weight.get(max);
//            specific_value_of_each.remove(max);

//        }



        return weight;
    }
}
