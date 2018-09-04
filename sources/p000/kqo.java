package p000;

/* compiled from: PG */
/* renamed from: kqo */
public abstract class kqo implements kte {
    /* renamed from: d */
    public int f22461d = 0;

    /* renamed from: a */
    int mo3532a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    void mo3533a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final byte[] m16620b() {
        try {
            byte[] bArr = new byte[mo3536e()];
            krh b = krh.m13826b(bArr);
            mo3534a(b);
            b.m13849a();
            return bArr;
        } catch (Throwable e) {
            String name = getClass().getName();
            String str = "byte array";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: c */
    public final kqx mo3252c() {
        try {
            kue b = kqx.m5058b(mo3536e());
            mo3534a(b.f19314a);
            return b.m13980d();
        } catch (Throwable e) {
            String name = getClass().getName();
            String str = "ByteString";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }
}
