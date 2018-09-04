package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dwk */
final class dwk implements aas {
    /* renamed from: a */
    private final /* synthetic */ dwd f14648a;

    dwk(dwd dwd) {
        this.f14648a = dwd;
    }

    /* renamed from: a */
    public final void mo1197a() {
        this.f14648a.f23048e.mo1548a(R.raw.panorama_single_photo_shutter_sound);
        hrg hrg = this.f14648a.f23062s;
        hrg.f6490a.setVisibility(0);
        hrg.f6490a.animate().alpha(0.0f).setDuration(300).setListener(new hrh(hrg));
    }
}
