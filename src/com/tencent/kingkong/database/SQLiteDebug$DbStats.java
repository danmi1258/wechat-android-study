package com.tencent.kingkong.database;

public class SQLiteDebug$DbStats
{
  public String cache;
  public String dbName;
  public long dbSize;
  public int lookaside;
  public long pageSize;

  public SQLiteDebug$DbStats(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.dbName = paramString;
    this.pageSize = (paramLong2 / 1024L);
    this.dbSize = (paramLong1 * paramLong2 / 1024L);
    this.lookaside = paramInt1;
    this.cache = (paramInt2 + "/" + paramInt3 + "/" + paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDebug.DbStats
 * JD-Core Version:    0.6.2
 */