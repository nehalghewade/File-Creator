package com.nehal.file;

import java.io.File;
import java.util.logging.Logger;

public class FileExtensionValidatorService {
    private static final Logger logger = Logger.getLogger(FileExtensionValidatorService.class.getName());

    private String getFileExtension(File file) {
        String fileName = file.getName();
        int stringDotIndex = fileName.lastIndexOf(".");
        if (stringDotIndex > 0 && stringDotIndex < fileName.length() - 1) {
        	String ext = fileName.substring(stringDotIndex);
        	logger.info("File Extension is :" + ext);
            return ext;
        }
        logger.warning("File extension could not be determined for file: " + fileName);
        return null;
    }

 
    	public boolean isValidExtension(File file) {
    	    String extension = getFileExtension(file);
    	    if (extension == null) {
    	        logger.warning("File has no extension: " + file.getName());
    	        return false; // or handle as appropriate
    	    }
    	    boolean isValid = new FileExtensionRegistry().validExtensions.contains(extension.toLowerCase());
    	    logger.info("Validation of file extension '" + extension + "' for file: " + file.getName() + " - Valid: " + isValid);
    	    return isValid;
    	}

    }

