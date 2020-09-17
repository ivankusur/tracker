package oop;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest extends TestCase {

    public void testWhenEqual() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    public void testWhen50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }
}
