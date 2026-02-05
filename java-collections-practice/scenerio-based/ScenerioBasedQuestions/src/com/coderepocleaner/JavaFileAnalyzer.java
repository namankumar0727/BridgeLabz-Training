package com.coderepocleaner;

import java.util.*;
import java.util.regex.*;

public class JavaFileAnalyzer {

    // camelCase method naming
    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([A-Z].*)\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);

    public static FileType analyze(String content) {

        boolean hasError = false;
        boolean hasWarning = false;

        // Check method naming
        Matcher methodMatcher = METHOD_PATTERN.matcher(content);
        if (methodMatcher.find()) {
            hasError = true;
        }

        // Detect unused imports (basic heuristic)
        Matcher importMatcher = IMPORT_PATTERN.matcher(content);
        while (importMatcher.find()) {
            String importedClass = importMatcher.group(1);
            String className = importedClass.substring(importedClass.lastIndexOf('.') + 1);

            if (!content.contains(className + " ")) {
                hasWarning = true;
            }
        }

        if (hasError) return FileType.ERROR;
        if (hasWarning) return FileType.WARNING;
        return FileType.VALID;
    }
}
