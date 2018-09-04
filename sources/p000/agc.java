package p000;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* renamed from: agc */
public final class agc implements adl {
    /* renamed from: b */
    private final Object f9734b;
    /* renamed from: c */
    private final int f9735c;
    /* renamed from: d */
    private final int f9736d;
    /* renamed from: e */
    private final Class f9737e;
    /* renamed from: f */
    private final Class f9738f;
    /* renamed from: g */
    private final adl f9739g;
    /* renamed from: h */
    private final Map f9740h;
    /* renamed from: i */
    private final adp f9741i;
    /* renamed from: j */
    private int f9742j;

    public agc(Object obj, adl adl, int i, int i2, Map map, Class cls, Class cls2, adp adp) {
        this.f9734b = aqe.m585a(obj, "Argument must not be null");
        this.f9739g = (adl) aqe.m585a((Object) adl, "Signature must not be null");
        this.f9735c = i;
        this.f9736d = i2;
        this.f9740h = (Map) aqe.m585a((Object) map, "Argument must not be null");
        this.f9737e = (Class) aqe.m585a((Object) cls, "Resource class must not be null");
        this.f9738f = (Class) aqe.m585a((Object) cls2, "Transcode class must not be null");
        this.f9741i = (adp) aqe.m585a((Object) adp, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agc)) {
            return false;
        }
        agc agc = (agc) obj;
        if (this.f9734b.equals(agc.f9734b) && this.f9739g.equals(agc.f9739g) && this.f9736d == agc.f9736d && this.f9735c == agc.f9735c && this.f9740h.equals(agc.f9740h) && this.f9737e.equals(agc.f9737e) && this.f9738f.equals(agc.f9738f) && this.f9741i.equals(agc.f9741i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9742j == 0) {
            this.f9742j = this.f9734b.hashCode();
            this.f9742j = (this.f9742j * 31) + this.f9739g.hashCode();
            this.f9742j = (this.f9742j * 31) + this.f9735c;
            this.f9742j = (this.f9742j * 31) + this.f9736d;
            this.f9742j = (this.f9742j * 31) + this.f9740h.hashCode();
            this.f9742j = (this.f9742j * 31) + this.f9737e.hashCode();
            this.f9742j = (this.f9742j * 31) + this.f9738f.hashCode();
            this.f9742j = (this.f9742j * 31) + this.f9741i.hashCode();
        }
        return this.f9742j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9734b);
        int i = this.f9735c;
        int i2 = this.f9736d;
        String valueOf2 = String.valueOf(this.f9737e);
        String valueOf3 = String.valueOf(this.f9738f);
        String valueOf4 = String.valueOf(this.f9739g);
        int i3 = this.f9742j;
        String valueOf5 = String.valueOf(this.f9740h);
        String valueOf6 = String.valueOf(this.f9741i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 151) + length2) + length3) + length4) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length());
        stringBuilder.append("EngineKey{model=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(i3);
        stringBuilder.append(", transformations=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", options=");
        stringBuilder.append(valueOf6);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo21a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
