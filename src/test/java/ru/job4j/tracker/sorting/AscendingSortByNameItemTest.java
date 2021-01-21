package ru.job4j.tracker.sorting;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AscendingSortByNameItemTest {

    @Test
    public void ascendingSortByName() {
        Item item1 = new Item(1, "test1");
        Item item2 = new Item(2, "test2");
        List<Item> result = Arrays.asList(item2, item1);
        Collections.sort(result, new AscendingSortByNameItem());
        List<Item> expected = Arrays.asList(item1, item2);
        assertThat(result, is(expected));
    }
}