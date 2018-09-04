package p000;

import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gdw */
public final class gdw implements fow {
    /* renamed from: a */
    public static final String f16836a = bli.m862a("PostProcImgSvr");
    /* renamed from: b */
    private final Executor f16837b;
    /* renamed from: c */
    private final InterleavedReadViewU8 f16838c;
    /* renamed from: d */
    private final GoudaRequest f16839d;

    public gdw(Executor executor, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest) {
        this.f16837b = (Executor) jri.m13152b((Object) executor);
        this.f16838c = (InterleavedReadViewU8) jri.m13152b((Object) interleavedReadViewU8);
        this.f16839d = (GoudaRequest) jri.m13152b((Object) goudaRequest);
    }

    /* renamed from: a */
    public final kpk mo568a() {
        kpk d = kpw.m18056d();
        this.f16837b.execute(new gdx(this.f16838c, d, this.f16839d.getOutput_width(), this.f16839d.getOutput_height(), this.f16839d.getPost_resample_sharpening()));
        return d;
    }

    /* renamed from: b */
    public final kpk mo569b() {
        return kow.m13618a(new isr("Image couldn't be upsampled."));
    }
}
