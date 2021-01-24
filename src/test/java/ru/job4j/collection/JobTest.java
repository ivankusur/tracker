package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorBySameNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDscByPriority());
        List<Job> rsl = Arrays.asList(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        rsl.sort(cmpNamePriority);
        assertThat(rsl, is(Arrays.asList(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        )));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByName() {
        List<Job> rsl = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        rsl.sort(new JobAscByName());
        assertThat(rsl, is(Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        )));
    }

    @Test
    public void whenComparatorDescByName() {
        List<Job> rsl = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        rsl.sort(new JobDescByName());
        assertThat(rsl, is(Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        )));
    }

    @Test
    public void whenComparatorAscByPriority() {
        List<Job> rsl = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        rsl.sort(new JobAscByPriority());
        assertThat(rsl, is(Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        )));
    }

    @Test
    public void whenComparatorDscByPriority() {
        List<Job> rsl = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        rsl.sort(new JobDscByPriority());
        assertThat(rsl, is(Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        )));
    }
}