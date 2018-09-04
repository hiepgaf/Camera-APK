package p000;

import android.app.backup.BackupManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: gou */
final class gou implements gol {
    /* renamed from: a */
    private final /* synthetic */ Context f17173a;

    gou(Context context) {
        this.f17173a = context;
    }

    /* renamed from: a */
    public final void mo1526a(String str) {
        BackupManager.dataChanged(this.f17173a.getPackageName());
    }
}
