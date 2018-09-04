package p000;

import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* renamed from: vd */
public final class vd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SearchAutoComplete f9406a;

    public vd(SearchAutoComplete searchAutoComplete) {
        this.f9406a = searchAutoComplete;
    }

    public final void run() {
        View view = this.f9406a;
        if (view.f10080a) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            view.f10080a = false;
        }
    }
}
