package p000;

/* renamed from: hyk */
public final class hyk {
    /* renamed from: a */
    private long f6825a;

    public hyk() {
        this((byte) 0);
    }

    private hyk(byte b) {
        this.f6825a = -1;
    }

    /* renamed from: a */
    public final hyk m3587a() {
        if (this.f6825a == -1) {
            System.nanoTime();
        } else {
            this.f6825a = -1;
        }
        return this;
    }
}
