package unk.com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class o
  implements DialogInterface.OnDismissListener
{
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    if (this.cnS != null)
      this.cnS.onDismiss(paramDialogInterface);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.o
 * JD-Core Version:    0.6.2
 */