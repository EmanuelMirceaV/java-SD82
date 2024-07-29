package Intro;

import java.io.File;

public class DeleteFiles {

    static final String localFolder = "C:\\Users\\emanu\\Downloads\\Courses\\Test";
    public static void main(String[] args) {

        delFiles(localFolder);

    }

    public static void delFiles(String fld) {

        File folder = new File(fld);

        for (File entry : folder.listFiles()) {
            if (entry.isDirectory() == false) {
                String fileName = entry.getName().toLowerCase();

                if ((fileName.endsWith(".txt") || fileName.endsWith(".rar")) && fileName.equals("other.txt")) {
                    entry.delete();

                }
            }
        }
        System.out.println("Execution complete");
    }

}
