package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gzi */
public final class gzi implements gzk {
    /* renamed from: a */
    public final List f17574a = new ArrayList();
    /* renamed from: b */
    public final gzk f17575b;
    /* renamed from: c */
    public boolean f17576c = false;
    /* renamed from: d */
    public boolean f17577d = false;
    /* renamed from: e */
    public long f17578e = 0;
    /* renamed from: f */
    public long f17579f = 0;

    public gzi(gzk gzk, hkc hkc) {
        this.f17575b = gzk;
    }

    /* renamed from: a */
    public final long m11684a() {
        if (this.f17577d) {
            return this.f17579f;
        }
        if (this.f17576c) {
            return this.f17578e;
        }
        return SystemClock.uptimeMillis();
    }

    public final void invalidate() {
        if (!(this.f17577d || this.f17576c)) {
            this.f17575b.invalidate();
            this.f17578e = SystemClock.uptimeMillis();
        }
        this.f17576c = true;
    }
}
