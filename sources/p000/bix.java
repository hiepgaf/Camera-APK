package p000;

import android.view.Surface;
import java.io.File;

/* compiled from: PG */
/* renamed from: bix */
public final class bix implements biw {
    /* renamed from: a */
    public static final String f10943a = bli.m862a("PreparedMediaRec");
    /* renamed from: b */
    private final boolean f10944b;
    /* renamed from: c */
    private final File f10945c;
    /* renamed from: d */
    private final int f10946d;
    /* renamed from: e */
    private final ipy f10947e;
    /* renamed from: f */
    private final kbg f10948f;
    /* renamed from: g */
    private final kbg f10949g;
    /* renamed from: h */
    private final Surface f10950h;

    public bix(boolean z, File file, int i, ipy ipy, kbg kbg, Surface surface, kbg kbg2) {
        this.f10944b = z;
        this.f10945c = file;
        this.f10946d = i;
        this.f10947e = ipy;
        this.f10948f = kbg;
        this.f10950h = surface;
        this.f10949g = kbg2;
    }

    /* renamed from: a */
    public final kbg mo460a() {
        return this.f10949g;
    }

    /* renamed from: b */
    public final kbg mo463b() {
        return this.f10948f;
    }

    /* renamed from: c */
    public final File mo464c() {
        return this.f10945c;
    }

    /* renamed from: d */
    public final Surface mo465d() {
        return this.f10950h;
    }

    /* renamed from: e */
    public final int mo466e() {
        return this.f10946d;
    }

    /* renamed from: f */
    public final boolean mo467f() {
        return this.f10944b;
    }

    /* renamed from: g */
    public final void mo468g() {
        this.f10947e.mo485c();
    }

    /* renamed from: h */
    public final void mo469h() {
        this.f10947e.mo493g();
    }

    /* renamed from: a */
    public final void mo462a(File file) {
        this.f10947e.mo480a(file);
    }

    /* renamed from: a */
    public final void mo461a(iop iop) {
        this.f10947e.mo478a(new biy(iop));
        this.f10947e.mo495h();
    }

    /* renamed from: i */
    public final void mo470i() {
        this.f10947e.mo497i();
    }
}
