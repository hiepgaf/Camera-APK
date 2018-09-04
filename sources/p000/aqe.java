package p000;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import java.io.FileDescriptor;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: aqe */
public final class aqe {
    aqe() {
    }

    /* renamed from: a */
    public static void m588a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static String m586a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static Collection m587a(Collection collection) {
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public static Object m585a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static Bitmap m578a(FileDescriptor fileDescriptor, int i) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(fileDescriptor);
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1);
            try {
                mediaMetadataRetriever.release();
            } catch (RuntimeException e) {
            }
        } catch (IllegalArgumentException e2) {
            try {
                mediaMetadataRetriever.release();
                frameAtTime = null;
            } catch (RuntimeException e3) {
                frameAtTime = null;
            }
        } catch (RuntimeException e4) {
            try {
                mediaMetadataRetriever.release();
                frameAtTime = null;
            } catch (RuntimeException e5) {
                frameAtTime = null;
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (RuntimeException e6) {
            }
            throw th;
        }
        if (frameAtTime == null) {
            return null;
        }
        int width = frameAtTime.getWidth();
        int height = frameAtTime.getHeight();
        if (width <= i) {
            return frameAtTime;
        }
        float f = (float) width;
        float f2 = ((float) i) / f;
        return Bitmap.createScaledBitmap(frameAtTime, Math.round(f * f2), Math.round(((float) height) * f2), true);
    }

    /* renamed from: a */
    public static azw m579a(String str, azw azw) {
        for (String parseFloat : str.split("\\|")) {
            try {
                azw.mo410a(Float.parseFloat(parseFloat));
            } catch (NumberFormatException e) {
            }
        }
        return azw;
    }

    /* renamed from: a */
    public static ijk m582a(ijk ijk) {
        return new bbc(ijk);
    }

    /* renamed from: a */
    public static ijk m583a(Runnable runnable) {
        return new bbb(runnable);
    }

    /* renamed from: a */
    public static iqo m584a(bbi bbi) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Runnable bbl = new bbl(bbi, countDownLatch);
            bbi.mo2655a(bbl, khx.m4940a());
            bbl.run();
            countDownLatch.await();
            Throwable a = bbi.mo2654a();
            if (a != null) {
                throw new ExecutionException(a);
            }
            iqo iqo = (iqo) jri.m13152b(bbi.mo2657c());
            return iqo;
        } finally {
            bbi.close();
        }
    }

    /* renamed from: a */
    public static bbi m581a(Throwable th) {
        bbi d = bcp.m14749d();
        d.m14754a(th);
        return d;
    }

    /* renamed from: a */
    public static bbi m580a(bbi bbi, kaw kaw) {
        bbi d = bcp.m14749d();
        bbi.mo2655a(new bbm(bbi, d, kaw), khx.m4940a());
        return new bbn(d, bbi);
    }
}
