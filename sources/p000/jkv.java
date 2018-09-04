package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkv */
public final class jkv extends jjq {
    /* renamed from: c */
    private final File f21883c;
    /* renamed from: d */
    private final jtv f21884d;

    public jkv(Context context, jtv jtv) {
        this(new File(context.getCacheDir().getPath(), jxr.m4682c()), jtv);
    }

    private jkv(File file, jtv jtv) {
        this("Video_VFR", file, jtv);
    }

    private jkv(String str, File file, jtv jtv) {
        super(str, -1);
        this.f21883c = file;
        this.f21884d = jtv;
    }

    /* renamed from: a */
    public final jaq mo2013a(juh juh, Executor executor) {
        boolean z;
        jri.m13152b((Object) juh);
        jri.m13152b((Object) executor);
        if (juh.m4648d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return jli.m12948b(new jkt(this.f18858a, this.f18859b, juh.m4644a(), this.f21883c, (long) (this.f21884d.mo2049a(juh.m4644a()).mo2076a() * 1000000.0f), (long) (this.f21884d.mo2049a(juh.m4647c()).mo2076a() * 1000000.0f)));
    }
}
