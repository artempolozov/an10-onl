package com.polozov.mainCourseJava.lesson06.homework.additionalPart1;

/**
 * Класс, описывающий сущность Жесткий диск
 */
public class HardDrivenDisk {

    /** Название  */
    private String name;

    /** Объем */
    private int capacity;

    /** Тип */
    private String type;

    public HardDrivenDisk() {
    }

    public HardDrivenDisk(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Метод для сбора общей информации по устройству
     * @return String общая информация
     */
    String getMainInformation() {
        return String.format("\tЖесткий диск. Наименование: %s\tОбъем: %dМб\tТип: %s",
                this.name, this.capacity, this.type);
    }

    /**
     * Метод для вывода общей информации по устройству
     */
    void showMainInformation() {
        System.out.println(getMainInformation());
    }
}
