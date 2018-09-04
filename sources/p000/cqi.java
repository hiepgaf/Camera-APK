package p000;

import android.database.Cursor;
import java.util.Date;

/* compiled from: PG */
/* renamed from: cqi */
public final class cqi {
    /* renamed from: a */
    private static final String f2563a = bli.m862a("PhotoDataFact");

    cqi() {
    }

    /* renamed from: a */
    public static eru m1408a(Cursor cursor) {
        kbg kbg;
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        long j2 = cursor.getLong(3);
        long j3 = cursor.getLong(4);
        Date date = new Date(j2);
        Date date2 = new Date(1000 * j3);
        String string3 = cursor.getString(5);
        int i = cursor.getInt(6);
        int i2 = cursor.getInt(7);
        int i3 = cursor.getInt(8);
        if (i2 <= 0 || i3 <= 0) {
            String str = f2563a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string3).length() + 63);
            stringBuilder.append("Zero dimension in ContentResolver for ");
            stringBuilder.append(string3);
            stringBuilder.append(": ");
            stringBuilder.append(i2);
            stringBuilder.append("x");
            stringBuilder.append(i3);
            bli.m873e(str, stringBuilder.toString());
            kbg = kau.f19138a;
        } else {
            kbg = kbg.m4745c(new iqp(i2, i3));
        }
        return new eru(j, string, string2, date, date2, string3, cqk.f2564a.buildUpon().appendPath(String.valueOf(j)).build(), false, kbg, cursor.getLong(9), i, erx.m2086a(cursor.getDouble(10), cursor.getDouble(11)), false);
    }
}
