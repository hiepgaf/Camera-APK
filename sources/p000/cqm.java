package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: cqm */
public final class cqm implements cpo {
    /* renamed from: b */
    private static final String f12522b = bli.m862a("PhotoItemFact");
    /* renamed from: a */
    public final ContentResolver f12523a;
    /* renamed from: c */
    private final Context f12524c;
    /* renamed from: d */
    private final cqb f12525d;
    /* renamed from: e */
    private final gsp f12526e;

    public cqm(Context context, cqb cqb, ContentResolver contentResolver, cqi cqi, gsp gsp) {
        this.f12524c = (Context) jri.m13152b((Object) context);
        this.f12525d = (cqb) jri.m13152b((Object) cqb);
        this.f12523a = (ContentResolver) jri.m13152b((Object) contentResolver);
        jri.m13152b((Object) cqi);
        this.f12526e = (gsp) jri.m13152b((Object) gsp);
    }

    /* renamed from: a */
    public final cql m8619a(Uri uri, boolean z, kbg kbg) {
        if (!this.f12526e.mo1641a(uri)) {
            return null;
        }
        Point e = this.f12526e.mo1646e(uri);
        if (e == null) {
            return null;
        }
        return new cql(this.f12524c, this.f12525d, cql.m15155a(uri, iqp.m4044a(e), this.f12526e.mo1647f(uri), z, kbg), this, this.f12526e);
    }

    /* renamed from: b */
    public final cql m8621b(Cursor cursor) {
        eru a = cqi.m1408a(cursor);
        if (a != null) {
            return new cql(this.f12524c, this.f12525d, a, this, this.f12526e);
        }
        bli.m873e(f12522b, "skipping item with null data, returning null for item");
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public final p000.cql m8618a(android.net.Uri r8) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.f12523a;	 Catch:{ SQLiteException -> 0x0023 }
        r2 = p000.cqk.f2565b;	 Catch:{ SQLiteException -> 0x0023 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ SQLiteException -> 0x0023 }
        if (r1 == 0) goto L_0x0021;
    L_0x000f:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r0 = r7.m8621b(r1);	 Catch:{ all -> 0x004a }
    L_0x0019:
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r1.close();	 Catch:{ SQLiteException -> 0x0023 }
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = r6;
        goto L_0x0019;
    L_0x0021:
        r0 = r6;
        goto L_0x0019;
    L_0x0023:
        r0 = move-exception;
        r1 = f12522b;
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
        goto L_0x001e;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        r1.close();	 Catch:{ all -> 0x0053 }
    L_0x0052:
        throw r2;	 Catch:{ SQLiteException -> 0x0023 }
    L_0x0053:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);	 Catch:{ SQLiteException -> 0x0023 }
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: cqm.a(android.net.Uri):cql");
    }

    /* renamed from: a */
    public final /* synthetic */ err mo1040a(Cursor cursor) {
        return m8621b(cursor);
    }
}
