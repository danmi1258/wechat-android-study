package com.tencent.mm.compatible.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class f extends BroadcastReceiver
{
  f(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      return;
    String str = paramIntent.getAction();
    e.L(paramIntent.getBooleanExtra("existing", false));
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt onReceive action[" + str + "] existing:" + e.lV());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.f
 * JD-Core Version:    0.6.2
 */