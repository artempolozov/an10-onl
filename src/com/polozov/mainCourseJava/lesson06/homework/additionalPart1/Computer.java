package com.polozov.mainCourseJava.lesson06.homework.additionalPart1;

/**
 * Класс, описывающий сущность Компьютер
 */
public class Computer {
    /** Цена компьютера */
    private int price;

    /** Модель компьтера */
    private String model;

    /** Оперативная память */
    private RandomAccessMemory memory;

    /** Жетский диск */
    private HardDrivenDisk disk;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.disk = new HardDrivenDisk();
        this.memory = new RandomAccessMemory();
    }

    public Computer(int price, String model, RandomAccessMemory memory, HardDrivenDisk disk) {
        this.price = price;
        this.model = model;
        this.memory = memory;
        this.disk = disk;
    }

    public RandomAccessMemory getMemory() {
        return memory;
    }

    public HardDrivenDisk getDisk() {
        return disk;
    }

    /**
     * Метод для сбора общей информации по устройству
     * @return String общая информация
     */
    private String getMainInformation() {
        return String.format("Компьютер. Стоимость: %d\tМодель: %s\n%s\n%s",
                this.price,
                this.model,
                this.memory.getMainInformation(),
                this.disk.getMainInformation());
    }

    /**
     * Метод для вывода общей информации по устройству
     */
    void showMainInformation() {
        System.out.println(getMainInformation());
    }
}
