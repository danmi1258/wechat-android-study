package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.ac;

final class fb
  implements DialogInterface.OnCancelListener
{
  fb(NewTaskUI paramNewTaskUI, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jUm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fb
 * JD-Core Version:    0.6.2
 */