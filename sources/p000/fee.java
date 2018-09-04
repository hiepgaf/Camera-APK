package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: fee */
final class fee implements iqt {
    /* renamed from: a */
    private final kpw f15909a = kpw.m18056d();
    /* renamed from: b */
    private int f15910b;

    public fee(int i) {
        this.f15910b = i;
    }

    /* renamed from: a */
    public final void m10268a() {
        if (!this.f15909a.isDone()) {
            this.f15909a.m17780a(new InterruptedException("FlashStateResult cancelled"));
        }
    }

    /* renamed from: b */
    public final boolean m10270b() {
        try {
            return ((Boolean) this.f15909a.get()).booleanValue();
        } catch (ExecutionException e) {
            throw new InterruptedException(e.getMessage());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        iwp iwp = (iwp) obj;
        if (iwp.mo3143a(CaptureResult.FLASH_STATE) != null && ((Integer) iwp.mo3143a(CaptureResult.FLASH_STATE)).intValue() == this.f15910b) {
            this.f15909a.mo3557a(Boolean.valueOf(true));
        }
    }
}
