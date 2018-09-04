package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: kvk */
public final class kvk extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public kvk(String str) {
        super(str);
    }

    /* renamed from: a */
    static kvk m5454a() {
        return new kvk("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: b */
    public static kvk m5455b() {
        return new kvk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static kvk m5456c() {
        return new kvk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
