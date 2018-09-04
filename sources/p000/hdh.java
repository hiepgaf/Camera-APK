package p000;

import android.util.Pair;
import android.widget.PopupWindow.OnDismissListener;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: hdh */
final /* synthetic */ class hdh implements OnDismissListener {
    /* renamed from: a */
    private final hde f6042a;

    hdh(hde hde) {
        this.f6042a = hde;
    }

    public final void onDismiss() {
        List<Pair> list = this.f6042a.f6033s;
        if (list != null) {
            for (Pair pair : list) {
                ((Executor) pair.second).execute((Runnable) pair.first);
            }
        }
    }
}
