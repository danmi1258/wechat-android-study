package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;

final class b
  implements DialogInterface.OnCancelListener
{
  b(a parama, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.iPy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.b
 * JD-Core Version:    0.6.2
 */