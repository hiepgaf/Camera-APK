package p000;

import android.net.Uri;
import java.util.Date;

/* compiled from: PG */
/* renamed from: erw */
public abstract class erw {
    /* renamed from: l */
    private static final Date f4161l = new Date(0);
    /* renamed from: m */
    private static final iqp f4162m = new iqp(0, 0);
    /* renamed from: a */
    public final Uri f4163a;
    /* renamed from: b */
    public long f4164b = -1;
    /* renamed from: c */
    public String f4165c = "";
    /* renamed from: d */
    public String f4166d = "";
    /* renamed from: e */
    public Date f4167e = f4161l;
    /* renamed from: f */
    public Date f4168f = f4161l;
    /* renamed from: g */
    public String f4169g = "";
    /* renamed from: h */
    public boolean f4170h = false;
    /* renamed from: i */
    public iqp f4171i = f4162m;
    /* renamed from: j */
    public erx f4172j = erx.f4174a;
    /* renamed from: k */
    public boolean f4173k = false;

    /* renamed from: c */
    public abstract erw mo1051c();

    public erw(Uri uri) {
        this.f4163a = uri;
    }

    /* renamed from: b */
    public eru mo1050b() {
        return new eru(this.f4164b, this.f4165c, this.f4166d, this.f4167e, this.f4168f, this.f4169g, this.f4163a, this.f4170h, kbg.m4745c(this.f4171i), 0, 0, this.f4172j, this.f4173k);
    }

    /* renamed from: a */
    public final erw m2080a(long j) {
        this.f4164b = j;
        return mo1051c();
    }

    /* renamed from: a */
    public final erw m2081a(Date date) {
        this.f4167e = date;
        return mo1051c();
    }

    /* renamed from: d */
    public final erw m2085d() {
        this.f4170h = true;
        return mo1051c();
    }

    /* renamed from: b */
    public final erw m2083b(Date date) {
        this.f4168f = date;
        return mo1051c();
    }
}
