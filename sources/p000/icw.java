package p000;

import java.util.TimeZone;

/* renamed from: icw */
public final class icw implements ifu {
    /* renamed from: a */
    public int f18211a;
    /* renamed from: b */
    public String f18212b;
    /* renamed from: c */
    public String f18213c;
    /* renamed from: d */
    public String f18214d;
    /* renamed from: e */
    public int f18215e;
    /* renamed from: f */
    public boolean f18216f;
    /* renamed from: g */
    public final ibw f18217g;
    /* renamed from: h */
    public boolean f18218h;
    /* renamed from: i */
    public final /* synthetic */ hth f18219i;

    public icw(hth hth, byte[] bArr) {
        this(hth, bArr, (byte) 0);
    }

    private icw(hth hth, byte[] bArr, byte b) {
        this.f18219i = hth;
        this.f18211a = this.f18219i.f6646g;
        this.f18212b = this.f18219i.f6645f;
        this.f18213c = null;
        this.f18214d = null;
        this.f18215e = 0;
        this.f18216f = true;
        this.f18217g = new ibw();
        this.f18218h = false;
        this.f18213c = null;
        this.f18214d = null;
        this.f18217g.f21677a = hth.f6649j.mo1785a();
        this.f18217g.f21678b = hth.f6649j.mo1786b();
        ibw ibw = this.f18217g;
        hth.f6650k;
        ibw.f21680d = (long) (TimeZone.getDefault().getOffset(this.f18217g.f21677a) / 1000);
        if (bArr != null) {
            this.f18217g.f21679c = bArr;
        }
    }

    /* renamed from: a */
    public final void mo1825a(ifv ifv) {
        throw new NoSuchMethodError();
    }
}
