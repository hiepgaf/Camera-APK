package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaRecorder;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: hsx */
public final class hsx {
    /* renamed from: a */
    public static final int[] f6598a = hsx.m3357a();
    /* renamed from: b */
    private static final SparseArray f6599b;

    static {
        SparseArray sparseArray = new SparseArray();
        f6599b = sparseArray;
        sparseArray.append(0, "com.google.android.camera.experimental2015.ExperimentalKeys");
        f6599b.append(1, "com.google.android.camera.experimental2016.ExperimentalKeys");
        f6599b.append(2, "com.google.android.camera.experimental2017.ExperimentalKeys");
    }

    /* renamed from: a */
    public static boolean m3356a(int[] iArr, int i) {
        return Arrays.binarySearch(iArr, i) >= 0;
    }

    /* renamed from: a */
    public static OutputConfiguration m3352a(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: a */
    public static void m3353a(CameraCaptureSession cameraCaptureSession, List list) {
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    /* renamed from: a */
    private static int[] m3357a() {
        int i;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        for (i = 0; i < f6599b.size(); i++) {
            try {
                Class.forName((String) f6599b.valueAt(i));
                arrayList.add(Integer.valueOf(f6599b.keyAt(i)));
            } catch (ClassNotFoundException e) {
            } catch (NoClassDefFoundError e2) {
            }
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + 1;
            i = i2 + 1;
            iArr[i3] = ((Integer) arrayList.get(i2)).intValue();
            i2 = i;
            i3 = i4;
        }
        Arrays.sort(iArr);
        return iArr;
    }

    /* renamed from: a */
    public static void m3354a(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.addSurface(surface);
    }

    /* renamed from: a */
    public static void m3355a(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.setVideoEncodingProfileLevel(i, i2);
    }
}
