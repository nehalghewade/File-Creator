package com.nehal.file;

import java.util.logging.Logger;

public class FileBuilderService {
    private static final Logger logger = Logger.getLogger(FileBuilderService.class.getName());
    private String fileDirectoryPath;
    private String fileName;

    public FileBuilderService setFileDirectoryPath(String fileDirectoryPath) {
        this.fileDirectoryPath = fileDirectoryPath;
        logger.info("File directory path set to: " + fileDirectoryPath);
        return this;
    }

    public FileBuilderService setFileName(String fileName) {
        this.fileName = fileName;
        logger.info("File name set to: " + fileName);
        return this;
    }

    public UserFile getUserFile() {
        logger.info("Creating UserFile with directory path: " + fileDirectoryPath + " and file name: " + fileName);
        return new UserFile(fileDirectoryPath, fileName);
    }
}
