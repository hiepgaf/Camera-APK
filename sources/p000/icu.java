package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.widget.ImageView;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.FocusSettings;
import com.google.android.apps.refocus.processing.ProgressListener;
import com.google.android.apps.refocus.viewer.RGBZViewer$RenderProgress;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: icu */
public final class icu implements hsp, hsw, ied {
    /* renamed from: a */
    public boolean f18193a;
    /* renamed from: b */
    public Map f18194b;
    /* renamed from: c */
    public ConnectionResult f18195c;
    /* renamed from: d */
    public final Context f18196d;
    /* renamed from: e */
    public final bkw f18197e;
    /* renamed from: f */
    public ImageView f18198f;
    /* renamed from: g */
    public Bitmap f18199g;
    /* renamed from: h */
    public DepthOfFieldOptions f18200h;
    /* renamed from: i */
    public Bitmap f18201i;
    /* renamed from: j */
    public RGBZViewer$RenderProgress f18202j;
    /* renamed from: k */
    public hsk f18203k;
    /* renamed from: l */
    public float f18204l;
    /* renamed from: m */
    public FocusSettings f18205m;
    /* renamed from: n */
    public boolean f18206n;
    /* renamed from: o */
    public ProgressListener f18207o;
    /* renamed from: p */
    public CountDownLatch f18208p;
    /* renamed from: q */
    private final Handler f18209q;

    public icu() {
        ArrayList arrayList = new ArrayList();
    }

    /* renamed from: f */
    private final boolean m12100f() {
        boolean z = false;
        Lock lock = null;
        lock.lock();
        try {
            if (this.f18194b == null && this.f18193a) {
                z = true;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            lock.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo1808a() {
        mo1812b();
        while (m12100f()) {
            Condition condition = null;
            try {
                condition.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo1814d()) {
            return ConnectionResult.f20457a;
        }
        ConnectionResult connectionResult = this.f18195c;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: a */
    public final void mo1810a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: c */
    public final void mo1813c() {
        Lock lock = null;
        lock.lock();
        try {
            this.f18193a = false;
            this.f18194b = null;
            this.f18195c = null;
            while (true) {
                Queue queue = null;
                if (queue.isEmpty()) {
                    break;
                }
                queue = null;
                ich ich = (ich) queue.remove();
                ich.m12067a(null);
                ich.m12064a();
            }
            Condition condition = null;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo1814d() {
        boolean z = false;
        Lock lock = null;
        lock.lock();
        try {
            if (this.f18194b != null && this.f18195c == null) {
                z = true;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            lock.unlock();
        }
    }

    public icu(Context context, Handler handler, bkw bkw) {
        this.f18196d = context;
        this.f18209q = handler;
        this.f18197e = bkw;
    }

    /* renamed from: b */
    public final void mo1812b() {
        Lock lock = null;
        lock.lock();
        try {
            if (this.f18193a) {
                lock.unlock();
                return;
            }
            ifv ifv;
            this.f18193a = true;
            this.f18194b = null;
            this.f18195c = null;
            idv idv = null;
            idv.m3695b();
            Map map = null;
            Iterable<hva> values = map.values();
            ice ice = new ice(values);
            for (hva hva : values) {
                ief ief = (ief) null.f6952g.get(hva.f6701b);
                if (ief != null) {
                    if (!ief.m16046b()) {
                    }
                }
                Handler handler = null.f6953h;
                handler.sendMessage(handler.obtainMessage(2, ice));
                ifv = ice.f6927b.f6990a;
            }
            ice.f6927b.m3735a();
            ifv = ice.f6927b.f6990a;
            ifv.mo1855a(new hzz(null), new icv(this));
        } finally {
            lock.unlock();
        }
    }

    public final float B_() {
        m12101g();
        return this.f18204l / 0.016f;
    }

    public final float[] C_() {
        m12101g();
        Bitmap bitmap = this.f18199g;
        if (bitmap == null) {
            return null;
        }
        DepthOfFieldOptions depthOfFieldOptions = this.f18200h;
        if (depthOfFieldOptions != null) {
            RGBZ rgbz = depthOfFieldOptions.rgbz;
            if (rgbz != null) {
                FocusSettings focusSettings = this.f18205m;
                if (focusSettings != null) {
                    float width = focusSettings.focalPointX * ((float) rgbz.getWidth());
                    float height = this.f18205m.focalPointY * ((float) this.f18200h.rgbz.getHeight());
                    RGBZ rgbz2 = this.f18200h.rgbz;
                    return m12099a((width * ((float) this.f18199g.getWidth())) / ((float) rgbz2.getWidth()), (height * ((float) this.f18199g.getHeight())) / ((float) rgbz2.getHeight()));
                }
            }
        }
        return m12099a(((float) bitmap.getWidth()) * 0.5f, ((float) this.f18199g.getHeight()) * 0.5f);
    }

    /* renamed from: a */
    private final float[] m12099a(float f, float f2) {
        float[] fArr = new float[]{f, f2};
        new Matrix(this.f18198f.getImageMatrix()).mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    public final void mo1822a(float f) {
        float f2 = 0.016f * f;
        hsk hsk = this.f18203k;
        if (hsk != null) {
            this.f18204l = f2;
            FocusSettings focusSettings = this.f18205m;
            focusSettings.blurAtInfinity = hsk.m3346a(focusSettings.focalDistance, focusSettings.depthOfField, this.f18204l);
            m12113e();
        }
    }

    /* renamed from: a */
    public final void mo1823a(int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        m12101g();
        DepthOfFieldOptions depthOfFieldOptions = this.f18200h;
        if (depthOfFieldOptions != null) {
            RGBZ rgbz = depthOfFieldOptions.rgbz;
            if (rgbz != null && rgbz.hasDepthmap() && this.f18199g != null) {
                rgbz = this.f18200h.rgbz;
                Matrix matrix = new Matrix();
                this.f18198f.getImageMatrix().invert(matrix);
                matrix.postScale(((float) rgbz.getWidth()) / ((float) this.f18199g.getWidth()), ((float) rgbz.getHeight()) / ((float) this.f18199g.getHeight()));
                float[] fArr = new float[]{f, f2};
                matrix.mapPoints(fArr);
                RGBZ rgbz2 = this.f18200h.rgbz;
                f2 = fArr[0];
                if (f2 >= 0.0f && f2 < ((float) rgbz2.getWidth())) {
                    f2 = fArr[1];
                    if (f2 >= 0.0f && f2 < ((float) rgbz2.getHeight())) {
                        this.f18205m.focalDistance = rgbz2.getDepth((int) fArr[0], (int) fArr[1]);
                        this.f18205m.focalPointX = fArr[0] / ((float) rgbz2.getWidth());
                        this.f18205m.focalPointY = fArr[1] / ((float) rgbz2.getHeight());
                        FocusSettings focusSettings = this.f18205m;
                        focusSettings.blurAtInfinity = this.f18203k.m3346a(focusSettings.focalDistance, focusSettings.depthOfField, this.f18204l);
                        m12113e();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1824a(Bitmap bitmap) {
        if (bitmap != null) {
            m12110b(bitmap);
        }
        this.f18207o.onDone();
    }

    /* renamed from: e */
    public final void m12113e() {
        DepthOfFieldOptions depthOfFieldOptions = this.f18200h;
        if (depthOfFieldOptions != null && depthOfFieldOptions.rgbz != null) {
            this.f18206n = true;
            RGBZViewer$RenderProgress rGBZViewer$RenderProgress = this.f18202j;
            if (rGBZViewer$RenderProgress != null) {
                rGBZViewer$RenderProgress.cancel();
            }
            depthOfFieldOptions = this.f18200h;
            FocusSettings focusSettings = this.f18205m;
            depthOfFieldOptions.focalDepth = focusSettings.focalDistance;
            depthOfFieldOptions.blurInfinity = focusSettings.blurAtInfinity * ((float) Math.max(depthOfFieldOptions.rgbz.getWidth(), this.f18200h.rgbz.getHeight()));
            this.f18200h.depthOfField = this.f18205m.depthOfField;
            this.f18202j = new RGBZViewer$RenderProgress();
            this.f18209q.removeCallbacks(null);
            this.f18209q.post(new hsu(this.f18196d, this.f18200h, this, this.f18202j, this.f18201i));
        }
    }

    /* renamed from: b */
    public final void m12110b(Bitmap bitmap) {
        this.f18199g = bitmap;
        ImageView imageView = this.f18198f;
        if (imageView != null) {
            imageView.setImageBitmap(this.f18199g);
        }
    }

    /* renamed from: g */
    private final void m12101g() {
        try {
            this.f18208p.await();
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final ich mo1809a(ich ich) {
        Queue queue = null;
        if (mo1814d()) {
            queue.f18266g.m3596a(ich);
            return ((ict) queue.get(ich.f21699e)).m3498a(0, ich);
        }
        queue.add(ich);
        return ich;
    }

    /* renamed from: b */
    public final ich mo1811b(ich ich) {
        Object obj = null;
        hum hum = ich.f21699e;
        obj.f18266g.m3596a(ich);
        return ((ict) obj.get(hum)).m3498a(1, ich);
    }
}
