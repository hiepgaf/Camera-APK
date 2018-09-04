package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iyp */
public final class iyp extends kvf {
    /* renamed from: a */
    private int f21822a;
    /* renamed from: b */
    private int f21823b;
    /* renamed from: c */
    private byte[] f21824c;

    public iyp() {
        this.f21822a = 0;
        this.f21823b = 0;
        this.f21824c = kvn.f8666i;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f21822a;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        i = this.f21823b;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(2, i);
        }
        if (Arrays.equals(this.f21824c, kvn.f8666i)) {
            return computeSerializedSize;
        }
        byte[] bArr = this.f21824c;
        int b = kvd.m5423b(24);
        i = bArr.length;
        return computeSerializedSize + ((i + kvd.m5423b(i)) + b);
    }

    public final /* synthetic */ kvl mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.f21822a = kvc.m5410f();
                    continue;
                case 16:
                    this.f21823b = kvc.m5410f();
                    continue;
                case 26:
                    int f = kvc.m5410f();
                    if (f < 0) {
                        throw kvk.m5455b();
                    }
                    byte[] bArr;
                    if (f == 0) {
                        bArr = kvn.f8666i;
                    } else {
                        i = kvc.f8635b;
                        int i2 = kvc.f8636c;
                        if (f > i - i2) {
                            throw kvk.m5456c();
                        }
                        bArr = new byte[f];
                        System.arraycopy(kvc.f8634a, i2, bArr, 0, f);
                        kvc.f8636c = f + kvc.f8636c;
                    }
                    this.f21824c = bArr;
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void writeTo(kvd kvd) {
        int i = this.f21822a;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        i = this.f21823b;
        if (i != 0) {
            kvd.m5431b(2, i);
        }
        if (!Arrays.equals(this.f21824c, kvn.f8666i)) {
            byte[] bArr = this.f21824c;
            kvd.m5436c(3, 2);
            kvd.m5439e(bArr.length);
            kvd.m5430a(bArr);
        }
        super.writeTo(kvd);
    }
}
