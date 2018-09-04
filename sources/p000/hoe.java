package p000;

import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: hoe */
final class hoe implements kov {
    /* renamed from: a */
    private final /* synthetic */ hod f17959a;

    hoe(hod hod) {
        this.f17959a = hod;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m874e(hod.f21599a, "Connection suspended", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m863a(hod.f21599a, "Google API connected");
        Object obj2 = this.f17959a;
        if (obj2.f21603d) {
            huq huq = hjk.f6271a.f17906a;
            IntentFilter[] intentFilterArr = new IntentFilter[1];
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
            intentFilter.addDataScheme("wear");
            intentFilter.addDataAuthority("*", null);
            intentFilterArr[0] = intentFilter;
            huq.mo1846a(new iia(huq, obj2, huq.mo1847a(obj2), intentFilterArr));
            hod hod = this.f17959a;
            igo a = igo.m3744a("/camera_packet");
            a.f7001b.f6999a.put("camera_ready", Boolean.valueOf(true));
            hod.m15911a(a, null);
        }
    }
}
