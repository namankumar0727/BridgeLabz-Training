package com.annotation.repeatableannotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Container annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}
