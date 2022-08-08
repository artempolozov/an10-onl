package com.polozov.mainCourseJava.lesson09;

import java.io.*;
import java.util.Scanner;

public class TryWithResourcesReadWriteFileClass {
    public static void main(String[] args)  {
        String filename = "newfile.txt";
        try {
            writeFile(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        readFile(filename);

        System.out.println("HELLO!");
    }

    private static void readFile(String filename) {
        try (FileReader fr = new FileReader(filename)) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    private static void writeFile(String filename) throws IOException, EOFException {
        File file = new File(filename);
        try {

            file.createNewFile();

        } catch (IOException e) {
            System.err.println("Не удалось создать файл");
            throw new IOException("Ошибка создания файла");
        }

        try (FileWriter fr = new FileWriter(file)){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            while (!line.equals("!q")) {
                fr.write(line + "\n");
                line = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
