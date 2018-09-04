package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cof */
public final class cof implements geu {
    /* renamed from: b */
    private static final String f12204b = bli.m862a("GenSingleAfctTask");
    /* renamed from: a */
    public final AtomicReference f12205a = new AtomicReference();
    /* renamed from: c */
    private final gln f12206c;
    /* renamed from: d */
    private final File f12207d;
    /* renamed from: e */
    private final jyt f12208e;
    /* renamed from: f */
    private final jqo f12209f;
    /* renamed from: g */
    private final Executor f12210g;
    /* renamed from: h */
    private final jip f12211h;
    /* renamed from: i */
    private final gsp f12212i;
    /* renamed from: j */
    private final jbj f12213j;
    /* renamed from: k */
    private final irs f12214k;
    /* renamed from: l */
    private final glj f12215l;
    /* renamed from: m */
    private volatile gkr f12216m;

    public cof(gln gln, File file, jip jip, jyt jyt, jqo jqo, Executor executor, gsp gsp, jbj jbj, irs irs, glj glj) {
        this.f12206c = gln;
        this.f12207d = file;
        this.f12211h = jip;
        this.f12208e = jyt;
        this.f12209f = jqo;
        this.f12210g = executor;
        this.f12212i = gsp;
        this.f12213j = jbj;
        this.f12214k = irs;
        this.f12215l = glj;
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final get getSession() {
        return this.f12216m;
    }

    public final void process(Context context) {
        StringBuilder stringBuilder;
        try {
            Object a;
            jxy a2 = jxr.m4679a(jli.m12943a(this.f12207d));
            jrg a3;
            if (jiu.m4513c(this.f12211h.f18840a)) {
                File[] f = a2.mo2067f(this.f12207d);
                if (f == null) {
                    f = new File[0];
                }
                File a4 = coc.m1211a(this.f12207d);
                jxy b = jxr.m4681b();
                File[] f2 = b.mo2067f(a4);
                if (f2 == null) {
                    f2 = new File[0];
                }
                if (f2.length > f.length) {
                    a = jqk.m13087a(a4, b).m4620a();
                } else {
                    a3 = jqk.m13087a(this.f12207d, a2).m4620a();
                }
            } else {
                a3 = jqk.m13087a(this.f12207d, a2).m4620a();
            }
            if (a.m13136f() == 0) {
                throw new RuntimeException("Loaded summary does not contain images.");
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f12216m = this.f12215l.m2590a(coc.m1212a(this.f12211h, currentTimeMillis), currentTimeMillis, kau.f19138a);
            this.f12213j.m12763a(this.f12216m);
            jwx jwx = (jwx) this.f12211h.mo2016a(a);
            glw glw = glw.RENDER_PHOTO;
            if (jiu.m4514d(this.f12211h.f18840a)) {
                glw = glw.RENDER_VIDEO;
            }
            this.f12206c.mo1504a(this.f12216m);
            this.f12216m.mo2872a(new iqp(jwx.f8073e, jwx.f8072d), glw);
            File file = this.f12207d;
            if (r4 != 0) {
                kbg a5;
                UUID uuid;
                for (File file2 : jxr.m4678a().mo2067f(file2)) {
                    a5 = eio.m1755a(file2);
                    if (a5.mo2084b()) {
                        break;
                    }
                }
                a5 = kau.f19138a;
                if (a5.mo2084b()) {
                    uuid = (UUID) a5.mo2081a();
                } else {
                    uuid = UUID.randomUUID();
                }
                Object jwy = new jwy();
                jxo bdc = new bdc(jwy, uuid);
                jaq a6 = cnz.m1208a(this.f12211h, this.f12207d, this.f12210g);
                a6.mo1973a(this.f12210g, new cog(this)).mo1980a(izw.f18704a);
                jli.m12951c(jli.m12936a(this.f12211h.mo2015a((jrg) a, bdc, this.f12210g, this.f12209f), a6).mo1975a(this.f12210g, new jkm(this.f12216m, jwy.f19095a)).mo1973a(this.f12210g, new grq(context.getContentResolver(), true, jiy.m4515a(this.f12211h.f18840a), this.f12207d.getName(), this.f12212i, this.f12214k)));
                jli.m12948b(a).mo1973a(this.f12210g, ion.m3944a()).mo1980a(izw.f18704a);
                jyt jyt = this.f12208e;
                if (jyt != null) {
                    try {
                        jyt.m4700a();
                        return;
                    } catch (Throwable e) {
                        bli.m867b(f12204b, "Could not write logs", e);
                        return;
                    }
                }
                return;
            }
            String valueOf = String.valueOf(file2);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("No summary files in ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to read UUID from");
            throw new RuntimeException(stringBuilder.toString());
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(this.f12207d);
            stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            stringBuilder.append("Failed to load metadata from ");
            stringBuilder.append(valueOf2);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }
}
