package com.tencent.mm.am;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class h
  implements b
{
  h(Intent paramIntent, String paramString1, String paramString2, Context paramContext, int paramInt)
  {
  }

  public final void onDone()
  {
    Intent localIntent;
    String str1;
    if (this.exR == null)
    {
      localIntent = new Intent();
      str1 = ak.aHh() + ".plugin." + this.jSJ;
      if (!this.jSK.startsWith("."))
        break label121;
    }
    label121: for (String str2 = str1 + this.jSK; ; str2 = this.jSK)
    {
      localIntent.setClassName(ak.getPackageName(), str2);
      if (!(this.dLL instanceof Activity))
        break label129;
      ((Activity)this.dLL).startActivityForResult(localIntent, this.goC);
      return;
      localIntent = this.exR;
      break;
    }
    label129: z.f("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "context not activity, skipped");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.h
 * JD-Core Version:    0.6.2
 */