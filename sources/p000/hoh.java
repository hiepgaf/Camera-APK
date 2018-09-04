package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.gms.wearable.Asset;

/* compiled from: PG */
/* renamed from: hoh */
final class hoh extends aqq {
    /* renamed from: a */
    private final /* synthetic */ hod f23491a;

    hoh(hod hod) {
        this.f23491a = hod;
        super(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo3364a(Object obj, ara ara) {
        byte[] bArr = (byte[]) obj;
        try {
            hod hod = this.f23491a;
            Asset a = Asset.m15121a(bArr);
            igo a2 = igo.m3744a("/camera_packet");
            if (a != null) {
                a2.f7001b.f6999a.put("postview_thumbnail", a);
            }
            hod.m15911a(a2, null);
        } catch (Throwable e) {
            bli.m867b(hod.f21599a, "error setting thumbnail data item", e);
        }
    }
}
