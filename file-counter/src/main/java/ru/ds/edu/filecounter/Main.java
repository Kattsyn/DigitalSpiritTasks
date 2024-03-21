package ru.ds.edu.filecounter;

import ru.ds.edu.filecounter.file.FileCounter;
import ru.ds.edu.filecounter.file.FileCounterService;
import ru.ds.edu.filecounter.file.FileCounterUtils;
import ru.ds.edu.filecounter.file.FileExtensionCount;

import java.io.File;
import java.util.List;
import java.util.Scanner;


/**
 * Задача:
 * <p>
 * 1) Необходимо подсчитать кол-во файлов в директории (путь к ней передаётся через аргумент),
 * включая файлы во вложенных директориях любого уровня.
 * <p>
 * 2) Кол-во файлов, должно быть сгруппировано по расширениям файлов.
 * <p>
 * 3) Вывод кол-ва файлов должен быть реализован следующим образом:
 *
 * <pre>
 * Кол-во файлов в переданной директории:
 * - pdf: 100
 * - txt: 23
 * - jpg: 156
 * .....
 * .....
 * - exe: 3
 * </pre>
 * <p>
 * 4) Для выполнения задания, необходимо реализовать интерфейс {@link FileCounterService},
 * а так же вспомогательные утилитный функции:
 * <p>
 * - {@link ru.ds.edu.filecounter.file.FileCounterUtils#fileExtension(String)}
 * <p>
 * - {@link ru.ds.edu.filecounter.file.FileCounterUtils#writeExtensionCount(FileExtensionCount, List)}
 * <p>
 * Логика реализации утилитных методов описана в самих методах.
 * <p>
 * 5) В реализации {@link FileCounterService} - использовать реализованные утилитные методы
 * класса {@link ru.ds.edu.filecounter.file.FileCounterUtils}
 * <p>
 * 6) Модель {@link FileExtensionCount} - нельзя изменять и расширять
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileCounter fileCounter = new FileCounter();
        fileCounter.outFiles(scanner.nextLine());
    }
}
