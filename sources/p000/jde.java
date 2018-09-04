package p000;

/* compiled from: PG */
/* renamed from: jde */
public class jde extends jdc {
    public jde(jcg jcg, izv izv) {
        super(jcg, izv);
    }

    /* renamed from: a */
    public /* synthetic */ jcf mo3166a(izu izu) {
        return mo3485b(izu);
    }

    /* renamed from: b */
    public jde mo3485b(izu izu) {
        return new jde(this.f18734c, izu.m4368a());
    }

    public String toString() {
        String valueOf = String.valueOf(this.f18734c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 4);
        stringBuilder.append("RGBA");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
