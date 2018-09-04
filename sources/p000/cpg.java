package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: cpg */
final class cpg extends AsyncTask {
    cpg() {
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        for (err err : (err[]) objArr) {
            if (err.mo1032f().m2072a()) {
                err.mo1029a();
            } else {
                String str = coy.f12446a;
                String valueOf = String.valueOf(err);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                stringBuilder.append("Deletion is not supported:");
                stringBuilder.append(valueOf);
                bli.m871d(str, stringBuilder.toString());
            }
        }
        return null;
    }
}
