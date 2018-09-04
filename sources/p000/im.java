package p000;

import android.util.Log;
import java.io.Writer;

/* compiled from: PG */
/* renamed from: im */
public final class im extends Writer {
    /* renamed from: a */
    private final String f7088a;
    /* renamed from: b */
    private StringBuilder f7089b = new StringBuilder(128);

    public im(String str) {
        this.f7088a = str;
    }

    public final void close() {
        m3844a();
    }

    public final void flush() {
        m3844a();
    }

    /* renamed from: a */
    private final void m3844a() {
        if (this.f7089b.length() > 0) {
            Log.d(this.f7088a, this.f7089b.toString());
            StringBuilder stringBuilder = this.f7089b;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m3844a();
            } else {
                this.f7089b.append(c);
            }
        }
    }
}
