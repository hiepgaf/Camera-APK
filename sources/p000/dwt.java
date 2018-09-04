package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: dwt */
final class dwt implements TextWatcher {
    /* renamed from: a */
    private final /* synthetic */ dwd f3331a;

    dwt(dwd dwd) {
        this.f3331a = dwd;
    }

    public final void afterTextChanged(Editable editable) {
        TextView textView = this.f3331a.f23059p;
        if (textView != null) {
            textView.announceForAccessibility(editable);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
