import java.util.ArrayList;
import java.util.List;

public class sorted_list {
    public static void main(String args[]){
        List<Integer> list1 = List.of(1, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8);

        List<Integer> mergedList = mergeLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        for (; i < list1.size() && j < list2.size(); ) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        for (; i < list1.size(); i++) {
            mergedList.add(list1.get(i));
        }

        for (; j < list2.size(); j++) {
            mergedList.add(list2.get(j));
        }

        return mergedList;
    }
}
