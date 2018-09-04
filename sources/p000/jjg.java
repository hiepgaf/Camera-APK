package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor.Builder;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.vision.face.Face;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjg */
public final class jjg extends jip {
    /* renamed from: d */
    private final Map f21853d;
    /* renamed from: e */
    private final jzp f21854e;
    /* renamed from: f */
    private final ByteBuffer f21855f;

    public jjg(String str, int i, long j, Map map, jzp jzp, ByteBuffer byteBuffer) {
        boolean z = false;
        super(str, i, j);
        jri.m13152b((Object) map);
        jri.m13152b((Object) jzp);
        if (jzp.f8149a > 0 && jzp.f8150b > 0) {
            z = true;
        }
        jri.m13143a(z);
        jri.m13152b((Object) byteBuffer);
        this.f21853d = kes.m4806a(map);
        this.f21854e = jzp;
        this.f21855f = byteBuffer;
    }

    /* renamed from: c */
    private final jwx m16270c(jrg jrg) {
        return new jwx(this.f18840a, GDepthUtil.MIME_JPEG, this.f18842c, jrg.f18971a, jrg.f18972b);
    }

    /* renamed from: a */
    public final /* synthetic */ jxn mo2016a(jrg jrg) {
        return m16270c(jrg);
    }

    /* renamed from: b */
    final float m16275b(jrg jrg) {
        return ((float) jrg.f18971a) / ((float) this.f21854e.f8149a);
    }

    /* renamed from: a */
    public final Collection mo3170a() {
        return this.f21853d.keySet();
    }

    /* renamed from: a */
    public final jaq mo2015a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) jxo);
        jri.m13152b((Object) executor);
        return m16269a(jrg, executor, jqo).mo1973a(executor, jkm.m12896a(jxo, m16270c(jrg)));
    }

    /* renamed from: a */
    private final jaq m16269a(jrg jrg, Executor executor, jqo jqo) {
        int i;
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) executor);
        Iterable arrayList = new ArrayList();
        float b = m16275b(jrg);
        for (Entry entry : this.f21853d.entrySet()) {
            int i2;
            long longValue = ((Long) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            if (!(list == null || list.isEmpty())) {
                List arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                i = 0;
                for (i2 = 0; i2 < list.size(); i2++) {
                    Face face = (Face) list.get(i2);
                    if (FaceUtils.hasAllLandmarks(face) && FaceUtils.hasAllProbabilities(face)) {
                        Rect scaledBoundingBox = FaceUtils.getScaledBoundingBox(face, b);
                        if (scaledBoundingBox.intersect(0, 0, jrg.f18971a - 1, jrg.f18972b - 1)) {
                            Rect rect = new Rect(i, 0, scaledBoundingBox.width() + i, scaledBoundingBox.height());
                            i += scaledBoundingBox.width();
                            arrayList2.add(face);
                            arrayList3.add(Pair.create(scaledBoundingBox, rect));
                        }
                    }
                }
                arrayList.add(new jjl(longValue, arrayList3, arrayList2));
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < arrayList.size()) {
            i2 = 0;
            i = 0;
            for (Pair pair : ((jjl) arrayList.get(i3)).f7884b) {
                int width = ((Rect) pair.second).width() + i;
                i2 = Math.max(i2, ((Rect) pair.second).height());
                i = width;
            }
            i = Math.max(i5, i);
            i3++;
            i4 = Math.max(i4, i2);
            i5 = i;
        }
        jzp a = jzp.m4713a(i5, i4);
        FaceEditor build = new Builder().setFrameDimensions(a.f8149a, a.f8150b).setPittPattAsDetector(this.f21855f).setAllSmilesAsOutput().build();
        return jli.m12947b(arrayList, executor, new jjh(this, jrg, jqo, build, a)).mo1973a(executor, new jjk(jqo, build)).mo1975a(executor, new jjm(jrg, jqo, arrayList)).mo1977a(executor, new jjj(build));
    }

    /* renamed from: a */
    public final jaq mo2014a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return m16269a(jrg, executor, jqo).mo1973a(executor, jkm.m12895a(jqo, context));
    }
}
