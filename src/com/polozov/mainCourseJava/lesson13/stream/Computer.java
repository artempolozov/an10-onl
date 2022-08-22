package com.polozov.mainCourseJava.lesson13.stream;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Computer {
    private String brand; // брэнд
    private int cost; // цена

    private String memoryBrand; // изготовитель ОЗУ
    private int memorySize; // размер одной планки ОЗУ
    private double memoryFrequency; // частота ОЗУ
    private int memoryCount; // количество планок ОЗУ

    private String cpuBrand; // изготовитель ЦПУ
    private double cpuFrequency; // частота ЦПУ
    private int coreCount; // количество ядер ЦПУ

    private String motherboardBrand; // изготовитель материнки
    private String chipset; // чипсет

    private String diskBrand; // изготовитель жесткого диска
    private int diskSize; // размер диска
    private int diskCount; // количество дисков
    private String diskType; // тип диска

    private String videoCardBrand; // изготовитель видеокарты
    private int videoCardSize; // размер видео карты
    private double videoCardFrequency; // частота видео карты

    private int powerUnit; // мощность блока питания

    public Computer(String brand, int cost, String memoryBrand, int memorySize, double memoryFrequency, int memoryCount, String cpuBrand, double cpuFrequency, int coreCount, String motherboardBrand, String chipset, String diskBrand, int diskSize, int diskCount, String diskType, String videoCardBrand, int videoCardSize, double videoCardFrequency, int powerUnit) {
        this.brand = brand;
        this.cost = cost;
        this.memoryBrand = memoryBrand;
        this.memorySize = memorySize;
        this.memoryFrequency = memoryFrequency;
        this.memoryCount = memoryCount;
        this.cpuBrand = cpuBrand;
        this.cpuFrequency = cpuFrequency;
        this.coreCount = coreCount;
        this.motherboardBrand = motherboardBrand;
        this.chipset = chipset;
        this.diskBrand = diskBrand;
        this.diskSize = diskSize;
        this.diskCount = diskCount;
        this.diskType = diskType;
        this.videoCardBrand = videoCardBrand;
        this.videoCardSize = videoCardSize;
        this.videoCardFrequency = videoCardFrequency;
        this.powerUnit = powerUnit;
    }
}
