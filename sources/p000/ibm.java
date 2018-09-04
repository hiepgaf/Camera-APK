package p000;

/* renamed from: ibm */
public class ibm extends ibr {
    /* renamed from: o */
    public ibo f18158o;

    /* renamed from: a */
    protected int mo1800a() {
        if (this.f18158o != null) {
            int i = 0;
            while (true) {
                ibo ibo = this.f18158o;
                if (i >= ibo.f6906b) {
                    break;
                }
                ibo.f6905a[i].m3643a();
                i++;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public ibm mo3121c() {
        ibm ibm = (ibm) super.mo1803d();
        ibq.m3650a(this, ibm);
        return ibm;
    }

    public /* synthetic */ Object clone() {
        return mo3121c();
    }

    /* renamed from: d */
    public /* synthetic */ ibr mo1803d() {
        return (ibm) clone();
    }

    /* renamed from: a */
    public void mo1801a(ibl ibl) {
        if (this.f18158o != null) {
            int i = 0;
            while (true) {
                ibo ibo = this.f18158o;
                if (i < ibo.f6906b) {
                    ibo.f6905a[i].m3644b();
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
