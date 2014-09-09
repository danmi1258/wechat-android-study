package com.tencent.kingkong.support;

import android.util.Printer;

public class PrefixPrinter
  implements Printer
{
  private final String mPrefix;
  private final Printer mPrinter;

  private PrefixPrinter(Printer paramPrinter, String paramString)
  {
    this.mPrinter = paramPrinter;
    this.mPrefix = paramString;
  }

  public static Printer create(Printer paramPrinter, String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return paramPrinter;
    return new PrefixPrinter(paramPrinter, paramString);
  }

  public void println(String paramString)
  {
    this.mPrinter.println(this.mPrefix + paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.PrefixPrinter
 * JD-Core Version:    0.6.2
 */