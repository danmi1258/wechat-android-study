package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class bi extends vn
{
  public int hQB;
  public int huF;
  public LinkedList hvf = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQB);
    parama.by(3, this.huF);
    parama.d(4, 8, this.hvf);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.hQB) + b.a.a.a.br(3, this.huF) + b.a.a.a.c(4, 8, this.hvf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.bi
 * JD-Core Version:    0.6.2
 */