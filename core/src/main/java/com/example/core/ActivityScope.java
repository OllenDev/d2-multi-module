package com.example.core;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Scope
@Documented
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ActivityScope
{
}
