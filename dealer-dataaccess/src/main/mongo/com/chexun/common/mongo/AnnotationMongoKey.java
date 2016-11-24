package com.chexun.common.mongo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义Mongo注解id
 * 
 * @author vincent.he
 * @version 1.0, Created on 2012-3-12
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationMongoKey {

}
