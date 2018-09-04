package p000;

import android.os.SystemClock;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfu */
final class dfu implements emc {
    /* renamed from: a */
    private final /* synthetic */ des f13110a;

    dfu(des des) {
        this.f13110a = des;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1141a(Object obj) {
        bli.m863a(des.f22792c, "captureListener");
        des des = this.f13110a;
        if (des.f22833s == 0) {
            des.f22807O = SystemClock.elapsedRealtime();
            des = this.f13110a;
            des.f22827m = true;
            des.f22795C.mo3011J();
        }
        this.f13110a.f22838x.mo1701c();
        des = this.f13110a;
        des.f22833s++;
        des.f22796D.sendEmptyMessage(101);
        this.f13110a.f22821g.mo1548a(R.raw.panorama_single_photo_shutter_sound);
        des = this.f13110a;
        if (!des.f22832r) {
            des.f22832r = true;
            des.f22809R.m2513d();
        }
    }
}
