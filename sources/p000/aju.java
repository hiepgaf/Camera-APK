package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: aju */
final class aju implements adw {
    /* renamed from: a */
    private static final String[] f9844a = new String[]{"_data"};
    /* renamed from: b */
    private final Context f9845b;
    /* renamed from: c */
    private final Uri f9846c;

    aju(Context context, Uri uri) {
        this.f9845b = context;
        this.f9846c = uri;
    }

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
    }

    /* renamed from: a */
    public final Class mo33a() {
        return File.class;
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        Object obj = null;
        Cursor query = this.f9845b.getContentResolver().query(this.f9846c, f9844a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    obj = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        if (TextUtils.isEmpty(obj)) {
            String valueOf = String.valueOf(this.f9846c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("Failed to find file path for: ");
            stringBuilder.append(valueOf);
            adx.mo36a(new FileNotFoundException(stringBuilder.toString()));
            return;
        }
        adx.mo37a(new File(obj));
    }
}
