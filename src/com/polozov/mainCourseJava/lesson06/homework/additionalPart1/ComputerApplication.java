package com.polozov.mainCourseJava.lesson06.homework.additionalPart1;

public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer1 = new Computer(10000, "HP");
        Computer computer2 = new Computer(2000, "Dell",
                new RandomAccessMemory(),
                new HardDrivenDisk());

        HardDrivenDisk disk1 = computer1.getDisk();
        disk1.setName("Seagate");
        disk1.setCapacity(2000);
        disk1.setType("Внутренний");

        RandomAccessMemory memory1 = computer1.getMemory();
        memory1.setName("Kingston");
        memory1.setCapacity(4000);

        HardDrivenDisk disk2 = computer2.getDisk();
        disk2.setName("Western Digital");
        disk2.setCapacity(4000);
        disk2.setType("Внутренний");

        RandomAccessMemory memory2 = computer2.getMemory();
        memory2.setName("Kingston");
        memory2.setCapacity(8000);

        computer1.showMainInformation();
        computer2.showMainInformation();

    }
}
