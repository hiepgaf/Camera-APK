package p000;

/* compiled from: PG */
/* renamed from: gxs */
public final class gxs extends gxy {
    /* renamed from: a */
    private final gxw f17554a;
    /* renamed from: b */
    private final gxv f17555b;
    /* renamed from: c */
    private final gyh f17556c;

    public gxs(gxw gxw, gxv gxv, gyh gyh) {
        if (gxw == null) {
            throw new NullPointerException("Null constraints");
        }
        this.f17554a = gxw;
        if (gxv == null) {
            throw new NullPointerException("Null boxes");
        }
        this.f17555b = gxv;
        this.f17556c = gyh;
    }

    /* renamed from: a */
    public final gxv mo1688a() {
        return this.f17555b;
    }

    /* renamed from: b */
    public final gxw mo1689b() {
        return this.f17554a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxy)) {
            return false;
        }
        gxy gxy = (gxy) obj;
        if (this.f17554a.equals(gxy.mo1689b()) && this.f17555b.equals(gxy.mo1688a())) {
            gyh gyh = this.f17556c;
            if (gyh != null) {
                if (gyh.equals(gxy.mo1690c())) {
                    return true;
                }
            } else if (gxy.mo1690c() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f17554a.hashCode() ^ 1000003) * 1000003) ^ this.f17555b.hashCode()) * 1000003;
        gyh gyh = this.f17556c;
        if (gyh != null) {
            hashCode = gyh.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17554a);
        String valueOf2 = String.valueOf(this.f17555b);
        String valueOf3 = String.valueOf(this.f17556c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 57) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("CameraLayoutHolder{constraints=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", boxes=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", viewfinderSpec=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public final gyh mo1690c() {
        return this.f17556c;
    }
}
