package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/* renamed from: hug */
public final class hug extends DialogFragment {
    /* renamed from: a */
    public OnCancelListener f23334a = null;
    public Dialog mDialog = null;

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f23334a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        return this.mDialog;
    }
}
