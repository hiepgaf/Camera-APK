package p000;

import android.graphics.Rect;
import android.media.Image;
import android.media.Image.Plane;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: itv */
public final class itv implements iwe, iwz {
    /* renamed from: a */
    private final Object f21773a = new Object();
    /* renamed from: b */
    private final Image f21774b;
    /* renamed from: c */
    private final int f21775c;
    /* renamed from: d */
    private final int f21776d;
    /* renamed from: e */
    private final int f21777e;
    /* renamed from: f */
    private final long f21778f;
    /* renamed from: g */
    private volatile ken f21779g;
    /* renamed from: h */
    private Rect f21780h;

    public itv(Image image) {
        this.f21774b = image;
        this.f21775c = this.f21774b.getFormat();
        this.f21776d = this.f21774b.getWidth();
        this.f21777e = this.f21774b.getHeight();
        this.f21778f = this.f21774b.getTimestamp();
    }

    public final void close() {
        synchronized (this.f21773a) {
            this.f21774b.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof iwz)) {
            return false;
        }
        iwz iwz = (iwz) obj;
        if (iwz.mo2716c() == this.f21775c && iwz.mo2720g() == this.f21776d && iwz.mo2717d() == this.f21777e && iwz.mo2719f() == this.f21778f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return new iud(this.f21774b);
    }

    /* renamed from: b */
    public final Rect mo2715b() {
        Rect rect;
        synchronized (this.f21773a) {
            try {
                this.f21780h = this.f21774b.getCropRect();
                rect = this.f21780h;
            } catch (IllegalStateException e) {
                rect = this.f21780h;
            }
        }
        return rect;
    }

    /* renamed from: c */
    public final int mo2716c() {
        return this.f21775c;
    }

    /* renamed from: d */
    public final int mo2717d() {
        return this.f21777e;
    }

    /* renamed from: e */
    public final List mo2718e() {
        return m16139h();
    }

    /* renamed from: f */
    public final long mo2719f() {
        return this.f21778f;
    }

    /* renamed from: g */
    public final int mo2720g() {
        return this.f21776d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21775c), Integer.valueOf(this.f21776d), Integer.valueOf(this.f21777e), Long.valueOf(this.f21778f)});
    }

    /* renamed from: h */
    private final ken m16139h() {
        ken ken = this.f21779g;
        if (ken == null) {
            synchronized (this.f21773a) {
                ken = this.f21779g;
                if (ken == null) {
                    Plane[] planes = this.f21774b.getPlanes();
                    if (planes == null) {
                        ken = ken.m13464e();
                    } else {
                        keo keo = new keo();
                        for (Plane itw : planes) {
                            keo.m16494c(new itw(itw));
                        }
                        ken = keo.m16491a();
                    }
                    this.f21779g = ken;
                }
            }
        }
        return ken;
    }

    /* renamed from: a */
    public final void mo2714a(Rect rect) {
        synchronized (this.f21773a) {
            this.f21780h = rect;
            try {
                this.f21774b.setCropRect(rect);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final String toString() {
        String b = ion.m3961b(this.f21775c);
        int i = this.f21776d;
        long j = this.f21778f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 39);
        stringBuilder.append("Image-");
        stringBuilder.append(b);
        stringBuilder.append("w");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}
