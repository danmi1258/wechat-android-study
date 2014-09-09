package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public class WXFileObject
  implements p
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final String TAG = "!44@/B4Tb64lLpISsBeGklBKOYzdO14BK4vr5Asj6Oq15NY=";
  private int contentLengthLimit = 10485760;
  public byte[] fileData;
  public String filePath;

  public WXFileObject()
  {
    this.fileData = null;
    this.filePath = null;
  }

  public WXFileObject(String paramString)
  {
    this.filePath = paramString;
  }

  public WXFileObject(byte[] paramArrayOfByte)
  {
    this.fileData = paramArrayOfByte;
  }

  private int getFileSize(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    File localFile;
    do
    {
      return 0;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return (int)localFile.length();
  }

  public boolean checkArgs()
  {
    if (((this.fileData == null) || (this.fileData.length == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)))
    {
      z.e("!44@/B4Tb64lLpISsBeGklBKOYzdO14BK4vr5Asj6Oq15NY=", "checkArgs fail, both arguments is null");
      return false;
    }
    if ((this.fileData != null) && (this.fileData.length > this.contentLengthLimit))
    {
      z.e("!44@/B4Tb64lLpISsBeGklBKOYzdO14BK4vr5Asj6Oq15NY=", "checkArgs fail, fileData is too large");
      return false;
    }
    if ((this.filePath != null) && (getFileSize(this.filePath) > this.contentLengthLimit))
    {
      z.e("!44@/B4Tb64lLpISsBeGklBKOYzdO14BK4vr5Asj6Oq15NY=", "checkArgs fail, fileSize is too large");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putByteArray("_wxfileobject_fileData", this.fileData);
    paramBundle.putString("_wxfileobject_filePath", this.filePath);
  }

  public void setContentLengthLimit(int paramInt)
  {
    this.contentLengthLimit = paramInt;
  }

  public void setFileData(byte[] paramArrayOfByte)
  {
    this.fileData = paramArrayOfByte;
  }

  public void setFilePath(String paramString)
  {
    this.filePath = paramString;
  }

  public int type()
  {
    return 6;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.fileData = paramBundle.getByteArray("_wxfileobject_fileData");
    this.filePath = paramBundle.getString("_wxfileobject_filePath");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXFileObject
 * JD-Core Version:    0.6.2
 */