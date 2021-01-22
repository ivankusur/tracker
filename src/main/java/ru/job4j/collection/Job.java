package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(name, job.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }


    @Override
    public int compareTo(Job another) {
        return Integer.compare(this.priority, another.priority);
    }
}
