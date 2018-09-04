package p000;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: bpm */
public final class bpm extends Exception {
    bpm() {
    }

    public bpm(Status status) {
        super(status.f20469f);
    }

    public bpm(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Failed to link shader program:\n";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        super(valueOf);
    }
}
