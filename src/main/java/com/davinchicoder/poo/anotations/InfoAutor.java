package com.davinchicoder.poo.anotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAutor {
    String nombre();

    String email();
}
