package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ia extends vn
{
  public int hEv;
  public String hsB;
  public String hsT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.hEv);
    if (this.hsB != null)
      parama.I(4, this.hsB);
  }

  public final ia bp(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala1 = new b.a.a.a.a(paramArrayOfByte, hre);
    int i = locala1.bet();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        if (j == 0)
          locala1.beu();
        i = locala1.bet();
        break;
        LinkedList localLinkedList = locala1.rN(i);
        int k = localLinkedList.size();
        for (int m = 0; m < k; m++)
        {
          byte[] arrayOfByte = (byte[])localLinkedList.get(m);
          ba localba = new ba();
          b.a.a.a.a locala2 = new b.a.a.a.a(arrayOfByte, hre);
          for (boolean bool = true; bool; bool = ba.a(locala2, localba, locala2.bet()));
          this.hRy = localba;
        }
        j = 1;
        continue;
        this.hsT = locala1.ben();
        j = 1;
        continue;
        this.hEv = locala1.bel();
        j = 1;
        continue;
        this.hsB = locala1.ben();
        j = 1;
      }
    }
    return this;
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    int j = i + b.a.a.a.br(3, this.hEv);
    if (this.hsB != null)
      j += b.a.a.b.b.a.J(4, this.hsB);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ia
 * JD-Core Version:    0.6.2
 */