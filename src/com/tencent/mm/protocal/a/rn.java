package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class rn extends vn
{
  public String ihm;
  public LinkedList iho = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ihm != null)
      parama.I(2, this.ihm);
    parama.d(3, 8, this.iho);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ihm != null)
      i += b.a.a.b.b.a.J(2, this.ihm);
    return i + b.a.a.a.c(3, 8, this.iho);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rn
 * JD-Core Version:    0.6.2
 */