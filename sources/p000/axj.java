package p000;

import android.app.ApplicationErrorReport.CrashInfo;

/* compiled from: PG */
/* renamed from: axj */
final class axj implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f10492a;
    /* renamed from: b */
    private final /* synthetic */ Exception f10493b;
    /* renamed from: c */
    private final /* synthetic */ axi f10494c;

    axj(axi axi, int i, Exception exception) {
        this.f10494c = axi;
        this.f10492a = i;
        this.f10493b = exception;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m863a(axi.f1001a, "Google API client connection suspended");
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        axi axi = this.f10494c;
        int i = this.f10492a;
        CrashInfo crashInfo = new CrashInfo(this.f10493b);
        hxv hxv = new hxv();
        hxv.f18135e = axi.f1005e;
        hxv = hxv.m12018a(crashInfo.exceptionClassName).m12020c(crashInfo.throwClassName).m12021d(crashInfo.throwFileName).m12022e(crashInfo.throwMethodName).m12019b(crashInfo.stackTrace);
        hxv.f18134d.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
        hxu a = hxv.m12017a(crashInfo.throwLineNumber);
        String valueOf = String.valueOf(axi.f1005e);
        String valueOf2 = String.valueOf(".CAMERA_ACCESS");
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a.f6796b = valueOf2;
        a.f6795a = axi.f1006f.getString(i);
        hxp.m3577b(hjk.f6271a.f17906a, a.mo1787a()).mo1807a(new axk(hjk));
    }
}
