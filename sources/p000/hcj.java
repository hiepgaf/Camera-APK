package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: hcj */
public abstract class hcj {
    /* renamed from: a */
    public abstract boolean mo1702a();

    /* renamed from: b */
    public abstract Drawable mo1703b();

    /* renamed from: c */
    public abstract int mo1704c();

    /* renamed from: d */
    public abstract int mo1705d();

    /* renamed from: e */
    public abstract hbf mo1706e();

    /* renamed from: f */
    public abstract int mo1707f();

    /* renamed from: g */
    public abstract int mo1708g();

    /* renamed from: h */
    public abstract int mo1709h();

    /* renamed from: i */
    public abstract int mo1710i();

    /* renamed from: j */
    public abstract int mo1711j();

    /* renamed from: k */
    public abstract int mo1712k();

    /* renamed from: l */
    public abstract int mo1713l();

    /* renamed from: m */
    public abstract int mo1714m();

    /* renamed from: n */
    public abstract int mo1715n();

    /* renamed from: o */
    public abstract int mo1716o();

    /* renamed from: p */
    public abstract int mo1717p();

    /* renamed from: a */
    private static hck m3030a(hbf hbf) {
        hck h = new hck((byte) 0).m3050a(hbf).m3051a(false).m3065h(0);
        h.f5963c = null;
        return h.m3049a(0).m3053b(-1).m3063g(0).m3061f(0);
    }

    /* renamed from: a */
    public static hcj m3029a(hbf hbf, Resources resources) {
        hck k;
        switch (hbf.ordinal()) {
            case 0:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(Illuminant.kOther).m3057d(resources.getColor(R.color.camera_mode_idle_color, null)).m3072m(0).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(0).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3061f(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3063g(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 1:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(0).m3057d(-1).m3072m(0).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(0).m3051a(true).m3065h(Illuminant.kOther).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 2:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_radius)).m3055c(Illuminant.kOther).m3057d(-1).m3072m(0).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(0).m3067i(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_radius)).m3061f(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius)).m3063g(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_radius)).m3048a();
            case 3:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius)).m3055c(0).m3057d(-1).m3072m(0).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(0).m3051a(true).m3065h(Illuminant.kOther).m3067i(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_pressed_radius)).m3061f(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius) / 2).m3063g(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius) / 2).m3069j(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_radius)).m3048a();
            case 4:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(0).m3057d(-1).m3072m(0).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(0).m3051a(true).m3065h(Illuminant.kOther).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3053b(resources.getColor(R.color.camera_mode_color, null)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 5:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3055c(0).m3057d(resources.getColor(R.color.camera_mode_idle_color, null)).m3071l(resources.getColor(R.color.video_mode_color, null)).m3072m(resources.getDimensionPixelSize(R.dimen.video_button_inner_radius)).m3070k(0).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 6:
                k = hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3055c(Illuminant.kOther).m3057d(resources.getColor(R.color.camera_button_cancel_color, null)).m3071l(resources.getColor(R.color.video_mode_color, null)).m3072m(0).m3070k(0);
                k.f5963c = resources.getDrawable(R.drawable.ic_cancel, null);
                return k.m3049a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 7:
                k = hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(Illuminant.kOther).m3057d(resources.getColor(R.color.camera_mode_idle_color, null)).m3071l(resources.getColor(R.color.camera_mode_idle_color, null)).m3072m(0).m3070k(0);
                k.f5963c = resources.getDrawable(R.drawable.ic_check, null);
                return k.m3049a((int) ((((float) resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth()) * 1.75f) / 2.0f)).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 8:
                k = hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(Illuminant.kOther).m3057d(-1).m3071l(resources.getColor(R.color.camera_button_cancel_color, null)).m3072m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3070k(0);
                k.f5963c = resources.getDrawable(R.drawable.ic_check, null);
                return k.m3049a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 9:
                k = hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3055c(Illuminant.kOther).m3057d(-1).m3071l(resources.getColor(R.color.camera_mode_color, null)).m3072m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3070k(0);
                k.f5963c = resources.getDrawable(R.drawable.ic_check, null);
                return k.m3049a(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            case 10:
                return hcj.m3030a(hbf).m3059e(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3055c(Illuminant.kOther).m3057d(-1).m3072m(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3071l(resources.getColor(R.color.video_mode_color, null)).m3070k(resources.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2).m3067i(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius)).m3069j(resources.getDimensionPixelSize(R.dimen.photo_button_radius)).m3048a();
            default:
                String valueOf = String.valueOf(hbf);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                stringBuilder.append("Shutter mode not supported: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: q */
    public final hck m3047q() {
        hck k = hcj.m3030a(mo1706e()).m3059e(mo1709h()).m3055c(mo1707f()).m3057d(mo1708g()).m3072m(mo1717p()).m3071l(mo1716o()).m3070k(mo1715n());
        k.f5963c = mo1703b();
        return k.m3049a(mo1704c()).m3051a(mo1702a()).m3065h(mo1712k()).m3067i(mo1713l()).m3053b(mo1705d()).m3061f(mo1710i()).m3063g(mo1711j()).m3069j(mo1714m());
    }
}
