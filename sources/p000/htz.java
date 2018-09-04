package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: htz */
public final class htz extends DialogFragment {
    /* renamed from: a */
    public Dialog f6660a = null;
    /* renamed from: b */
    public OnCancelListener f6661b = null;

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f6661b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f6660a == null) {
            setShowsDialog(false);
        }
        return this.f6660a;
    }
}
