package p000;

import android.content.ContentResolver;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cnv */
final class cnv {
    /* renamed from: a */
    public final jip f2216a;
    /* renamed from: b */
    public final /* synthetic */ cnq f2217b;
    /* renamed from: c */
    private final Context f2218c;

    public cnv(cnq cnq, Context context, jip jip) {
        this.f2217b = cnq;
        jri.m13152b((Object) context);
        jri.m13152b((Object) jip);
        this.f2218c = context;
        this.f2216a = jip;
    }

    /* renamed from: a */
    public final jaq m1204a(jrg jrg, File file, gkr gkr) {
        this.f2217b.f20338c.mo1903a("ArtifactRasterizer#rasterizeArtifactHighRes");
        try {
            jip jip = this.f2216a;
            Executor executor = this.f2217b.g;
            Context context = this.f2218c;
            Object jwy = new jwy();
            jxo bdc = new bdc(jwy, this.f2217b.o);
            jaq a = jli.m12936a(jip.mo2015a(jrg, bdc, executor, this.f2217b.j), cnz.m1208a(this.f2216a, file, executor)).mo1975a(executor, new jkm(gkr, jwy.f19095a));
            ContentResolver contentResolver = context.getContentResolver();
            jiy a2 = jiy.m4515a(jip.f18840a);
            String name = this.f2217b.i.getName();
            cnq cnq = this.f2217b;
            jaq a3 = a.mo1973a(executor, new grq(contentResolver, false, a2, name, cnq.f20337b, cnq.f20344t));
            return a3;
        } finally {
            this.f2217b.f20338c.mo1904b();
        }
    }

    /* renamed from: a */
    public final gkr m1203a(jrg jrg, long j) {
        this.f2217b.f20338c.mo1903a("ArtifactRasterizer#rasterizeArtifactPreview");
        try {
            Context context = this.f2218c;
            Object obj = this.f2216a;
            Executor executor = this.f2217b.g;
            jri.m13152b(obj);
            gkr a = this.f2217b.f20339d.m2590a(coc.m1212a(obj, this.f2217b.e.mo2884l()), j, kau.f19138a);
            jli.m12951c(obj.mo2014a(jrg, context, executor, this.f2217b.j).mo1973a(executor, new cnw(this, a)));
            return a;
        } finally {
            this.f2217b.f20338c.mo1904b();
        }
    }
}
