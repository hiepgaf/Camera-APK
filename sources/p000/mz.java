package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: mz */
public final class mz implements pf {
    /* renamed from: a */
    private boolean f19394a;
    /* renamed from: b */
    private final /* synthetic */ WeakReference f19395b;
    /* renamed from: c */
    private final /* synthetic */ rm f19396c;

    public mz(rm rmVar, WeakReference weakReference) {
        this.f19396c = rmVar;
        this.f19395b = weakReference;
        this();
    }

    /* renamed from: a */
    public final void m14126a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new gt(this));
    }

    /* renamed from: a */
    public final void m14128a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new gs(this, typeface));
    }

    /* renamed from: a */
    public final void mo2353a(op opVar, boolean z) {
        if (!this.f19394a) {
            this.f19394a = true;
            ru ruVar = null;
            ruVar.m5797a();
            this.f19394a = false;
        }
    }

    /* renamed from: a */
    public final void m14127a(Typeface typeface) {
        rm rmVar = this.f19396c;
        WeakReference weakReference = this.f19395b;
        if (rmVar.f9119c) {
            rmVar.f9118b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, rmVar.f9117a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2354a(op opVar) {
        return false;
    }
}
