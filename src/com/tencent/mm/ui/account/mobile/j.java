package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class j
  implements DialogInterface.OnClickListener
{
  j(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    h.a(this.iUf);
    b.b(true, bg.qS() + "," + getClass().getName() + ",F200_200," + bg.eg("F200_200") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.j
 * JD-Core Version:    0.6.2
 */