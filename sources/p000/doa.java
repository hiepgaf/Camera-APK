package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: doa */
public final class doa implements iqo {
    /* renamed from: A */
    public final ilp f13596A;
    /* renamed from: B */
    public final ecd f13597B;
    /* renamed from: C */
    public final asu f13598C;
    /* renamed from: D */
    public final hat f13599D;
    /* renamed from: E */
    public final irs f13600E;
    /* renamed from: F */
    public final imy f13601F;
    /* renamed from: G */
    public final div f13602G;
    /* renamed from: H */
    public final kwk f13603H;
    /* renamed from: I */
    public kbg f13604I = kau.f19138a;
    /* renamed from: J */
    public ilp f13605J;
    /* renamed from: K */
    public final cfh f13606K;
    /* renamed from: L */
    private final HandlerThread f13607L;
    /* renamed from: a */
    public final Intent f13608a;
    /* renamed from: b */
    public final dli f13609b;
    /* renamed from: c */
    public final ikd f13610c;
    /* renamed from: d */
    public final Context f13611d;
    /* renamed from: e */
    public final fbn f13612e;
    /* renamed from: f */
    public final hjw f13613f;
    /* renamed from: g */
    public final gci f13614g;
    /* renamed from: h */
    public final dzh f13615h;
    /* renamed from: i */
    public final bpq f13616i;
    /* renamed from: j */
    public final dkb f13617j;
    /* renamed from: k */
    public final hek f13618k;
    /* renamed from: l */
    public final heq f13619l;
    /* renamed from: m */
    public final gpn f13620m;
    /* renamed from: n */
    public final Resources f13621n;
    /* renamed from: o */
    public final ContentResolver f13622o;
    /* renamed from: p */
    public final ilb f13623p;
    /* renamed from: q */
    public final irh f13624q;
    /* renamed from: r */
    public final bfk f13625r;
    /* renamed from: s */
    public final djo f13626s;
    /* renamed from: t */
    public final cbu f13627t;
    /* renamed from: u */
    public final ing f13628u;
    /* renamed from: v */
    public final ilp f13629v;
    /* renamed from: w */
    public final fer f13630w;
    /* renamed from: x */
    public final ehx f13631x;
    /* renamed from: y */
    public final eid f13632y;
    /* renamed from: z */
    public final fbr f13633z;

    public doa(Intent intent, dli dli, ikd ikd, Context context, fbn fbn, hjw hjw, gci gci, gpn gpn, dzh dzh, cfh cfh, cbu cbu, bpq bpq, Resources resources, ContentResolver contentResolver, dkb dkb, hek hek, heq heq, irh irh, bfk bfk, djo djo, ing ing, ilp ilp, fer fer, ehx ehx, eid eid, fbr fbr, ilp ilp2, ilp ilp3, ecd ecd, asu asu, hat hat, irs irs, HandlerThread handlerThread, ilb ilb, imy imy, div div, kwk kwk) {
        this.f13608a = intent;
        this.f13609b = dli;
        this.f13610c = ikd;
        this.f13611d = context;
        this.f13627t = cbu;
        this.f13612e = fbn;
        this.f13613f = hjw;
        this.f13614g = gci;
        this.f13615h = dzh;
        this.f13616i = bpq;
        this.f13617j = dkb;
        this.f13618k = hek;
        this.f13619l = heq;
        this.f13620m = gpn;
        this.f13606K = cfh;
        this.f13622o = contentResolver;
        this.f13621n = resources;
        this.f13607L = handlerThread;
        this.f13623p = ilb;
        this.f13624q = irh;
        this.f13625r = bfk;
        this.f13626s = djo;
        this.f13628u = ing;
        this.f13629v = ilp;
        this.f13630w = fer;
        this.f13631x = ehx;
        this.f13632y = eid;
        this.f13633z = fbr;
        this.f13605J = ilp2;
        this.f13596A = ilp3;
        this.f13597B = ecd;
        this.f13598C = asu;
        this.f13599D = hat;
        this.f13600E = irs;
        this.f13601F = imy;
        this.f13602G = div;
        this.f13603H = kwk;
    }

    public final void close() {
        this.f13607L.quit();
    }

    /* renamed from: a */
    public final void m9188a(Uri uri) {
        if (uri != null) {
            this.f13604I = kbg.m4745c(uri);
        } else {
            this.f13604I = kau.f19138a;
        }
    }
}
