package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adh extends vn
{
  public String gnq;
  public int hQd;
  public ws hQi;
  public int hQj;
  public String iwg;
  public int iwh;
  public int iwi;
  public int iwj;
  public int iwk;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.hQi != null)
    {
      parama.bv(3, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(4, this.hQd);
    if (this.iwg != null)
      parama.I(5, this.iwg);
    parama.by(6, this.hQj);
    parama.by(7, this.iwh);
    parama.by(8, this.iwi);
    parama.by(9, this.iwj);
    parama.by(10, this.iwk);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.hQi != null)
      i += b.a.a.a.bs(3, this.hQi.hD());
    int j = i + b.a.a.a.br(4, this.hQd);
    if (this.iwg != null)
      j += b.a.a.b.b.a.J(5, this.iwg);
    return j + b.a.a.a.br(6, this.hQj) + b.a.a.a.br(7, this.iwh) + b.a.a.a.br(8, this.iwi) + b.a.a.a.br(9, this.iwj) + b.a.a.a.br(10, this.iwk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adh
 * JD-Core Version:    0.6.2
 */