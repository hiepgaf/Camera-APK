package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kjb */
final class kjb extends kip {
    /* renamed from: a */
    private final File f19223a;
    /* renamed from: b */
    private final keu f19224b;

    kjb(File file, kiy... kiyArr) {
        this.f19223a = (File) jri.m13152b((Object) file);
        this.f19224b = keu.m13478a((Object[]) kiyArr);
    }

    /* renamed from: a */
    public final /* synthetic */ OutputStream mo2182a() {
        return new FileOutputStream(this.f19223a, this.f19224b.contains(kiy.f8324a));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19223a);
        String valueOf2 = String.valueOf(this.f19224b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length());
        stringBuilder.append("Files.asByteSink(");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
