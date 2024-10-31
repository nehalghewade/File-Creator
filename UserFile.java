package com.nehal.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class UserFile {
    private static final Logger logger = Logger.getLogger(UserFile.class.getName());
    private String fileName;
    private String fileDirectoryPath;

    public UserFile(String fileDirectoryPath, String fileName) {
        this.fileName = fileName;
        this.fileDirectoryPath = fileDirectoryPath;
    }

    public void create() throws IOException {
        if (fileDirectoryPath == null || fileDirectoryPath.isEmpty() || fileDirectoryPath.isBlank()) {
            this.fileDirectoryPath = System.getProperty("user.home") + "\\OneDrive\\Desktop";
            logger.warning("File directory path was null or empty. Set to user's Desktop: " + fileDirectoryPath);
        }
        
         if (FileCheckerService.checkFileExists(fileDirectoryPath, fileName) == false) {
            File file = new File(fileDirectoryPath, fileName);
            if (new FileExtensionValidatorService().isValidExtension(file)) {
                file.createNewFile();
                logger.info("File created successfully at: " + file.getAbsolutePath());
            } else {
                logger.warning("Invalid file extension for file: " + fileName);
            }
        } else {
            logger.severe("File already exists at: " + fileDirectoryPath + "\\" + fileName);
        }
    }
}
