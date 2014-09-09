package com.tencent.kingkong.database;

public final class SQLiteCustomFunction
{
  public final SQLiteDatabase.CustomFunction callback;
  public final String name;
  public final int numArgs;

  public SQLiteCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    if (paramString == null)
      throw new IllegalArgumentException("name must not be null.");
    this.name = paramString;
    this.numArgs = paramInt;
    this.callback = paramCustomFunction;
  }

  private void dispatchCallback(String[] paramArrayOfString)
  {
    this.callback.callback(paramArrayOfString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteCustomFunction
 * JD-Core Version:    0.6.2
 */