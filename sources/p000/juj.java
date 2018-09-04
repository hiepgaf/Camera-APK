package p000;

import android.util.Log;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: juj */
public final class juj implements juk {
    /* renamed from: a */
    private final Writer f19067a;
    /* renamed from: b */
    private final juf f19068b;
    /* renamed from: c */
    private final String f19069c;

    public juj(juf juf, String str, Writer writer) {
        this.f19068b = juf;
        this.f19069c = str;
        this.f19067a = writer;
    }

    /* renamed from: b */
    private final List m13240b(List list) {
        Writer stringWriter = new StringWriter();
        String str = this.f19069c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append("NEW CHAIN: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringWriter.write(stringBuilder.toString());
        juj.m13239a(list, stringWriter);
        for (juk juk : this.f19068b.f19065a) {
            String a = juj.m13238a(juk);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 23);
            stringBuilder2.append("  Applying Segmenter: ");
            stringBuilder2.append(a);
            stringBuilder2.append("\n");
            stringWriter.write(stringBuilder2.toString());
            list = juk.mo2054a(list);
            juj.m13239a(list, stringWriter);
        }
        stringWriter.write("CHAIN END. Final Result:\n");
        juj.m13239a(list, stringWriter);
        stringWriter.write("\n\n");
        synchronized (this.f19067a) {
            this.f19067a.write(stringWriter.toString());
        }
        return list;
    }

    /* renamed from: a */
    public final List mo2054a(List list) {
        try {
            return m13240b(list);
        } catch (IOException e) {
            Log.w("LoggingChainedResegmenter", "Cannot log segmentation chain. Reverting back to standard implementation.");
            return this.f19068b.mo2054a(list);
        }
    }

    /* renamed from: a */
    private static String m13238a(juk juk) {
        if (juk instanceof jvi) {
            return String.valueOf(((jvi) juk).f19070a.getClass().getSimpleName()).concat(" (cached)");
        }
        if (!(juk instanceof juj)) {
            return juk.getClass().getSimpleName();
        }
        juj juj = (juj) juk;
        String a = juj.m13238a(juj.f19068b);
        String str = juj.f19069c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 3) + String.valueOf(str).length());
        stringBuilder.append(a);
        stringBuilder.append(" (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m13239a(List list, Writer writer) {
        if (list.isEmpty()) {
            writer.write("    > [EMPTY SEGMENT LIST]\n");
        }
        for (juh juh : list) {
            String valueOf = String.valueOf(juh);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
            stringBuilder.append("    > ");
            stringBuilder.append(valueOf);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
            writer.write("      [\n");
            Iterator it = juh.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                StringBuilder stringBuilder2 = new StringBuilder(40);
                stringBuilder2.append("        timestamp: ");
                stringBuilder2.append(longValue);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
            }
            writer.write("      ]\n");
        }
    }
}
