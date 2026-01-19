package com.birdsanctuary;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String developer();
    String date();
    String version();
}
