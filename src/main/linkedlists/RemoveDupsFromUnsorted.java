package main.linkedlists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class RemoveDupsFromUnsorted {

    public static LinkedList removeDups(LinkedList list) {
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
        //Sort list and see if adjacent elements are the same
        
    }
}
