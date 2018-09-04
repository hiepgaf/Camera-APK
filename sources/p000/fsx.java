package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fsx */
public final class fsx {
    /* renamed from: a */
    public final fta f4704a;
    /* renamed from: b */
    private final ffc f4705b;
    /* renamed from: c */
    private final fsm f4706c;

    public fsx(ffc ffc, fta fta, fsm fsm) {
        this.f4705b = ffc;
        this.f4704a = fta;
        this.f4706c = fsm;
    }

    /* renamed from: a */
    public final boolean m2371a() {
        Key key = CaptureResult.EDGE_MODE;
        Integer valueOf = Integer.valueOf(0);
        Object valueOf2 = Integer.valueOf(1);
        Object valueOf3 = Integer.valueOf(2);
        return m2372a(key, valueOf, keu.m13473a(valueOf2, valueOf3), keu.m13472a(valueOf3));
    }

    /* renamed from: b */
    public final boolean m2375b() {
        return this.f4704a.m2379a().m2382a(CaptureResult.FLASH_STATE, Integer.valueOf(3), Integer.valueOf(4)) ^ 1;
    }

    /* renamed from: c */
    public final boolean m2376c() {
        return this.f4704a.m2379a().m2382a(CaptureResult.CONTROL_AF_STATE, Integer.valueOf(2), Integer.valueOf(6), Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(5));
    }

    /* renamed from: d */
    public final boolean m2377d() {
        if (this.f4706c.f4686b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m2378e() {
        Key key = CaptureResult.NOISE_REDUCTION_MODE;
        Integer valueOf = Integer.valueOf(0);
        Object valueOf2 = Integer.valueOf(2);
        return m2372a(key, valueOf, keu.m13473a(valueOf2, Integer.valueOf(1)), keu.m13472a(valueOf2));
    }

    /* renamed from: a */
    final boolean m2372a(Key key, Object obj, Set set, Set set2) {
        int i;
        boolean z;
        fta fta = this.f4704a;
        if (fta.m2380b().f4708a.size() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        i ^= 1;
        if (i != 0) {
            z = false;
        } else if (fta.m2379a().m2382a(key, set.toArray())) {
            z = true;
        } else {
            z = false;
        }
        boolean z2;
        if (i == 0) {
            z2 = false;
        } else if (!fta.m2379a().m2381a(key, obj)) {
            z2 = false;
        } else if (fta.m2380b().m2382a(key, set2.toArray())) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3;
        if (i == 0) {
            z3 = false;
        } else if (!fta.m2379a().m2382a(key, set.toArray())) {
            z3 = false;
        } else if (fta.m2380b().m2381a(key, obj)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || r3 || r2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m2373a(fss... fssArr) {
        return Arrays.asList(fssArr).contains(this.f4706c.f4685a);
    }

    /* renamed from: a */
    public final boolean m2374a(Integer... numArr) {
        return Arrays.asList(numArr).contains(this.f4705b.mo1913a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }
}
