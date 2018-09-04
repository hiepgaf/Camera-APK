package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import java.util.List;

/* compiled from: PG */
/* renamed from: jmb */
final class jmb implements jnp {
    /* renamed from: a */
    private final /* synthetic */ GraphFactory[] f18936a;
    /* renamed from: b */
    private final /* synthetic */ MffContext f18937b;

    jmb(GraphFactory[] graphFactoryArr, MffContext mffContext) {
        this.f18936a = graphFactoryArr;
        this.f18937b = mffContext;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        jie jie = (jie) jms.m4595a(jie.class, "default");
        FeatureTable featureTable = (FeatureTable) jms.m4595a(FeatureTable.class, "default");
        List b = khb.m4885b();
        for (GraphFactory graphFactory : this.f18936a) {
            VideoFrameProvider videoFrameProvider = (VideoFrameProvider) jms.m4595a(VideoFrameProvider.class, "default");
            FilterGraph create = graphFactory.create(this.f18937b);
            create.getVariable("videoProvider").setValue(videoFrameProvider);
            create.getRunner().getFrameManager().setCacheSize(25165824);
            create.getRunner().setThreadName(graphFactory.getClass().getName().replace("GraphFactory", ""));
            List b2 = khb.m4885b();
            for (Filter filter : create.getAllFilters()) {
                if (filter instanceof jii) {
                    b2.add((jii) filter);
                }
            }
            b.add(new jij(jie.mo2008a(new jid(create, b2)), featureTable));
        }
        b.add(new jin((VideoFrameProvider) jms.m4595a(VideoFrameProvider.class, "default"), featureTable));
        return new jim(b);
    }
}
