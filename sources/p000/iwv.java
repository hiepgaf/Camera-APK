package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwv */
public final class iwv {
    /* renamed from: a */
    public Integer f7521a;
    /* renamed from: b */
    public List f7522b;
    /* renamed from: c */
    public Executor f7523c;
    /* renamed from: d */
    public iwi f7524d;
    /* renamed from: e */
    public iwo f7525e;

    public iwv(byte b) {
        this();
    }

    iwv(iwu iwu) {
        this();
        this.f7521a = Integer.valueOf(iwu.mo1948d());
        this.f7522b = iwu.mo1946b();
        this.f7523c = iwu.mo1945a();
        this.f7524d = iwu.mo1949e();
        this.f7525e = iwu.mo1947c();
    }

    /* renamed from: a */
    public final iwu m4301a() {
        String str = "";
        if (this.f7521a == null) {
            str = String.valueOf(str).concat(" sessionType");
        }
        if (this.f7522b == null) {
            str = String.valueOf(str).concat(" outputSurfaces");
        }
        if (this.f7523c == null) {
            str = String.valueOf(str).concat(" executor");
        }
        if (this.f7524d == null) {
            str = String.valueOf(str).concat(" stateCallback");
        }
        if (this.f7525e == null) {
            str = String.valueOf(str).concat(" sessionParameters");
        }
        if (str.isEmpty()) {
            return new iwr(this.f7521a.intValue(), this.f7522b, this.f7523c, this.f7524d, this.f7525e);
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
