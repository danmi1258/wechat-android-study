package com.tencent.mm.plugin.accountsync.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.e;

final class c
  implements DialogInterface.OnClickListener
{
  c(a parama, Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(true));
    this.dWO.dWN.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
    a.a(this.dWO, this.dLL, this.dWP);
    if ((this.dLL instanceof Activity))
      ((Activity)this.dLL).finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.c
 * JD-Core Version:    0.6.2
 */