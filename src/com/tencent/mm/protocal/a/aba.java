package com.tencent.mm.protocal.a;

public final class aba extends com.tencent.mm.ao.a
{
  public int hPS;
  public String iuZ;

  public static boolean a(b.a.a.a.a parama, aba paramaba, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaba.hPS = parama.bel();
      return true;
    case 2:
    }
    paramaba.iuZ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hPS);
    if (this.iuZ != null)
      parama.I(2, this.iuZ);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hPS);
    if (this.iuZ != null)
      i += b.a.a.b.b.a.J(2, this.iuZ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aba
 * JD-Core Version:    0.6.2
 */