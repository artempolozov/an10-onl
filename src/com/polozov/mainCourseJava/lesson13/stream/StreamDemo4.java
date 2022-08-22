package com.polozov.mainCourseJava.lesson13.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        List<Computer> computers = Stream.of(
                new Computer("Lenovo", 1950,
                        "Kingston", 8, 3.6, 2,
                        "Intel", 2.7, 8,
                        "MSI", "B560",
                        "WD", 2000, 1, "sata-3.5",
                        "ASUS", 4000, 1.5,
                        850),
                new Computer("HP", 2100,
                        "Kingston", 4, 3.4, 2,
                        "AMD", 3.4, 8,
                        "MSI", "B560",
                        "Seagate", 1000, 1, "ssd-2.5",
                        "MSI", 6000, 1.7,
                        1100),
                new Computer("ASUS", 2000,
                        "Kingston", 4, 3.4, 4,
                        "AMD", 3.6, 6,
                        "MSI", "B560",
                        "WD", 1000, 1, "ssd-2.5",
                        "Gigabyte", 6000, 1.5,
                        1000),
                new Computer("Lenovo", 2200,
                        "Kingston", 8, 2.7, 4,
                        "AMD", 3.8, 10,
                        "MSI", "B560",
                        "WD", 1000, 1, "ssd-m2",
                        "ASUS", 8000, 1.5,
                        1200),
                new Computer("MSI", 1950,
                        "Kingston", 8, 3.2, 2,
                        "Intel", 2.5, 8,
                        "MSI", "B560",
                        "Seagate", 4000, 1, "sata-3.5",
                        "MSI", 4000, 1.7,
                        900),
                new Computer("DELL", 1900,
                        "Kingston", 8, 3.6, 4,
                        "Intel", 3.2, 4,
                        "MSI", "B560",
                        "WD", 2000, 1, "sata-3.5",
                        "Gigabyte", 4000, 1.3,
                        850),
                new Computer("no-name", 1600,
                        "Kingston", 4, 4.0, 3,
                        "AMD", 3.0, 8,
                        "MSI", "B560",
                        "Seagate", 2000, 1, "sata-3.5",
                        "ASUS", 4000, 1.5,
                        9000),
                new Computer("Lenovo", 1800,
                        "Kingston", 4, 3.0, 4,
                        "Intel", 2.7, 4,
                        "MSI", "B560",
                        "WD", 1000, 2, "sata-3.5",
                        "MSI", 6000, 1.7,
                        900),
                new Computer("HP", 2050,
                        "Kingston", 8, 3.6, 2,
                        "Intel", 2.7, 8,
                        "MSI", "B560",
                        "Seagate", 2000, 1, "sata-3.5",
                        "Gigabyte", 6000, 1.5,
                        1000),
                new Computer("ASUS", 2200,
                        "Kingston", 8, 3.2, 4,
                        "AMD", 3.4, 12,
                        "MSI", "B560",
                        "WD", 1000, 1, "ssd-m2",
                        "ASUS", 8000, 1.7,
                        1200),
                new Computer("ASUS", 2150,
                        "Kingston", 8, 3.4, 2,
                        "Intel", 2.7, 4,
                        "MSI", "B560",
                        "Seagate", 1000, 1, "ssd-2.5",
                        "MSI", 4000, 1.7,
                        900)
        ).collect(Collectors.toList());


        // 1. Найти компьютеры, у которых больше двух планок оперативы
        // и суммарный размер дисков более 1000 и вывести отсортированный по бренду список
        computers.stream()
                .filter(c -> c.getMemoryCount() > 2)
                .filter(c -> c.getDiskCount() * c.getDiskSize() > 1000)
                .sorted(Comparator.comparing(Computer::getBrand))
                .forEach(System.out::println);

        System.out.println("--------------------");

        computers.stream()
                .sorted((c1, c2) -> (int) (c1.getMemorySize() * c1.getMemoryCount() * c1.getMemoryFrequency() - (c2.getMemorySize() * c2.getMemoryCount() * c2.getMemoryFrequency())))
                .limit(9)
                .sorted((c1, c2) -> (int) (c1.getCoreCount() * c1.getCpuFrequency() - (c2.getCoreCount() * c2.getCpuFrequency())))
                .limit(6)
                .sorted((c1, c2) -> (int) (c1.getVideoCardFrequency() * c1.getVideoCardSize() - (c2.getVideoCardFrequency() * c2.getVideoCardSize())))
                .limit(3)
                .forEach(System.out::println);

        System.out.println(computers.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase("hp"))
                .filter(c -> c.getDiskBrand().equalsIgnoreCase("seagate"))
                .count());

        computers.stream()
                .collect(Collectors.groupingBy(Computer::getBrand, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .sorted()
                .forEach(System.out::println);
    }
}
