package com.nehal.main;

import java.util.Scanner;
import java.util.logging.Logger;
import com.nehal.file.FileBuilderService;
import com.nehal.file.UserFile;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Filename: ");
            String fileName = scanner.nextLine().strip();
            System.out.print("Enter Directory Path: ");
            String directoryPath = scanner.nextLine().strip();

            UserFile userFile = new FileBuilderService()
                                    .setFileDirectoryPath(directoryPath)
                                    .setFileName(fileName)
                                    .getUserFile();
            
            userFile.create();     
            logger.info("File creation process completed.");
        } catch (Exception e) {
            logger.severe("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
