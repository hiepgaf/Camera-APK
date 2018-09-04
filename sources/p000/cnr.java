package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cnr */
final class cnr extends izx {
    /* renamed from: a */
    private final /* synthetic */ cnq f22707a;

    cnr(cnq cnq) {
        this.f22707a = cnq;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo3396b(Object obj, Object obj2) {
        FeatureTable featureTable = (FeatureTable) obj;
        grw grw = this.f22707a.n;
        jig jig = new jig(featureTable);
        jzr a = jig.m4507a(jza.FACE_COUNT);
        jzr a2 = jig.m4507a(jza.EXPOSURE);
        jzr a3 = jig.m4507a(jza.MOTION_SALIENCY);
        jzr a4 = jig.m4507a(jza.PERCEPTUAL_SHARPNESS);
        jzr a5 = jig.m4507a(jza.CAMERA_MOTION);
        grw.m2766a().f22409a = grw.m2764a(a);
        grw.m2766a().f22413e = grw.m2764a(a2);
        grw.m2766a().f22410b = grw.m2764a(a3);
        grw.m2766a().f22412d = grw.m2764a(a4);
        grw.m2766a().f22411c = grw.m2764a(a5);
        int assignmentCount = featureTable.getAssignmentCount(jza.FACE_COUNT);
        int assignmentCount2 = featureTable.getAssignmentCount(jza.EXPOSURE);
        int assignmentCount3 = featureTable.getAssignmentCount(jza.MOTION_SALIENCY);
        int assignmentCount4 = featureTable.getAssignmentCount(jza.PERCEPTUAL_SHARPNESS);
        ArrayList arrayList = new ArrayList();
        arrayList.add(grw.m2763a("FACE", assignmentCount));
        arrayList.add(grw.m2763a("CAMF", assignmentCount2));
        arrayList.add(grw.m2763a("MOTN", assignmentCount3));
        arrayList.add(grw.m2763a("FAST", assignmentCount4));
        grw.m2769b().f22424b = (kma[]) arrayList.toArray(new kma[0]);
    }
}
