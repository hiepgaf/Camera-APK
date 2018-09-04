package p000;

import android.app.AlertDialog;

/* compiled from: PG */
/* renamed from: gtn */
final class gtn implements kov {
    /* renamed from: a */
    public final /* synthetic */ AlertDialog f17324a;
    /* renamed from: b */
    private final /* synthetic */ gtm f17325b;

    gtn(gtm gtm, AlertDialog alertDialog) {
        this.f17325b = gtm;
        this.f17324a = alertDialog;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        if (((Long) obj).longValue() < 0) {
            AlertDialog alertDialog = this.f17324a;
            if (!(alertDialog == null || alertDialog.isShowing())) {
                this.f17325b.f17322c.execute(new gto(this));
            }
            bli.m869c(gtm.f17320a, "Available storage space is too low.");
        }
    }
}
