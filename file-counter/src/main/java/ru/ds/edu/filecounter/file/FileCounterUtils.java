package ru.ds.edu.filecounter.file;

import java.util.List;

/**
 * Утилитный класс, содержащий вспомогательные функции
 * для реализации {@link FileCounterService}
 */
public final class FileCounterUtils {

    /**
     * Возвращает расширение файла.
     * <p>
     * Если у файла отсутствует расширение,
     * то возвращает - "no-ext"
     *
     * @param fileName - наименование файла
     * @return
     */

    //Выбрал такую реализацию, тк посчитал операцию split() не слишком затратную, и достаточно эффективной.
    public static String fileExtension(String fileName) {
        String[] parts = fileName.split("\\.");
        if (parts.length > 1) {
            return parts[parts.length - 1];
        } else {
            return "no-ext";
        }
    }


    /**
     * Находит в списке writable необходимую группу -
     * (сравнение происходит по {@link FileExtensionCount#getExtension()})
     * и прибавляет к ней кол-во, переданное в item.
     * <p>
     * Если в списке отсутствует группа, то в список добавляется новый элемент с соответствующими параметрам
     *
     * @param item     - элемент, который нужно просуммировать в списке writable или добавить новый,
     *                 если в списке отсутствует такая группа.
     * @param writable - список, содержащий сгруппированное по расширению кол-во файлов
     */
    public static void writeExtensionCount(FileExtensionCount item, List<FileExtensionCount> writable) {
        for (FileExtensionCount fileExtensionCount : writable) {
            if (fileExtensionCount.getExtension().equals(item.getExtension())) {
                fileExtensionCount.increaseCount(item.getCount());
                return;
            }
        }
        writable.add(item);
    }
}
