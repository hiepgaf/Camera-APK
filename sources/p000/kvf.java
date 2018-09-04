package p000;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kvf */
public abstract class kvf extends kvl {
    public kvh unknownFieldData;

    public kvf clone() {
        kvf kvf = (kvf) super.clone();
        kvj.m5453a(this, kvf);
        return kvf;
    }

    public int computeSerializedSize() {
        int i = 0;
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.unknownFieldData.m5445b()) {
            i2 += this.unknownFieldData.m5446b(i).m5452b();
            i++;
        }
        return i2;
    }

    protected int computeSerializedSizeAsMessageSet() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.unknownFieldData.m5445b()) {
            kvi b = this.unknownFieldData.m5446b(i);
            if (b.f8652b == null) {
                int i3 = 0;
                for (kvm kvm : b.f8653c) {
                    int i4 = kvm.f8656a;
                    byte[] bArr = kvm.f8657b;
                    int b2 = kvd.m5423b(8);
                    i3 = (bArr.length + (((kvd.m5423b(i4) + kvd.m5423b(16)) + (b2 + b2)) + kvd.m5423b(24))) + i3;
                }
                i2 += i3;
                i++;
            } else {
                throw new NoSuchMethodError();
            }
        }
        return i2;
    }

    public final Object getExtension(kvg kvg) {
        kvh kvh = this.unknownFieldData;
        if (kvh == null) {
            return null;
        }
        kvi c = kvh.m5447c(kvg.f8645b >>> 3);
        if (c == null) {
            return null;
        }
        if (c.f8652b == null) {
            c.f8651a = kvg;
            throw new NoSuchMethodError();
        } else if (c.f8651a.equals(kvg)) {
            return c.f8652b;
        } else {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
    }

    public final kvh getUnknownFieldArray() {
        return this.unknownFieldData;
    }

    public final boolean hasExtension(kvg kvg) {
        kvh kvh = this.unknownFieldData;
        if (kvh == null || kvh.m5447c(kvg.f8645b >>> 3) == null) {
            return false;
        }
        return true;
    }

    public final kvf setExtension(kvg kvg, Object obj) {
        kvi kvi = null;
        int i = kvg.f8645b >>> 3;
        kvh kvh;
        if (obj == null) {
            kvh = this.unknownFieldData;
            if (kvh != null) {
                i = kvh.m5442a(i);
                if (i >= 0 && kvh.f8648c[i] != kvh.f8646a) {
                    kvh.f8648c[i] = kvh.f8646a;
                    kvh.f8647b = true;
                }
                if (this.unknownFieldData.m5445b() == 0) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            kvh = this.unknownFieldData;
            if (kvh == null) {
                this.unknownFieldData = new kvh();
            } else {
                kvi = kvh.m5447c(i);
            }
            if (kvi == null) {
                this.unknownFieldData.m5444a(i, new kvi(kvg, obj));
            } else {
                kvi.m5451a(kvg, obj);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(kvc kvc, int i) {
        int b = kvc.m5401b();
        if (!kvc.m5409e(i)) {
            return false;
        }
        storeUnknownFieldData(i >>> 3, new kvm(i, kvc.m5400a(b, kvc.m5401b() - b)));
        return true;
    }

    protected final boolean storeUnknownFieldAsMessageSet(kvc kvc, int i) {
        if (i != kvn.f8658a) {
            return storeUnknownField(kvc, i);
        }
        int i2 = 0;
        byte[] bArr = null;
        while (true) {
            int i3 = kvc.m5413i();
            if (i3 == 0) {
                break;
            } else if (i3 == kvn.f8660c) {
                i2 = kvc.m5410f();
            } else if (i3 == kvn.f8661d) {
                int b = kvc.m5401b();
                kvc.m5409e(i3);
                bArr = kvc.m5400a(b, kvc.m5401b() - b);
            } else if (!kvc.m5409e(i3)) {
                break;
            }
        }
        kvc.m5398a(kvn.f8659b);
        if (!(bArr == null || i2 == 0)) {
            storeUnknownFieldData(i2, new kvm(i2, bArr));
        }
        return true;
    }

    private void storeUnknownFieldData(int i, kvm kvm) {
        kvi kvi;
        kvi kvi2;
        kvh kvh = this.unknownFieldData;
        if (kvh == null) {
            this.unknownFieldData = new kvh();
            kvi = null;
        } else {
            kvi = kvh.m5447c(i);
        }
        if (kvi == null) {
            kvi = new kvi();
            this.unknownFieldData.m5444a(i, kvi);
            kvi2 = kvi;
        } else {
            kvi2 = kvi;
        }
        List list = kvi2.f8653c;
        if (list != null) {
            list.add(kvm);
            return;
        }
        Object obj = kvi2.f8652b;
        if (obj instanceof kvl) {
            byte[] bArr = kvm.f8657b;
            int length = bArr.length;
            kvc a = kvc.m5393a(bArr, 0, length);
            int f = a.m5410f();
            if (f != length - kvd.m5414a(f)) {
                throw kvk.m5456c();
            }
            kvi2.m5451a(kvi2.f8651a, ((kvl) kvi2.f8652b).mergeFrom(a));
        } else if (obj instanceof kvl[]) {
            Collections.singletonList(kvm);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(kvm);
            throw new NoSuchMethodError();
        }
    }

    protected void writeAsMessageSetTo(kvd kvd) {
        if (this.unknownFieldData != null) {
            int i = 0;
            while (i < this.unknownFieldData.m5445b()) {
                kvi b = this.unknownFieldData.m5446b(i);
                if (b.f8652b == null) {
                    for (kvm kvm : b.f8653c) {
                        int i2 = kvm.f8656a;
                        byte[] bArr = kvm.f8657b;
                        kvd.m5436c(1, 3);
                        kvd.m5436c(2, 0);
                        kvd.m5439e(i2);
                        kvd.m5436c(3, 2);
                        kvd.m5430a(bArr);
                        kvd.m5436c(1, 4);
                    }
                    i++;
                } else {
                    throw new NoSuchMethodError();
                }
            }
        }
    }

    public void writeTo(kvd kvd) {
        if (this.unknownFieldData != null) {
            for (int i = 0; i < this.unknownFieldData.m5445b(); i++) {
                this.unknownFieldData.m5446b(i).m5450a(kvd);
            }
        }
    }
}
