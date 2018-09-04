package p000;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: ago */
final class ago implements adx, afa {
    /* renamed from: a */
    private final afb f9755a;
    /* renamed from: b */
    private final afc f9756b;
    /* renamed from: c */
    private int f9757c;
    /* renamed from: d */
    private int f9758d = -1;
    /* renamed from: e */
    private adl f9759e;
    /* renamed from: f */
    private List f9760f;
    /* renamed from: g */
    private int f9761g;
    /* renamed from: h */
    private volatile aka f9762h;
    /* renamed from: i */
    private File f9763i;
    /* renamed from: j */
    private agp f9764j;

    ago(afc afc, afb afb) {
        this.f9756b = afc;
        this.f9755a = afb;
    }

    /* renamed from: a */
    public final void mo35a() {
        aka aka = this.f9762h;
        if (aka != null) {
            aka.f508c.mo25b();
        }
    }

    /* renamed from: c */
    private final boolean m6414c() {
        return this.f9761g < this.f9760f.size();
    }

    /* renamed from: a */
    public final void mo37a(Object obj) {
        this.f9755a.mo41a(this.f9759e, obj, this.f9762h.f508c, adf.RESOURCE_DISK_CACHE, this.f9764j);
    }

    /* renamed from: a */
    public final void mo36a(Exception exception) {
        this.f9755a.mo40a(this.f9764j, exception, this.f9762h.f508c, adf.RESOURCE_DISK_CACHE);
    }

    /* renamed from: b */
    public final boolean mo38b() {
        List a = this.f9756b.m205a();
        if (a.isEmpty()) {
            return false;
        }
        afc afc = this.f9756b;
        List b = afc.f370c.f211d.m113b(afc.f371d.getClass(), afc.f374g, afc.f378k);
        if (b.isEmpty() && File.class.equals(this.f9756b.f378k)) {
            return false;
        }
        while (true) {
            if (this.f9760f != null && m6414c()) {
                break;
            }
            this.f9758d++;
            if (this.f9758d >= b.size()) {
                this.f9757c++;
                if (this.f9757c >= a.size()) {
                    return false;
                }
                this.f9758d = 0;
            }
            adl adl = (adl) a.get(this.f9757c);
            Class cls = (Class) b.get(this.f9758d);
            ads b2 = this.f9756b.m207b(cls);
            afc afc2 = this.f9756b;
            this.f9764j = new agp(afc2.f370c.f210c, adl, afc2.f381n, afc2.f372e, afc2.f373f, b2, cls, afc2.f376i);
            this.f9763i = this.f9756b.f375h.m214a().mo79a(this.f9764j);
            File file = this.f9763i;
            if (file != null) {
                this.f9759e = adl;
                this.f9760f = this.f9756b.m206a(file);
                this.f9761g = 0;
            }
        }
        this.f9762h = null;
        int i = 0;
        while (i == 0 && m6414c()) {
            List list = this.f9760f;
            int i2 = this.f9761g;
            this.f9761g = i2 + 1;
            ajz ajz = (ajz) list.get(i2);
            File file2 = this.f9763i;
            afc afc3 = this.f9756b;
            this.f9762h = ajz.mo88a(file2, afc3.f372e, afc3.f373f, afc3.f376i);
            if (this.f9762h != null && this.f9756b.m209c(this.f9762h.f508c.mo33a())) {
                this.f9762h.f508c.mo24a(this.f9756b.f382o, this);
                i = 1;
            }
        }
        return i;
    }
}
