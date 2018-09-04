package p000;

import android.net.Uri;
import android.nfc.NfcAdapter.CreateBeamUrisCallback;
import android.nfc.NfcEvent;

/* compiled from: PG */
/* renamed from: cfq */
public final class cfq implements CreateBeamUrisCallback {
    /* renamed from: a */
    private final /* synthetic */ cfk f1921a;

    public cfq(cfk cfk) {
        this.f1921a = cfk;
    }

    public final Uri[] createBeamUris(NfcEvent nfcEvent) {
        return this.f1921a.f20291q;
    }
}
