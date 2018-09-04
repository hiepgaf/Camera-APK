package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.RefocusProgressView;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.ColorImage.Format;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.apps.refocus.processing.ProcessingNative;

/* compiled from: PG */
/* renamed from: dwl */
final class dwl implements aaf {
    /* renamed from: a */
    public final /* synthetic */ dwd f14649a;

    dwl(dwd dwd) {
        this.f14649a = dwd;
    }

    /* renamed from: a */
    public final void mo1198a(byte[] bArr) {
        int i = 0;
        dwd dwd = this.f14649a;
        dxj dxj = dwd.f23056m;
        if (dxj == null || dxj.f14688b == null) {
            bli.m873e(dwd.f23020d, "onPictureTaken called after camera released");
            return;
        }
        abo abo = dxj.f14692f;
        dwd.f23065v = new ColorImage(abo.m68b().f178a.x, abo.m68b().f178a.y, Format.fromImageFormat(abo.f147m), bArr);
        this.f14649a.f23022B.submit(new dwm(this));
        dwd = this.f14649a;
        dwd.f23055l.removeCallbacks(dwd.f23025E);
        dwd.f23055l.removeCallbacks(dwd.f23026F);
        RefocusProgressView refocusProgressView = dwd.f23057n;
        refocusProgressView.f2459a = false;
        refocusProgressView.m1348a(0.0f);
        dwd.f23057n.setVisibility(0);
        dwd.f23058o.setVisibility(8);
        dwd.f23059p.setText(R.string.refocus_instructions);
        dwd.f23059p.setVisibility(0);
        dwd.f23063t.m3311b();
        dwd.f23060q = new hrj();
        dxo dxo = dwd.f23064u;
        int i2 = dwd.f23056m.f14692f.m70c().f178a.x;
        int i3 = dwd.f23056m.f14692f.m70c().f178a.y;
        dxo.f3365e = (float) Math.max(i2, i3);
        ProcessingNative.StartTracker(dxo.f3366f, (int) Math.max((double) Math.round(Math.log((double) (Math.max(i2, i3) / DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX)) / Math.log(2.0d)), 0.0d));
        hrv.m3315a(hrv.f6526a, dxo.f3361a);
        float[] fArr = dxo.f3363c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        while (i < 64) {
            fArr = dxo.f3362b;
            fArr[i] = (float) (i2 / 2);
            fArr[i + 1] = (float) (i3 / 2);
            i += 2;
        }
        dxo.f3367g.reset();
        dwd.f23069z = new dxn(dwd.f23064u, dwd.f23068y, dwd.f23060q, dwd.f23063t);
        dwd.f23068y.m3314b();
        dwd.f23066w = go.ae;
        dwd.f23050g.mo3009D();
        this.f14649a.f23061r.m11633d();
    }
}
