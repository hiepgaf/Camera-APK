package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dmf */
public final class dmf extends doc {
    /* renamed from: c */
    public static final String f21096c = bli.m862a("VidIntStOpenCamera");
    /* renamed from: d */
    public final iut f21097d;
    /* renamed from: e */
    public final iur f21098e;
    /* renamed from: f */
    public final ffc f21099f;
    /* renamed from: g */
    public boolean f21100g;
    /* renamed from: h */
    public djz f21101h;
    /* renamed from: i */
    public kpk f21102i;
    /* renamed from: j */
    public bfe f21103j;
    /* renamed from: k */
    private final ipv f21104k = new dmg(this);
    /* renamed from: l */
    private boolean f21105l;

    public dmf(doc doc, iut iut, iur iur, ffc ffc) {
        super((bug) doc);
        this.f21097d = iut;
        this.f21098e = iur;
        this.f21099f = ffc;
        this.f21100g = false;
        m988a(dbd.class, new dmh(this));
        m988a(dlo.class, new dmi(this));
        m988a(dav.class, new dmk(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        String str;
        FileNotFoundException e;
        boolean z;
        String str2;
        StringBuilder stringBuilder;
        bfk bfk;
        inc inc;
        bez bez;
        ine a;
        ilp dmm;
        kbg kbg;
        int a2;
        int b;
        ipv ipv;
        iur iur;
        ilp ilp;
        irh irh;
        kpw d;
        CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession;
        kpk kpk;
        ijv ijv;
        Iterable arrayList;
        if (this.f21099f == null) {
            bli.m866b(f21096c, "mOneCameraCharacteristics is null");
            return new dlz(this);
        }
        Integer valueOf;
        Bundle extras = ((doa) m991d()).f13608a.getExtras();
        Intent intent = ((doa) m991d()).f13608a;
        kbg kbg2 = kau.f19138a;
        kbg kbg3 = kau.f19138a;
        if (extras != null) {
            Uri uri = (Uri) extras.getParcelable("output");
            if (uri != null) {
                try {
                    kbg2 = kbg.m4745c(((doa) m991d()).f13622o.openFileDescriptor(uri, "rw"));
                    try {
                        str = f21096c;
                        String valueOf2 = String.valueOf(uri);
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                        stringBuilder2.append("Input uri is: ");
                        stringBuilder2.append(valueOf2);
                        bli.m869c(str, stringBuilder2.toString());
                        ((doa) m991d()).m9188a(uri);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        bli.m866b(f21096c, e.toString());
                        if (intent.hasExtra("android.intent.extra.videoQuality")) {
                            z = false;
                        } else if (intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (intent.hasExtra("android.intent.extra.durationLimit")) {
                            valueOf = Integer.valueOf(intent.getIntExtra("android.intent.extra.durationLimit", 0));
                        } else {
                            valueOf = null;
                        }
                        if (intent.hasExtra("android.intent.extra.sizeLimit")) {
                            kbg3 = kbg.m4745c(Long.valueOf((long) intent.getIntExtra("android.intent.extra.sizeLimit", 0)));
                            str2 = f21096c;
                            str = String.valueOf(kbg3.mo2081a());
                            stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
                            stringBuilder.append("SIZE LIMTI IS ");
                            stringBuilder.append(str);
                            bli.m869c(str2, stringBuilder.toString());
                        }
                        bfk = ((doa) m991d()).f13625r;
                        inc = inc.FPS_30;
                        bez = (bez) bfk.mo2670b(this.f21098e).mo2081a();
                        a = ((doa) m991d()).f13617j.m1640a(((doa) m991d()).f13615h.m1694a(), bez, inc, z);
                        ((doa) m991d()).f13624q.m4080a(this.f21098e, new irg(this.f21098e));
                        this.f21105l = ((doa) m991d()).f13617j.m1645b(inc, a, bez.m804a());
                        if (this.f21105l) {
                            dmm = new dmm(this, ((doa) m991d()).f13629v);
                        } else {
                            dmm = new ilb(Boolean.valueOf(false));
                        }
                        this.f21101h = new djz(((doa) m991d()).f13615h.m1694a(), this.f21099f, ((doa) m991d()).f13614g);
                        kbg = kau.f19138a;
                        if (((doa) m991d()).f13617j.m1646c()) {
                            kbg = kbg.m4745c(((doa) m991d()).f13613f);
                        }
                        a2 = ((doa) m991d()).f13617j.m1639a(inc, a);
                        if (valueOf != null) {
                            a2 = valueOf.intValue();
                        }
                        b = ((doa) m991d()).f13617j.m1643b(inc, a);
                        valueOf.intValue();
                        ((doa) m991d()).f13597B.m15518a(this.f21097d);
                        ipv = this.f21104k;
                        iur = this.f21098e;
                        ilp = this.f21101h.f13499a;
                        m991d();
                        this.f21102i = bfk.mo2668a(inc, ipv, a, iur, kbg2, dmm, ilp, kbg, true, false, a2, kbg3);
                        irh = ((doa) m991d()).f13624q;
                        d = kpw.m18056d();
                        cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
                        cameraDeviceInstrumentationSession.m8424b();
                        irh.m4080a(this.f21098e, new dmn(this, cameraDeviceInstrumentationSession, d));
                        kpk = this.f21102i;
                        ijv = new ijv(this, a);
                        arrayList = new ArrayList(2);
                        arrayList.add(kpk);
                        arrayList.add(d);
                        kow.m13622a(kow.m13616a(arrayList), new ijs(ijv), kpq.f8410a);
                        return null;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    bli.m866b(f21096c, e.toString());
                    if (intent.hasExtra("android.intent.extra.videoQuality")) {
                        z = false;
                    } else if (intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (intent.hasExtra("android.intent.extra.durationLimit")) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(intent.getIntExtra("android.intent.extra.durationLimit", 0));
                    }
                    if (intent.hasExtra("android.intent.extra.sizeLimit")) {
                        kbg3 = kbg.m4745c(Long.valueOf((long) intent.getIntExtra("android.intent.extra.sizeLimit", 0)));
                        str2 = f21096c;
                        str = String.valueOf(kbg3.mo2081a());
                        stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
                        stringBuilder.append("SIZE LIMTI IS ");
                        stringBuilder.append(str);
                        bli.m869c(str2, stringBuilder.toString());
                    }
                    bfk = ((doa) m991d()).f13625r;
                    inc = inc.FPS_30;
                    bez = (bez) bfk.mo2670b(this.f21098e).mo2081a();
                    a = ((doa) m991d()).f13617j.m1640a(((doa) m991d()).f13615h.m1694a(), bez, inc, z);
                    ((doa) m991d()).f13624q.m4080a(this.f21098e, new irg(this.f21098e));
                    this.f21105l = ((doa) m991d()).f13617j.m1645b(inc, a, bez.m804a());
                    if (this.f21105l) {
                        dmm = new ilb(Boolean.valueOf(false));
                    } else {
                        dmm = new dmm(this, ((doa) m991d()).f13629v);
                    }
                    this.f21101h = new djz(((doa) m991d()).f13615h.m1694a(), this.f21099f, ((doa) m991d()).f13614g);
                    kbg = kau.f19138a;
                    if (((doa) m991d()).f13617j.m1646c()) {
                        kbg = kbg.m4745c(((doa) m991d()).f13613f);
                    }
                    a2 = ((doa) m991d()).f13617j.m1639a(inc, a);
                    if (valueOf != null) {
                        a2 = valueOf.intValue();
                    }
                    b = ((doa) m991d()).f13617j.m1643b(inc, a);
                    valueOf.intValue();
                    ((doa) m991d()).f13597B.m15518a(this.f21097d);
                    ipv = this.f21104k;
                    iur = this.f21098e;
                    ilp = this.f21101h.f13499a;
                    m991d();
                    this.f21102i = bfk.mo2668a(inc, ipv, a, iur, kbg2, dmm, ilp, kbg, true, false, a2, kbg3);
                    irh = ((doa) m991d()).f13624q;
                    d = kpw.m18056d();
                    cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
                    cameraDeviceInstrumentationSession.m8424b();
                    irh.m4080a(this.f21098e, new dmn(this, cameraDeviceInstrumentationSession, d));
                    kpk = this.f21102i;
                    ijv = new ijv(this, a);
                    arrayList = new ArrayList(2);
                    arrayList.add(kpk);
                    arrayList.add(d);
                    kow.m13622a(kow.m13616a(arrayList), new ijs(ijv), kpq.f8410a);
                    return null;
                }
            }
        }
        if (intent.hasExtra("android.intent.extra.videoQuality")) {
            z = false;
        } else if (intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (intent.hasExtra("android.intent.extra.durationLimit")) {
            valueOf = Integer.valueOf(intent.getIntExtra("android.intent.extra.durationLimit", 0));
        } else {
            valueOf = null;
        }
        if (intent.hasExtra("android.intent.extra.sizeLimit")) {
            kbg3 = kbg.m4745c(Long.valueOf((long) intent.getIntExtra("android.intent.extra.sizeLimit", 0)));
            str2 = f21096c;
            str = String.valueOf(kbg3.mo2081a());
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
            stringBuilder.append("SIZE LIMTI IS ");
            stringBuilder.append(str);
            bli.m869c(str2, stringBuilder.toString());
        }
        bfk = ((doa) m991d()).f13625r;
        inc = inc.FPS_30;
        bez = (bez) bfk.mo2670b(this.f21098e).mo2081a();
        a = ((doa) m991d()).f13617j.m1640a(((doa) m991d()).f13615h.m1694a(), bez, inc, z);
        ((doa) m991d()).f13624q.m4080a(this.f21098e, new irg(this.f21098e));
        this.f21105l = ((doa) m991d()).f13617j.m1645b(inc, a, bez.m804a());
        if (this.f21105l) {
            dmm = new dmm(this, ((doa) m991d()).f13629v);
        } else {
            dmm = new ilb(Boolean.valueOf(false));
        }
        this.f21101h = new djz(((doa) m991d()).f13615h.m1694a(), this.f21099f, ((doa) m991d()).f13614g);
        kbg = kau.f19138a;
        if (((doa) m991d()).f13617j.m1646c()) {
            kbg = kbg.m4745c(((doa) m991d()).f13613f);
        }
        a2 = ((doa) m991d()).f13617j.m1639a(inc, a);
        if (valueOf != null) {
            a2 = valueOf.intValue();
        }
        b = ((doa) m991d()).f13617j.m1643b(inc, a);
        if (valueOf != null && valueOf.intValue() < b) {
            valueOf.intValue();
        }
        ((doa) m991d()).f13597B.m15518a(this.f21097d);
        ipv = this.f21104k;
        iur = this.f21098e;
        ilp = this.f21101h.f13499a;
        m991d();
        this.f21102i = bfk.mo2668a(inc, ipv, a, iur, kbg2, dmm, ilp, kbg, true, false, a2, kbg3);
        irh = ((doa) m991d()).f13624q;
        d = kpw.m18056d();
        cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
        cameraDeviceInstrumentationSession.m8424b();
        irh.m4080a(this.f21098e, new dmn(this, cameraDeviceInstrumentationSession, d));
        kpk = this.f21102i;
        ijv = new ijv(this, a);
        arrayList = new ArrayList(2);
        arrayList.add(kpk);
        arrayList.add(d);
        kow.m13622a(kow.m13616a(arrayList), new ijs(ijv), kpq.f8410a);
        return null;
    }
}
