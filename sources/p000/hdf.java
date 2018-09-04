package p000;

import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.concurrent.Executor;

/* renamed from: hdf */
final /* synthetic */ class hdf implements OnClickListener {
    /* renamed from: a */
    private final hde f6041a;

    hdf(hde hde) {
        this.f6041a = hde;
    }

    public final void onClick(View view) {
        hde hde = this.f6041a;
        hde.m3079a();
        for (Pair pair : hde.f6018d) {
            ((Executor) pair.second).execute((Runnable) pair.first);
        }
    }
}
