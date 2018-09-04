package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: bjh */
public final class bjh implements bjg {
    /* renamed from: a */
    private static final String f10955a = bli.m862a("CdrMediaRecNextOutputFile");
    /* renamed from: b */
    private final biw f10956b;

    public bjh(biw biw) {
        this.f10956b = biw;
    }

    /* renamed from: a */
    public final void mo503a(File file) {
        try {
            this.f10956b.mo462a(file);
        } catch (ipu e) {
            String str = f10955a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
            stringBuilder.append("Failed when call PreparedMediaRecorder#setNextOutputFile: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        }
    }
}
