package android.support.v8.renderscript;

/* compiled from: PG */
public class Element extends BaseObj {
    public int[] mArraySizes;
    public String[] mElementNames;
    public Element[] mElements;
    public DataKind mKind;
    public boolean mNormalized;
    public int[] mOffsetInBytes;
    public int mSize;
    public DataType mType;
    public int mVectorSize;
    public int[] mVisibleElementMap;

    /* compiled from: PG */
    /* renamed from: android.support.v8.renderscript.Element$1 */
    /* synthetic */ class C00301 {
        public static final /* synthetic */ int[] $SwitchMap$android$support$v8$renderscript$Element$DataKind = new int[DataKind.values().length];
        public static final /* synthetic */ int[] $SwitchMap$android$support$v8$renderscript$Element$DataType = new int[DataType.values().length];

        static {
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataKind[DataKind.PIXEL_LA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataKind[DataKind.PIXEL_RGB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataKind[DataKind.PIXEL_RGBA.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.FLOAT_32.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.FLOAT_64.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.SIGNED_8.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.SIGNED_16.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.SIGNED_32.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.SIGNED_64.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.UNSIGNED_8.ordinal()] = 7;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.UNSIGNED_16.ordinal()] = 8;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.UNSIGNED_32.ordinal()] = 9;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.UNSIGNED_64.ordinal()] = 10;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$android$support$v8$renderscript$Element$DataType[DataType.BOOLEAN.ordinal()] = 11;
            } catch (NoSuchFieldError e14) {
            }
        }
    }

    /* compiled from: PG */
    public class Builder {
        public int[] mArraySizes = new int[8];
        public int mCount = 0;
        public String[] mElementNames = new String[8];
        public Element[] mElements = new Element[8];
        public RenderScript mRS;
        public int mSkipPadding;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        public Builder add(Element element, String str) {
            return add(element, str, 1);
        }

        public Builder add(Element element, String str, int i) {
            if (i <= 0) {
                throw new RSIllegalArgumentException("Array size cannot be less than 1.");
            }
            if (this.mSkipPadding == 0 || !str.startsWith("#padding_")) {
                if (element.mVectorSize == 3) {
                    this.mSkipPadding = 1;
                } else {
                    this.mSkipPadding = 0;
                }
                int i2 = this.mCount;
                Object obj = this.mElements;
                if (i2 == obj.length) {
                    int i3 = i2 + 8;
                    Object obj2 = new Element[i3];
                    Object obj3 = new String[i3];
                    Object obj4 = new int[i3];
                    System.arraycopy(obj, 0, obj2, 0, i2);
                    System.arraycopy(this.mElementNames, 0, obj3, 0, this.mCount);
                    System.arraycopy(this.mArraySizes, 0, obj4, 0, this.mCount);
                    this.mElements = obj2;
                    this.mElementNames = obj3;
                    this.mArraySizes = obj4;
                }
                Element[] elementArr = this.mElements;
                int i4 = this.mCount;
                elementArr[i4] = element;
                this.mElementNames[i4] = str;
                this.mArraySizes[i4] = i;
                this.mCount = i4 + 1;
            } else {
                this.mSkipPadding = 0;
            }
            return this;
        }

        public Element create() {
            int i = 0;
            this.mRS.validate();
            int i2 = this.mCount;
            Object obj = new Element[i2];
            Object obj2 = new String[i2];
            Object obj3 = new int[i2];
            System.arraycopy(this.mElements, 0, obj, 0, i2);
            System.arraycopy(this.mElementNames, 0, obj2, 0, this.mCount);
            System.arraycopy(this.mArraySizes, 0, obj3, 0, this.mCount);
            long[] jArr = new long[i2];
            while (i < obj.length) {
                jArr[i] = obj[i].getID(this.mRS);
                i++;
            }
            return new Element(this.mRS.nElementCreate2(jArr, obj2, obj3), this.mRS, obj, obj2, obj3);
        }
    }

    /* compiled from: PG */
    public enum DataKind {
        USER(0),
        PIXEL_L(7),
        PIXEL_A(8),
        PIXEL_LA(9),
        PIXEL_RGB(10),
        PIXEL_RGBA(11),
        PIXEL_DEPTH(12),
        PIXEL_YUV(13);
        
        public int mID;

        private DataKind(int i) {
            this.mID = i;
        }
    }

    /* compiled from: PG */
    public enum DataType {
        NONE(0, 0),
        FLOAT_32(2, 4),
        FLOAT_64(3, 8),
        SIGNED_8(4, 1),
        SIGNED_16(5, 2),
        SIGNED_32(6, 4),
        SIGNED_64(7, 8),
        UNSIGNED_8(8, 1),
        UNSIGNED_16(9, 2),
        UNSIGNED_32(10, 4),
        UNSIGNED_64(11, 8),
        BOOLEAN(12, 1),
        UNSIGNED_5_6_5(13, 2),
        UNSIGNED_5_5_5_1(14, 2),
        UNSIGNED_4_4_4_4(15, 2),
        MATRIX_4X4(16, 64),
        MATRIX_3X3(17, 36),
        MATRIX_2X2(18, 16),
        RS_ELEMENT(1000),
        RS_TYPE(1001),
        RS_ALLOCATION(1002),
        RS_SAMPLER(1003),
        RS_SCRIPT(1004);
        
        public int mID;
        public int mSize;

        private DataType(int i) {
            this.mID = i;
            this.mSize = 4;
            if (RenderScript.sPointerSize == 8) {
                this.mSize = 32;
            }
        }

        private DataType(int i, int i2) {
            this.mID = i;
            this.mSize = i2;
        }
    }

    Element(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    Element(long j, RenderScript renderScript, DataType dataType, DataKind dataKind, boolean z, int i) {
        super(j, renderScript);
        if (dataType == DataType.UNSIGNED_5_6_5 || dataType == DataType.UNSIGNED_4_4_4_4 || dataType == DataType.UNSIGNED_5_5_5_1) {
            this.mSize = dataType.mSize;
        } else if (i == 3) {
            this.mSize = dataType.mSize << 2;
        } else {
            this.mSize = dataType.mSize * i;
        }
        this.mType = dataType;
        this.mKind = dataKind;
        this.mNormalized = z;
        this.mVectorSize = i;
    }

    Element(long j, RenderScript renderScript, Element[] elementArr, String[] strArr, int[] iArr) {
        int i = 0;
        super(j, renderScript);
        this.mSize = 0;
        this.mVectorSize = 1;
        this.mElements = elementArr;
        this.mElementNames = strArr;
        this.mArraySizes = iArr;
        this.mType = DataType.NONE;
        this.mKind = DataKind.USER;
        this.mOffsetInBytes = new int[this.mElements.length];
        while (true) {
            Element[] elementArr2 = this.mElements;
            if (i < elementArr2.length) {
                int[] iArr2 = this.mOffsetInBytes;
                int i2 = this.mSize;
                iArr2[i] = i2;
                this.mSize = (elementArr2[i].mSize * this.mArraySizes[i]) + i2;
                i++;
            } else {
                updateVisibleSubElements();
                return;
            }
        }
    }

    public static Element ALLOCATION(RenderScript renderScript) {
        if (renderScript.mElement_ALLOCATION == null) {
            renderScript.mElement_ALLOCATION = createUser(renderScript, DataType.RS_ALLOCATION);
        }
        return renderScript.mElement_ALLOCATION;
    }

    public static Element A_8(RenderScript renderScript) {
        if (renderScript.mElement_A_8 == null) {
            renderScript.mElement_A_8 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_A);
        }
        return renderScript.mElement_A_8;
    }

    public static Element BOOLEAN(RenderScript renderScript) {
        if (renderScript.mElement_BOOLEAN == null) {
            renderScript.mElement_BOOLEAN = createUser(renderScript, DataType.BOOLEAN);
        }
        return renderScript.mElement_BOOLEAN;
    }

    public static Element ELEMENT(RenderScript renderScript) {
        if (renderScript.mElement_ELEMENT == null) {
            renderScript.mElement_ELEMENT = createUser(renderScript, DataType.RS_ELEMENT);
        }
        return renderScript.mElement_ELEMENT;
    }

    public static Element F32(RenderScript renderScript) {
        if (renderScript.mElement_F32 == null) {
            renderScript.mElement_F32 = createUser(renderScript, DataType.FLOAT_32);
        }
        return renderScript.mElement_F32;
    }

    public static Element F32_2(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_2 == null) {
            renderScript.mElement_FLOAT_2 = createVector(renderScript, DataType.FLOAT_32, 2);
        }
        return renderScript.mElement_FLOAT_2;
    }

    public static Element F32_3(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_3 == null) {
            renderScript.mElement_FLOAT_3 = createVector(renderScript, DataType.FLOAT_32, 3);
        }
        return renderScript.mElement_FLOAT_3;
    }

    public static Element F32_4(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_4 == null) {
            renderScript.mElement_FLOAT_4 = createVector(renderScript, DataType.FLOAT_32, 4);
        }
        return renderScript.mElement_FLOAT_4;
    }

    public static Element F64(RenderScript renderScript) {
        if (renderScript.mElement_F64 == null) {
            renderScript.mElement_F64 = createUser(renderScript, DataType.FLOAT_64);
        }
        return renderScript.mElement_F64;
    }

    public static Element F64_2(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_2 == null) {
            renderScript.mElement_DOUBLE_2 = createVector(renderScript, DataType.FLOAT_64, 2);
        }
        return renderScript.mElement_DOUBLE_2;
    }

    public static Element F64_3(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_3 == null) {
            renderScript.mElement_DOUBLE_3 = createVector(renderScript, DataType.FLOAT_64, 3);
        }
        return renderScript.mElement_DOUBLE_3;
    }

    public static Element F64_4(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_4 == null) {
            renderScript.mElement_DOUBLE_4 = createVector(renderScript, DataType.FLOAT_64, 4);
        }
        return renderScript.mElement_DOUBLE_4;
    }

    public static Element I16(RenderScript renderScript) {
        if (renderScript.mElement_I16 == null) {
            renderScript.mElement_I16 = createUser(renderScript, DataType.SIGNED_16);
        }
        return renderScript.mElement_I16;
    }

    public static Element I16_2(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_2 == null) {
            renderScript.mElement_SHORT_2 = createVector(renderScript, DataType.SIGNED_16, 2);
        }
        return renderScript.mElement_SHORT_2;
    }

    public static Element I16_3(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_3 == null) {
            renderScript.mElement_SHORT_3 = createVector(renderScript, DataType.SIGNED_16, 3);
        }
        return renderScript.mElement_SHORT_3;
    }

    public static Element I16_4(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_4 == null) {
            renderScript.mElement_SHORT_4 = createVector(renderScript, DataType.SIGNED_16, 4);
        }
        return renderScript.mElement_SHORT_4;
    }

    public static Element I32(RenderScript renderScript) {
        if (renderScript.mElement_I32 == null) {
            renderScript.mElement_I32 = createUser(renderScript, DataType.SIGNED_32);
        }
        return renderScript.mElement_I32;
    }

    public static Element I32_2(RenderScript renderScript) {
        if (renderScript.mElement_INT_2 == null) {
            renderScript.mElement_INT_2 = createVector(renderScript, DataType.SIGNED_32, 2);
        }
        return renderScript.mElement_INT_2;
    }

    public static Element I32_3(RenderScript renderScript) {
        if (renderScript.mElement_INT_3 == null) {
            renderScript.mElement_INT_3 = createVector(renderScript, DataType.SIGNED_32, 3);
        }
        return renderScript.mElement_INT_3;
    }

    public static Element I32_4(RenderScript renderScript) {
        if (renderScript.mElement_INT_4 == null) {
            renderScript.mElement_INT_4 = createVector(renderScript, DataType.SIGNED_32, 4);
        }
        return renderScript.mElement_INT_4;
    }

    public static Element I64(RenderScript renderScript) {
        if (renderScript.mElement_I64 == null) {
            renderScript.mElement_I64 = createUser(renderScript, DataType.SIGNED_64);
        }
        return renderScript.mElement_I64;
    }

    public static Element I64_2(RenderScript renderScript) {
        if (renderScript.mElement_LONG_2 == null) {
            renderScript.mElement_LONG_2 = createVector(renderScript, DataType.SIGNED_64, 2);
        }
        return renderScript.mElement_LONG_2;
    }

    public static Element I64_3(RenderScript renderScript) {
        if (renderScript.mElement_LONG_3 == null) {
            renderScript.mElement_LONG_3 = createVector(renderScript, DataType.SIGNED_64, 3);
        }
        return renderScript.mElement_LONG_3;
    }

    public static Element I64_4(RenderScript renderScript) {
        if (renderScript.mElement_LONG_4 == null) {
            renderScript.mElement_LONG_4 = createVector(renderScript, DataType.SIGNED_64, 4);
        }
        return renderScript.mElement_LONG_4;
    }

    public static Element I8(RenderScript renderScript) {
        if (renderScript.mElement_I8 == null) {
            renderScript.mElement_I8 = createUser(renderScript, DataType.SIGNED_8);
        }
        return renderScript.mElement_I8;
    }

    public static Element I8_2(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_2 == null) {
            renderScript.mElement_CHAR_2 = createVector(renderScript, DataType.SIGNED_8, 2);
        }
        return renderScript.mElement_CHAR_2;
    }

    public static Element I8_3(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_3 == null) {
            renderScript.mElement_CHAR_3 = createVector(renderScript, DataType.SIGNED_8, 3);
        }
        return renderScript.mElement_CHAR_3;
    }

    public static Element I8_4(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_4 == null) {
            renderScript.mElement_CHAR_4 = createVector(renderScript, DataType.SIGNED_8, 4);
        }
        return renderScript.mElement_CHAR_4;
    }

    public static Element MATRIX_2X2(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_2X2 == null) {
            renderScript.mElement_MATRIX_2X2 = createUser(renderScript, DataType.MATRIX_2X2);
        }
        return renderScript.mElement_MATRIX_2X2;
    }

    public static Element MATRIX_3X3(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_3X3 == null) {
            renderScript.mElement_MATRIX_3X3 = createUser(renderScript, DataType.MATRIX_3X3);
        }
        return renderScript.mElement_MATRIX_3X3;
    }

    public static Element MATRIX_4X4(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_4X4 == null) {
            renderScript.mElement_MATRIX_4X4 = createUser(renderScript, DataType.MATRIX_4X4);
        }
        return renderScript.mElement_MATRIX_4X4;
    }

    public static Element RGBA_4444(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_4444 == null) {
            renderScript.mElement_RGBA_4444 = createPixel(renderScript, DataType.UNSIGNED_4_4_4_4, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_4444;
    }

    public static Element RGBA_5551(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_5551 == null) {
            renderScript.mElement_RGBA_5551 = createPixel(renderScript, DataType.UNSIGNED_5_5_5_1, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_5551;
    }

    public static Element RGBA_8888(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_8888 == null) {
            renderScript.mElement_RGBA_8888 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_8888;
    }

    public static Element RGB_565(RenderScript renderScript) {
        if (renderScript.mElement_RGB_565 == null) {
            renderScript.mElement_RGB_565 = createPixel(renderScript, DataType.UNSIGNED_5_6_5, DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_565;
    }

    public static Element RGB_888(RenderScript renderScript) {
        if (renderScript.mElement_RGB_888 == null) {
            renderScript.mElement_RGB_888 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_888;
    }

    public static Element SAMPLER(RenderScript renderScript) {
        if (renderScript.mElement_SAMPLER == null) {
            renderScript.mElement_SAMPLER = createUser(renderScript, DataType.RS_SAMPLER);
        }
        return renderScript.mElement_SAMPLER;
    }

    public static Element SCRIPT(RenderScript renderScript) {
        if (renderScript.mElement_SCRIPT == null) {
            renderScript.mElement_SCRIPT = createUser(renderScript, DataType.RS_SCRIPT);
        }
        return renderScript.mElement_SCRIPT;
    }

    public static Element TYPE(RenderScript renderScript) {
        if (renderScript.mElement_TYPE == null) {
            renderScript.mElement_TYPE = createUser(renderScript, DataType.RS_TYPE);
        }
        return renderScript.mElement_TYPE;
    }

    public static Element U16(RenderScript renderScript) {
        if (renderScript.mElement_U16 == null) {
            renderScript.mElement_U16 = createUser(renderScript, DataType.UNSIGNED_16);
        }
        return renderScript.mElement_U16;
    }

    public static Element U16_2(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_2 == null) {
            renderScript.mElement_USHORT_2 = createVector(renderScript, DataType.UNSIGNED_16, 2);
        }
        return renderScript.mElement_USHORT_2;
    }

    public static Element U16_3(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_3 == null) {
            renderScript.mElement_USHORT_3 = createVector(renderScript, DataType.UNSIGNED_16, 3);
        }
        return renderScript.mElement_USHORT_3;
    }

    public static Element U16_4(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_4 == null) {
            renderScript.mElement_USHORT_4 = createVector(renderScript, DataType.UNSIGNED_16, 4);
        }
        return renderScript.mElement_USHORT_4;
    }

    public static Element U32(RenderScript renderScript) {
        if (renderScript.mElement_U32 == null) {
            renderScript.mElement_U32 = createUser(renderScript, DataType.UNSIGNED_32);
        }
        return renderScript.mElement_U32;
    }

    public static Element U32_2(RenderScript renderScript) {
        if (renderScript.mElement_UINT_2 == null) {
            renderScript.mElement_UINT_2 = createVector(renderScript, DataType.UNSIGNED_32, 2);
        }
        return renderScript.mElement_UINT_2;
    }

    public static Element U32_3(RenderScript renderScript) {
        if (renderScript.mElement_UINT_3 == null) {
            renderScript.mElement_UINT_3 = createVector(renderScript, DataType.UNSIGNED_32, 3);
        }
        return renderScript.mElement_UINT_3;
    }

    public static Element U32_4(RenderScript renderScript) {
        if (renderScript.mElement_UINT_4 == null) {
            renderScript.mElement_UINT_4 = createVector(renderScript, DataType.UNSIGNED_32, 4);
        }
        return renderScript.mElement_UINT_4;
    }

    public static Element U64(RenderScript renderScript) {
        if (renderScript.mElement_U64 == null) {
            renderScript.mElement_U64 = createUser(renderScript, DataType.UNSIGNED_64);
        }
        return renderScript.mElement_U64;
    }

    public static Element U64_2(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_2 == null) {
            renderScript.mElement_ULONG_2 = createVector(renderScript, DataType.UNSIGNED_64, 2);
        }
        return renderScript.mElement_ULONG_2;
    }

    public static Element U64_3(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_3 == null) {
            renderScript.mElement_ULONG_3 = createVector(renderScript, DataType.UNSIGNED_64, 3);
        }
        return renderScript.mElement_ULONG_3;
    }

    public static Element U64_4(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_4 == null) {
            renderScript.mElement_ULONG_4 = createVector(renderScript, DataType.UNSIGNED_64, 4);
        }
        return renderScript.mElement_ULONG_4;
    }

    public static Element U8(RenderScript renderScript) {
        if (renderScript.mElement_U8 == null) {
            renderScript.mElement_U8 = createUser(renderScript, DataType.UNSIGNED_8);
        }
        return renderScript.mElement_U8;
    }

    public static Element U8_2(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_2 == null) {
            renderScript.mElement_UCHAR_2 = createVector(renderScript, DataType.UNSIGNED_8, 2);
        }
        return renderScript.mElement_UCHAR_2;
    }

    public static Element U8_3(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_3 == null) {
            renderScript.mElement_UCHAR_3 = createVector(renderScript, DataType.UNSIGNED_8, 3);
        }
        return renderScript.mElement_UCHAR_3;
    }

    public static Element U8_4(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_4 == null) {
            renderScript.mElement_UCHAR_4 = createVector(renderScript, DataType.UNSIGNED_8, 4);
        }
        return renderScript.mElement_UCHAR_4;
    }

    public static Element createPixel(RenderScript renderScript, DataType dataType, DataKind dataKind) {
        if (dataKind != DataKind.PIXEL_L && dataKind != DataKind.PIXEL_A && dataKind != DataKind.PIXEL_LA && dataKind != DataKind.PIXEL_RGB && dataKind != DataKind.PIXEL_RGBA && dataKind != DataKind.PIXEL_DEPTH && dataKind != DataKind.PIXEL_YUV) {
            throw new RSIllegalArgumentException("Unsupported DataKind");
        } else if (dataType != DataType.UNSIGNED_8 && dataType != DataType.UNSIGNED_16 && dataType != DataType.UNSIGNED_5_6_5 && dataType != DataType.UNSIGNED_4_4_4_4 && dataType != DataType.UNSIGNED_5_5_5_1) {
            throw new RSIllegalArgumentException("Unsupported DataType");
        } else if (dataType == DataType.UNSIGNED_5_6_5 && dataKind != DataKind.PIXEL_RGB) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType == DataType.UNSIGNED_5_5_5_1 && dataKind != DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType == DataType.UNSIGNED_4_4_4_4 && dataKind != DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType != DataType.UNSIGNED_16 || dataKind == DataKind.PIXEL_DEPTH) {
            int i;
            switch (dataKind.ordinal()) {
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                default:
                    i = 1;
                    break;
            }
            return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, true, i), renderScript, dataType, dataKind, true, i);
        } else {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
    }

    static Element createUser(RenderScript renderScript, DataType dataType) {
        DataKind dataKind = DataKind.USER;
        return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, false, 1), renderScript, dataType, dataKind, false, 1);
    }

    public static Element createVector(RenderScript renderScript, DataType dataType, int i) {
        if (i < 2 || i > 4) {
            throw new RSIllegalArgumentException("Vector size out of range 2-4.");
        }
        switch (dataType.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                DataKind dataKind = DataKind.USER;
                return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, false, i), renderScript, dataType, dataKind, false, i);
            default:
                throw new RSIllegalArgumentException("Cannot create vector of non-primitive type.");
        }
    }

    public int getBytesSize() {
        return this.mSize;
    }

    public DataKind getDataKind() {
        return this.mKind;
    }

    public DataType getDataType() {
        return this.mType;
    }

    public long getDummyElement(RenderScript renderScript) {
        return renderScript.nIncElementCreate((long) this.mType.mID, this.mKind.mID, this.mNormalized, this.mVectorSize);
    }

    public Element getSubElement(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mElements[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getSubElementArraySize(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mArraySizes[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getSubElementCount() {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public String getSubElementName(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mElementNames[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getSubElementOffsetBytes(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mOffsetInBytes[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getVectorSize() {
        return this.mVectorSize;
    }

    public boolean isCompatible(Element element) {
        if (equals(element)) {
            return true;
        }
        if (this.mSize == element.mSize && this.mType != DataType.NONE && this.mType == element.mType && this.mVectorSize == element.mVectorSize) {
            return true;
        }
        return false;
    }

    public boolean isComplex() {
        if (this.mElements == null) {
            return false;
        }
        int i = 0;
        while (true) {
            Element[] elementArr = this.mElements;
            if (i >= elementArr.length) {
                return false;
            }
            if (elementArr[i].mElements != null) {
                return true;
            }
            i++;
        }
    }

    private void updateVisibleSubElements() {
        if (this.mElements != null) {
            int i = 0;
            for (String charAt : this.mElementNames) {
                if (charAt.charAt(0) != '#') {
                    i++;
                }
            }
            this.mVisibleElementMap = new int[i];
            int i2 = 0;
            int i3 = 0;
            while (i3 < r4) {
                if (this.mElementNames[i3].charAt(0) != '#') {
                    i = i2 + 1;
                    this.mVisibleElementMap[i2] = i3;
                } else {
                    i = i2;
                }
                i3++;
                i2 = i;
            }
        }
    }
}
