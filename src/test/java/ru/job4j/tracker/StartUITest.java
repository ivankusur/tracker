package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenFindAllItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Searched item"));
        List<UserAction> actions = Arrays.asList(
                new FIndAllAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Searched item"));
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find all item" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item.toString() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find all item" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new ReplaceAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new ConsoleOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new DeleteAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Searched item", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Searched item"));
        List<UserAction> actions = Arrays.asList(
                new FindByNameAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find Item by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item.toString() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find Item by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Searched item"));
        List<UserAction> actions = Arrays.asList(
                new FindByIdAction(out),
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find items by ID" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item.toString() + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find items by ID" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Collections.singletonList(
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"5", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Collections.singletonList(
                new ExitAction()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}