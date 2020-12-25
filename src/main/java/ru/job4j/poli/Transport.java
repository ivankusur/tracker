package ru.job4j.poli;

public interface Transport {
    void go();

    void passengers(int amount);

    int fillUp(int fuelQuantity);

}

