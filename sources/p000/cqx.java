package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

/* compiled from: PG */
/* renamed from: cqx */
public final class cqx implements cpo {
    /* renamed from: e */
    private static final String f12542e = bli.m862a("VideoItemFact");
    /* renamed from: a */
    public final Context f12543a;
    /* renamed from: b */
    public final cqb f12544b;
    /* renamed from: c */
    public final ContentResolver f12545c;
    /* renamed from: d */
    public final gsp f12546d;

    public cqx(Context context, ContentResolver contentResolver, cqb cqb, gsp gsp, cqp cqp) {
        this.f12543a = (Context) jri.m13152b((Object) context);
        this.f12545c = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f12544b = (cqb) jri.m13152b((Object) cqb);
        this.f12546d = (gsp) jri.m13152b((Object) gsp);
        jri.m13152b((Object) cqp);
    }

    /* renamed from: b */
    private final cqs m8669b(Cursor cursor) {
        cqv a = cqp.m1409a(cursor);
        if (a != null) {
            return new cqs(this.f12543a, this.f12544b, a, this);
        }
        bli.m873e(f12542e, "skipping item with null data, returning null for item");
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public final p000.cqs m8670a(android.net.Uri r8) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.f12543a;	 Catch:{ SQLiteException -> 0x0027 }
        r0 = r0.getContentResolver();	 Catch:{ SQLiteException -> 0x0027 }
        r2 = p000.cqr.f2569b;	 Catch:{ SQLiteException -> 0x0027 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ SQLiteException -> 0x0027 }
        if (r1 == 0) goto L_0x0025;
    L_0x0013:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x0023;
    L_0x0019:
        r0 = r7.m8669b(r1);	 Catch:{ all -> 0x004e }
    L_0x001d:
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ SQLiteException -> 0x0027 }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = r6;
        goto L_0x001d;
    L_0x0025:
        r0 = r6;
        goto L_0x001d;
    L_0x0027:
        r0 = move-exception;
        r1 = f12542e;
        r2 = java.lang.String.valueOf(r8);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 13;
        r4.<init>(r3);
        r3 = "Error in get ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        p000.bli.m874e(r1, r2, r0);
        r0 = r6;
        goto L_0x0022;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0056;
    L_0x0053:
        r1.close();	 Catch:{ all -> 0x0057 }
    L_0x0056:
        throw r2;	 Catch:{ SQLiteException -> 0x0027 }
    L_0x0057:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);	 Catch:{ SQLiteException -> 0x0027 }
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: cqx.a(android.net.Uri):cqs");
    }

    /* renamed from: a */
    public final /* synthetic */ err mo1040a(Cursor cursor) {
        return m8669b(cursor);
    }
}
