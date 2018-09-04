package p000;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hqs */
final class hqs extends AsyncTask {
    /* renamed from: a */
    private int f6457a;
    /* renamed from: b */
    private int f6458b;
    /* renamed from: c */
    private final /* synthetic */ hqq f6459c;

    hqs(hqq hqq) {
        this.f6459c = hqq;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f6457a = m3288a(hqq.f6449a);
        this.f6458b = m3288a(hqq.f6450b);
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i = this.f6457a;
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Lens availability result:");
        stringBuilder.append(i);
        Log.i("LensSdkParamsReader", stringBuilder.toString());
        i = this.f6458b;
        stringBuilder = new StringBuilder(40);
        stringBuilder.append("Stickers availability result:");
        stringBuilder.append(i);
        Log.i("LensSdkParamsReader", stringBuilder.toString());
        hqq hqq = this.f6459c;
        hra hra = hqq.f6454e;
        hra.f21619c = this.f6457a;
        hra.f21620d = this.f6458b;
        hqq.f6455f = true;
        for (hqr a : hqq.f6453d) {
            a.mo1774a(this.f6459c.f6454e);
        }
        this.f6459c.f6453d.clear();
    }

    /* renamed from: a */
    private final int m3288a(String str) {
        Throwable th;
        Cursor cursor;
        try {
            Cursor query = this.f6459c.f6452c.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        int parseInt = Integer.parseInt(query.getString(0));
                        if (parseInt > 6) {
                            parseInt = 6;
                        }
                        if (query == null) {
                            return parseInt;
                        }
                        query.close();
                        return parseInt;
                    }
                } catch (Throwable th2) {
                    Cursor cursor2 = query;
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return 4;
        } catch (Throwable th22) {
            th = th22;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
