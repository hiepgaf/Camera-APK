package p000;

import android.annotation.TargetApi;
import android.location.Location;
import java.io.File;
import java.util.concurrent.TimeUnit;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: eqt */
public final class eqt {
    /* renamed from: a */
    public File f4089a = null;
    /* renamed from: b */
    public kbg f4090b = null;
    /* renamed from: c */
    public boolean f4091c = false;
    /* renamed from: d */
    private final epw f4092d;
    /* renamed from: e */
    private long f4093e = -1;
    /* renamed from: f */
    private ixx f4094f = null;
    /* renamed from: g */
    private iqp f4095g = null;
    /* renamed from: h */
    private long f4096h = -1;
    /* renamed from: i */
    private String f4097i = null;

    public eqt(epw epw) {
        this.f4092d = epw;
    }

    /* renamed from: a */
    public final epv m2016a() {
        if (this.f4093e < 0) {
            throw new IllegalStateException("video duration is not set.");
        } else if (this.f4089a == null) {
            throw new IllegalStateException("video file is not set.");
        } else if (this.f4090b == null) {
            throw new IllegalStateException("video location optional is not set.");
        } else if (this.f4094f == null) {
            throw new IllegalStateException("video MIME type is not set.");
        } else if (this.f4095g == null) {
            throw new IllegalStateException("video resolution is not set.");
        } else if (this.f4096h < 0) {
            throw new IllegalStateException("video taken time is not set.");
        } else if (this.f4097i == null) {
            throw new IllegalStateException("video title is not set.");
        } else {
            epv a = new epv();
            a.m1988a("media_type", Integer.valueOf(3));
            a.m1990a("_data", this.f4089a.getAbsolutePath());
            a.m1989a("_size", Long.valueOf(this.f4089a.length()));
            a.m1990a("_display_name", this.f4089a.getName());
            a.m1990a(NotificationCompatJellybean.KEY_TITLE, this.f4097i);
            a.m1989a("date_added", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4096h)));
            a.m1989a("date_modified", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4089a.lastModified())));
            a.m1990a("mime_type", this.f4094f.f7545i);
            a.m1988a("width", Integer.valueOf(this.f4095g.f7329a));
            a.m1988a("height", Integer.valueOf(this.f4095g.f7330b));
            a.m1989a("duration", Long.valueOf(this.f4093e));
            String num = Integer.toString(this.f4095g.f7329a);
            String num2 = Integer.toString(this.f4095g.f7330b);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(num).length() + 1) + String.valueOf(num2).length());
            stringBuilder.append(num);
            stringBuilder.append("x");
            stringBuilder.append(num2);
            a.m1990a("resolution", stringBuilder.toString());
            if (this.f4090b.mo2084b()) {
                a.m1987a("latitude", Double.valueOf(((Location) this.f4090b.mo2081a()).getLatitude()));
                a.m1987a("longitude", Double.valueOf(((Location) this.f4090b.mo2081a()).getLongitude()));
            }
            a.m1989a("datetaken", Long.valueOf(this.f4096h));
            if (this.f4091c) {
                a.m1988a("mini_thumb_magic", Integer.valueOf(1));
            }
            return a;
        }
    }

    /* renamed from: a */
    public final eqt m2017a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("invalid video duration ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4093e = j;
        return this;
    }

    /* renamed from: a */
    public final eqt m2019a(ixx ixx) {
        if (ixx.m4333a()) {
            this.f4094f = ixx;
            return this;
        }
        String valueOf = String.valueOf(ixx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("invalid video MIME type ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final eqt m2018a(iqp iqp) {
        if (iqp.m4046a() <= 0) {
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("invalid video size ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4095g = iqp;
        return this;
    }

    /* renamed from: b */
    public final eqt m2021b(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid video taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4096h = j;
        return this;
    }

    /* renamed from: a */
    public final eqt m2020a(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty video title");
        }
        this.f4097i = str;
        return this;
    }
}
