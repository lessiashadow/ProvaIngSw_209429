package myPackage;

import java.util.Collections;
import java.util.List;

public class MyListUtil {

    public List<Integer> sort(List<Integer> list, int order) {
        if(order == 0)
            Collections.sort(list);
        else
            Collections.sort(list, Collections.<Integer>reverseOrder());
        return list;
    }

}
