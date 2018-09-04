package p000;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ajl */
public class ajl implements adl {
    /* renamed from: b */
    public final ajm f9832b;
    /* renamed from: c */
    public final URL f9833c;
    /* renamed from: d */
    public final String f9834d;
    /* renamed from: e */
    public String f9835e;
    /* renamed from: f */
    public URL f9836f;
    /* renamed from: g */
    private volatile byte[] f9837g;
    /* renamed from: h */
    private int f9838h;

    public ajl(String str) {
        this(str, ajm.f497a);
    }

    private ajl(String str, ajm ajm) {
        this.f9833c = null;
        this.f9834d = aqe.m586a(str);
        this.f9832b = (ajm) aqe.m585a((Object) ajm, "Argument must not be null");
    }

    public ajl(URL url) {
        this(url, ajm.f497a);
    }

    private ajl(URL url, ajm ajm) {
        this.f9833c = (URL) aqe.m585a((Object) url, "Argument must not be null");
        this.f9834d = null;
        this.f9832b = (ajm) aqe.m585a((Object) ajm, "Argument must not be null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ajl)) {
            return false;
        }
        ajl ajl = (ajl) obj;
        if (m6536a().equals(ajl.m6536a()) && this.f9832b.equals(ajl.f9832b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m6536a() {
        String str = this.f9834d;
        return str == null ? ((URL) aqe.m585a(this.f9833c, "Argument must not be null")).toString() : str;
    }

    public int hashCode() {
        if (this.f9838h == 0) {
            this.f9838h = m6536a().hashCode();
            this.f9838h = (this.f9838h * 31) + this.f9832b.hashCode();
        }
        return this.f9838h;
    }

    public String toString() {
        return m6536a();
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        if (this.f9837g == null) {
            this.f9837g = m6536a().getBytes(a);
        }
        messageDigest.update(this.f9837g);
    }
}
