package p000;

/* compiled from: PG */
/* renamed from: jir */
public class jir {
    /* renamed from: a */
    public final juk f7853a;
    /* renamed from: b */
    public final jiq f7854b;

    public jir(juk juk, jiq jiq) {
        jri.m13152b((Object) juk);
        jri.m13152b((Object) jiq);
        this.f7853a = juk;
        this.f7854b = jiq;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7853a);
        String valueOf2 = String.valueOf(this.f7854b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length());
        stringBuilder.append("ArtifactSpec[segmenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", renderer=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
