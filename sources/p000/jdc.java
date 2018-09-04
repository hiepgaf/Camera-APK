package p000;

/* compiled from: PG */
/* renamed from: jdc */
public abstract class jdc implements jcf {
    /* renamed from: a */
    public final izv f18732a;
    /* renamed from: b */
    public final jce[] f18733b;
    /* renamed from: c */
    public final jcg f18734c;
    /* renamed from: d */
    private final int f18735d;

    protected jdc(jcg jcg, izv izv) {
        this(jcg, izv, (byte) 0);
    }

    private jdc(jcg jcg, izv izv, byte b) {
        this(jcg, izv, 4, (jcg.mo3164a() << 2) * izv.f7592a[0]);
    }

    private jdc(jcg jcg, izv izv, int i, int i2) {
        boolean z;
        int i3 = 0;
        if (i2 >= (izv.f7592a[0] << 2) * jcg.mo3164a()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "row stride that is shorter than row data size");
        this.f18734c = jcg;
        this.f18732a = izv;
        this.f18735d = i2;
        int[] iArr = new int[]{this.f18734c.mo3164a() << 2, this.f18735d};
        this.f18733b = new jce[4];
        while (i3 < 4) {
            this.f18733b[i3] = new jce(this.f18734c, i3 * r0, iArr);
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdc)) {
            return false;
        }
        jdc jdc = (jdc) obj;
        if (this.f18733b.length == jdc.f18733b.length && this.f18735d == jdc.f18735d && this.f18732a.equals(jdc.f18732a) && this.f18734c.equals(jdc.f18734c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f18732a.hashCode() * 31) + this.f18733b.length) * 31) + this.f18735d) * 31) + this.f18734c.hashCode();
    }
}
