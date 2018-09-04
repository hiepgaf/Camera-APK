package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jnq */
public final class jnq implements jnp {
    jnq() {
    }

    /* renamed from: a */
    public static void m13000a(jms jms, jqo jqo, Executor executor) {
        jms.f7928c = false;
        jms.m4599b(jxm.class, "default").m4601a(new jqb());
        jms.m4599b(jll.class, "post_processing_executor").m4601a(new jqc(executor));
        jms.m4599b(jqo.class, "post_processing_bitmapallocator").m4601a(new jqd(jqo));
        jms.m4599b(jsb.class, "default").m4601a(new jqf());
        jms.m4599b(jsw.class, "default").m4601a(new jqg(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX));
        jms.m4599b(jjd.class, "default").m4601a(new jqh());
        jms.f7928c = true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jqu((jqo) jms.m4595a(jqo.class, "default"), (jrj) jms.m4595a(jrj.class, "med-res-acquisition-pipeline"));
    }
}
