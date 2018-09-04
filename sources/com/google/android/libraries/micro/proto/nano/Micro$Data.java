package com.google.android.libraries.micro.proto.nano;

import p000.iym;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class Micro$Data extends kvf {
    public static volatile Micro$Data[] _emptyArray;
    public iym debugData;
    public long deviceTimestampUs;
    public int frameHeight;
    public int frameWidth;
    public int[] histogramCountData;
    public int isKeyFrame;
    public float[] motionHomographyData;

    public Micro$Data() {
        clear();
    }

    public static int checkKeyFrameTypeOrThrow(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum KeyFrameType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkKeyFrameTypeOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkKeyFrameTypeOrThrow : iArr2) {
            checkKeyFrameTypeOrThrow(checkKeyFrameTypeOrThrow);
        }
        return iArr2;
    }

    public final Micro$Data clear() {
        this.motionHomographyData = kvn.f8664g;
        this.histogramCountData = kvn.f8662e;
        this.frameWidth = 0;
        this.frameHeight = 0;
        this.deviceTimestampUs = 0;
        this.isKeyFrame = 0;
        this.debugData = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int length;
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        float[] fArr = this.motionHomographyData;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + kvd.m5423b(length);
            }
        }
        int[] iArr = this.histogramCountData;
        if (iArr == null) {
            i = computeSerializedSize;
        } else if (iArr.length > 0) {
            length = 0;
            while (true) {
                int[] iArr2 = this.histogramCountData;
                if (i >= iArr2.length) {
                    break;
                }
                length += kvd.m5423b(iArr2[i]);
                i++;
            }
            i = ((computeSerializedSize + length) + 1) + kvd.m5423b(length);
        } else {
            i = computeSerializedSize;
        }
        length = this.frameWidth;
        if (length != 0) {
            i += kvd.m5415a(3, length);
        }
        length = this.frameHeight;
        if (length != 0) {
            i += kvd.m5415a(4, length);
        }
        long j = this.deviceTimestampUs;
        if (j != 0) {
            i += kvd.m5416a(5, j);
        }
        length = this.isKeyFrame;
        if (length != 0) {
            i += kvd.m5415a(6, length);
        }
        kvl kvl = this.debugData;
        if (kvl != null) {
            return i + kvd.m5418a(7, kvl);
        }
        return i;
    }

    public static Micro$Data[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new Micro$Data[0];
                }
            }
        }
        return _emptyArray;
    }

    public final Micro$Data mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            int c;
            int i2;
            Object obj;
            Object obj2;
            Object obj3;
            switch (i) {
                case 0:
                    break;
                case 10:
                    i = kvc.m5410f();
                    c = kvc.m5404c(i);
                    i2 = i / 4;
                    obj = this.motionHomographyData;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.m5406d());
                        i++;
                    }
                    this.motionHomographyData = obj2;
                    kvc.m5402b(c);
                    continue;
                case 13:
                    c = kvn.m5457a(kvc, 13);
                    obj2 = this.motionHomographyData;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.m5406d());
                    this.motionHomographyData = obj3;
                    continue;
                case 16:
                    c = kvn.m5457a(kvc, 16);
                    obj2 = this.histogramCountData;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.m5410f();
                        kvc.m5413i();
                        i++;
                    }
                    obj3[i] = kvc.m5410f();
                    this.histogramCountData = obj3;
                    continue;
                case 18:
                    i2 = kvc.m5404c(kvc.m5410f());
                    c = kvc.m5401b();
                    i = 0;
                    while (kvc.m5397a() > 0) {
                        kvc.m5410f();
                        i++;
                    }
                    kvc.m5407d(c);
                    obj = this.histogramCountData;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    Object obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.m5410f();
                        c++;
                    }
                    this.histogramCountData = obj4;
                    kvc.m5402b(i2);
                    continue;
                case 24:
                    this.frameWidth = kvc.m5410f();
                    continue;
                case 32:
                    this.frameHeight = kvc.m5410f();
                    continue;
                case 40:
                    this.deviceTimestampUs = kvc.m5411g();
                    continue;
                case 48:
                    c = kvc.m5401b();
                    try {
                        this.isKeyFrame = checkKeyFrameTypeOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(c);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 58:
                    if (this.debugData == null) {
                        this.debugData = new iym();
                    }
                    kvc.m5399a(this.debugData);
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

    public static Micro$Data parseFrom(kvc kvc) {
        return new Micro$Data().mergeFrom(kvc);
    }

    public static Micro$Data parseFrom(byte[] bArr) {
        return (Micro$Data) kvl.mergeFrom(new Micro$Data(), bArr);
    }

    public final void writeTo(kvd kvd) {
        int length;
        int i = 0;
        float[] fArr = this.motionHomographyData;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                kvd.m5439e(10);
                kvd.m5439e(length << 2);
                length = 0;
                while (true) {
                    float[] fArr2 = this.motionHomographyData;
                    if (length >= fArr2.length) {
                        break;
                    }
                    kvd.m5427a(fArr2[length]);
                    length++;
                }
            }
        }
        int[] iArr = this.histogramCountData;
        if (iArr != null && iArr.length > 0) {
            length = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.histogramCountData;
                if (length >= iArr2.length) {
                    break;
                }
                i2 += kvd.m5423b(iArr2[length]);
                length++;
            }
            kvd.m5439e(18);
            kvd.m5439e(i2);
            while (true) {
                iArr = this.histogramCountData;
                if (i >= iArr.length) {
                    break;
                }
                kvd.m5439e(iArr[i]);
                i++;
            }
        }
        length = this.frameWidth;
        if (length != 0) {
            kvd.m5431b(3, length);
        }
        length = this.frameHeight;
        if (length != 0) {
            kvd.m5431b(4, length);
        }
        long j = this.deviceTimestampUs;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        length = this.isKeyFrame;
        if (length != 0) {
            kvd.m5431b(6, length);
        }
        kvl kvl = this.debugData;
        if (kvl != null) {
            kvd.m5434b(7, kvl);
        }
        super.writeTo(kvd);
    }
}
