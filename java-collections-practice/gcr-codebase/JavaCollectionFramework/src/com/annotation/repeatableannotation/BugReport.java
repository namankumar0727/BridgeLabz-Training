package com.annotation.repeatableannotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Make annotation repeatable
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReport {
    String description();
}
