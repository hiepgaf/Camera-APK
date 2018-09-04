package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zzch;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: iim */
final class iim extends iik {
    /* renamed from: a */
    private final List f23350a;

    iim(ici ici, List list) {
        super(ici);
        this.f23350a = list;
    }

    /* renamed from: a */
    public final void mo3479a(zzch zzch) {
        String str;
        int i = zzch.f20723a;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            default:
                str = htl.m3401a(i);
                break;
        }
        Status status = new Status(i, str);
        zzao zzao = zzch.f20724b;
        m16058a(new igh(status));
        if (zzch.f20723a != 0) {
            for (FutureTask cancel : this.f23350a) {
                cancel.cancel(true);
            }
        }
    }
}
