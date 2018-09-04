package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.Cursor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: crh */
final class crh implements crg {
    /* renamed from: a */
    private static final String f12555a = bli.m862a("FSListBuilder");
    /* renamed from: b */
    private final String f12556b;
    /* renamed from: c */
    private final cqm f12557c;
    /* renamed from: d */
    private final cqx f12558d;
    /* renamed from: e */
    private final ContentResolver f12559e;
    /* renamed from: f */
    private final cow f12560f;
    /* renamed from: g */
    private long f12561g;
    /* renamed from: h */
    private long f12562h;

    /* renamed from: a */
    private static /* synthetic */ void m8697a(Throwable th, Cursor cursor) {
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

    public crh(long j, cqm cqm, cqx cqx, ContentResolver contentResolver, cow cow, gsx gsx) {
        this.f12561g = j;
        this.f12562h = j;
        this.f12557c = (cqm) jri.m13152b((Object) cqm);
        this.f12558d = (cqx) jri.m13152b((Object) cqx);
        this.f12559e = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f12560f = (cow) jri.m13152b((Object) cow);
        this.f12556b = String.valueOf(gsx.mo1624b()).concat("%");
        String str = f12555a;
        long j2 = this.f12561g;
        long j3 = this.f12562h;
        StringBuilder stringBuilder = new StringBuilder(86);
        stringBuilder.append("Initialized lastPhotoUtcTimeMs: ");
        stringBuilder.append(j2);
        stringBuilder.append(" lastVideoId: ");
        stringBuilder.append(j3);
        bli.m871d(str, stringBuilder.toString());
    }

    /* renamed from: a */
    private static err m8695a(Cursor cursor, cpo cpo) {
        err err = null;
        if (cursor != null && cursor.getColumnCount() != 0) {
            while (cursor.moveToNext()) {
                err = cpo.mo1040a(cursor);
                if (err != null) {
                    break;
                }
                bli.m863a(f12555a, "Skipping item because failed to load.");
            }
        }
        return err;
    }

    /* renamed from: a */
    private static String m8696a(eru eru) {
        return new File(eru.f4154g).getParent();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.util.List mo1067a(int r12) {
        /*
        r11 = this;
        r10 = 68;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00bd }
        r0 = r11.f12556b;	 Catch:{ all -> 0x00bd }
        r1 = 0;
        r4[r1] = r0;	 Catch:{ all -> 0x00bd }
        r0 = r11.f12561g;	 Catch:{ all -> 0x00bd }
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x00bd }
        r1 = 1;
        r4[r1] = r0;	 Catch:{ all -> 0x00bd }
        r0 = r11.f12559e;	 Catch:{ all -> 0x00bd }
        r1 = p000.cqk.f2564a;	 Catch:{ all -> 0x00bd }
        r2 = p000.cqk.f2565b;	 Catch:{ all -> 0x00bd }
        r3 = "_data LIKE ? AND datetaken <= ?";
        r5 = "datetaken DESC";
        r7 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00bd }
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00b4 }
        r0 = r11.f12556b;	 Catch:{ all -> 0x00b4 }
        r1 = 0;
        r4[r1] = r0;	 Catch:{ all -> 0x00b4 }
        r0 = r11.f12562h;	 Catch:{ all -> 0x00b4 }
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x00b4 }
        r1 = 1;
        r4[r1] = r0;	 Catch:{ all -> 0x00b4 }
        r0 = r11.f12559e;	 Catch:{ all -> 0x00b4 }
        r1 = p000.cqr.f2568a;	 Catch:{ all -> 0x00b4 }
        r2 = p000.cqr.f2569b;	 Catch:{ all -> 0x00b4 }
        r3 = "_data LIKE ? AND datetaken <= ?";
        r5 = "datetaken DESC";
        r2 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00b4 }
        r0 = f12555a;	 Catch:{ all -> 0x00ab }
        r4 = r11.f12561g;	 Catch:{ all -> 0x00ab }
        r8 = r11.f12562h;	 Catch:{ all -> 0x00ab }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r3 = 67;
        r1.<init>(r3);	 Catch:{ all -> 0x00ab }
        r3 = "StartQuery with time: ";
        r1.append(r3);	 Catch:{ all -> 0x00ab }
        r1.append(r4);	 Catch:{ all -> 0x00ab }
        r3 = " and ";
        r1.append(r3);	 Catch:{ all -> 0x00ab }
        r1.append(r8);	 Catch:{ all -> 0x00ab }
        r1 = r1.toString();	 Catch:{ all -> 0x00ab }
        p000.bli.m871d(r0, r1);	 Catch:{ all -> 0x00ab }
        r1 = r11.m8694a(r7);	 Catch:{ all -> 0x00ab }
        r0 = r11.m8698b(r2);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8600a(r1);	 Catch:{ all -> 0x00ab }
        r11.f12561g = r4;	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8600a(r0);	 Catch:{ all -> 0x00ab }
        r11.f12562h = r4;	 Catch:{ all -> 0x00ab }
    L_0x007d:
        if (r1 == 0) goto L_0x0110;
    L_0x007f:
        if (r12 <= 0) goto L_0x00e1;
    L_0x0081:
        if (r1 == 0) goto L_0x009d;
    L_0x0083:
        if (r0 == 0) goto L_0x008d;
    L_0x0085:
        r4 = r11.f12561g;	 Catch:{ all -> 0x00ab }
        r8 = r11.f12562h;	 Catch:{ all -> 0x00ab }
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x009d;
    L_0x008d:
        r6.add(r1);	 Catch:{ all -> 0x00ab }
        r1 = r11.m8694a(r7);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8600a(r1);	 Catch:{ all -> 0x00ab }
        r11.f12561g = r4;	 Catch:{ all -> 0x00ab }
    L_0x009a:
        r12 = r12 + -1;
        goto L_0x007d;
    L_0x009d:
        r6.add(r0);	 Catch:{ all -> 0x00ab }
        r0 = r11.m8698b(r2);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8600a(r0);	 Catch:{ all -> 0x00ab }
        r11.f12562h = r4;	 Catch:{ all -> 0x00ab }
        goto L_0x009a;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x00ad:
        r1 = move-exception;
        if (r2 == 0) goto L_0x00b3;
    L_0x00b0:
        p000.crh.m8697a(r0, r2);	 Catch:{ all -> 0x00b4 }
    L_0x00b3:
        throw r1;	 Catch:{ all -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00bc;
    L_0x00b9:
        p000.crh.m8697a(r0, r7);	 Catch:{ all -> 0x00bd }
    L_0x00bc:
        throw r1;	 Catch:{ all -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        r1 = f12555a;
        r2 = r11.f12561g;
        r4 = r11.f12562h;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r10);
        r7 = "EndingQuery with time: ";
        r6.append(r7);
        r6.append(r2);
        r2 = " and ";
        r6.append(r2);
        r6.append(r4);
        r2 = r6.toString();
        p000.bli.m871d(r1, r2);
        throw r0;
    L_0x00e1:
        if (r2 == 0) goto L_0x00e7;
    L_0x00e3:
        r0 = 0;
        p000.crh.m8697a(r0, r2);	 Catch:{ all -> 0x00b4 }
    L_0x00e7:
        if (r7 == 0) goto L_0x00ed;
    L_0x00e9:
        r0 = 0;
        p000.crh.m8697a(r0, r7);	 Catch:{ all -> 0x00bd }
    L_0x00ed:
        r0 = f12555a;
        r2 = r11.f12561g;
        r4 = r11.f12562h;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r10);
        r7 = "EndingQuery with time: ";
        r1.append(r7);
        r1.append(r2);
        r2 = " and ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        p000.bli.m871d(r0, r1);
        return r6;
    L_0x0110:
        if (r0 == 0) goto L_0x00e1;
    L_0x0112:
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: crh.a(int):java.util.List");
    }

    /* renamed from: a */
    private final err m8694a(Cursor cursor) {
        err a = crh.m8695a(cursor, this.f12557c);
        if (a == null) {
            return null;
        }
        if (!cow.m1390a(a)) {
            return a;
        }
        int a2;
        String a3 = crh.m8696a(a.mo1033g());
        List arrayList = new ArrayList();
        arrayList.add(new cot((cql) a));
        while (cursor.moveToNext()) {
            cql b = this.f12557c.m8621b(cursor);
            if (!cow.m1390a(b) || !a3.equals(crh.m8696a(b.f12515e))) {
                cursor.moveToPrevious();
                break;
            }
            arrayList.add(new cot(b));
        }
        cow cow = this.f12560f;
        a = new cou(cow.f2531e, cow.f2529c, cow.f2528b, cow.f2530d, cov.m8502a(arrayList), cow.f2532f);
        eru eru = ((cot) ((cov) a.e).m8520c().get(0)).f12527c.f12515e;
        if (System.currentTimeMillis() - eru.f4153f.getTime() <= 60000) {
            a2 = new ckm(new File(eru.f4154g).getParentFile()).m1167a() ^ 1;
        } else {
            a2 = 0;
        }
        if (a2 != 0) {
            bli.m863a(cow.f2527a, "Burst creation failed because saving is in progress");
            a = null;
        }
        if (a == null) {
            m8694a(cursor);
            return null;
        }
        a3 = f12555a;
        int d = a.m15146d();
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("moveToNextPhotoItem() found burst of size: ");
        stringBuilder.append(d);
        bli.m871d(a3, stringBuilder.toString());
        return a;
    }

    /* renamed from: b */
    private final cqs m8698b(Cursor cursor) {
        return (cqs) crh.m8695a(cursor, this.f12558d);
    }
}
