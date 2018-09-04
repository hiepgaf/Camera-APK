package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.CameraProfile;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: com */
public abstract class com implements geu {
    /* renamed from: a */
    private static final String f12420a = bli.m862a("PostProcessingTask");
    /* renamed from: b */
    private final ipz f12421b;
    /* renamed from: c */
    private final int f12422c;
    /* renamed from: d */
    private final dpu f12423d;
    /* renamed from: e */
    public final gkr f12424e;
    /* renamed from: f */
    public final gln f12425f;
    /* renamed from: g */
    public final ExecutorService f12426g;
    /* renamed from: h */
    public final cjn f12427h;
    /* renamed from: i */
    public final File f12428i;
    /* renamed from: j */
    public final jqo f12429j;
    /* renamed from: k */
    public final jrg f12430k;
    /* renamed from: l */
    public final jrg f12431l;
    /* renamed from: m */
    public final jrg f12432m;
    /* renamed from: n */
    public final grw f12433n;
    /* renamed from: o */
    public final UUID f12434o;
    /* renamed from: p */
    private final ckm f12435p = new ckm(new File(gtu.m2823a().mo1624b(), this.f12424e.mo2886n()));

    /* renamed from: a */
    protected abstract void mo2779a(Context context);

    public com(jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, gsp gsp) {
        this.f12432m = jrg;
        this.f12424e = gkr;
        this.f12425f = gln;
        this.f12430k = jrg2;
        this.f12431l = jrg3;
        this.f12426g = executorService;
        this.f12427h = cjn;
        this.f12422c = i;
        this.f12428i = file;
        this.f12429j = jqo;
        this.f12433n = grw;
        this.f12423d = dpu;
        this.f12434o = uuid;
        Point e = gsp.mo1646e(this.f12424e.mo2887o());
        this.f12421b = ipz.m4018a(e.x, e.y).m4024a();
    }

    public get getSession() {
        return this.f12424e;
    }

    public void process(Context context) {
        try {
            mo2779a(context);
            this.f12424e.mo2879f();
            bli.m863a(f12420a, "OnBurstSaved");
            cjn cjn = this.f12427h;
            ((BurstSessionStatistics) cjn.f2077a.f2052s.burstStats().getCurrentSession()).m8410b();
            bli.m871d(cig.f2026a, "onBurstCompleted");
            cjn.f2077a.f2047n.close();
            cjn.f2077a.f2046m.mo3557a(null);
            cjn.f2077a.m1154a();
        } catch (Exception e) {
            this.f12427h.m1159a(e);
        } finally {
            this.f12426g.shutdown();
            new jzy(jqk.m13097b(this.f12432m)).close();
            this.f12435p.m1168b();
        }
    }

    /* renamed from: a */
    protected final jaq m8498a(Map map, List list, coe coe) {
        this.f12435p.m1169c();
        bli.m871d(f12420a, "rasterizeFramesHighRes");
        Iterable arrayList = new ArrayList(list.size());
        List arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Object obj = null;
        for (int i = 0; i < list.size(); i++) {
            int i2;
            boolean z;
            long longValue;
            coq coq = (coq) list.get(i);
            long j = coq.f2519a;
            boolean z2 = coq.f2524f;
            gob gob = coq.f2521c;
            Long valueOf = Long.valueOf(j);
            jqs jqs = (jqs) map.get(valueOf);
            if (obj != null) {
                i2 = go.bd;
            } else {
                i2 = go.bc;
            }
            int indexOf = arrayList2.indexOf(valueOf);
            long j2 = coe.f2228c;
            if (i2 == go.bc) {
                z = true;
            } else {
                z = false;
            }
            String a = jxr.m4675a(indexOf, j2, "", z, z2);
            synchronized (this) {
                longValue = ((Long) coe.f2226a.get(j)).longValue();
            }
            arrayList.add(jli.m12939a(this.f12426g, new coo(gob, coq.f2526h, a, longValue, jqs)));
            obj = 1;
        }
        return jas.m12716b(jli.m12937a(arrayList));
    }

    /* renamed from: a */
    protected final jaq m8496a(File file) {
        File a = coc.m1211a(file);
        if (a.mkdirs() || a.isDirectory()) {
            try {
                new File(a, ".nomedia").createNewFile();
                Map hashMap = new HashMap();
                for (Long longValue : this.f12431l.m13135e()) {
                    long longValue2 = longValue.longValue();
                    hashMap.put(Long.valueOf(longValue2), jxr.m4680b(longValue2));
                }
                return m8499a(this.f12431l, a, hashMap);
            } catch (IOException e) {
                throw new IllegalStateException("Unable to create .nomedia file.");
            }
        }
        throw new IllegalStateException("Unable to create med res directory.");
    }

    /* renamed from: a */
    final jaq m8499a(jrg jrg, File file, Map map) {
        int jpegEncodingQualityParameter = CameraProfile.getJpegEncodingQualityParameter(2);
        Iterable arrayList = new ArrayList();
        for (Long longValue : jrg.m13135e()) {
            long longValue2 = longValue.longValue();
            String str = (String) map.get(Long.valueOf(longValue2));
            if (str != null) {
                arrayList.add(jrg.m13130b(longValue2).mo1973a(this.f12426g, new con(this, new File(file, str), jpegEncodingQualityParameter)));
            }
        }
        return jas.m12716b(jli.m12937a(arrayList));
    }

    /* renamed from: a */
    protected final jaq m8497a(List list, Executor executor) {
        bli.m871d(f12420a, "saveCapturedImages");
        coh coh = new coh(list, this.f12434o, this.f12423d, executor, new cny());
        return jli.m12937a(coh.m1213a(this.f12432m, this.f12421b, this.f12422c)).mo1973a(coh.f2229a, coh.f2230b);
    }
}
