package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;

final class cs
  implements DialogInterface.OnCancelListener
{
  cs(cr paramcr, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.iPy);
    bg.qX().b(380, this.iPE.iPD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cs
 * JD-Core Version:    0.6.2
 */