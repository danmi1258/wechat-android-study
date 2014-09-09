package com.jg;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
public @interface JgMethodChecked
{
  public abstract int author();

  public abstract String fComment();

  public abstract String lastDate();

  public abstract int level();

  public abstract int reviewer();

  public abstract EType[] vComment();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.jg.JgMethodChecked
 * JD-Core Version:    0.6.2
 */