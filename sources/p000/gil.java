package p000;

import android.annotation.TargetApi;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gil */
public final class gil {
    /* renamed from: a */
    public final ExecutorService f5246a = Executors.newSingleThreadExecutor(iel.m3721c("image-saver", 0));
    /* renamed from: b */
    public final gin f5247b;
    /* renamed from: c */
    public final hju f5248c;
    /* renamed from: d */
    public ByteBuffer f5249d;

    public gil(gij gij, gin gin, hju hju) {
        this.f5247b = gin;
        this.f5248c = hju;
    }

    /* renamed from: a */
    static iwp m2566a(gfw gfw) {
        kpk kpk = gfw.f5151d;
        if (kpk == null) {
            return null;
        }
        try {
            return (iwp) kpk.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return null;
        } catch (ExecutionException e2) {
            return null;
        } catch (TimeoutException e3) {
            return null;
        }
    }

    /* renamed from: b */
    static int m2567b(gfw gfw) {
        return (gfw.f5153f.width() * 3) * gfw.f5153f.height();
    }
}
