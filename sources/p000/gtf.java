package p000;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gtf */
public final class gtf {
    /* renamed from: a */
    private final gsx f5683a;
    /* renamed from: b */
    private final Set f5684b = Collections.synchronizedSet(new HashSet());

    gtf(gsx gsx) {
        this.f5683a = (gsx) jri.m13152b((Object) gsx);
    }

    /* renamed from: a */
    public final String m2813a(long j, DateFormat dateFormat) {
        return m2809b(dateFormat.format(new Date(j)));
    }

    /* renamed from: a */
    public final File m2811a(String str, ixx ixx) {
        File a = this.f5683a.mo1623a();
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(ixx.f7546j);
        return new File(a, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    public final String m2812a(long j) {
        return m2813a(j, new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* renamed from: a */
    public final File m2810a(String str) {
        File file = new File(this.f5683a.mo1623a(), ".inflight");
        String str2 = ixx.JPEG.f7546j;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 4) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: b */
    public final String m2814b(long j) {
        return m2813a(j, new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* renamed from: b */
    private final String m2809b(String str) {
        synchronized (this.f5684b) {
            if (this.f5684b.contains(str)) {
                String stringBuilder;
                int i = 0;
                do {
                    i++;
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 12);
                    stringBuilder2.append(str);
                    stringBuilder2.append("_");
                    stringBuilder2.append(i);
                    stringBuilder = stringBuilder2.toString();
                } while (this.f5684b.contains(stringBuilder));
                this.f5684b.add(stringBuilder);
                return stringBuilder;
            }
            this.f5684b.add(str);
            return str;
        }
    }
}
