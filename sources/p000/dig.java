package p000;

import android.content.Intent;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: dig */
final class dig implements kov {
    /* renamed from: a */
    private final /* synthetic */ hkv f13372a;
    /* renamed from: b */
    private final /* synthetic */ dhz f13373b;

    dig(dhz dhz, hkv hkv) {
        this.f13373b = dhz;
        this.f13372a = hkv;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        synchronized (this.f13373b.f22901j) {
            if (this.f13373b.f22904m == dii.BACKGROUND) {
                bli.m873e(dhz.f22887d, "Ignoring openCamcorderDevice failure because state is BACKGROUND");
            } else if (th instanceof CancellationException) {
                bli.m873e(dhz.f22887d, "Ignoring openCamcorderDevice failure because it was cancelled");
            } else if (th instanceof gso) {
                bli.m866b(dhz.f22887d, "Ignoring openCamcorderDevice failure because of low storage space");
                r0 = this.f13373b;
                r0.f22896e.execute(new dia(r0, false));
            } else {
                bli.m867b(dhz.f22887d, "openCamcorderDevice onFailure: ", th);
                r0 = this.f13373b;
                r0.f22906o = null;
                r0.m17078m();
                this.f13373b.f22908q.mo2693a(th);
            }
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        boolean z = true;
        obj = (dil) obj;
        bli.m863a(dhz.f22887d, "openCamcorderDevice onSuccess");
        jri.m13152b(obj);
        synchronized (this.f13373b.f22901j) {
            if (this.f13373b.f22904m != dii.OPENING_CAMCORDER) {
                obj.close();
                return;
            }
            this.f13373b.f22904m = dii.CAMCORDER_OPENED;
            dhz dhz = this.f13373b;
            dhz.f22905n = obj;
            dil dil = dhz.f22905n;
            hkv hkv = this.f13372a;
            Intent intent = dhz.f22903l.f989a.getIntent();
            if (intent != null) {
                String action = intent.getAction();
                boolean booleanExtra = intent.getBooleanExtra("Video Action Processed", false);
                if (action == null) {
                    z = false;
                } else if (!action.equals("android.media.action.VIDEO_CAMERA")) {
                    z = false;
                } else if (booleanExtra) {
                    z = false;
                } else {
                    intent.putExtra("Video Action Processed", true);
                }
            } else {
                z = false;
            }
            dil.mo2963a(hkv, z);
            this.f13373b.f22906o = null;
        }
    }
}
