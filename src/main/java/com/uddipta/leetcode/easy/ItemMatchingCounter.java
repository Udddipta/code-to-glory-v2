package com.uddipta.leetcode.easy;

import java.util.List;

public class ItemMatchingCounter {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = -1;

        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default:
                //do nothing
        }

        if(!(index >= 0 && index <= 2)){
            return 0;
        }

        int matchingEntries = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                ++matchingEntries;
            }

        }
        return matchingEntries;

    }
}

