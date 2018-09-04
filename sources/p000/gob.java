package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: gob */
public final class gob implements get {
    /* renamed from: a */
    public static final String f17150a = bli.m862a("StckdCptrSession");
    /* renamed from: b */
    public final Uri f17151b;
    /* renamed from: c */
    public final kbg f17152c;
    /* renamed from: d */
    public final god f17153d;
    /* renamed from: e */
    private final grg f17154e = new goc();
    /* renamed from: f */
    private final gtf f17155f;
    /* renamed from: g */
    private final gsl f17156g;
    /* renamed from: h */
    private final ContentResolver f17157h;
    /* renamed from: i */
    private final gsq f17158i;

    public gob(Uri uri, gtf gtf, gsl gsl, ContentResolver contentResolver, kbg kbg, god god, gsq gsq) {
        this.f17151b = (Uri) jri.m13152b((Object) uri);
        this.f17155f = (gtf) jri.m13152b((Object) gtf);
        this.f17156g = (gsl) jri.m13152b((Object) gsl);
        this.f17157h = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f17152c = kbg;
        this.f17153d = (god) jri.m13152b((Object) god);
        this.f17158i = (gsq) jri.m13152b((Object) gsq);
    }

    /* renamed from: a */
    public final void mo1481a(hec hec, boolean z, String str) {
        this.f17153d.m2650a();
    }

    /* renamed from: h */
    public final grg mo1482h() {
        return this.f17154e;
    }

    /* renamed from: a */
    public final synchronized void m11231a(File file, String str, int i, int i2, long j) {
        File a = this.f17155f.m2811a(str, ixx.JPEG);
        String str2 = f17150a;
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Saving using stack image saver: ");
        stringBuilder.append(valueOf);
        bli.m863a(str2, stringBuilder.toString());
        try {
            this.f17156g.mo1617a(file, a);
            if (a.length() > 0) {
                this.f17158i.m2799a(this.f17157h, str, j, this.f17152c, 0, a.getAbsolutePath(), i, i2, ixx.JPEG);
            }
        } catch (Throwable e) {
            bli.m867b(f17150a, String.format("Unable to rename file from %s to %s.", new Object[]{file.getPath(), a.getPath()}), e);
        }
    }

    /* renamed from: a */
    public final kpk mo1479a(InputStream inputStream, glz glz) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    public final void mo1480a(gew gew) {
    }
}
