package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;

final class bk
  implements View.OnClickListener
{
  bk(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.b(this.jzm, true);
    ContactRemarkInfoModUI.g(this.jzm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bk
 * JD-Core Version:    0.6.2
 */