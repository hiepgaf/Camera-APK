package p000;

import android.os.Trace;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: tx */
public abstract class tx {
    /* renamed from: a */
    public final ty f9295a = new ty();
    /* renamed from: b */
    public boolean f9296b = false;

    /* renamed from: a */
    public abstract int mo728a();

    /* renamed from: a */
    public abstract void mo731a(ux uxVar, int i);

    /* renamed from: b */
    public abstract ux mo733b(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public final ux m5868a(ViewGroup viewGroup, int i) {
        try {
            Trace.beginSection("RV CreateView");
            ux b = mo733b(viewGroup, i);
            if (b.f9369a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            b.f9374f = i;
            return b;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public long mo729a(int i) {
        return -1;
    }

    /* renamed from: b */
    public int mo732b(int i) {
        return 0;
    }

    /* renamed from: a */
    public void mo730a(ux uxVar) {
    }

    /* renamed from: a */
    public final void m5869a(tz tzVar) {
        this.f9295a.registerObserver(tzVar);
    }
}
