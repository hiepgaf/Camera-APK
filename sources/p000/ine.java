package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ine */
public enum ine {
    RES_UNKNOWN(-1, -1),
    RES_QCIF(176, 144),
    RES_QVGA(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX, 240),
    RES_CIF(352, 288),
    RES_480P(720, 480),
    RES_720P(DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX, 720),
    RES_1080P(1920, 1080),
    RES_2160P(3840, 2160);
    
    /* renamed from: i */
    public static final Map f7159i = null;
    /* renamed from: j */
    private final int f7161j;
    /* renamed from: k */
    private final int f7162k;

    static {
        f7159i = new HashMap();
        ine[] values = ine.values();
        int length = values.length;
        int i;
        while (i < length) {
            ine ine = values[i];
            f7159i.put(new iqp(ine.f7161j, ine.f7162k), ine);
            i++;
        }
    }

    private ine(int i, int i2) {
        this.f7161j = i;
        this.f7162k = i2;
    }

    /* renamed from: a */
    public static Comparator m3879a() {
        return new inf();
    }

    /* renamed from: b */
    public final long m3880b() {
        return ((long) this.f7161j) * ((long) this.f7162k);
    }

    /* renamed from: c */
    public final iqp m3881c() {
        return new iqp(this.f7161j, this.f7162k);
    }
}
