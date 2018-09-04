package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: xk */
public final class xk extends xh {
    /* renamed from: b */
    public int f19674b = DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    /* renamed from: c */
    public String f19675c = "\n";
    /* renamed from: d */
    public String f19676d = "  ";
    /* renamed from: e */
    public int f19677e = 0;

    private xk(int i) {
        super(i);
    }

    public final Object clone() {
        try {
            xk xkVar = new xk(this.f9510a);
            xkVar.f19677e = this.f19677e;
            xkVar.f19676d = this.f19676d;
            xkVar.f19675c = this.f19675c;
            xkVar.f19674b = this.f19674b;
            return xkVar;
        } catch (wb e) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m14524b() {
        return (this.f9510a & 3) == 2;
    }

    /* renamed from: c */
    public final boolean m14525c() {
        return (this.f9510a & 3) == 3;
    }

    /* renamed from: d */
    public final String m14526d() {
        if (m14524b()) {
            return "UTF-16BE";
        }
        if (m14525c()) {
            return "UTF-16LE";
        }
        return "UTF-8";
    }

    /* renamed from: a */
    protected final int mo2540a() {
        return 4976;
    }

    /* renamed from: e */
    public final xk m14527e() {
        m6238a(16, true);
        return this;
    }

    /* renamed from: f */
    public final xk m14528f() {
        m6238a(64, true);
        return this;
    }
}
