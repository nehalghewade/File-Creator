package com.nehal.file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FileCheckerService {
    private static final Logger logger = Logger.getLogger(FileCheckerService.class.getName());

    public static boolean checkFileExists(String parentDirectory, String fileName) {
        if (parentDirectory == null || parentDirectory.isEmpty() || parentDirectory.isBlank()) {
            parentDirectory = System.getProperty("user.home") + "\\Desktop";
            logger.warning("Parent directory was null or empty. Set to user's Desktop: " + parentDirectory);
        }
        
        boolean exists = Files.exists(Paths.get(parentDirectory, fileName));
        logger.info("File check for path: " + parentDirectory + "\\" + fileName + " - Exists: " + exists);
        
        return exists;
    }
}
