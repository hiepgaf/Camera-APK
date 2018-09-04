package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: htu */
public final class htu implements htj {
    /* renamed from: a */
    public static Boolean f18114a = null;
    /* renamed from: b */
    private static final Charset f18115b = Charset.forName("UTF-8");
    /* renamed from: c */
    private final htv f18116c;

    public htu() {
        this(new htv(null));
    }

    public htu(Context context) {
        this(new htv(context));
    }

    private htu(htv htv) {
        this.f18116c = (htv) htl.m3431b((Object) htv);
    }

    /* renamed from: a */
    private static htw m11980a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        String str2 = "";
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            String valueOf = String.valueOf(str);
            str2 = "Failed to parse the rule: ";
            Log.e("LogSamplerImpl", valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new htw(str2, parseLong, parseLong2);
            }
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("negative values not supported: ");
            stringBuilder.append(parseLong);
            stringBuilder.append("/");
            stringBuilder.append(parseLong2);
            Log.e("LogSamplerImpl", stringBuilder.toString());
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            valueOf = String.valueOf(str);
            String str3 = "parseLong() failed while parsing: ";
            Log.e("LogSamplerImpl", valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf), th);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo1778a(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str == null) {
            return true;
        }
        String valueOf;
        ContentResolver contentResolver = this.f18116c.f6656a;
        long a = contentResolver != null ? ibj.m3608a(contentResolver, "android_id") : 0;
        ContentResolver contentResolver2 = this.f18116c.f6656a;
        if (contentResolver2 != null) {
            String valueOf2 = String.valueOf("gms:playlog:service:sampling_");
            valueOf = String.valueOf(str);
            valueOf = ibj.m3612b(contentResolver2, valueOf.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf));
        } else {
            valueOf = null;
        }
        htw a2 = htu.m11980a(valueOf);
        if (a2 == null) {
            return true;
        }
        String str2 = a2.f6657a;
        if (str2 == null || str2.isEmpty()) {
            a = htl.m3394a(ByteBuffer.allocate(8).putLong(a).array());
        } else {
            byte[] bytes = str2.getBytes(f18115b);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
            allocate.putLong(a);
            a = htl.m3394a(allocate.array());
        }
        long j = a2.f6658b;
        long j2 = a2.f6659c;
        if (j < 0 || j2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("negative values not supported: ");
            stringBuilder.append(j);
            stringBuilder.append("/");
            stringBuilder.append(j2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (j2 > 0) {
            if ((a < 0 ? (((a & Long.MAX_VALUE) % j2) + ((Long.MAX_VALUE % j2) + 1)) % j2 : a % j2) < j) {
                return true;
            }
        }
        return false;
    }
}
