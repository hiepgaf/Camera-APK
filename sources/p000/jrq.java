package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.imageutils.GrayValuesExtractor;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.libraries.smartburst.filterpacks.face.FaceSharpnessCalculator;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.libraries.smartburst.filterpacks.face.PittPattFaceDetector;
import com.google.android.libraries.smartburst.filterpacks.image.ImageHistogramEqualization;
import com.google.android.libraries.smartburst.utils.FloatArray;
import com.google.android.vision.face.Face;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jrq */
public final class jrq implements jry {
    /* renamed from: a */
    private static final PittPattFaceDetector f18981a = new PittPattFaceDetector(true, true, true, 20, 0);
    /* renamed from: b */
    private static final GrayValuesExtractor f18982b = new GrayValuesExtractor(false);
    /* renamed from: c */
    private static final FaceSharpnessCalculator f18983c = new FaceSharpnessCalculator(false);
    /* renamed from: d */
    private final Context f18984d;

    public jrq(Context context) {
        jri.m13152b((Object) context);
        this.f18984d = context;
    }

    /* renamed from: a */
    private static float m13165a(List list, jrx jrx) {
        jri.m13152b((Object) list);
        jri.m13152b((Object) jrx);
        float f = 0.0f;
        for (Face a : list) {
            f = jrx.mo3175a(a).floatValue() + f;
        }
        if (list.isEmpty()) {
            return 0.0f;
        }
        return f / ((float) list.size());
    }

    /* renamed from: b */
    private static Pair m13166b(List list, jrx jrx) {
        jri.m13152b((Object) list);
        jri.m13143a(list.isEmpty() ^ 1);
        jri.m13152b((Object) jrx);
        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        for (Face a : list) {
            float floatValue = jrx.mo3175a(a).floatValue();
            float min = Math.min(f2, floatValue);
            f = Math.max(f, floatValue);
            f2 = min;
        }
        return Pair.create(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: a */
    public final jxa mo2043a(long j, Bitmap bitmap) {
        jri.m13152b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            jri.m13152b((Object) bitmap);
            Object a = jqk.m13076a(bitmap);
            int width = a.getWidth();
            int height = a.getHeight();
            jri.m13152b(a);
            int[] outputFrameDimensions = f18982b.getOutputFrameDimensions(a.getDimensions());
            FrameBuffer2D asFrameBuffer2D = Frame.create(FrameType.buffer2D(100), outputFrameDimensions).asFrameBuffer2D();
            f18982b.toGrayValues((FrameImage2D) a, asFrameBuffer2D);
            ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(1);
            FrameBuffer2D asFrameBuffer2D2 = Frame.create(FrameType.buffer2D(100), outputFrameDimensions).asFrameBuffer2D();
            ByteBuffer lockBytes2 = asFrameBuffer2D2.lockBytes(2);
            ImageHistogramEqualization.applyImageHistogramEqualization(lockBytes, a.getWidth(), a.getHeight(), lockBytes2);
            asFrameBuffer2D.unlock();
            asFrameBuffer2D.release();
            Object<Face> detectFaces = f18981a.detectFaces(this.f18984d, lockBytes2, a.getWidth(), a.getHeight());
            asFrameBuffer2D2.unlock();
            asFrameBuffer2D2.release();
            jxa jxa = new jxa();
            if (detectFaces.isEmpty()) {
                jxa.m4666a(jxa.f8046c, new ArrayList());
            } else {
                float computeFaceSharpness;
                jri.m13152b(a);
                jri.m13152b((Object) detectFaces);
                FloatArray floatArray = new FloatArray();
                float f = 0.0f;
                for (Face computeFaceSharpness2 : detectFaces) {
                    computeFaceSharpness = f18983c.computeFaceSharpness(a, computeFaceSharpness2);
                    floatArray.add(computeFaceSharpness);
                    f = computeFaceSharpness + f;
                }
                if (detectFaces.isEmpty()) {
                    computeFaceSharpness = 0.0f;
                } else {
                    computeFaceSharpness = f / ((float) detectFaces.size());
                }
                Pair create = Pair.create(floatArray, Float.valueOf(computeFaceSharpness));
                float a2 = jrq.m13165a((List) detectFaces, new jrr());
                float a3 = jrq.m13165a((List) detectFaces, new jrt());
                float a4 = jrq.m13165a((List) detectFaces, new jrv());
                jri.m13152b((Object) detectFaces);
                jri.m13143a(detectFaces.isEmpty() ^ 1);
                f = Float.MAX_VALUE;
                for (Face computeFaceSharpness22 : detectFaces) {
                    f = Math.min(f, Math.max(computeFaceSharpness22.getIsLeftEyeOpenScore(), computeFaceSharpness22.getIsRightEyeOpenScore()));
                }
                Pair b = jrq.m13166b(detectFaces, new jrs());
                Pair b2 = jrq.m13166b(detectFaces, new jru());
                Pair b3 = jrq.m13166b(detectFaces, new jrw());
                jri.m13152b((Object) detectFaces);
                jri.m13143a(detectFaces.isEmpty() ^ 1);
                RectF rectF = new RectF();
                for (Face computeFaceSharpness222 : detectFaces) {
                    rectF.union(FaceUtils.getFaceRect(computeFaceSharpness222, width, height));
                }
                jri.m13152b(a);
                jri.m13152b((Object) detectFaces);
                width = a.getWidth();
                height = a.getHeight();
                FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
                ArrayList arrayList = new ArrayList(detectFaces.size());
                for (Face computeFaceSharpness2222 : detectFaces) {
                    int[] iArr = new int[]{width, height};
                    int[] computeCropDimensions = ImageCropper.computeCropDimensions(iArr, FaceUtils.getFaceQuad(computeFaceSharpness2222, width, height));
                    FrameImage2D asFrameImage2D = Frame.create(image2D, computeCropDimensions).asFrameImage2D();
                    FaceUtils.cropFace(a, computeFaceSharpness2222, asFrameImage2D);
                    asFrameBuffer2D2 = Frame.create(FrameType.buffer2D(100), f18982b.getOutputFrameDimensions(computeCropDimensions)).asFrameImage2D();
                    f18982b.toGrayValues(asFrameImage2D, asFrameBuffer2D2);
                    asFrameImage2D.release();
                    ByteBuffer lockBytes3 = asFrameBuffer2D2.lockBytes(1);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lockBytes3.capacity());
                    lockBytes3.rewind();
                    allocateDirect.put(lockBytes3);
                    lockBytes3.rewind();
                    allocateDirect.flip();
                    asFrameBuffer2D2.unlock();
                    asFrameBuffer2D2.release();
                    arrayList.add(allocateDirect);
                }
                jxa.m4666a(jxa.f8046c, detectFaces).m4666a(jxa.f8047d, (FloatArray) create.first).m4666a(jxa.f8048e, (Float) create.second).m4666a(jxa.f8049f, Float.valueOf(a2)).m4666a(jxa.f8050g, Float.valueOf(f)).m4666a(jxa.f8051h, (Float) b.first).m4666a(jxa.f8052i, (Float) b.second).m4666a(jxa.f8053j, Float.valueOf(a3)).m4666a(jxa.f8054k, (Float) b2.first).m4666a(jxa.f8055l, (Float) b2.second).m4666a(jxa.f8056m, Float.valueOf(a4)).m4666a(jxa.f8057n, (Float) b3.first).m4666a(jxa.f8058o, (Float) b3.second).m4666a(jxa.f8059p, rectF).m4666a(jxa.f8065v, arrayList);
            }
            a.release();
            return jxa;
        } finally {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        return "FaceMetadataExtractor";
    }
}
