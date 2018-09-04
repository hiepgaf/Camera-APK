package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ejt */
public class ejt extends ejn {
    /* renamed from: f */
    public static final String f15210f = bli.m862a("Sprite");
    /* renamed from: g */
    public Point f15211g = new Point();
    /* renamed from: h */
    public float f15212h;
    /* renamed from: i */
    public float f15213i;
    /* renamed from: j */
    public float[] f15214j = new float[16];
    /* renamed from: k */
    public int f15215k;
    /* renamed from: l */
    public boolean f15216l = false;
    /* renamed from: m */
    private float f15217m = 4.0f;
    /* renamed from: n */
    private float[] f15218n = new float[16];
    /* renamed from: o */
    private int f15219o;
    /* renamed from: p */
    private ArrayList f15220p = new ArrayList();

    /* renamed from: b */
    public final void mo1228b(float[] fArr) {
    }

    /* renamed from: a */
    public final void m9720a(float[] fArr, float f, float f2, float f3) {
        if (!this.f15216l) {
            bli.m866b(f15210f, "Sprite not initialized.");
        } else if (this.e != null) {
            GLES20.glUseProgram(this.e.f3693d);
            this.a.position(0);
            this.b.position(0);
            this.e.m1808b(this.a);
            this.e.m1806a(this.b);
            Matrix.translateM(this.f15214j, 0, fArr, 0, f, f2, 0.0f);
            Matrix.rotateM(this.f15214j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            if (f3 != 1.0f) {
                Matrix.scaleM(this.f15214j, 0, f3, f3, f3);
            }
            this.e.m1807a(this.f15214j);
            if (this.d.size() != 0) {
                ((ejo) this.d.get(0)).m1799a();
                this.c.position(0);
                GLES20.glDrawElements(4, this.f15215k, 5123, this.c);
            }
        }
    }

    /* renamed from: a */
    public final void mo1227a() {
        ArrayList arrayList = this.f15220p;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ejo ejo = (ejo) arrayList.get(i);
                if (ejo != null) {
                    ejo.m1800d();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f15220p.clear();
        }
    }

    /* renamed from: a */
    public final boolean m9721a(Context context, int i, float f) {
        int i2 = 0;
        if (!m9718a(context, i)) {
            return false;
        }
        this.f15217m = f;
        float[] fArr = new float[12];
        float f2 = this.f15212h;
        float f3 = -f2;
        fArr[0] = f3;
        float f4 = this.f15213i;
        fArr[1] = f4;
        float f5 = this.f15217m;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f4;
        fArr[5] = f5;
        fArr[6] = f2;
        f2 = -f4;
        fArr[7] = f2;
        fArr[8] = f5;
        fArr[9] = f3;
        fArr[10] = f2;
        fArr[11] = f5;
        while (i2 < 12) {
            this.a.put(i2, fArr[i2]);
            i2++;
        }
        this.f15216l = true;
        return true;
    }

    /* renamed from: a */
    private final boolean m9718a(Context context, int i) {
        ejo ejo = new ejo();
        this.d.add(0, ejo);
        this.f15220p.add(ejo);
        Options options = new Options();
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
        if (decodeResource == null) {
            return false;
        }
        this.f15211g.set(decodeResource.getWidth(), decodeResource.getHeight());
        try {
            ejo = (ejo) this.d.get(0);
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            ejo.f3688a = iArr[0];
            GLES20.glBindTexture(3553, ejo.f3688a);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, WrapAxes.f2483S, WrapModes.CLAMP_TO_EDGE);
            GLES20.glTexParameteri(3553, WrapAxes.f2484T, WrapModes.CLAMP_TO_EDGE);
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            ejp.m1801a("Texture : loadBitmap");
            decodeResource.recycle();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        decodeResource.recycle();
        this.f15215k = 6;
        this.f15219o = 4;
        this.a = ByteBuffer.allocateDirect((this.f15219o * 3) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i2 = this.f15219o;
        this.b = ByteBuffer.allocateDirect((i2 + i2) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        i2 = this.f15215k;
        this.c = ByteBuffer.allocateDirect(i2 + i2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        Point point = this.f15211g;
        this.f15212h = ((float) point.x) / 2.0f;
        this.f15213i = ((float) point.y) / 2.0f;
        float[] fArr = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        for (i2 = 0; i2 < 8; i2++) {
            this.b.put(i2, fArr[i2]);
        }
        short[] sArr = new short[]{(short) 0, (short) 1, (short) 2, (short) 0, (short) 2, (short) 3};
        for (i2 = 0; i2 < 6; i2++) {
            this.c.put(i2, sArr[i2]);
        }
        Matrix.setIdentityM(this.f15218n, 0);
        return true;
    }
}
