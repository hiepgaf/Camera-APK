package p000;

import java.lang.reflect.Array;

/* compiled from: PG */
/* renamed from: jpc */
final class jpc implements jnp {
    jpc() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        jiv[] jivArr = (jiv[]) jms.m4595a(jiv[].class, "cropping_layouts");
        jiv[] jivArr2 = (jiv[]) jms.m4595a(jiv[].class, "noncropping_layouts");
        int length = jivArr.length;
        int length2 = jivArr2.length;
        Object[] objArr = (Object[]) Array.newInstance(jiv.class, length + length2);
        System.arraycopy(jivArr, 0, objArr, 0, length);
        System.arraycopy(jivArr2, 0, objArr, length, length2);
        return (jiv[]) objArr;
    }
}
