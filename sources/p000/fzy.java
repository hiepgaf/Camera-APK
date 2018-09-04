package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: fzy */
public class fzy {
    /* renamed from: a */
    public final fzm f4920a = new fzm(fzo.TIMER, kes.m4808b(fzp.TIMER_ZERO_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_off), fzp.TIMER_THREE_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_3s), fzp.TIMER_TEN_SECONDS, Integer.valueOf(R.drawable.ic_timer_normal_10s)), R.string.timer_options_desc, ken.m13455a(new fzn(fzp.TIMER_ZERO_SECONDS, R.drawable.ic_timer_normal_off, R.string.timer_off_desc, R.string.timer_off_desc), new fzn(fzp.TIMER_THREE_SECONDS, R.drawable.ic_timer_expanded_3s, R.string.timer_seconds_desc, R.string.timer_3_seconds_desc), new fzn(fzp.TIMER_TEN_SECONDS, R.drawable.ic_timer_expanded_10s, R.string.timer_seconds_desc, R.string.timer_10_seconds_desc)));
    /* renamed from: b */
    public final fzm f4921b = mo1437a();
    /* renamed from: c */
    public final fzm f4922c = new fzm(fzo.RAW_OUTPUT, kes.m4807b(fzp.UNSELECTED, Integer.valueOf(R.drawable.ic_raw_off_24dp), fzp.SELECTED, Integer.valueOf(R.drawable.ic_raw_on_24dp)), R.string.raw_output_desc, ken.m13454a(new fzn(fzp.UNSELECTED, R.drawable.ic_raw_off_24dp, R.string.raw_output_off_desc, R.string.raw_output_off_desc), new fzn(fzp.SELECTED, R.drawable.ic_raw_on_24dp, R.string.raw_output_on_desc, R.string.raw_output_on_desc)));
    /* renamed from: d */
    public final fzm f4923d;
    /* renamed from: e */
    public final fzm f4924e;
    /* renamed from: f */
    public final fzm f4925f;
    /* renamed from: g */
    public final fzm f4926g;
    /* renamed from: h */
    public final fzm f4927h;
    /* renamed from: i */
    public final fzm f4928i;
    /* renamed from: j */
    public final fzm f4929j;
    /* renamed from: k */
    public final fzm f4930k;
    /* renamed from: l */
    public final fzm f4931l;
    /* renamed from: m */
    public final fzm f4932m;
    /* renamed from: n */
    public final fzm f4933n;
    /* renamed from: o */
    public final fzm f4934o;
    /* renamed from: p */
    public final fzm f4935p;
    /* renamed from: q */
    public final fzm f4936q;

    public fzy() {
        fzo fzo = fzo.WHITE_BALANCE;
        Object obj = fzp.WHITE_BALANCE_AUTO;
        Object valueOf = Integer.valueOf(R.drawable.ic_wb_auto);
        Object obj2 = fzp.WHITE_BALANCE_CLOUDY;
        Object valueOf2 = Integer.valueOf(R.drawable.ic_wb_cloudy);
        Object obj3 = fzp.WHITE_BALANCE_SUNNY;
        Object valueOf3 = Integer.valueOf(R.drawable.ic_wb_sunny);
        Object obj4 = fzp.WHITE_BALANCE_FLUORESCENT;
        Object valueOf4 = Integer.valueOf(R.drawable.ic_wb_fluorescent);
        Object obj5 = fzp.WHITE_BALANCE_INCANDESCENT;
        Object valueOf5 = Integer.valueOf(R.drawable.ic_wb_incandescent);
        khb.m4892b(obj, valueOf);
        khb.m4892b(obj2, valueOf2);
        khb.m4892b(obj3, valueOf3);
        khb.m4892b(obj4, valueOf4);
        khb.m4892b(obj5, valueOf5);
        this.f4923d = new fzm(fzo, kgi.m13503a(5, new Object[]{obj, valueOf, obj2, valueOf2, obj3, valueOf3, obj4, valueOf4, obj5, valueOf5}), R.string.white_balance_options_desc, ken.m13456a(new fzn(fzp.WHITE_BALANCE_AUTO, R.drawable.ic_wb_auto, R.string.white_balance_auto_desc, R.string.white_balance_auto_desc), new fzn(fzp.WHITE_BALANCE_CLOUDY, R.drawable.ic_wb_cloudy, R.string.white_balance_cloudy_desc, R.string.white_balance_cloudy_desc), new fzn(fzp.WHITE_BALANCE_SUNNY, R.drawable.ic_wb_sunny, R.string.white_balance_sunny_desc, R.string.white_balance_sunny_desc), new fzn(fzp.WHITE_BALANCE_FLUORESCENT, R.drawable.ic_wb_fluorescent, R.string.white_balance_fluorescent_desc, R.string.white_balance_fluorescent_desc), new fzn(fzp.WHITE_BALANCE_INCANDESCENT, R.drawable.ic_wb_incandescent, R.string.white_balance_incandescent_desc, R.string.white_balance_incandescent_desc)));
        fzo fzo2 = fzo.PHOTO_FLASH;
        fzp fzp = fzp.PHOTO_FLASH_OFF;
        Integer valueOf6 = Integer.valueOf(R.drawable.ic_flash_normal_off);
        fzp fzp2 = fzp.PHOTO_FLASH_AUTO;
        Integer valueOf7 = Integer.valueOf(R.drawable.ic_flash_normal_auto);
        fzp fzp3 = fzp.PHOTO_FLASH_ON;
        Integer valueOf8 = Integer.valueOf(R.drawable.ic_flash_normal_on);
        this.f4924e = new fzm(fzo2, kes.m4808b(fzp, valueOf6, fzp2, valueOf7, fzp3, valueOf8), R.string.flash_options_desc, ken.m13455a(new fzn(fzp.PHOTO_FLASH_OFF, R.drawable.ic_flash_normal_off, R.string.flash_off_desc, R.string.flash_off_desc), new fzn(fzp.PHOTO_FLASH_AUTO, R.drawable.ic_flash_normal_auto, R.string.flash_auto_desc, R.string.flash_auto_desc), new fzn(fzp.PHOTO_FLASH_ON, R.drawable.ic_flash_normal_on, R.string.flash_on_desc, R.string.flash_on_desc)));
        this.f4925f = new fzm(fzo.VIDEO_FLASH, kes.m4807b(fzp.VIDEO_FLASH_OFF, valueOf6, fzp.VIDEO_FLASH_ON, valueOf8), R.string.flash_options_desc, ken.m13454a(new fzn(fzp.VIDEO_FLASH_OFF, R.drawable.ic_flash_normal_off, R.string.flash_off_desc, R.string.flash_off_desc), new fzn(fzp.VIDEO_FLASH_ON, R.drawable.ic_flash_normal_on, R.string.flash_on_desc, R.string.flash_on_desc)));
        fzo2 = fzo.FPS;
        fzp = fzp.FPS_AUTO;
        valueOf6 = Integer.valueOf(R.drawable.ic_fps_auto);
        fzp2 = fzp.FPS_30;
        valueOf7 = Integer.valueOf(R.drawable.ic_fps_30);
        fzp3 = fzp.FPS_60;
        valueOf8 = Integer.valueOf(R.drawable.ic_fps_60);
        this.f4926g = new fzm(fzo2, kes.m4808b(fzp, valueOf6, fzp2, valueOf7, fzp3, valueOf8), R.string.fps_options_desc, ken.m13454a(new fzn(fzp.FPS_30, R.drawable.ic_fps_expanded_30, R.string.fps_desc, R.string.fps_30_desc), new fzn(fzp.FPS_60, R.drawable.ic_fps_expanded_60, R.string.fps_desc, R.string.fps_60_desc)));
        this.f4927h = new fzm(fzo.FPS, kes.m4808b(fzp.FPS_AUTO, valueOf6, fzp.FPS_30, valueOf7, fzp.FPS_60, valueOf8), R.string.fps_options_desc, ken.m13455a(new fzn(fzp.FPS_AUTO, R.drawable.ic_fps_expanded_auto, R.string.fps_desc_auto, R.string.fps_auto_desc), new fzn(fzp.FPS_30, R.drawable.ic_fps_expanded_30, R.string.fps_desc, R.string.fps_30_desc), new fzn(fzp.FPS_60, R.drawable.ic_fps_expanded_60, R.string.fps_desc, R.string.fps_60_desc)));
        this.f4928i = new fzm(fzo.MICROPHONE, kes.m4807b(fzp.EXT_MICROPHONE_ON, Integer.valueOf(R.drawable.ic_ext_mic_on), fzp.EXT_MICROPHONE_OFF, Integer.valueOf(R.drawable.ic_ext_mic_off)), R.string.ext_mic_options_desc, ken.m13454a(new fzn(fzp.EXT_MICROPHONE_ON, R.drawable.ic_ext_mic_on, R.string.ext_mic_on_desc, R.string.ext_mic_on_acc_desc), new fzn(fzp.EXT_MICROPHONE_OFF, R.drawable.ic_ext_mic_off, R.string.ext_mic_off_desc, R.string.ext_mic_off_acc_desc)));
        this.f4929j = new fzm(fzo.MICROVIDEO, kes.m4808b(fzp.MICROVIDEO_OFF, Integer.valueOf(R.drawable.ic_motion_off), fzp.MICROVIDEO_ON, Integer.valueOf(R.drawable.ic_motion_recording), fzp.MICROVIDEO_AUTO, Integer.valueOf(R.drawable.ic_motion_auto_recording)), R.string.micro_desc, ken.m13455a(new fzn(fzp.MICROVIDEO_OFF, R.drawable.ic_motion_off, R.string.micro_off_desc, R.string.micro_off_desc), new fzn(fzp.MICROVIDEO_AUTO, R.drawable.ic_motion_auto, R.string.micro_auto_desc, R.string.micro_auto_desc), new fzn(fzp.MICROVIDEO_ON, R.drawable.ic_motion_on, R.string.micro_on_desc, R.string.micro_on_desc)));
        this.f4930k = new fzm(fzo.VESPER, kes.m4807b(fzp.VESPER_OFF, Integer.valueOf(R.drawable.ic_faceretouch_off), fzp.VESPER_ON, Integer.valueOf(R.drawable.ic_faceretouch_on)), R.string.faceretouch_desc, ken.m13454a(new fzn(fzp.VESPER_OFF, R.drawable.ic_faceretouch_off, R.string.faceretouch_off_desc, R.string.faceretouch_off_desc), new fzn(fzp.VESPER_ON, R.drawable.ic_faceretouch_on, R.string.faceretouch_on_desc, R.string.faceretouch_on_desc)));
        this.f4931l = new fzm(fzo.PANORAMA_HORIZONTAL, kes.m4807b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_horizontal_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_horizontal_white_24)), R.string.panorama_horizontal_desc, ken.m13464e());
        this.f4932m = new fzm(fzo.PANORAMA_VERTICAL, kes.m4807b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_vertical_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_vertical_white_24)), R.string.panorama_vertical_desc, ken.m13464e());
        this.f4933n = new fzm(fzo.PANORAMA_WIDE, kes.m4807b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_wide_angle_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_wide_angle_white_24)), R.string.panorama_wide_desc, ken.m13464e());
        this.f4934o = new fzm(fzo.PANORAMA_FISHEYE, kes.m4807b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_panorama_fish_eye_on_white_24), fzp.UNSELECTED, Integer.valueOf(R.drawable.quantum_ic_panorama_fish_eye_white_24)), R.string.panorama_fish_eye_desc, ken.m13464e());
        this.f4935p = new fzm(fzo.PANORAMA_PHOTOSPHERE, kes.m4807b(fzp.SELECTED, Integer.valueOf(R.drawable.ic_photosphere_selected_24dp), fzp.UNSELECTED, Integer.valueOf(R.drawable.ic_photosphere_normal)), R.string.photosphere_name, ken.m13464e());
        this.f4936q = new fzm(fzo.IMAX_AUDIO, kes.m4807b(fzp.IMAX_AUDIO_ON, Integer.valueOf(R.drawable.quantum_ic_mic_white_24), fzp.IMAX_AUDIO_OFF, Integer.valueOf(R.drawable.quantum_ic_mic_off_white_24)), R.string.ext_mic_options_desc, ken.m13454a(new fzn(fzp.IMAX_AUDIO_ON, R.drawable.quantum_ic_mic_white_24, R.string.ext_mic_on_desc, R.string.ext_mic_on_acc_desc), new fzn(fzp.IMAX_AUDIO_OFF, R.drawable.quantum_ic_mic_off_white_24, R.string.ext_mic_off_desc, R.string.ext_mic_off_acc_desc)));
    }

    /* renamed from: a */
    public fzm mo1437a() {
        return new fzm(fzo.HDR, kes.m4805a(fzp.HDR_OFF, Integer.valueOf(R.drawable.ic_hdr_off_active_24dp), fzp.HDR_AUTO, Integer.valueOf(R.drawable.ic_hdr_auto_active_24dp), fzp.HDR_ON, Integer.valueOf(R.drawable.ic_hdr_on_active_24dp), fzp.HDR_READY, Integer.valueOf(R.drawable.ic_hdr_auto_checkmark_active_24dp)), R.string.hdr_plus_options_desc, ken.m13455a(new fzn(fzp.HDR_OFF, R.drawable.ic_hdr_off_24dp, R.string.hdr_off_desc, R.string.hdr_off_desc), new fzn(fzp.HDR_AUTO, R.drawable.ic_hdr_auto_24dp, R.string.hdr_auto_desc, R.string.hdr_auto_desc), new fzn(fzp.HDR_ON, R.drawable.ic_hdr_on_24dp, R.string.hdr_on_desc, R.string.hdr_on_desc)));
    }
}
