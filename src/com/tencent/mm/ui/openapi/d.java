package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.pluginsdk.model.app.k;

final class d
  implements AdapterView.OnItemClickListener
{
  d(AddAppUI paramAddAppUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    k localk = AddAppUI.b(this.jJQ).mJ(paramInt);
    AddAppUI.a(this.jJQ, localk.field_appId);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.d
 * JD-Core Version:    0.6.2
 */