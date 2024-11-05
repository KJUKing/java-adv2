package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");

        System.out.println("File exists: " + file.exists());

        boolean created = file.createNewFile();
        System.out.println("File created = " + created);

        boolean dirCreated = directory.mkdir();
        System.out.println("Directory created = " + dirCreated);

//        boolean deleted = file.delete();
//        System.out.println("File deleted = " + deleted);
//
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("directory.isDirectory() = " + directory.isDirectory());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.length() = " + file.length() + "byte");

        File newFile = new File("temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("File renamed = " + renamed);

        long lastModified = newFile.lastModified();
        System.out.println("Last modified = " + new Date(lastModified));
    }
}
