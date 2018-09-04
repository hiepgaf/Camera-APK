package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jyt */
public final class jyt {
    /* renamed from: a */
    private final File f8079a;
    /* renamed from: b */
    private final Map f8080b = new HashMap();
    /* renamed from: c */
    private final String f8081c;

    public jyt(File file, String str) {
        jri.m13152b((Object) file);
        jri.m13152b((Object) str);
        this.f8079a = file;
        this.f8081c = str;
    }

    /* renamed from: a */
    public final void m4701a(String str, jyv jyv) {
        jri.m13152b((Object) str);
        jri.m13152b((Object) jyv);
        if (this.f8080b.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 57);
            stringBuilder.append("Cannot add log-writer for file '");
            stringBuilder.append(str);
            stringBuilder.append("' which is already taken!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f8080b.put(str, jyv);
    }

    /* renamed from: a */
    public final StringWriter m4699a(String str) {
        jri.m13152b((Object) str);
        StringWriter stringWriter = new StringWriter();
        m4701a(str, new jyu(stringWriter));
        return stringWriter;
    }

    /* renamed from: b */
    public final jyy m4702b(String str) {
        jri.m13152b((Object) str);
        Object jyy = new jyy();
        m4701a(str, jyy);
        return jyy;
    }

    /* renamed from: a */
    public final void m4700a() {
        String valueOf;
        Throwable th;
        Closeable closeable;
        for (Entry entry : this.f8080b.entrySet()) {
            File file = this.f8079a;
            String valueOf2 = String.valueOf(this.f8081c);
            String valueOf3 = String.valueOf((String) entry.getKey());
            if (valueOf3.length() == 0) {
                valueOf3 = new String(valueOf2);
            } else {
                valueOf3 = valueOf2.concat(valueOf3);
            }
            File file2 = new File(file, valueOf3);
            valueOf3 = String.valueOf(file2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 16);
            stringBuilder.append("Saving log file ");
            stringBuilder.append(valueOf3);
            Log.i("LogCollectionWriter", stringBuilder.toString());
            try {
                Closeable fileWriter = new FileWriter(file2);
                try {
                    ((jyv) entry.getValue()).mo2003a(fileWriter);
                    try {
                        kit.m4964a(fileWriter, true);
                    } catch (IOException e) {
                        valueOf = String.valueOf(e.getMessage());
                        valueOf3 = "Error closing file: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(valueOf3);
                        } else {
                            valueOf = valueOf3.concat(valueOf);
                        }
                        Log.e("LogCollectionWriter", valueOf);
                    }
                } catch (Throwable th2) {
                    Closeable closeable2 = fileWriter;
                    th = th2;
                    closeable = closeable2;
                }
            } catch (Throwable th22) {
                th = th22;
                closeable = null;
            }
        }
        return;
        try {
            kit.m4964a(closeable, true);
        } catch (IOException e2) {
            valueOf = String.valueOf(e2.getMessage());
            String str = "Error closing file: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.e("LogCollectionWriter", valueOf);
        }
        throw th;
        throw th;
    }
}
