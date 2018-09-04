package p000;

/* compiled from: PG */
/* renamed from: fda */
final class fda extends fbx {
    /* renamed from: a */
    private final gie f15877a;
    /* renamed from: b */
    private final gif f15878b;

    fda(gie gie, gif gif) {
        this.f15877a = gie;
        this.f15878b = gif;
    }

    /* renamed from: a */
    final gie mo1351a() {
        return this.f15877a;
    }

    /* renamed from: b */
    final gif mo1352b() {
        return this.f15878b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fbx)) {
            return false;
        }
        fbx fbx = (fbx) obj;
        if (this.f15877a.equals(fbx.mo1351a()) && this.f15878b.equals(fbx.mo1352b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15877a.hashCode() ^ 1000003) * 1000003) ^ this.f15878b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15877a);
        String valueOf2 = String.valueOf(this.f15878b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(valueOf2).length());
        stringBuilder.append("AeState{aeMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", aeState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
