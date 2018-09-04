package p000;

/* compiled from: PG */
/* renamed from: dzs */
public final class dzs extends Exception {
    dzs() {
    }

    public dzs(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Failed to compile shader:\n";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        super(valueOf);
    }
}
