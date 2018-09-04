package p000;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ags */
final class ags implements adx, afa, afb {
    /* renamed from: a */
    private final afc f9774a;
    /* renamed from: b */
    private final afb f9775b;
    /* renamed from: c */
    private int f9776c;
    /* renamed from: d */
    private aey f9777d;
    /* renamed from: e */
    private Object f9778e;
    /* renamed from: f */
    private volatile aka f9779f;
    /* renamed from: g */
    private aez f9780g;

    ags(afc afc, afb afb) {
        this.f9774a = afc;
        this.f9775b = afb;
    }

    /* renamed from: a */
    public final void mo35a() {
        aka aka = this.f9779f;
        if (aka != null) {
            aka.f508c.mo25b();
        }
    }

    /* renamed from: a */
    public final void mo40a(adl adl, Exception exception, adw adw, adf adf) {
        this.f9775b.mo40a(adl, exception, adw, this.f9779f.f508c.mo27d());
    }

    /* renamed from: a */
    public final void mo41a(adl adl, Object obj, adw adw, adf adf, adl adl2) {
        this.f9775b.mo41a(adl, obj, adw, this.f9779f.f508c.mo27d(), adl);
    }

    /* renamed from: a */
    public final void mo37a(Object obj) {
        afm afm = this.f9774a.f383p;
        if (obj == null || !afm.mo44a(this.f9779f.f508c.mo27d())) {
            this.f9775b.mo41a(this.f9779f.f506a, obj, this.f9779f.f508c, this.f9779f.f508c.mo27d(), this.f9780g);
            return;
        }
        this.f9778e = obj;
        this.f9775b.mo42c();
    }

    /* renamed from: a */
    public final void mo36a(Exception exception) {
        this.f9775b.mo40a(this.f9780g, exception, this.f9779f.f508c, this.f9779f.f508c.mo27d());
    }

    /* renamed from: c */
    public final void mo42c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo38b() {
        boolean z = false;
        Object obj = this.f9778e;
        if (obj != null) {
            this.f9778e = null;
            long a = arm.m630a();
            try {
                adi a2 = this.f9774a.f370c.f211d.f226a.m549a(obj.getClass());
                if (a2 == null) {
                    throw new aci(obj.getClass(), (byte) 0);
                }
                aho aho = new aho(a2, obj, this.f9774a.f376i);
                this.f9780g = new aez(this.f9779f.f506a, this.f9774a.f381n);
                this.f9774a.f375h.m214a().mo80a(this.f9780g, aho);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    String valueOf = String.valueOf(this.f9780g);
                    String valueOf2 = String.valueOf(obj);
                    String valueOf3 = String.valueOf(a2);
                    double a3 = arm.m629a(a);
                    StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                    stringBuilder.append("Finished encoding source to cache, key: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(", data: ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(", encoder: ");
                    stringBuilder.append(valueOf3);
                    stringBuilder.append(", duration: ");
                    stringBuilder.append(a3);
                    Log.v("SourceGenerator", stringBuilder.toString());
                }
                this.f9779f.f508c.mo26c();
                this.f9777d = new aey(Collections.singletonList(this.f9779f.f506a), this.f9774a, this);
            } catch (Throwable th) {
                this.f9779f.f508c.mo26c();
            }
        }
        aey aey = this.f9777d;
        if (aey != null && aey.mo38b()) {
            return true;
        }
        this.f9777d = null;
        this.f9779f = null;
        while (!z && this.f9776c < this.f9774a.m208b().size()) {
            List b = this.f9774a.m208b();
            int i = this.f9776c;
            this.f9776c = i + 1;
            this.f9779f = (aka) b.get(i);
            if (this.f9779f != null && (this.f9774a.f383p.mo44a(this.f9779f.f508c.mo27d()) || this.f9774a.m209c(this.f9779f.f508c.mo33a()))) {
                this.f9779f.f508c.mo24a(this.f9774a.f382o, this);
                z = true;
            }
        }
        return z;
    }
}
