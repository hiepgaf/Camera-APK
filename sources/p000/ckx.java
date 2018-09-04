package p000;

import android.content.Context;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ckx */
public final class ckx implements cop {
    /* renamed from: a */
    public static final String f12129a = bli.m862a("SBSingleCreationGen");
    /* renamed from: b */
    public final gln f12130b;
    /* renamed from: c */
    public final File f12131c;
    /* renamed from: d */
    public final Context f12132d;
    /* renamed from: e */
    public final gsp f12133e;
    /* renamed from: f */
    public final glj f12134f;
    /* renamed from: g */
    public jyt f12135g;
    /* renamed from: h */
    private final gev f12136h;
    /* renamed from: i */
    private final Object f12137i = new Object();
    /* renamed from: j */
    private jaq f12138j;
    /* renamed from: k */
    private final irs f12139k;

    public ckx(gev gev, gln gln, File file, Context context, gsp gsp, irs irs, glj glj) {
        this.f12136h = gev;
        this.f12130b = gln;
        this.f12131c = file;
        this.f12132d = context;
        this.f12133e = gsp;
        this.f12139k = irs;
        this.f12134f = glj;
    }

    /* renamed from: a */
    public final jaq mo707a(jiy jiy) {
        jaq d = jbj.m12751d();
        synchronized (this.f12137i) {
            this.f12138j.mo1973a(jlk.f7915a, new clc(this, jiy, d)).mo1980a(izw.f18704a);
        }
        return d;
    }

    /* renamed from: a */
    public final kpk mo708a() {
        kpk a;
        synchronized (this.f12137i) {
            a = this.f12138j.mo1973a(jlk.f7915a, new clb()).mo1979a();
        }
        return a;
    }

    /* renamed from: a */
    final jsb m8318a(Context context, FeatureTable featureTable, jxm jxm, jrg jrg, Executor executor, jqo jqo) {
        jms jms = new jms();
        jqk.m13093a(jms, context, jmr.SMART_BURST, jiu.f7856a, executor, jqo);
        jms.m4599b(jrg.class, "default").m4601a(new cky(jrg));
        jms.m4599b(jxm.class, "default").m4601a(new ckz(jxm));
        jms.m4599b(FeatureTable.class, "default").m4601a(new cla(featureTable));
        synchronized (this.f12137i) {
            jyt jyt = this.f12135g;
            if (jyt != null) {
                jqk.m13094a(jms, jyt);
            }
        }
        return (jsb) jms.m4595a(jsb.class, "default");
    }

    /* renamed from: a */
    static boolean m8315a(File file) {
        if (new File(file, "feature_table.bin").exists() && new File(file, "metadatastore.bin").exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo709b() {
        Executor b = cht.m1131b();
        jqo jrd = new jrd();
        synchronized (this.f12137i) {
            if (jlo.m4541c()) {
                this.f12135g = new jyt(jlo.m4539a(), "camera_single_");
            }
            this.f12138j = jli.m12948b(izg.f7590a).mo1973a(b, new clf(this, b, jrd)).mo1975a(b, new clg()).mo1973a(b, new cld());
            this.f12138j.mo1980a(izw.f18704a);
        }
    }
}
