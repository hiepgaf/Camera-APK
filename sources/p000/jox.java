package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import java.util.List;

/* compiled from: PG */
/* renamed from: jox */
final class jox implements jnp {
    jox() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.m4595a(FeatureTable.class, "default");
        List d = ((jrg) jms.m4595a(jrg.class, "default")).m13134d();
        jri.m13143a(d.isEmpty() ^ 1);
        return MotionStabilizer.createFrom(featureTable, ((Long) d.get(0)).longValue(), ((Long) d.get(d.size() - 1)).longValue());
    }
}
