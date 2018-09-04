package p000;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: cpn */
public final class cpn {
    /* renamed from: a */
    private static final String f2544a = bli.m862a("FilmstripQuery");
    /* renamed from: b */
    private static final String f2545b = String.valueOf(gtu.m2823a().mo1624b()).concat("%");

    /* renamed from: a */
    private static /* synthetic */ void m1394a(Throwable th, Cursor cursor) {
        if (th != null) {
            try {
                cursor.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        cursor.close();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public static java.util.List m1392a(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, long r10, java.lang.String r12, p000.cpo r13) {
        /*
        r0 = 2;
        r4 = new java.lang.String[r0];
        r0 = 0;
        r1 = f2545b;
        r4[r0] = r1;
        r0 = 1;
        r1 = java.lang.Long.toString(r10);
        r4[r0] = r1;
        r3 = "_data LIKE ? AND datetaken > ?";
        r0 = r7;
        r1 = r8;
        r2 = r9;
        r5 = r12;
        r1 = r0.query(r1, r2, r3, r4, r5);
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0030 }
        r2.<init>();	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x005f;
    L_0x0020:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x005f;
    L_0x0026:
        r0 = r13.mo1040a(r1);	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0039;
    L_0x002c:
        r2.add(r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0020;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        p000.cpn.m1394a(r0, r1);
    L_0x0038:
        throw r2;
    L_0x0039:
        r0 = "_data";
        r0 = r1.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x0030 }
        r3 = f2544a;	 Catch:{ all -> 0x0030 }
        r4 = "Error loading filmstrip item: ";
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0030 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0030 }
        r5 = r0.length();	 Catch:{ all -> 0x0030 }
        if (r5 != 0) goto L_0x005a;
    L_0x0051:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0030 }
        r0.<init>(r4);	 Catch:{ all -> 0x0030 }
    L_0x0056:
        p000.bli.m873e(r3, r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0020;
    L_0x005a:
        r0 = r4.concat(r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0056;
    L_0x005f:
        if (r1 == 0) goto L_0x0065;
    L_0x0061:
        r0 = 0;
        p000.cpn.m1394a(r0, r1);
    L_0x0065:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: cpn.a(android.content.ContentResolver, android.net.Uri, java.lang.String[], long, java.lang.String, cpo):java.util.List");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public static java.util.List m1393a(android.content.ContentResolver r6, android.net.Uri r7, java.lang.String[] r8, java.lang.String r9) {
        /*
        r1 = 0;
        r0 = 2;
        r4 = new java.lang.String[r0];
        r0 = f2545b;
        r4[r1] = r0;
        r0 = 1;
        r2 = -1;
        r1 = java.lang.Long.toString(r2);
        r4[r0] = r1;
        r3 = "_data LIKE ? AND datetaken > ?";
        r0 = r6;
        r1 = r7;
        r2 = r8;
        r5 = r9;
        r1 = r0.query(r1, r2, r3, r4, r5);
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0043 }
        r2.<init>();	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x0072;
    L_0x0022:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0072;
    L_0x0028:
        r0 = r7.buildUpon();	 Catch:{ all -> 0x0043 }
        r3 = 0;
        r4 = r1.getLong(r3);	 Catch:{ all -> 0x0043 }
        r3 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0043 }
        r0 = r0.appendPath(r3);	 Catch:{ all -> 0x0043 }
        r0 = r0.build();	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x004c;
    L_0x003f:
        r2.add(r0);	 Catch:{ all -> 0x0043 }
        goto L_0x0022;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r2 = move-exception;
        if (r1 == 0) goto L_0x004b;
    L_0x0048:
        p000.cpn.m1394a(r0, r1);
    L_0x004b:
        throw r2;
    L_0x004c:
        r0 = "_data";
        r0 = r1.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x0043 }
        r3 = f2544a;	 Catch:{ all -> 0x0043 }
        r4 = "Error loading filmstrip item: ";
        r0 = r1.getString(r0);	 Catch:{ all -> 0x0043 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0043 }
        r5 = r0.length();	 Catch:{ all -> 0x0043 }
        if (r5 != 0) goto L_0x006d;
    L_0x0064:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0043 }
        r0.<init>(r4);	 Catch:{ all -> 0x0043 }
    L_0x0069:
        p000.bli.m873e(r3, r0);	 Catch:{ all -> 0x0043 }
        goto L_0x0022;
    L_0x006d:
        r0 = r4.concat(r0);	 Catch:{ all -> 0x0043 }
        goto L_0x0069;
    L_0x0072:
        if (r1 == 0) goto L_0x0078;
    L_0x0074:
        r0 = 0;
        p000.cpn.m1394a(r0, r1);
    L_0x0078:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: cpn.a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String):java.util.List");
    }
}
