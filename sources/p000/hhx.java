package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hhx */
public enum hhx {
    UNINITIALIZED(0, 0, 0),
    PHOTO(R.string.mode_camera, R.string.mode_camera_desc, R.drawable.ic_camera),
    VIDEO(R.string.mode_video, R.string.mode_video_desc, R.drawable.ic_videocam),
    PANORAMA(R.string.mode_panorama, R.string.mode_panorama_desc, R.drawable.ic_panorama_normal),
    IMAX(R.string.mode_panorama, R.string.mode_panorama_desc, R.drawable.ic_panorama_normal),
    PHOTO_SPHERE(R.string.mode_photosphere, R.string.mode_photosphere_desc, R.drawable.ic_photosphere_normal),
    SLOW_MOTION(R.string.mode_video_slomo, R.string.mode_video_slomo_desc, R.drawable.ic_slow_motion_video),
    LENS_BLUR(R.string.mode_refocus, R.string.mode_refocus_desc, R.drawable.ic_refocus),
    PORTRAIT(R.string.mode_gouda, R.string.mode_gouda_desc, R.drawable.ic_gouda),
    IMAGE_INTENT(R.string.mode_camera, R.string.mode_camera_desc, R.drawable.ic_camera),
    VIDEO_INTENT(R.string.mode_video, R.string.mode_video_desc, R.drawable.ic_videocam),
    ORNAMENT(R.string.mode_ornament, R.string.mode_ornament_desc, R.drawable.ic_ornaments),
    LENS(R.string.mode_lens, R.string.mode_lens_desc, R.drawable.quantum_ic_google_lens_white_24),
    SETTINGS(R.string.mode_settings, R.string.settings_open_desc, R.drawable.ic_settings_normal_nopadding);
    
    /* renamed from: o */
    public final int f6214o;
    /* renamed from: p */
    public final int f6215p;
    /* renamed from: q */
    private final int f6216q;

    private hhx(int i, int i2, int i3) {
        this.f6214o = i;
        this.f6215p = i2;
        this.f6216q = i3;
    }

    /* renamed from: a */
    public final Drawable m3151a(Resources resources) {
        return resources.getDrawable(this.f6216q, null);
    }

    /* renamed from: a */
    public static boolean m3150a(hhx hhx, boolean z) {
        if (z) {
            return keu.m13473a(PORTRAIT, PHOTO).contains(hhx);
        }
        return PHOTO.equals(hhx);
    }

    /* renamed from: a */
    public static hhx m3149a(String str) {
        return (hhx) Enum.valueOf(hhx.class, str);
    }
}
