package p000;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* compiled from: PG */
/* renamed from: gx */
class gx extends ha {
    gx() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public android.graphics.Typeface mo1665a(android.content.Context r6, p000.hq[] r7, int r8) {
        /*
        r5 = this;
        r0 = 0;
        r1 = r7.length;
        if (r1 > 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r1 = p000.ha.m2963a(r7, r8);
        r2 = r6.getContentResolver();
        r1 = r1.f6440a;	 Catch:{ IOException -> 0x004d }
        r3 = "r";
        r4 = 0;
        r2 = r2.openFileDescriptor(r1, r3, r4);	 Catch:{ IOException -> 0x004d }
        r1 = p000.gx.m11638a(r2);	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r3 = r1.canRead();	 Catch:{ all -> 0x0044 }
        if (r3 != 0) goto L_0x0039;
    L_0x0022:
        r3 = new java.io.FileInputStream;	 Catch:{ all -> 0x0044 }
        r1 = r2.getFileDescriptor();	 Catch:{ all -> 0x0044 }
        r3.<init>(r1);	 Catch:{ all -> 0x0044 }
        r1 = p000.ha.m2959a(r6, r3);	 Catch:{ all -> 0x004f }
        r3.close();	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0037;
    L_0x0034:
        r2.close();	 Catch:{ IOException -> 0x004d }
    L_0x0037:
        r0 = r1;
        goto L_0x0004;
    L_0x0039:
        r1 = android.graphics.Typeface.createFromFile(r1);	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0042;
    L_0x003f:
        r2.close();	 Catch:{ IOException -> 0x004d }
    L_0x0042:
        r0 = r1;
        goto L_0x0004;
    L_0x0044:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0046 }
    L_0x0046:
        r3 = move-exception;
        if (r2 == 0) goto L_0x004c;
    L_0x0049:
        r2.close();	 Catch:{ all -> 0x0056 }
    L_0x004c:
        throw r3;	 Catch:{ IOException -> 0x004d }
    L_0x004d:
        r1 = move-exception;
        goto L_0x0004;
    L_0x004f:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0051 }
    L_0x0051:
        r4 = move-exception;
        r3.close();	 Catch:{ all -> 0x005b }
    L_0x0055:
        throw r4;	 Catch:{ all -> 0x0044 }
    L_0x0056:
        r2 = move-exception;
        p000.kqg.m5044a(r1, r2);	 Catch:{ IOException -> 0x004d }
        goto L_0x004c;
    L_0x005b:
        r3 = move-exception;
        p000.kqg.m5044a(r1, r3);	 Catch:{ all -> 0x0044 }
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.a(android.content.Context, hq[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    private static File m11638a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(stringBuilder.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }
}
