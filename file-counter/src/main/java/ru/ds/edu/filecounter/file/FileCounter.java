package ru.ds.edu.filecounter.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCounter implements FileCounterService {
    @Override
    public List<FileExtensionCount> countGroupByExtension(String rootPath) throws FileCounterException {
        List<FileExtensionCount> countList = new ArrayList<>();

        countGroupInFolder(rootPath, countList);

        return countList;
    }

    private void countGroupInFolder(String path, List<FileExtensionCount> countList) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isDirectory()) {
                countGroupInFolder(file.getPath(), countList);
            } else {
                FileExtensionCount item = new FileExtensionCount(FileCounterUtils.fileExtension(file.getName()), 1);
                FileCounterUtils.writeExtensionCount(item, countList);
            }
        }
    }

    public void outFiles(String rootPath) {
        List<FileExtensionCount> list = countGroupByExtension(rootPath);

        System.out.println("<pre>");
        System.out.println("Кол-во файлов в переданной директории:");
        for (FileExtensionCount item : list) {
            System.out.println("- " + item.getExtension() + ": " + item.getCount());
        }
        System.out.println("</pre>");
        System.out.println("<p>");
    }
}
