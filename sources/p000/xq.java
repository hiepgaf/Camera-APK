package p000;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: xq */
final class xq extends zs {
    /* renamed from: a */
    public static final aby f19682a = new aby("AndCam2AgntImp");
    /* renamed from: b */
    public final ye f19683b;
    /* renamed from: c */
    public final abq f19684c;
    /* renamed from: d */
    public final abs f19685d;
    /* renamed from: e */
    public final CameraManager f19686e;
    /* renamed from: f */
    public final MediaActionSound f19687f;
    /* renamed from: g */
    public abi f19688g;
    /* renamed from: h */
    public final List f19689h;
    /* renamed from: j */
    private final HandlerThread f19690j = new HandlerThread("Camera2 Handler Thread");
    /* renamed from: k */
    private int f19691k;

    xq(Context context) {
        this.f19690j.start();
        this.f19683b = new ye(this, this.f19690j.getLooper());
        this.f19688g = new abi(this.f19683b);
        this.f19684c = new abq();
        this.f19685d = new abs(this.f19683b, this.f19690j);
        this.f19685d.start();
        this.f19686e = (CameraManager) context.getSystemService("camera");
        this.f19687f = new MediaActionSound();
        this.f19687f.load(0);
        this.f19691k = 0;
        this.f19689h = new ArrayList();
        m14530g();
    }

    /* renamed from: a */
    public final abg mo2542a() {
        m14530g();
        return new xr(this.f19686e, (String[]) this.f19689h.toArray(new String[0]));
    }

    /* renamed from: b */
    protected final abi mo2544b() {
        return this.f19688g;
    }

    /* renamed from: c */
    protected final Handler mo2545c() {
        return this.f19683b;
    }

    /* renamed from: d */
    protected final abq mo2546d() {
        return this.f19684c;
    }

    /* renamed from: e */
    protected final abs mo2547e() {
        return this.f19685d;
    }

    /* renamed from: f */
    public final void mo2548f() {
    }

    /* renamed from: a */
    public final void mo2543a(abi abi) {
        this.f19688g = abi;
    }

    /* renamed from: g */
    private final boolean m14530g() {
        try {
            int i;
            String[] cameraIdList = this.f19686e.getCameraIdList();
            Set hashSet = new HashSet(Arrays.asList(cameraIdList));
            for (i = 0; i < this.f19689h.size(); i++) {
                if (!hashSet.contains(this.f19689h.get(i))) {
                    this.f19689h.set(i, null);
                    this.f19691k--;
                }
            }
            hashSet.removeAll(this.f19689h);
            for (Object obj : cameraIdList) {
                if (hashSet.contains(obj)) {
                    this.f19689h.add(obj);
                    this.f19691k++;
                }
            }
            return true;
        } catch (Throwable e) {
            abx.m85a(f19682a, "Could not get device listing from camera subsystem", e);
            return false;
        }
    }
}
