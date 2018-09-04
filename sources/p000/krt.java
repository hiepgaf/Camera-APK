package p000;

/* compiled from: PG */
/* renamed from: krt */
public enum krt {
    DOUBLE(0, kru.SCALAR, ksj.DOUBLE),
    FLOAT(1, kru.SCALAR, ksj.FLOAT),
    INT64(2, kru.SCALAR, ksj.LONG),
    UINT64(3, kru.SCALAR, ksj.LONG),
    INT32(4, kru.SCALAR, ksj.INT),
    FIXED64(5, kru.SCALAR, ksj.LONG),
    FIXED32(6, kru.SCALAR, ksj.INT),
    BOOL(7, kru.SCALAR, ksj.BOOLEAN),
    STRING(8, kru.SCALAR, ksj.STRING),
    MESSAGE(9, kru.SCALAR, ksj.MESSAGE),
    BYTES(10, kru.SCALAR, ksj.BYTE_STRING),
    UINT32(11, kru.SCALAR, ksj.INT),
    ENUM(12, kru.SCALAR, ksj.ENUM),
    SFIXED32(13, kru.SCALAR, ksj.INT),
    SFIXED64(14, kru.SCALAR, ksj.LONG),
    SINT32(15, kru.SCALAR, ksj.INT),
    SINT64(16, kru.SCALAR, ksj.LONG),
    GROUP(17, kru.SCALAR, ksj.MESSAGE),
    DOUBLE_LIST(18, kru.VECTOR, ksj.DOUBLE),
    FLOAT_LIST(19, kru.VECTOR, ksj.FLOAT),
    INT64_LIST(20, kru.VECTOR, ksj.LONG),
    UINT64_LIST(21, kru.VECTOR, ksj.LONG),
    INT32_LIST(22, kru.VECTOR, ksj.INT),
    FIXED64_LIST(23, kru.VECTOR, ksj.LONG),
    FIXED32_LIST(24, kru.VECTOR, ksj.INT),
    BOOL_LIST(25, kru.VECTOR, ksj.BOOLEAN),
    STRING_LIST(26, kru.VECTOR, ksj.STRING),
    MESSAGE_LIST(27, kru.VECTOR, ksj.MESSAGE),
    BYTES_LIST(28, kru.VECTOR, ksj.BYTE_STRING),
    UINT32_LIST(29, kru.VECTOR, ksj.INT),
    ENUM_LIST(30, kru.VECTOR, ksj.ENUM),
    SFIXED32_LIST(31, kru.VECTOR, ksj.INT),
    SFIXED64_LIST(32, kru.VECTOR, ksj.LONG),
    SINT32_LIST(33, kru.VECTOR, ksj.INT),
    SINT64_LIST(34, kru.VECTOR, ksj.LONG),
    DOUBLE_LIST_PACKED(35, kru.PACKED_VECTOR, ksj.DOUBLE),
    FLOAT_LIST_PACKED(36, kru.PACKED_VECTOR, ksj.FLOAT),
    INT64_LIST_PACKED(37, kru.PACKED_VECTOR, ksj.LONG),
    UINT64_LIST_PACKED(38, kru.PACKED_VECTOR, ksj.LONG),
    INT32_LIST_PACKED(39, kru.PACKED_VECTOR, ksj.INT),
    FIXED64_LIST_PACKED(40, kru.PACKED_VECTOR, ksj.LONG),
    FIXED32_LIST_PACKED(41, kru.PACKED_VECTOR, ksj.INT),
    BOOL_LIST_PACKED(42, kru.PACKED_VECTOR, ksj.BOOLEAN),
    UINT32_LIST_PACKED(43, kru.PACKED_VECTOR, ksj.INT),
    ENUM_LIST_PACKED(44, kru.PACKED_VECTOR, ksj.ENUM),
    SFIXED32_LIST_PACKED(45, kru.PACKED_VECTOR, ksj.INT),
    SFIXED64_LIST_PACKED(46, kru.PACKED_VECTOR, ksj.LONG),
    SINT32_LIST_PACKED(47, kru.PACKED_VECTOR, ksj.INT),
    SINT64_LIST_PACKED(48, kru.PACKED_VECTOR, ksj.LONG),
    GROUP_LIST(49, kru.VECTOR, ksj.MESSAGE),
    MAP(50, kru.MAP, ksj.VOID);
    
    private static final krt[] aa = null;
    /* renamed from: k */
    public final int f8509k;

    static {
        krt[] values = krt.values();
        int length = values.length;
        aa = new krt[length];
        int i;
        while (i < length) {
            krt krt = values[i];
            aa[krt.f8509k] = krt;
            i++;
        }
    }

    private krt(int i, kru kru, ksj ksj) {
        this.f8509k = i;
        Class cls;
        switch (kru.ordinal()) {
            case 1:
                cls = ksj.f8528k;
                break;
            case 3:
                cls = ksj.f8528k;
                break;
        }
        if (kru == kru.SCALAR) {
            switch (ksj.ordinal()) {
            }
        }
    }
}
