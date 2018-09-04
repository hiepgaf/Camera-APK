package p000;

/* compiled from: PG */
/* renamed from: jdh */
public final class jdh extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public jdh() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public jdh(String str) {
        super(str);
    }

    /* renamed from: a */
    public static jdh m4419a(jfj jfj) {
        String valueOf = String.valueOf(jfj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
        stringBuilder.append("Could not create EGL context for version ");
        stringBuilder.append(valueOf);
        stringBuilder.append(".");
        return new jdh(stringBuilder.toString());
    }
}
