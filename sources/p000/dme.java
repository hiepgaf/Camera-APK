package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: dme */
public final class dme extends doc {
    /* renamed from: c */
    private static final String f21093c = bli.m862a("VidStateCompleted");
    /* renamed from: d */
    private boolean f21094d;
    /* renamed from: e */
    private Uri f21095e;

    public dme(doc doc, boolean z, Uri uri) {
        super((bug) doc);
        this.f21094d = z;
        this.f21095e = uri;
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        if (this.f21094d) {
            Intent intent = new Intent();
            String str = f21093c;
            String valueOf = String.valueOf(this.f21095e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("Current video URI: ");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
            intent.setData(this.f21095e);
            intent.addFlags(1);
            ((doa) m991d()).f13606K.mo2737a(intent);
        } else {
            ((doa) m991d()).f13606K.mo2735a();
        }
        return null;
    }
}
