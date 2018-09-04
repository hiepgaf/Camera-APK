package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.libraries.smartburst.filterfw.geometry.MinDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterpacks.motion.FrameWarper;
import com.google.android.libraries.smartburst.filterpacks.motion.HomographyTransform;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjy */
public final class jjy extends jip {
    /* renamed from: e */
    private static final Scaler f21867e = new MinDimensionScaler(480);
    /* renamed from: d */
    public final boolean f21868d;
    /* renamed from: f */
    private final jjf f21869f;
    /* renamed from: g */
    private final MotionStabilizer f21870g;
    /* renamed from: h */
    private final List f21871h;

    public jjy(String str, int i, long j, jjf jjf, MotionStabilizer motionStabilizer, boolean z, List list) {
        super(str, i, j);
        jri.m13152b((Object) jjf);
        jri.m13152b((Object) motionStabilizer);
        jri.m13152b((Object) list);
        jri.m13143a(list.isEmpty() ^ 1);
        this.f21869f = jjf;
        this.f21870g = motionStabilizer;
        this.f21868d = z;
        this.f21871h = ken.m13458a((Collection) list);
    }

    /* renamed from: a */
    private final List m16285a(List list) {
        int i = 0;
        List arrayList = new ArrayList();
        long longValue = ((Long) this.f21871h.get(0)).longValue();
        List list2 = this.f21871h;
        long longValue2 = ((Long) list2.get(list2.size() - 1)).longValue();
        for (Long longValue3 : list) {
            long longValue4 = longValue3.longValue();
            if (longValue4 >= longValue && longValue4 <= longValue2) {
                HomographyTransform compensationTransformForTimestamp;
                if (this.f21868d) {
                    compensationTransformForTimestamp = this.f21870g.getCompensationTransformForTimestamp(longValue4);
                } else {
                    compensationTransformForTimestamp = HomographyTransform.createIdentityHomographyTransform();
                }
                int i2 = i + 1;
                arrayList.add(new jke(longValue4, i, compensationTransformForTimestamp));
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final int m16287c() {
        List list = this.f21871h;
        return Math.max(1000, Math.min(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR, (int) ((((Long) list.get(list.size() - 1)).longValue() - ((Long) this.f21871h.get(0)).longValue()) / 1000000)));
    }

    /* renamed from: b */
    private final jwx m16286b(jrg jrg) {
        int[] scale = f21867e.scale(jrg.f18971a, jrg.f18972b);
        return new jwx(this.f18840a, "image/gif", this.f18842c, scale[0], scale[1]);
    }

    /* renamed from: a */
    public final /* synthetic */ jxn mo2016a(jrg jrg) {
        return m16286b(jrg);
    }

    /* renamed from: a */
    public final Collection mo3170a() {
        return this.f21871h;
    }

    /* renamed from: a */
    public final jaq mo2015a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        boolean z;
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) jxo);
        jri.m13152b((Object) executor);
        Iterable a = m16285a(jrg.m13134d());
        if (a.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Too few frames in segment to create a GIF.");
        int c = m16287c() / a.size();
        Object b = m16286b(jrg);
        jzp a2 = jzp.m4713a(b.f8073e, b.f8072d);
        jje jje = new jje(this.f21869f);
        OutputStream bufferedOutputStream = new BufferedOutputStream(jxo.mo427a(b), b.f8073e * b.f8072d);
        FrameWarper frameWarper = new FrameWarper(a2.f8149a, a2.f8150b);
        return jli.m12946b(jli.m12942a(a, executor, new jkf(this, jrg, a2, jqo, frameWarper)), executor, new jkd(jje, a2, c, a.size())).mo1973a(executor, new jki(bufferedOutputStream)).mo1973a(executor, ion.m3941a(b)).mo1977a(executor, new jkc(frameWarper));
    }

    /* renamed from: a */
    public final jaq mo2014a(jrg jrg, Context context, Executor executor, jqo jqo) {
        boolean z;
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) executor);
        Iterable a = m16285a(jrg.m13134d());
        if (a.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Too few frames in segment to create a GIF.");
        return jli.m12947b(a, executor, new jka(jrg, jqo)).mo1973a(executor, new jjz(context, m16287c() / a.size()));
    }
}
