package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: dfs */
final class dfs extends has {
    /* renamed from: a */
    private final /* synthetic */ des f20972a;

    dfs(des des) {
        this.f20972a = des;
    }

    /* renamed from: a */
    public final OnGestureListener mo1119a() {
        return null;
    }

    public final OnTouchListener k_() {
        return this.f20972a.f22805M;
    }

    public final void l_() {
        Handler handler = this.f20972a.f22801I;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    public final void mo1120d() {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        des des = this.f20972a;
        if (des.f22802J == null) {
            Object obj;
            des.f22840z = i;
            des.f22793A = i2;
            des.m17048o();
            this.f20972a.f22830p.mo2757l().m9600a();
            ebd l = this.f20972a.f22830p.mo2757l();
            SurfaceTexture surfaceTexture2 = l.f14892I;
            if (surfaceTexture2 != null) {
                han han = l.f14887D;
                if (han != null) {
                    surfaceTexture2.setDefaultBufferSize(han.mo1216c(), l.f14887D.mo1214b());
                    obj = this.f20972a;
                    obj.f22802J = new bwb(surfaceTexture, obj.f22801I, obj);
                    des = this.f20972a;
                    if (des.f22824j != null) {
                        des.m17054u();
                        this.f20972a.f22837w.mo2757l();
                        ebd.m9598i();
                        return;
                    }
                    return;
                }
            }
            bli.m873e(ebd.f14883a, "Could not set SurfaceTexture default buffer dimensions, not yet setup");
            obj = this.f20972a;
            obj.f22802J = new bwb(surfaceTexture, obj.f22801I, obj);
            des = this.f20972a;
            if (des.f22824j != null) {
                des.m17054u();
                this.f20972a.f22837w.mo2757l();
                ebd.m9598i();
                return;
            }
            return;
        }
        bli.m873e(des.f22792c, "onCameraAvailable queued before onSurfaceTextureAvailable");
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f20972a.m17053t();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = des.f22792c;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("onSurfaceTextureSizeChanged: ");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        bli.m871d(str, stringBuilder.toString());
        des des = this.f20972a;
        des.f22840z = i;
        des.f22793A = i2;
        Handler handler = des.f22801I;
        if (handler != null) {
            handler.obtainMessage(2, i, i2).sendToTarget();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
