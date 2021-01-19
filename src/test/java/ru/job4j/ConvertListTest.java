package ru.job4j;

import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConvertListTest {

    @Test
    public void whenToList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{1, 2, 3});
        List<Integer> expected = Arrays.asList(1, 1, 2, 3);
        assertThat(ConvertList.convert(in), is(expected));
    }
}