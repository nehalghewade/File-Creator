package com.nehal.file;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class FileExtensionRegistry {
    private static final Logger logger = Logger.getLogger(FileExtensionRegistry.class.getName());
    public final Set<String> validExtensions;

    public FileExtensionRegistry() {
        validExtensions = new HashSet<String>();
        logger.info("Initializing FileExtensionRegistry...");
        initializeExtensions();
        logger.info("Valid extensions initialized: " + validExtensions);
    }

    private void initializeExtensions() {
        String[] extensionsData = { ".txt", ".md", ".rtf", ".doc", ".docx", ".odt", ".pdf", ".csv", ".xls", ".xlsx",
                ".ods", ".json", ".xml", ".sql", ".dat", ".db", ".c", ".cpp", ".java", ".py", ".js", ".html", ".htm",
                ".css", ".php", ".rb", ".go", ".kt", ".swift", ".ts", ".sh", ".jpg", ".jpeg", ".png", ".gif", ".bmp",
                ".svg", ".tif", ".tiff", ".mp3", ".wav", ".aac", ".flac", ".ogg", ".m4a", ".mp4", ".avi", ".mkv",
                ".mov", ".wmv", ".flv", ".zip", ".rar", ".7z", ".gz", ".tar", ".iso", ".exe", ".bat", ".app", ".apk",
                ".jar", ".db", ".mdb", ".accdb", ".sqlite", ".sql", ".dbf", ".html", ".htm", ".css", ".js", ".php",
                ".asp", ".aspx" };

        for (String extension : extensionsData) {
            validExtensions.add(extension.toLowerCase());
            logger.fine("Added valid extension: " + extension); // Log each added extension
        }
    }
}
