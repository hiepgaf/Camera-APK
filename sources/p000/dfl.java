package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfl */
final class dfl implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ int f3033a = R.string.photosphere_no_back_camera;
    /* renamed from: b */
    private final /* synthetic */ des f3034b;

    dfl(des des) {
        this.f3034b = des;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cfh a = this.f3034b.f22830p;
        int i2 = this.f3033a;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("Fatal error in Panorama module: ");
        stringBuilder.append(i2);
        a.mo2745a(stringBuilder.toString());
    }
}
