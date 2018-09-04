package p000;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: ekl */
public final class ekl extends ejn {
    /* renamed from: f */
    private int f15229f = 0;
    /* renamed from: g */
    private ejs f15230g;

    public ekl() {
        try {
            this.f15230g = new ejs();
            this.f15230g.m9717b(ejd.f3654e);
            this.f3681a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f3683c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.f3682b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            float f = -5.1000004f;
            while (i3 < 35) {
                float f2 = -5.1000004f;
                int i4 = i;
                i = 0;
                int i5 = i2;
                while (i < 35) {
                    short s = (short) (i4 + 1);
                    m1794a(i4, -0.030000001f + f, f2);
                    short s2 = (short) (s + 1);
                    m1794a(s, 0.030000001f + f, f2);
                    s = (short) (s2 + 1);
                    m1794a(s2, f, -0.030000001f + f2);
                    short s3 = (short) (s + 1);
                    m1794a(s, f, 0.030000001f + f2);
                    i2 = 0;
                    while (i2 < 4) {
                        s = (short) (i5 + 1);
                        this.f3683c.put(i5, (short) (i4 + i2));
                        i2++;
                        short s4 = s;
                    }
                    i++;
                    f2 += 0.3f;
                    short s5 = s3;
                }
                i3++;
                i = i4;
                f += 0.3f;
                i2 = i5;
            }
            this.f15229f = i2;
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }

    /* renamed from: b */
    public final void mo1228b(float[] fArr) {
        GLES20.glUseProgram(this.f15230g.f3693d);
        this.f15230g.m9717b(ejd.f3654e);
        this.f15230g.m1808b(this.a);
        this.f15230g.m1806a(this.b);
        this.f15230g.m1807a(fArr);
        this.c.position(0);
        GLES20.glDrawElements(1, this.f15229f, 5123, this.c);
    }

    /* renamed from: a */
    public final void mo1227a() {
        GLES20.glDeleteProgram(this.f15230g.f3693d);
    }
}
