package p000;

import android.annotation.TargetApi;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fks */
final class fks implements fhz, iqo {
    /* renamed from: a */
    public final Set f16113a;
    /* renamed from: b */
    public final fiw f16114b;
    /* renamed from: c */
    public final Collection f16115c;
    /* renamed from: d */
    private final fkz f16116d;
    /* renamed from: e */
    private final fyt f16117e;
    /* renamed from: f */
    private final AtomicBoolean f16118f = new AtomicBoolean(false);

    fks(fkz fkz, Set set, fiw fiw, Collection collection, fyt fyt) {
        jri.m13143a(collection.isEmpty() ^ 1);
        jri.m13143a(set.isEmpty() ^ 1);
        this.f16116d = fkz;
        this.f16113a = set;
        this.f16114b = fiw;
        this.f16115c = collection;
        this.f16117e = fyt;
    }

    public final void close() {
        this.f16118f.set(true);
    }

    /* renamed from: a */
    public final fia mo705a() {
        return fib.f4565a.mo705a();
    }

    /* renamed from: b */
    public final fia mo706b() {
        if (!this.f16116d.mo1402a()) {
            return fib.f4565a.mo706b();
        }
        fyr fyr;
        if (this.f16118f.get()) {
            fyr = null;
        } else {
            fyr = this.f16117e.mo1431d();
        }
        if (fyr != null) {
            return new fkt(this, fyr);
        }
        return fib.f4565a.mo706b();
    }
}
