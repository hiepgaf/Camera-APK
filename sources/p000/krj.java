package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: krj */
public final class krj extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    krj() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    krj(String str, Throwable th) {
        String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        super(valueOf2, th);
    }

    krj(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
