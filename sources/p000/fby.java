package p000;

/* compiled from: PG */
/* renamed from: fby */
public final class fby {
    /* renamed from: a */
    private gie f4465a;
    /* renamed from: b */
    private gif f4466b;

    fby(byte b) {
        this();
    }

    /* renamed from: a */
    public final fby m2237a(gie gie) {
        if (gie == null) {
            throw new NullPointerException("Null aeMode");
        }
        this.f4465a = gie;
        return this;
    }

    /* renamed from: a */
    public final fby m2238a(gif gif) {
        if (gif == null) {
            throw new NullPointerException("Null aeState");
        }
        this.f4466b = gif;
        return this;
    }

    /* renamed from: a */
    public final fbx m2236a() {
        String str = "";
        if (this.f4465a == null) {
            str = String.valueOf(str).concat(" aeMode");
        }
        if (this.f4466b == null) {
            str = String.valueOf(str).concat(" aeState");
        }
        if (str.isEmpty()) {
            return new fda(this.f4465a, this.f4466b);
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
