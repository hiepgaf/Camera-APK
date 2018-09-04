package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gnh */
public final class gnh {
    /* renamed from: a */
    public final List f5498a = new ArrayList();
    /* renamed from: b */
    public final ikd f5499b;
    /* renamed from: c */
    public final gln f5500c;

    public gnh(ikd ikd, gln gln, gmv gmv) {
        this.f5499b = ikd;
        this.f5500c = gln;
        this.f5498a.add(gmv);
    }

    /* renamed from: a */
    public final void m2639a(glq glq) {
        synchronized (this.f5498a) {
            this.f5498a.add(glq);
        }
    }

    /* renamed from: a */
    public final void m2632a(Bitmap bitmap, int i) {
        this.f5499b.execute(new gns(this, bitmap, i));
    }

    /* renamed from: a */
    public final void m2631a(Bitmap bitmap) {
        this.f5499b.execute(new gnj(this, bitmap));
    }

    /* renamed from: a */
    public final void m2633a(Uri uri) {
        this.f5499b.execute(new gnr(this, uri));
    }

    /* renamed from: b */
    public final void m2640b(Uri uri) {
        this.f5499b.execute(new gnn(this, uri));
    }

    /* renamed from: a */
    public final void m2638a(Uri uri, List list) {
        this.f5499b.execute(new gnl(this, uri, list));
    }

    /* renamed from: a */
    public final void m2637a(Uri uri, hec hec, boolean z) {
        this.f5499b.execute(new gnm(this, uri, hec, z));
    }

    /* renamed from: c */
    public final void m2642c(Uri uri) {
        this.f5499b.execute(new gno(this, uri));
    }

    /* renamed from: a */
    public final void m2634a(Uri uri, int i) {
        this.f5499b.execute(new gnp(this, uri, i));
    }

    /* renamed from: a */
    public final void m2636a(Uri uri, hec hec) {
        this.f5499b.execute(new gnq(this, uri, hec));
    }

    /* renamed from: a */
    public final void m2635a(Uri uri, glw glw, eqi eqi) {
        this.f5499b.execute(new gni(this, uri, glw, eqi));
    }

    /* renamed from: b */
    public final void m2641b(glq glq) {
        synchronized (this.f5498a) {
            this.f5498a.remove(glq);
        }
    }
}
