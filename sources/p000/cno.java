package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cno */
public final class cno {
    /* renamed from: a */
    public cnp f2213a;
    /* renamed from: b */
    public final List f2214b = new ArrayList();

    /* renamed from: a */
    public final boolean m1201a(Uri uri) {
        return this.f2214b.contains(uri);
    }

    /* renamed from: a */
    public final boolean m1200a() {
        return this.f2214b.size() > 0;
    }

    /* renamed from: b */
    public final void m1202b(Uri uri) {
        cnp cnp;
        if (m1201a(uri)) {
            if (this.f2214b.remove(uri)) {
                cnp = this.f2213a;
                if (cnp != null) {
                    this.f2214b.size();
                    cnp.f2215a.m8337b();
                }
            }
        } else if (!this.f2214b.contains(uri)) {
            this.f2214b.add(uri);
            cnp = this.f2213a;
            if (cnp != null) {
                this.f2214b.size();
                cnp.f2215a.m8337b();
            }
        }
    }
}
