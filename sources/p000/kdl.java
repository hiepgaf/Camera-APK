package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kdl */
final class kdl implements Iterator {
    /* renamed from: a */
    private int f8239a;
    /* renamed from: b */
    private int f8240b;
    /* renamed from: c */
    private int f8241c;
    /* renamed from: d */
    private final /* synthetic */ kdk f8242d;

    kdl(kdk kdk) {
        int i;
        this.f8242d = kdk;
        kdk kdk2 = this.f8242d;
        this.f8239a = kdk2.f8234c;
        if (kdk2.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f8240b = i;
        this.f8241c = -1;
    }

    /* renamed from: a */
    private final void m4785a() {
        if (this.f8242d.f8234c != this.f8239a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f8240b >= 0;
    }

    public final Object next() {
        m4785a();
        if (hasNext()) {
            int i = this.f8240b;
            this.f8241c = i;
            kdk kdk = this.f8242d;
            Object obj = kdk.f8233b[i];
            i++;
            if (i >= kdk.f8235d) {
                i = -1;
            }
            this.f8240b = i;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m4785a();
        if (this.f8241c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8239a++;
        kdk kdk = this.f8242d;
        Object[] objArr = kdk.f8233b;
        int i = this.f8241c;
        kdk.m4784a(objArr[i], (int) (kdk.f8232a[i] >>> 32));
        this.f8240b--;
        this.f8241c = -1;
    }
}
