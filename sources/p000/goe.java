package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: goe */
public final class goe {
    /* renamed from: a */
    private final gnu f5590a;
    /* renamed from: b */
    private final String f5591b;
    /* renamed from: c */
    private final String f5592c;
    /* renamed from: d */
    private File f5593d = null;

    public goe(gnu gnu, String str, String str2) {
        this.f5590a = gnu;
        this.f5591b = str;
        this.f5592c = str2;
    }

    /* renamed from: a */
    public final synchronized File m2653a() {
        return this.f5593d;
    }

    /* renamed from: b */
    public final synchronized boolean m2654b() {
        return m2653a() != null;
    }

    /* renamed from: c */
    public final synchronized boolean m2655c() {
        boolean z = true;
        synchronized (this) {
            if (this.f5593d == null) {
                try {
                    this.f5593d = this.f5590a.mo1508a(this.f5591b, this.f5592c);
                } catch (IOException e) {
                    z = false;
                }
            }
        }
        return z;
    }
}
