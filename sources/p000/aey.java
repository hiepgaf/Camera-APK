package p000;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: aey */
final class aey implements adx, afa {
    /* renamed from: a */
    private final List f9659a;
    /* renamed from: b */
    private final afc f9660b;
    /* renamed from: c */
    private final afb f9661c;
    /* renamed from: d */
    private int f9662d;
    /* renamed from: e */
    private adl f9663e;
    /* renamed from: f */
    private List f9664f;
    /* renamed from: g */
    private int f9665g;
    /* renamed from: h */
    private volatile aka f9666h;
    /* renamed from: i */
    private File f9667i;

    aey(afc afc, afb afb) {
        this(afc.m205a(), afc, afb);
    }

    aey(List list, afc afc, afb afb) {
        this.f9662d = -1;
        this.f9659a = list;
        this.f9660b = afc;
        this.f9661c = afb;
    }

    /* renamed from: a */
    public final void mo35a() {
        aka aka = this.f9666h;
        if (aka != null) {
            aka.f508c.mo25b();
        }
    }

    /* renamed from: c */
    private final boolean m6343c() {
        return this.f9665g < this.f9664f.size();
    }

    /* renamed from: a */
    public final void mo37a(Object obj) {
        this.f9661c.mo41a(this.f9663e, obj, this.f9666h.f508c, adf.DATA_DISK_CACHE, this.f9663e);
    }

    /* renamed from: a */
    public final void mo36a(Exception exception) {
        this.f9661c.mo40a(this.f9663e, exception, this.f9666h.f508c, adf.DATA_DISK_CACHE);
    }

    /* renamed from: b */
    public final boolean mo38b() {
        int i = 0;
        while (true) {
            if (this.f9664f != null && m6343c()) {
                break;
            }
            this.f9662d++;
            if (this.f9662d >= this.f9659a.size()) {
                return false;
            }
            adl adl = (adl) this.f9659a.get(this.f9662d);
            this.f9667i = this.f9660b.f375h.m214a().mo79a(new aez(adl, this.f9660b.f381n));
            File file = this.f9667i;
            if (file != null) {
                this.f9663e = adl;
                this.f9664f = this.f9660b.m206a(file);
                this.f9665g = 0;
            }
        }
        this.f9666h = null;
        while (i == 0 && m6343c()) {
            List list = this.f9664f;
            int i2 = this.f9665g;
            this.f9665g = i2 + 1;
            ajz ajz = (ajz) list.get(i2);
            file = this.f9667i;
            afc afc = this.f9660b;
            this.f9666h = ajz.mo88a(file, afc.f372e, afc.f373f, afc.f376i);
            if (this.f9666h != null && this.f9660b.m209c(this.f9666h.f508c.mo33a())) {
                this.f9666h.f508c.mo24a(this.f9660b.f382o, this);
                i = 1;
            }
        }
        return i;
    }
}
