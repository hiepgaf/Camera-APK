package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: jet */
public final class jet extends jfa {
    /* renamed from: a */
    public final jfj f23558a;
    /* renamed from: b */
    public final int f23559b;
    /* renamed from: c */
    public int f23560c = 0;
    /* renamed from: d */
    public int f23561d = 0;
    /* renamed from: f */
    private final int f23562f;

    jet(jfj jfj, int i, int i2, int i3) {
        super(i);
        this.f23558a = jfj;
        this.f23559b = i2;
        this.f23562f = i3;
    }

    /* renamed from: b */
    public final void m17961b() {
        if (jeh.m4430a(this.f23562f) != this.e) {
            GLES20.glBindBuffer(this.f23559b, this.e);
        }
    }

    public final void close() {
        int a = jeh.m4430a(this.f23562f);
        if (!(a == 0 || a == this.e)) {
            GLES20.glBindBuffer(this.f23559b, 0);
        }
        GLES20.glDeleteBuffers(1, new int[]{this.e}, 0);
    }

    public final String toString() {
        int i = this.f23395e;
        int i2 = this.f23559b;
        int i3 = this.f23562f;
        StringBuilder stringBuilder = new StringBuilder(78);
        stringBuilder.append("GLRawBuffer{handle=");
        stringBuilder.append(i);
        stringBuilder.append(", target=");
        stringBuilder.append(i2);
        stringBuilder.append(", bindingGetter=");
        stringBuilder.append(i3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
