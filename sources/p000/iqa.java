package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: iqa */
public final class iqa {
    /* renamed from: a */
    public byte[] f7312a = new byte[1];
    /* renamed from: b */
    public int f7313b = 0;
    /* renamed from: c */
    public int f7314c = 0;

    /* renamed from: a */
    public final void m4029a(int i) {
        Object obj = this.f7312a;
        int length = obj.length;
        int i2 = this.f7314c;
        if (length - i2 < i) {
            int i3 = this.f7313b;
            i2 -= i3;
            int i4 = i2 + i;
            if (i4 > length || i4 <= (length >> 1)) {
                Object obj2 = new byte[i4];
                if (i2 > 0) {
                    System.arraycopy(obj, i3, obj2, 0, i2);
                }
                this.f7312a = obj2;
            } else if (i2 > 0) {
                System.arraycopy(obj, i3, obj, 0, i2);
            }
            this.f7313b = 0;
            this.f7314c = i2;
        }
    }

    /* renamed from: a */
    public final void m4030a(OutputStream outputStream, int i) {
        int i2 = this.f7313b;
        if (i2 + i <= this.f7314c) {
            outputStream.write(this.f7312a, i2, i);
            this.f7313b += i;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    /* renamed from: a */
    public final int m4028a() {
        return this.f7314c - this.f7313b;
    }

    /* renamed from: b */
    public final void m4031b(int i) {
        int i2 = this.f7313b + i;
        if (i2 <= this.f7314c) {
            this.f7313b = i2;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.f7312a.length; i++) {
            if (i == this.f7313b) {
                stringBuilder.append("{ ");
            }
            if (i == this.f7314c) {
                stringBuilder.append("} ");
            }
            if (i < this.f7312a.length) {
                stringBuilder.append(String.format("%02X ", new Object[]{Byte.valueOf(this.f7312a[i])}));
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
