package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkj */
public final class jkj extends jjq {
    /* renamed from: c */
    private final jxm f21875c;
    /* renamed from: d */
    private final jjf f21876d;
    /* renamed from: e */
    private final MotionStabilizer f21877e;

    public jkj(jxm jxm, jjf jjf, MotionStabilizer motionStabilizer) {
        this("GIF_Action", 6, jxm, jjf, motionStabilizer);
    }

    public jkj(String str, int i, jxm jxm, jjf jjf, MotionStabilizer motionStabilizer) {
        super(str, i);
        jri.m13152b((Object) jxm);
        jri.m13152b((Object) jjf);
        jri.m13152b((Object) motionStabilizer);
        this.f21875c = jxm;
        this.f21876d = jjf;
        this.f21877e = motionStabilizer;
    }

    /* renamed from: a */
    public final jaq mo2013a(juh juh, Executor executor) {
        boolean z;
        boolean booleanValue;
        jri.m13152b((Object) juh);
        jri.m13152b((Object) executor);
        if (juh.m4648d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Cannot create GIF from an empty stack.");
        ken a = ken.m13458a(juh.f7984a);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Object obj = a.get(i);
            i++;
            jxa a2 = this.f21875c.m4672a(((Long) obj).longValue());
            if (a2.m4668b(jxa.f8062s)) {
                booleanValue = ((Boolean) a2.m4665a(jxa.f8062s)).booleanValue() ^ 1;
                break;
            }
        }
        booleanValue = false;
        return jli.m12948b(new jjy(this.f18858a, this.f18859b, juh.m4647c(), this.f21876d, this.f21877e, booleanValue, ken.m13458a(juh.f7984a)));
    }
}
