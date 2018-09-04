package p000;

import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jyr */
final class jyr extends jtn {
    /* renamed from: b */
    private final jtn f21993b;
    /* renamed from: c */
    private final jyy f21994c;

    public jyr(jtn jtn, jyy jyy) {
        super(jtn.f19040a);
        this.f21993b = jtn;
        this.f21994c = jyy;
    }

    /* renamed from: a */
    public final jzf mo3178a(long j, jky jky) {
        for (Feature feature : jky.m4526a()) {
            float[] values = feature.getValues();
            for (int i = 0; i < values.length; i++) {
                String name = feature.getType().name();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 13);
                stringBuilder.append(name);
                stringBuilder.append("[");
                stringBuilder.append(i);
                stringBuilder.append("]");
                this.f21994c.m13350a(stringBuilder.toString(), j, values[i]);
            }
        }
        return this.f21993b.mo3178a(j, jky);
    }

    public final String toString() {
        return this.f21993b.toString();
    }
}
