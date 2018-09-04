package p000;

/* compiled from: PG */
/* renamed from: bry */
public class bry {
    /* renamed from: b */
    public final String f1504b;

    public bry(String str) {
        jri.m13152b((Object) str);
        if (str.startsWith("persist.")) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 122);
            stringBuilder.append("The provided flag name of '");
            stringBuilder.append(str);
            stringBuilder.append("'  starts with '");
            stringBuilder.append("persist.");
            stringBuilder.append("'. '");
            stringBuilder.append("persist.");
            stringBuilder.append("' will be automatically prepended to the adb property name.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String valueOf = String.valueOf("persist.");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        if (valueOf2.length() > 31) {
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 97) + String.valueOf(valueOf2).length());
            stringBuilder2.append("The provided name of '");
            stringBuilder2.append(str);
            stringBuilder2.append("' is longer than adb can support (31 characters) when the prefix is added: ");
            stringBuilder2.append(valueOf2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        this.f1504b = str;
    }
}
