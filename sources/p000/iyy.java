package p000;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: iyy */
public class iyy implements iyz, iza {
    /* renamed from: a */
    public izb f18694a;
    /* renamed from: b */
    public izb f18695b;
    /* renamed from: c */
    public izb f18696c;
    /* renamed from: d */
    public izb f18697d = izb.m4360a(iyt.f7568a);
    /* renamed from: e */
    public izb f18698e;
    /* renamed from: f */
    public int f18699f = -1;
    /* renamed from: g */
    public long f18700g = -1;

    /* renamed from: a */
    public iyy m12682a(File file) {
        this.f18695b = izb.m4360a(new iyw(file));
        kow.m13622a(this.f18695b.f7580a, new iys(), kpq.f8410a);
        this.f18696c = izb.m4360a(new iyx(file));
        return this;
    }

    /* renamed from: a */
    public Callable m12686a() {
        jri.m13152b(this.f18694a);
        jri.m13152b(this.f18695b);
        jri.m13152b(this.f18696c);
        jri.m13152b(this.f18697d);
        jri.m13152b(this.f18698e);
        return new iyr(this.f18694a, this.f18695b, this.f18696c, this.f18697d, this.f18698e, this.f18699f, this.f18700g);
    }

    /* renamed from: a */
    public iyy mo1967a(OutputStream outputStream) {
        this.f18698e = izb.m4360a(new iyv(outputStream));
        return this;
    }

    /* renamed from: b */
    public iyz mo1970b() {
        this.f18699f = 1;
        return this;
    }

    /* renamed from: a */
    public iyz mo1968a(long j) {
        this.f18700g = j;
        return this;
    }

    /* renamed from: a */
    public iza mo1969a(InputStream inputStream) {
        this.f18694a = izb.m4360a(new iyu(inputStream));
        return this;
    }
}
