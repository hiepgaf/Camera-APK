package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jfk */
public final class jfk implements ize {
    /* renamed from: a */
    public final jdi f21839a;
    /* renamed from: b */
    public final jcg[] f21840b;
    /* renamed from: c */
    public final int[] f21841c;
    /* renamed from: d */
    public final int f21842d;

    public jfk(jdi jdi, jcg[] jcgArr, int[] iArr, int i) {
        boolean z;
        if (jcgArr.length == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f21839a = jdi;
        this.f21840b = jcgArr;
        this.f21841c = iArr;
        this.f21842d = i;
    }

    /* renamed from: a */
    public final int m16253a(int i) {
        return (this.f21840b[i].mo3164a() * this.f21841c[i]) / 8;
    }

    public final void close() {
        this.f21839a.close();
    }

    /* renamed from: a */
    public final jas mo3162a() {
        return this.f21839a.mo3162a();
    }

    /* renamed from: a */
    public static jfk m16252a(jdo jdo, jfl jfl) {
        int i = 0;
        int i2 = jfl.f7762a;
        jcg[] jcgArr = new jcg[]{jfl.f7763b};
        int[] iArr = new int[]{jfl.f7764c};
        ByteBuffer order = ByteBuffer.allocateDirect(((jfl.f7763b.mo3164a() * jfl.f7764c) * i2) / 8).order(ByteOrder.nativeOrder());
        while (i < i2) {
            jfl.mo1989a(i, order);
            i++;
        }
        order.rewind();
        return new jfk(jdi.m17947a(jdo, order), jcgArr, iArr, i2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21839a);
        String arrays = Arrays.toString(this.f21840b);
        String arrays2 = Arrays.toString(this.f21841c);
        int i = this.f21842d;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 83) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append("GLVertexArray{buffer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", types=");
        stringBuilder.append(arrays);
        stringBuilder.append(", dimensions=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", count=");
        stringBuilder.append(i);
        stringBuilder.append(", isInterleaved=");
        stringBuilder.append(false);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
