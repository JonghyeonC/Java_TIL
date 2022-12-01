package com.ssafy.annotation3;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface SourceAnno {
	String value();
}
