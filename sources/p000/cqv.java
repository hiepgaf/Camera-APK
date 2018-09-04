package p000;

import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import java.util.Date;

/* compiled from: PG */
/* renamed from: cqv */
public final class cqv extends eru {
    /* renamed from: a */
    public final long f12541a;

    public cqv(long j, String str, String str2, Date date, Date date2, String str3, Uri uri, boolean z, iqp iqp, long j2, erx erx, long j3) {
        super(j, str, str2, date, date2, str3, uri, z, kbg.m4745c(iqp), j2, 0, erx, false);
        this.f12541a = j3;
    }

    public final Uri e_() {
        return Media.EXTERNAL_CONTENT_URI.buildUpon().appendPath(Long.toString(this.f4149b)).build();
    }
}
