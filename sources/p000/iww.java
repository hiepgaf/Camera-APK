package p000;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: iww */
public class iww implements iwz {
    /* renamed from: a */
    private final iwz f21796a;

    public iww(iwz iwz) {
        this.f21796a = iwz;
    }

    public void close() {
        this.f21796a.close();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof iwz)) {
            return false;
        }
        iwz iwz = (iwz) obj;
        if (iwz.mo2716c() == mo2716c() && iwz.mo2720g() == mo2720g() && iwz.mo2717d() == mo2717d() && iwz.mo2719f() == mo2719f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return this.f21796a.mo2713a();
    }

    /* renamed from: b */
    public final Rect mo2715b() {
        return this.f21796a.mo2715b();
    }

    /* renamed from: c */
    public final int mo2716c() {
        return this.f21796a.mo2716c();
    }

    /* renamed from: d */
    public final int mo2717d() {
        return this.f21796a.mo2717d();
    }

    /* renamed from: e */
    public final List mo2718e() {
        return this.f21796a.mo2718e();
    }

    /* renamed from: f */
    public final long mo2719f() {
        return this.f21796a.mo2719f();
    }

    /* renamed from: g */
    public final int mo2720g() {
        return this.f21796a.mo2720g();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo2716c()), Integer.valueOf(mo2720g()), Integer.valueOf(mo2717d()), Long.valueOf(mo2719f())});
    }

    /* renamed from: a */
    public final void mo2714a(Rect rect) {
        this.f21796a.mo2714a(rect);
    }

    public String toString() {
        return this.f21796a.toString();
    }
}
