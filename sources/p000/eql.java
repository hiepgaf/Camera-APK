package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: eql */
public final class eql implements eqi, kov {
    /* renamed from: b */
    private static final String f15386b = bli.m862a("ProcessingImg");
    /* renamed from: a */
    public final kpw f15387a = kpw.m18056d();
    /* renamed from: c */
    private final ContentResolver f15388c;
    /* renamed from: d */
    private final Uri f15389d;
    /* renamed from: e */
    private final kwk f15390e;
    /* renamed from: f */
    private final Uri f15391f;
    /* renamed from: g */
    private final long f15392g;
    /* renamed from: h */
    private final String f15393h;
    /* renamed from: i */
    private final glw f15394i;
    /* renamed from: j */
    private boolean f15395j;

    eql(ContentResolver contentResolver, Uri uri, kwk kwk, Uri uri2, long j, String str, glw glw) {
        this.f15388c = contentResolver;
        this.f15389d = uri;
        this.f15390e = kwk;
        this.f15391f = uri2;
        this.f15392g = j;
        this.f15393h = str;
        this.f15394i = glw;
    }

    /* renamed from: e */
    public final synchronized boolean m9834e() {
        boolean z = false;
        synchronized (this) {
            if (this.f15395j) {
                bli.m873e(f15386b, "Was deleted already");
            } else {
                if (this.f15388c.delete(this.f15391f, null, null) == 1) {
                    z = true;
                }
                this.f15395j = z;
                z = this.f15395j;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final kpk mo1262a() {
        return this.f15387a;
    }

    /* renamed from: b */
    public final long mo1263b() {
        return Long.parseLong(this.f15391f.getLastPathSegment());
    }

    /* renamed from: c */
    public final Uri mo1264c() {
        return this.f15391f;
    }

    /* renamed from: d */
    public final glw mo1265d() {
        return this.f15394i;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        m9834e();
        this.f15387a.m17780a(th);
    }

    /* renamed from: a */
    private final synchronized void m9828a(eqn eqn) {
        String valueOf;
        if (this.f15395j) {
            String str = f15386b;
            valueOf = String.valueOf(this.f15391f);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("item already deleted ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        } else {
            if (eqn.mo1501f().mo2084b()) {
                valueOf = (String) eqn.mo1501f().mo2081a();
            } else {
                valueOf = this.f15393h;
            }
            epy epy = (epy) this.f15390e.mo345a();
            epy.f4067a = eqn.mo1499d();
            epy.f4068b = eqn.mo1496a();
            epy = epy.m1995a(eqn.mo1497b());
            epy.f4069c = eqn.mo1498c();
            ContentValues contentValues = epy.m1994a(eqn.mo1500e()).m1993a(this.f15392g).m1996a(valueOf).m1992a().f4066a;
            Object build = this.f15389d.buildUpon().appendPath(this.f15391f.getLastPathSegment()).build();
            try {
                if (this.f15388c.update(build, contentValues, null, null) == 1) {
                    this.f15387a.mo3557a(build);
                } else {
                    this.f15387a.m17780a(new IOException());
                }
            } catch (Throwable e) {
                String str2 = f15386b;
                valueOf = String.valueOf(e.getMessage());
                String str3 = "Cannot update ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                bli.m866b(str2, valueOf);
                this.f15387a.m17780a(e);
            }
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        m9828a((eqn) obj);
    }
}
