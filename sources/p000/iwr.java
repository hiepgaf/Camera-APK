package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwr */
final class iwr extends iwu {
    /* renamed from: a */
    private final int f18635a;
    /* renamed from: b */
    private final List f18636b;
    /* renamed from: c */
    private final Executor f18637c;
    /* renamed from: d */
    private final iwi f18638d;
    /* renamed from: e */
    private final iwo f18639e;

    iwr(int i, List list, Executor executor, iwi iwi, iwo iwo) {
        this.f18635a = i;
        this.f18636b = list;
        this.f18637c = executor;
        this.f18638d = iwi;
        this.f18639e = iwo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwu)) {
            return false;
        }
        iwu iwu = (iwu) obj;
        if (this.f18635a == iwu.mo1948d() && this.f18636b.equals(iwu.mo1946b()) && this.f18637c.equals(iwu.mo1945a()) && this.f18638d.equals(iwu.mo1949e()) && this.f18639e.equals(iwu.mo1947c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Executor mo1945a() {
        return this.f18637c;
    }

    /* renamed from: b */
    public final List mo1946b() {
        return this.f18636b;
    }

    /* renamed from: c */
    public final iwo mo1947c() {
        return this.f18639e;
    }

    /* renamed from: d */
    public final int mo1948d() {
        return this.f18635a;
    }

    /* renamed from: e */
    public final iwi mo1949e() {
        return this.f18638d;
    }

    public final int hashCode() {
        return ((((((((this.f18635a ^ 1000003) * 1000003) ^ this.f18636b.hashCode()) * 1000003) ^ this.f18637c.hashCode()) * 1000003) ^ this.f18638d.hashCode()) * 1000003) ^ this.f18639e.hashCode();
    }

    /* renamed from: f */
    public final iwv mo1950f() {
        return new iwv((iwu) this);
    }

    public final String toString() {
        int i = this.f18635a;
        String valueOf = String.valueOf(this.f18636b);
        String valueOf2 = String.valueOf(this.f18637c);
        String valueOf3 = String.valueOf(this.f18638d);
        String valueOf4 = String.valueOf(this.f18639e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 114) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("SessionConfigurationProxy{sessionType=");
        stringBuilder.append(i);
        stringBuilder.append(", outputSurfaces=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", executor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", stateCallback=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", sessionParameters=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
