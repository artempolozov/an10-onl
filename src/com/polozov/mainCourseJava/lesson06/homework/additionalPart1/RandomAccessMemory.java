package com.polozov.mainCourseJava.lesson06.homework.additionalPart1;

/**
 * Класс, описывающий сущность Оперативная память
 */
public class RandomAccessMemory {

    /** Название  */
    private String name;

    /** Объем */
    private int capacity;

    public RandomAccessMemory() {
    }

    public RandomAccessMemory(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Метод для сбора общей информации по устройству
     * @return String общая информация
     */
    String getMainInformation() {
        return String.format("\tОперативная память. Наименование: %s\tОбъем: %dМб",
                this.name, this.capacity);
    }

    /**
     * Метод для вывода общей информации по устройству
     */
    void showMainInformation() {
        System.out.println(getMainInformation());
    }

}
