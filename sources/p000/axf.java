package p000;

import android.hardware.camera2.CaptureResult.Key;
import android.util.Pair;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.List;

/* compiled from: PG */
/* renamed from: axf */
public final class axf {
    /* renamed from: a */
    private static final String f997a = bli.m862a("CaptureDataSerilzr");

    /* renamed from: a */
    private static String m728a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (obj.getClass().isArray()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                stringBuilder.append(axf.m728a(Array.get(obj, i)));
                if (i != length - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        } else if (!(obj instanceof Pair)) {
            return obj.toString();
        } else {
            Pair pair = (Pair) obj;
            String a = axf.m728a(pair.first);
            String a2 = axf.m728a(pair.second);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a).length() + 9) + String.valueOf(a2).length());
            stringBuilder2.append("Pair: ");
            stringBuilder2.append(a);
            stringBuilder2.append(" / ");
            stringBuilder2.append(a2);
            return stringBuilder2.toString();
        }
    }

    /* renamed from: a */
    public static void m729a(String str, iwp iwp, File file) {
        try {
            Writer fileWriter = new FileWriter(file, true);
            axg axg = new axg(iwp, str);
            Writer bufferedWriter = new BufferedWriter(fileWriter);
            try {
                List<Key> c = axg.f998a.mo3145c();
                String format = String.format(null, axg.f999b, new Object[0]);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(format).length() + 1);
                stringBuilder.append(format);
                stringBuilder.append('\n');
                bufferedWriter.write(stringBuilder.toString());
                for (Key key : c) {
                    bufferedWriter.write(String.format(null, "    %s\n", new Object[]{key.getName()}));
                    bufferedWriter.write(String.format(null, "        %s\n", new Object[]{axf.m728a(axg.f998a.mo3143a(key))}));
                }
                try {
                    bufferedWriter.close();
                } catch (Throwable e) {
                    bli.m867b(f997a, "dumpMetadata - Failed to close writer.", e);
                }
            } catch (Throwable e2) {
                bli.m867b(f997a, "dumpMetadata - Failed to dump metadata", e2);
                try {
                    bufferedWriter.close();
                } catch (Throwable e22) {
                    bli.m867b(f997a, "dumpMetadata - Failed to close writer.", e22);
                }
            } catch (Throwable e222) {
                try {
                    bufferedWriter.close();
                } catch (Throwable e3) {
                    bli.m867b(f997a, "dumpMetadata - Failed to close writer.", e3);
                }
                throw e222;
            }
            fileWriter.close();
        } catch (Throwable e2222) {
            bli.m867b(f997a, "Could not write capture data to file.", e2222);
        }
    }
}
