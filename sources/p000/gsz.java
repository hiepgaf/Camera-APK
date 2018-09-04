package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gsz */
public final class gsz extends DialogFragment {
    /* renamed from: a */
    public gtb f5680a;
    /* renamed from: b */
    private final OnClickListener f5681b = new gta(this);

    static {
        bli.m862a("CameraStorageAccessFailureDialog");
    }

    /* renamed from: a */
    final void m2807a() {
        gtb gtb = this.f5680a;
        if (gtb != null) {
            gtb.mo1626b();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m2807a();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context activity = getActivity();
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843605, typedValue, true);
        return new Builder(activity, 16974546).setCancelable(false).setTitle(R.string.storage_error_dialog_title).setMessage(R.string.storage_error_dialog_message).setPositiveButton(R.string.storage_error_button_text, this.f5681b).setIcon(typedValue.resourceId).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        m2807a();
    }
}
