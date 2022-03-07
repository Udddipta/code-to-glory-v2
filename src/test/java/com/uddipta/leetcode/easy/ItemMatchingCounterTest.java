package com.uddipta.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ItemMatchingCounterTest {

    @Test
    public void check_item_matching_counter_logic_for_color_matching() {
        ItemMatchingCounter itemMatchingCounter = new ItemMatchingCounter();
        List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone"));
        Assert.assertEquals(itemMatchingCounter.countMatches(items, "color", "silver"), 1);

    }

    @Test
    public void check_item_matching_counter_logic_for_type_matching() {
        ItemMatchingCounter itemMatchingCounter = new ItemMatchingCounter();
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone"));
        Assert.assertEquals(itemMatchingCounter.countMatches(items, "type", "phone"), 2);

    }

    @Test
    public void check_item_matching_counter_logic_for_name_matching() {
        ItemMatchingCounter itemMatchingCounter = new ItemMatchingCounter();
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","iphone"),
                Arrays.asList("phone","gold","iphone"));
        Assert.assertEquals(itemMatchingCounter.countMatches(items, "name", "iphone"), 2);

    }

    @Test
    public void check_item_matching_counter_logic_for_incorrect_input() {
        ItemMatchingCounter itemMatchingCounter = new ItemMatchingCounter();
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","iphone"),
                Arrays.asList("phone","gold","iphone"));
        Assert.assertEquals(itemMatchingCounter.countMatches(items, "food", "iphone"), 0);

    }
}
