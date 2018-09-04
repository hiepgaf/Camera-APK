package p000;

import android.annotation.TargetApi;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gim */
public final class gim implements iqo {
    /* renamed from: a */
    public final fkp f16940a;
    /* renamed from: b */
    private final gnu f16941b;
    /* renamed from: c */
    private final gsl f16942c;

    /* renamed from: a */
    public static /* synthetic */ void m11100a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        outputStream.close();
    }

    public gim(fkp fkp, gsl gsl, gnu gnu) {
        this.f16940a = fkp;
        this.f16942c = gsl;
        this.f16941b = gnu;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final File m11101a(fkp fkp) {
        Long l = (Long) fkp.m17317a(fkr.f4605e);
        File file = new File(this.f16941b.mo1507a("burst"), String.format(Locale.US, "burst-%d", new Object[]{l}));
        if (this.f16942c.mo1619c(file)) {
            return new File(file, jxr.m4677a(fkp.mo2719f()));
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not create burst directory: ");
        stringBuilder.append(valueOf);
        throw new IOException(stringBuilder.toString());
    }
}
