package p000;

import android.annotation.TargetApi;
import android.location.Location;
import java.io.File;
import java.util.concurrent.TimeUnit;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: epy */
public final class epy {
    /* renamed from: a */
    public File f4067a = null;
    /* renamed from: b */
    public kbg f4068b = null;
    /* renamed from: c */
    public iqm f4069c = null;
    /* renamed from: d */
    private final epw f4070d;
    /* renamed from: e */
    private ixx f4071e = null;
    /* renamed from: f */
    private iqp f4072f = null;
    /* renamed from: g */
    private long f4073g = -1;
    /* renamed from: h */
    private String f4074h = null;

    public epy(epw epw) {
        this.f4070d = epw;
    }

    /* renamed from: a */
    public final epv m1992a() {
        if (this.f4067a == null) {
            throw new IllegalStateException("image file is not set.");
        } else if (this.f4068b == null) {
            throw new IllegalStateException("image location optional is not set.");
        } else if (this.f4071e == null) {
            throw new IllegalStateException("image MIME type is not set.");
        } else if (this.f4069c == null) {
            throw new IllegalStateException("image orientation is not set.");
        } else if (this.f4072f == null) {
            throw new IllegalStateException("image size is not set.");
        } else if (this.f4073g < 0) {
            throw new IllegalStateException("image taken time is not set.");
        } else if (this.f4074h == null) {
            throw new IllegalStateException("image title is not set.");
        } else {
            epv a = new epv();
            a.m1988a("media_type", Integer.valueOf(1));
            a.m1990a("_data", this.f4067a.getAbsolutePath());
            a.m1989a("_size", Long.valueOf(this.f4067a.length()));
            a.m1990a("_display_name", this.f4067a.getName());
            a.m1990a(NotificationCompatJellybean.KEY_TITLE, this.f4074h);
            a.m1989a("date_added", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4073g)));
            a.m1989a("date_modified", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4067a.lastModified())));
            a.m1990a("mime_type", this.f4071e.f7545i);
            a.m1988a("width", Integer.valueOf(this.f4072f.f7329a));
            a.m1988a("height", Integer.valueOf(this.f4072f.f7330b));
            if (this.f4068b.mo2084b()) {
                a.m1987a("latitude", Double.valueOf(((Location) this.f4068b.mo2081a()).getLatitude()));
                a.m1987a("longitude", Double.valueOf(((Location) this.f4068b.mo2081a()).getLongitude()));
            }
            a.m1989a("datetaken", Long.valueOf(this.f4073g));
            a.m1988a("orientation", Integer.valueOf(this.f4069c.f7326e));
            return a;
        }
    }

    /* renamed from: a */
    public final epy m1995a(ixx ixx) {
        if (ixx.f7540h.contains(ixx)) {
            this.f4071e = ixx;
            return this;
        }
        String valueOf = String.valueOf(ixx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("invalid image MIME type ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final epy m1994a(iqp iqp) {
        if (iqp.m4046a() <= 0) {
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("invalid image size ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4072f = iqp;
        return this;
    }

    /* renamed from: a */
    public final epy m1993a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid image taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4073g = j;
        return this;
    }

    /* renamed from: a */
    public final epy m1996a(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty image title");
        }
        this.f4074h = str;
        return this;
    }
}
