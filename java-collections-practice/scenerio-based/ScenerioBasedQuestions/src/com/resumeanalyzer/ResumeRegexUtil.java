package com.resumeanalyzer;

import java.util.regex.Pattern;

public class ResumeRegexUtil {

    public static final Pattern EMAIL_PATTERN =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

    public static final Pattern PHONE_PATTERN =
            Pattern.compile("\\b\\d{10}\\b");

    public static final Pattern KEYWORD_PATTERN =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);
}
