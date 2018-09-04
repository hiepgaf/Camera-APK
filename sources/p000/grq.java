package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: grq */
public final class grq extends izy {
    /* renamed from: a */
    private static final String f21546a = bli.m862a("LogAfctGenFunc");
    /* renamed from: b */
    private final ContentResolver f21547b;
    /* renamed from: c */
    private final klw f21548c = new klw();
    /* renamed from: d */
    private final gsp f21549d;
    /* renamed from: e */
    private final irs f21550e;

    public grq(ContentResolver contentResolver, boolean z, jiy jiy, String str, gsp gsp, irs irs) {
        int i;
        this.f21547b = contentResolver;
        this.f21550e = irs;
        klw klw = this.f21548c;
        switch (jiy.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            default:
                String str2 = f21546a;
                String valueOf = String.valueOf(jiy);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Unknown creation type ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" for logging");
                bli.m866b(str2, stringBuilder.toString());
                i = -1;
                break;
        }
        klw.f22415b = i;
        klw klw2 = this.f21548c;
        klw2.f22416c = z;
        klw2.f22414a = ept.m1984a().m1986a(str);
        this.f21549d = gsp;
    }

    public final /* synthetic */ void a_(Object obj) {
        kbg kbg = (kbg) obj;
        if (kbg.mo2084b()) {
            Uri uri = (Uri) kbg.mo2081a();
            if (uri == null) {
                bli.m866b(f21546a, "Couldn't get session URI");
                return;
            }
            Uri b = this.f21549d.mo1642b(uri);
            if (b == null) {
                String str = f21546a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Couldn't get content URI for session ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
            }
            String a = eio.m1754a(this.f21547b, b);
            if (a == null) {
                a = f21546a;
                String valueOf2 = String.valueOf(uri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                stringBuilder2.append("Couldn't get file name for ");
                stringBuilder2.append(valueOf2);
                bli.m866b(a, stringBuilder2.toString());
                return;
            }
            epp epp = new epp(18, false, new File(a).getName());
            epp.f4044b.captureDoneEvent.smartburstCreationMeta = this.f21548c;
            this.f21550e.mo1581a(epp);
        }
    }
}
