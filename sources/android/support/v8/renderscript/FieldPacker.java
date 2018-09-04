package android.support.v8.renderscript;

import android.util.Log;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.BitSet;

/* compiled from: PG */
public class FieldPacker {
    public BitSet mAlignment;
    public byte[] mData;
    public int mLen;
    public int mPos;

    public FieldPacker(int i) {
        this.mPos = 0;
        this.mLen = i;
        this.mData = new byte[i];
        this.mAlignment = new BitSet();
    }

    public FieldPacker(byte[] bArr) {
        int length = bArr.length;
        this.mPos = length;
        this.mLen = length;
        this.mData = bArr;
        this.mAlignment = new BitSet();
    }

    public void addBoolean(boolean z) {
        addI8((byte) z);
    }

    public void addF32(float f) {
        addI32(Float.floatToRawIntBits(f));
    }

    public void addF32(Float2 float2) {
        addF32(float2.f758x);
        addF32(float2.f759y);
    }

    public void addF32(Float3 float3) {
        addF32(float3.f760x);
        addF32(float3.f761y);
        addF32(float3.f762z);
    }

    public void addF32(Float4 float4) {
        addF32(float4.f764x);
        addF32(float4.f765y);
        addF32(float4.f766z);
        addF32(float4.f763w);
    }

    public void addF64(double d) {
        addI64(Double.doubleToRawLongBits(d));
    }

    public void addF64(Double2 double2) {
        addF64(double2.f749x);
        addF64(double2.f750y);
    }

    public void addF64(Double3 double3) {
        addF64(double3.f751x);
        addF64(double3.f752y);
        addF64(double3.f753z);
    }

    public void addF64(Double4 double4) {
        addF64(double4.f755x);
        addF64(double4.f756y);
        addF64(double4.f757z);
        addF64(double4.f754w);
    }

    public void addI16(Short2 short2) {
        addI16(short2.f785x);
        addI16(short2.f786y);
    }

    public void addI16(Short3 short3) {
        addI16(short3.f787x);
        addI16(short3.f788y);
        addI16(short3.f789z);
    }

    public void addI16(Short4 short4) {
        addI16(short4.f791x);
        addI16(short4.f792y);
        addI16(short4.f793z);
        addI16(short4.f790w);
    }

    public void addI16(short s) {
        align(2);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) s;
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) (s >> 8);
    }

    public void addI32(int i) {
        align(4);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) i;
        i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (i >> 16);
        i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = i >> 24;
    }

    public void addI32(Int2 int2) {
        addI32(int2.f767x);
        addI32(int2.f768y);
    }

    public void addI32(Int3 int3) {
        addI32(int3.f769x);
        addI32(int3.f770y);
        addI32(int3.f771z);
    }

    public void addI32(Int4 int4) {
        addI32(int4.f773x);
        addI32(int4.f774y);
        addI32(int4.f775z);
        addI32(int4.f772w);
    }

    public void addI64(long j) {
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 8) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 16) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 24) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 32) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 40) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 48) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 56) & 255));
    }

    public void addI64(Long2 long2) {
        addI64(long2.f776x);
        addI64(long2.f777y);
    }

    public void addI64(Long3 long3) {
        addI64(long3.f778x);
        addI64(long3.f779y);
        addI64(long3.f780z);
    }

    public void addI64(Long4 long4) {
        addI64(long4.f782x);
        addI64(long4.f783y);
        addI64(long4.f784z);
        addI64(long4.f781w);
    }

    public void addI8(byte b) {
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = b;
    }

    public void addI8(Byte2 byte2) {
        addI8(byte2.f740x);
        addI8(byte2.f741y);
    }

    public void addI8(Byte3 byte3) {
        addI8(byte3.f742x);
        addI8(byte3.f743y);
        addI8(byte3.f744z);
    }

    public void addI8(Byte4 byte4) {
        addI8(byte4.f746x);
        addI8(byte4.f747y);
        addI8(byte4.f748z);
        addI8(byte4.f745w);
    }

    public void addMatrix(Matrix2f matrix2f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix2f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addMatrix(Matrix3f matrix3f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix3f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addMatrix(Matrix4f matrix4f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix4f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addObj(BaseObj baseObj) {
        if (baseObj != null) {
            if (RenderScript.sPointerSize == 8) {
                addI64(baseObj.getID(null));
                addI64(0);
                addI64(0);
                addI64(0);
                return;
            }
            addI32((int) baseObj.getID(null));
        } else if (RenderScript.sPointerSize == 8) {
            addI64(0);
            addI64(0);
            addI64(0);
            addI64(0);
        } else {
            addI32(0);
        }
    }

    private void addSafely(Object obj) {
        int i = this.mPos;
        Object obj2;
        do {
            try {
                addToPack(this, obj);
                obj2 = null;
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                this.mPos = i;
                int i2 = this.mLen;
                resize(i2 + i2);
                obj2 = 1;
                continue;
            }
        } while (obj2 != null);
    }

    private static void addToPack(FieldPacker fieldPacker, Object obj) {
        if (obj instanceof Boolean) {
            fieldPacker.addBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            fieldPacker.addI8(((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            fieldPacker.addI16(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            fieldPacker.addI32(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            fieldPacker.addI64(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            fieldPacker.addF32(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            fieldPacker.addF64(((Double) obj).doubleValue());
        } else if (obj instanceof Byte2) {
            fieldPacker.addI8((Byte2) obj);
        } else if (obj instanceof Byte3) {
            fieldPacker.addI8((Byte3) obj);
        } else if (obj instanceof Byte4) {
            fieldPacker.addI8((Byte4) obj);
        } else if (obj instanceof Short2) {
            fieldPacker.addI16((Short2) obj);
        } else if (obj instanceof Short3) {
            fieldPacker.addI16((Short3) obj);
        } else if (obj instanceof Short4) {
            fieldPacker.addI16((Short4) obj);
        } else if (obj instanceof Int2) {
            fieldPacker.addI32((Int2) obj);
        } else if (obj instanceof Int3) {
            fieldPacker.addI32((Int3) obj);
        } else if (obj instanceof Int4) {
            fieldPacker.addI32((Int4) obj);
        } else if (obj instanceof Long2) {
            fieldPacker.addI64((Long2) obj);
        } else if (obj instanceof Long3) {
            fieldPacker.addI64((Long3) obj);
        } else if (obj instanceof Long4) {
            fieldPacker.addI64((Long4) obj);
        } else if (obj instanceof Float2) {
            fieldPacker.addF32((Float2) obj);
        } else if (obj instanceof Float3) {
            fieldPacker.addF32((Float3) obj);
        } else if (obj instanceof Float4) {
            fieldPacker.addF32((Float4) obj);
        } else if (obj instanceof Double2) {
            fieldPacker.addF64((Double2) obj);
        } else if (obj instanceof Double3) {
            fieldPacker.addF64((Double3) obj);
        } else if (obj instanceof Double4) {
            fieldPacker.addF64((Double4) obj);
        } else if (obj instanceof Matrix2f) {
            fieldPacker.addMatrix((Matrix2f) obj);
        } else if (obj instanceof Matrix3f) {
            fieldPacker.addMatrix((Matrix3f) obj);
        } else if (obj instanceof Matrix4f) {
            fieldPacker.addMatrix((Matrix4f) obj);
        } else if (obj instanceof BaseObj) {
            fieldPacker.addObj((BaseObj) obj);
        }
    }

    public void addU16(int i) {
        if (i < 0 || i > 65535) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FieldPacker.addU16( ");
            stringBuilder.append(i);
            stringBuilder.append(" )");
            Log.e("rs", stringBuilder.toString());
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(2);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) i;
        i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
    }

    public void addU16(Int2 int2) {
        addU16(int2.f767x);
        addU16(int2.f768y);
    }

    public void addU16(Int3 int3) {
        addU16(int3.f769x);
        addU16(int3.f770y);
        addU16(int3.f771z);
    }

    public void addU16(Int4 int4) {
        addU16(int4.f773x);
        addU16(int4.f774y);
        addU16(int4.f775z);
        addU16(int4.f772w);
    }

    public void addU32(long j) {
        if (j < 0 || j > 4294967295L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FieldPacker.addU32( ");
            stringBuilder.append(j);
            stringBuilder.append(" )");
            Log.e("rs", stringBuilder.toString());
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(4);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 8) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 16) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 24) & 255));
    }

    public void addU32(Long2 long2) {
        addU32(long2.f776x);
        addU32(long2.f777y);
    }

    public void addU32(Long3 long3) {
        addU32(long3.f778x);
        addU32(long3.f779y);
        addU32(long3.f780z);
    }

    public void addU32(Long4 long4) {
        addU32(long4.f782x);
        addU32(long4.f783y);
        addU32(long4.f784z);
        addU32(long4.f781w);
    }

    public void addU64(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FieldPacker.addU64( ");
            stringBuilder.append(j);
            stringBuilder.append(" )");
            Log.e("rs", stringBuilder.toString());
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 8) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 16) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 24) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 32) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 40) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 48) & 255));
        i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) ((j >> 56) & 255));
    }

    public void addU64(Long2 long2) {
        addU64(long2.f776x);
        addU64(long2.f777y);
    }

    public void addU64(Long3 long3) {
        addU64(long3.f778x);
        addU64(long3.f779y);
        addU64(long3.f780z);
    }

    public void addU64(Long4 long4) {
        addU64(long4.f782x);
        addU64(long4.f783y);
        addU64(long4.f784z);
        addU64(long4.f781w);
    }

    public void addU8(Short2 short2) {
        addU8(short2.f785x);
        addU8(short2.f786y);
    }

    public void addU8(Short3 short3) {
        addU8(short3.f787x);
        addU8(short3.f788y);
        addU8(short3.f789z);
    }

    public void addU8(Short4 short4) {
        addU8(short4.f791x);
        addU8(short4.f792y);
        addU8(short4.f793z);
        addU8(short4.f790w);
    }

    public void addU8(short s) {
        if (s < (short) 0 || s > (short) 255) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FieldPacker.addU8( ");
            stringBuilder.append(s);
            stringBuilder.append(" )");
            Log.e("rs", stringBuilder.toString());
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) s;
    }

    public void align(int i) {
        if (i > 0) {
            int i2 = i - 1;
            if ((i & i2) == 0) {
                while (true) {
                    int i3 = this.mPos;
                    if ((i3 & i2) != 0) {
                        this.mAlignment.flip(i3);
                        byte[] bArr = this.mData;
                        int i4 = this.mPos;
                        this.mPos = i4 + 1;
                        bArr[i4] = (byte) 0;
                    } else {
                        return;
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("argument must be a non-negative non-zero power of 2: ");
        stringBuilder.append(i);
        throw new RSIllegalArgumentException(stringBuilder.toString());
    }

    static FieldPacker createFieldPack(Object[] objArr) {
        int i = 0;
        int i2 = 0;
        for (Object packedSize : objArr) {
            i2 += getPackedSize(packedSize);
        }
        FieldPacker fieldPacker = new FieldPacker(i2);
        i2 = objArr.length;
        while (i < i2) {
            addToPack(fieldPacker, objArr[i]);
            i++;
        }
        return fieldPacker;
    }

    static FieldPacker createFromArray(Object[] objArr) {
        FieldPacker fieldPacker = new FieldPacker(RenderScript.sPointerSize << 3);
        for (Object addSafely : objArr) {
            fieldPacker.addSafely(addSafely);
        }
        fieldPacker.resize(fieldPacker.mPos);
        return fieldPacker;
    }

    public final byte[] getData() {
        return this.mData;
    }

    private static int getPackedSize(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Byte)) {
            return 1;
        }
        if (obj instanceof Short) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if (obj instanceof Long) {
            return 8;
        }
        if (obj instanceof Float) {
            return 4;
        }
        if (obj instanceof Double) {
            return 8;
        }
        if (obj instanceof Byte2) {
            return 2;
        }
        if (obj instanceof Byte3) {
            return 3;
        }
        if (obj instanceof Byte4) {
            return 4;
        }
        if (obj instanceof Short2) {
            return 4;
        }
        if (obj instanceof Short3) {
            return 6;
        }
        if (obj instanceof Short4) {
            return 8;
        }
        if (obj instanceof Int2) {
            return 8;
        }
        if (obj instanceof Int3) {
            return 12;
        }
        if (obj instanceof Int4) {
            return 16;
        }
        if (obj instanceof Long2) {
            return 16;
        }
        if (obj instanceof Long3) {
            return 24;
        }
        if (obj instanceof Long4) {
            return 32;
        }
        if (obj instanceof Float2) {
            return 8;
        }
        if (obj instanceof Float3) {
            return 12;
        }
        if (obj instanceof Float4) {
            return 16;
        }
        if (obj instanceof Double2) {
            return 16;
        }
        if (obj instanceof Double3) {
            return 24;
        }
        if (obj instanceof Double4) {
            return 32;
        }
        if (obj instanceof Matrix2f) {
            return 16;
        }
        if (obj instanceof Matrix3f) {
            return 36;
        }
        if (obj instanceof Matrix4f) {
            return 64;
        }
        if (!(obj instanceof BaseObj)) {
            return 0;
        }
        if (RenderScript.sPointerSize == 8) {
            return 32;
        }
        return 4;
    }

    public int getPos() {
        return this.mPos;
    }

    public void reset() {
        this.mPos = 0;
    }

    public void reset(int i) {
        if (i < 0 || i > this.mLen) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("out of range argument: ");
            stringBuilder.append(i);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
        this.mPos = i;
    }

    private boolean resize(int i) {
        if (i == this.mLen) {
            return false;
        }
        Object obj = new byte[i];
        System.arraycopy(this.mData, 0, obj, 0, this.mPos);
        this.mData = obj;
        this.mLen = i;
        return true;
    }

    public void skip(int i) {
        int i2 = this.mPos + i;
        if (i2 < 0 || i2 > this.mLen) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("out of range argument: ");
            stringBuilder.append(i);
            throw new RSIllegalArgumentException(stringBuilder.toString());
        }
        this.mPos = i2;
    }

    public boolean subBoolean() {
        if (subI8() == (byte) 1) {
            return true;
        }
        return false;
    }

    public Byte2 subByte2() {
        Byte2 byte2 = new Byte2();
        byte2.f741y = subI8();
        byte2.f740x = subI8();
        return byte2;
    }

    public Byte3 subByte3() {
        Byte3 byte3 = new Byte3();
        byte3.f744z = subI8();
        byte3.f743y = subI8();
        byte3.f742x = subI8();
        return byte3;
    }

    public Byte4 subByte4() {
        Byte4 byte4 = new Byte4();
        byte4.f745w = subI8();
        byte4.f748z = subI8();
        byte4.f747y = subI8();
        byte4.f746x = subI8();
        return byte4;
    }

    public Double2 subDouble2() {
        Double2 double2 = new Double2();
        double2.f750y = subF64();
        double2.f749x = subF64();
        return double2;
    }

    public Double3 subDouble3() {
        Double3 double3 = new Double3();
        double3.f753z = subF64();
        double3.f752y = subF64();
        double3.f751x = subF64();
        return double3;
    }

    public Double4 subDouble4() {
        Double4 double4 = new Double4();
        double4.f754w = subF64();
        double4.f757z = subF64();
        double4.f756y = subF64();
        double4.f755x = subF64();
        return double4;
    }

    public float subF32() {
        return Float.intBitsToFloat(subI32());
    }

    public double subF64() {
        return Double.longBitsToDouble(subI64());
    }

    public Float2 subFloat2() {
        Float2 float2 = new Float2();
        float2.f759y = subF32();
        float2.f758x = subF32();
        return float2;
    }

    public Float3 subFloat3() {
        Float3 float3 = new Float3();
        float3.f762z = subF32();
        float3.f761y = subF32();
        float3.f760x = subF32();
        return float3;
    }

    public Float4 subFloat4() {
        Float4 float4 = new Float4();
        float4.f763w = subF32();
        float4.f766z = subF32();
        float4.f765y = subF32();
        float4.f764x = subF32();
        return float4;
    }

    public short subI16() {
        subalign(2);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        byte b = bArr[i];
        int i2 = this.mPos - 1;
        this.mPos = i2;
        return (short) ((bArr[i2] & Illuminant.kOther) | ((short) ((b & Illuminant.kOther) << 8)));
    }

    public int subI32() {
        subalign(4);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        byte b = bArr[i];
        int i2 = this.mPos - 1;
        this.mPos = i2;
        byte b2 = bArr[i2];
        int i3 = this.mPos - 1;
        this.mPos = i3;
        byte b3 = bArr[i3];
        int i4 = this.mPos - 1;
        this.mPos = i4;
        return (bArr[i4] & Illuminant.kOther) | ((((b & Illuminant.kOther) << 24) | ((b2 & Illuminant.kOther) << 16)) | ((b3 & Illuminant.kOther) << 8));
    }

    public long subI64() {
        subalign(8);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        byte b = bArr[i];
        int i2 = this.mPos - 1;
        this.mPos = i2;
        byte b2 = bArr[i2];
        int i3 = this.mPos - 1;
        this.mPos = i3;
        byte b3 = bArr[i3];
        int i4 = this.mPos - 1;
        this.mPos = i4;
        byte b4 = bArr[i4];
        int i5 = this.mPos - 1;
        this.mPos = i5;
        byte b5 = bArr[i5];
        int i6 = this.mPos - 1;
        this.mPos = i6;
        byte b6 = bArr[i6];
        int i7 = this.mPos - 1;
        this.mPos = i7;
        byte b7 = bArr[i7];
        int i8 = this.mPos - 1;
        this.mPos = i8;
        return (((long) bArr[i8]) & 255) | (((((((((long) b3) & 255) << 40) | (((((long) b) & 255) << 56) | ((((long) b2) & 255) << 48))) | ((((long) b4) & 255) << 32)) | ((((long) b5) & 255) << 24)) | ((((long) b6) & 255) << 16)) | ((((long) b7) & 255) << 8));
    }

    public byte subI8() {
        subalign(1);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        return bArr[i];
    }

    public Int2 subInt2() {
        Int2 int2 = new Int2();
        int2.f768y = subI32();
        int2.f767x = subI32();
        return int2;
    }

    public Int3 subInt3() {
        Int3 int3 = new Int3();
        int3.f771z = subI32();
        int3.f770y = subI32();
        int3.f769x = subI32();
        return int3;
    }

    public Int4 subInt4() {
        Int4 int4 = new Int4();
        int4.f772w = subI32();
        int4.f775z = subI32();
        int4.f774y = subI32();
        int4.f773x = subI32();
        return int4;
    }

    public Long2 subLong2() {
        Long2 long2 = new Long2();
        long2.f777y = subI64();
        long2.f776x = subI64();
        return long2;
    }

    public Long3 subLong3() {
        Long3 long3 = new Long3();
        long3.f780z = subI64();
        long3.f779y = subI64();
        long3.f778x = subI64();
        return long3;
    }

    public Long4 subLong4() {
        Long4 long4 = new Long4();
        long4.f781w = subI64();
        long4.f784z = subI64();
        long4.f783y = subI64();
        long4.f782x = subI64();
        return long4;
    }

    public Matrix2f subMatrix2f() {
        Matrix2f matrix2f = new Matrix2f();
        for (int length = matrix2f.mMat.length - 1; length >= 0; length--) {
            matrix2f.mMat[length] = subF32();
        }
        return matrix2f;
    }

    public Matrix3f subMatrix3f() {
        Matrix3f matrix3f = new Matrix3f();
        for (int length = matrix3f.mMat.length - 1; length >= 0; length--) {
            matrix3f.mMat[length] = subF32();
        }
        return matrix3f;
    }

    public Matrix4f subMatrix4f() {
        Matrix4f matrix4f = new Matrix4f();
        for (int length = matrix4f.mMat.length - 1; length >= 0; length--) {
            matrix4f.mMat[length] = subF32();
        }
        return matrix4f;
    }

    public Short2 subShort2() {
        Short2 short2 = new Short2();
        short2.f786y = subI16();
        short2.f785x = subI16();
        return short2;
    }

    public Short3 subShort3() {
        Short3 short3 = new Short3();
        short3.f789z = subI16();
        short3.f788y = subI16();
        short3.f787x = subI16();
        return short3;
    }

    public Short4 subShort4() {
        Short4 short4 = new Short4();
        short4.f790w = subI16();
        short4.f793z = subI16();
        short4.f792y = subI16();
        short4.f791x = subI16();
        return short4;
    }

    public void subalign(int i) {
        int i2 = i - 1;
        if ((i & i2) == 0) {
            int i3;
            while (true) {
                i3 = this.mPos;
                if ((i3 & i2) == 0) {
                    break;
                }
                this.mPos = i3 - 1;
            }
            if (i3 > 0) {
                while (this.mAlignment.get(this.mPos - 1)) {
                    this.mPos--;
                    this.mAlignment.flip(this.mPos);
                }
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("argument must be a non-negative non-zero power of 2: ");
        stringBuilder.append(i);
        throw new RSIllegalArgumentException(stringBuilder.toString());
    }
}
