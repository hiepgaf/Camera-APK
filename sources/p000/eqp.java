package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: eqp */
public final class eqp implements eqi, kov {
    /* renamed from: a */
    private static final String f15399a = bli.m862a("ProcessingVid");
    /* renamed from: b */
    private final ContentResolver f15400b;
    /* renamed from: c */
    private final Uri f15401c;
    /* renamed from: d */
    private final kwk f15402d;
    /* renamed from: e */
    private final Uri f15403e;
    /* renamed from: f */
    private final long f15404f;
    /* renamed from: g */
    private final String f15405g;
    /* renamed from: h */
    private final glw f15406h;
    /* renamed from: i */
    private final kpw f15407i = kpw.m18056d();
    /* renamed from: j */
    private boolean f15408j;

    eqp(ContentResolver contentResolver, Uri uri, kwk kwk, Uri uri2, long j, String str, glw glw) {
        this.f15400b = contentResolver;
        this.f15401c = uri;
        this.f15402d = kwk;
        this.f15403e = uri2;
        this.f15404f = j;
        this.f15405g = str;
        this.f15406h = glw;
    }

    /* renamed from: a */
    public final kpk mo1262a() {
        return this.f15407i;
    }

    /* renamed from: b */
    public final long mo1263b() {
        return Long.parseLong(this.f15403e.getLastPathSegment());
    }

    /* renamed from: c */
    public final Uri mo1264c() {
        return this.f15403e;
    }

    /* renamed from: d */
    public final glw mo1265d() {
        return this.f15406h;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        if (this.f15408j) {
            bli.m873e(f15399a, "Was deleted already");
        } else {
            boolean z;
            if (this.f15400b.delete(this.f15403e, null, null) == 1) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            this.f15408j = true;
        }
        this.f15407i.m17780a(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        eqr eqr = (eqr) obj;
        if (this.f15408j) {
            String str = f15399a;
            String valueOf = String.valueOf(this.f15403e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("item already deleted ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            return;
        }
        if (eqr.m2015a().mo2084b()) {
            valueOf = (String) eqr.m2015a().mo2081a();
        } else {
            valueOf = this.f15405g;
        }
        eqt eqt = (eqt) this.f15402d.mo345a();
        bgl bgl = eqr.f4088a;
        eqt.f4089a = bgl.f1133a;
        eqt.f4090b = bgl.f1135c;
        eqt = eqt.m2019a(bgl.m814b()).m2018a(eqr.f4088a.f1134b.mo1897g().m3881c()).m2021b(this.f15404f).m2020a(valueOf).m2017a(eqr.f4088a.f1137e);
        eqt.f4091c = true;
        ContentValues contentValues = eqt.m2016a().f4066a;
        Object build = this.f15401c.buildUpon().appendPath(this.f15403e.getLastPathSegment()).build();
        try {
            if (this.f15400b.update(build, contentValues, null, null) == 1) {
                this.f15407i.mo3557a(build);
            } else {
                this.f15407i.m17780a(new IOException());
            }
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = f15399a;
            str = String.valueOf(th.getMessage());
            String str3 = "Cannot update ";
            if (str.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(str);
            }
            bli.m866b(str2, str);
            this.f15407i.m17780a(th);
        }
    }
}
