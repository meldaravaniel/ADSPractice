package main.linkedlists;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class RemoveDupsFromUnsorted {

    public static LinkedList removeDups(LinkedList list) {
        if (list == null) return list;
        if (list.size() < 2) return list;
        Map<Object, Boolean> stuff = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Object thing = list.get(i);
            if (stuff.get(thing) != null && stuff.get(thing)) {
                list.remove(i);
            } else {
                stuff.put(thing, true);
            }
        }
        return list;
    }

    public static LinkedList removeDupsNoBuffer(LinkedList list) {
        if (list == null) return null;
        if (list.size() < 2) return list;
        //Sort list and see if adjacent elements are the same
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                 list.remove(i + 1);
            }
        }
        return list;
    }
}
