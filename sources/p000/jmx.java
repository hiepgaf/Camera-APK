package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import java.io.File;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: jmx */
public final class jmx implements jnp {
    /* renamed from: a */
    private final /* synthetic */ VideoFrameProvider f18945a;

    private jmx(VideoFrameProvider videoFrameProvider) {
        this.f18945a = videoFrameProvider;
    }

    /* renamed from: a */
    public static void m12980a(jms jms, MffContext mffContext, jmr jmr, GraphFactory[] graphFactoryArr, VideoFrameProvider videoFrameProvider, kpk kpk, jqo jqo, EnumSet enumSet) {
        jms.f7928c = false;
        jms.m4599b(VideoFrameProvider.class, "default").m4601a(new jmx(videoFrameProvider));
        jms.m4599b(jsh.class, "low-res-acquisition-pipeline").m4601a(new jmg());
        jms.m4599b(jsh.class, "med-res-acquisition-pipeline").m4601a(new jmj(jmr));
        jms.m4599b(jsh.class, "empty-acquisition-pipeline").m4601a(new jmk());
        jms.m4599b(jsi.class, "low-res-acquisition-pipeline").m4601a(new jmm(mffContext));
        jms.m4599b(jsi.class, "med-res-acquisition-pipeline").m4601a(new jmn(mffContext));
        jms.m4599b(jlb.class, "low-res-acquisition-pipeline").m4601a(new jmo());
        jms.m4599b(jla.class, "med-res-acquisition-pipeline").m4601a(new jmp());
        jms.m4599b(jqu.class, "low-res-acquisition-pipeline").m4601a(new jmq());
        jms.m4599b(jqu.class, "med-res-acquisition-pipeline").m4601a(new jnq());
        jms.m4599b(jqo.class, "default").m4601a(new jlx(jqo));
        jms.m4599b(jsh.class, "default").m4601a(new jly(mffContext));
        jms.m4599b(jrb.class, "default").m4601a(new jlz(kpk));
        jms.m4599b(jie.class, "default").m4601a(new jma());
        jms.m4599b(jif.class, "default").m4601a(new jmb(graphFactoryArr, mffContext));
        jms.m4599b(jsl.class, "default").m4601a(new jmc());
        jms.m4599b(jrj.class, "default").m4601a(new jmd());
        jms.m4599b(jrj.class, "low-res-acquisition-pipeline").m4601a(new jme());
        jms.m4599b(jrj.class, "med-res-acquisition-pipeline").m4601a(new jmf());
        jms.m4599b(FeatureTable.class, "default").m4601a(new jmh(enumSet));
        jms.m4599b(File.class, "session-directory").m4601a(new jmi(kpk));
        jms.f7928c = true;
    }

    /* renamed from: b */
    public static void m12981b(jms jms) {
        jms.f7928c = false;
        jms.m4599b(jvt.class, "default").m4601a(new jmy());
        jms.m4599b(jtv.class, "auc_sharpness").m4601a(new jnh());
        jms.m4599b(jtv.class, "auc_motion_saliency").m4601a(new jni());
        jms.m4599b(jtv.class, "auc_quality").m4601a(new jnj());
        jms.m4599b(jtv.class, "camera_motion_score").m4601a(new jnk());
        jms.m4599b(jtv.class, "combined_eyes").m4601a(new jnl());
        jms.m4599b(jwa.class, "FeatureWaitingFrameDropper").m4601a(new jnm());
        jms.m4599b(jwa.class, "FixedFrameRateSavingFrameDropper").m4601a(new jnn());
        jms.m4599b(jwa.class, "InOrderTimestampFrameDropper").m4601a(new jno());
        jms.m4599b(jvx.class, "default").m4601a(new jmz());
        jms.m4599b(jwa.class, "default").m4601a(new jna());
        jms.m4599b(jwa.class, "med-res-acquisition-pipeline").m4601a(new jnb());
        jms.m4599b(jtv.class, "med-res-acquisition-pipeline").m4601a(new jnc());
        jms.f7928c = true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return this.f18945a;
    }
}
