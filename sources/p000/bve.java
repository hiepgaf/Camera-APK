package p000;

import android.support.v4.app.Person;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bve */
public enum bve {
    NONE(hrb.BADGE, R.string.photo_name, R.string.photo_description, R.drawable.ic_photo),
    REFOCUS(hrb.EDIT, R.string.refocus_name, R.string.refocus_description, R.drawable.ic_refocus, Integer.valueOf(R.string.refocus_action_name), Integer.valueOf(R.string.refocus_action_promote), "com.google.android.apps.refocus.ViewerActivity"),
    PANORAMA(hrb.BADGE, R.string.panorama_name, R.string.panorama_description, R.drawable.ic_panorama_normal),
    PHOTOSPHERE(hrb.BADGE, R.string.photosphere_name, R.string.photosphere_description, R.drawable.ic_photosphere_normal),
    BURSTS(hrb.BADGE, R.string.burst_name, R.string.burst_description, R.drawable.ic_burst_mode_white_36dp),
    PORTRAIT(hrb.BADGE, R.string.gouda_name, R.string.gouda_description, R.drawable.ic_gouda),
    DNG(hrb.BADGE, R.string.dng_name, R.string.dng_description, R.drawable.ic_photo);
    
    /* renamed from: h */
    public final hrb f1615h;
    /* renamed from: i */
    public final int f1616i;
    /* renamed from: j */
    public final int f1617j;
    /* renamed from: k */
    public final int f1618k;
    /* renamed from: l */
    private final Integer f1619l;
    /* renamed from: m */
    private final Integer f1620m;
    /* renamed from: n */
    private final String f1621n;

    private bve(hrb hrb, int i, int i2, int i3) {
        this(r11, r12, hrb, i, i2, i3, null, null, null);
    }

    private bve(hrb hrb, int i, int i2, int i3, Integer num, Integer num2, String str) {
        boolean z = true;
        this.f1615h = hrb;
        this.f1616i = i;
        this.f1617j = i2;
        this.f1618k = i3;
        this.f1620m = num2;
        this.f1619l = num;
        this.f1621n = str;
        bve.m1001a(this.f1617j, "description");
        bve.m1001a(this.f1618k, "icon");
        bve.m1001a(this.f1616i, Person.NAME_KEY);
        boolean z2;
        if (this.f1615h.equals(hrb.BADGE)) {
            if (this.f1621n == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bve.m1002a(z2, "Action activity must be null");
            if (this.f1619l == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bve.m1002a(z2, "Action description must be null");
            if (this.f1620m != null) {
                z = false;
            }
            bve.m1002a(z, "Action promotion message must be null");
            return;
        }
        if (this.f1621n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bve.m1002a(z2, "Action activity cannot be null");
        if (this.f1619l != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bve.m1002a(z2, "Action description cannot be null");
        if (this.f1620m == null) {
            z = false;
        }
        bve.m1002a(z, "Action promotion message cannot be null");
    }

    /* renamed from: a */
    private static void m1002a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    private static void m1001a(int i, String str) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        bve.m1002a(z, String.valueOf(str).concat(" must be a valid resource id"));
    }

    /* renamed from: a */
    public static kbg m1000a(String str) {
        if (kbi.m4752a(str)) {
            return kau.f19138a;
        }
        try {
            return kbg.m4744b(bve.m1003b(str));
        } catch (IllegalArgumentException e) {
            String[] split = str.split("-");
            if (split.length != 2 || !split[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                return kau.f19138a;
            }
            try {
                return kbg.m4744b(bve.m1003b(split[1]));
            } catch (IllegalArgumentException e2) {
                return kau.f19138a;
            } catch (NullPointerException e3) {
                return kau.f19138a;
            }
        }
    }

    /* renamed from: a */
    public final kbg m1004a() {
        Integer num = this.f1619l;
        if (num != null) {
            return kbg.m4745c(num);
        }
        return kau.f19138a;
    }

    /* renamed from: b */
    public final kbg m1005b() {
        if (this.f1621n == null || !this.f1615h.equals(hrb.EDIT)) {
            return kau.f19138a;
        }
        return kbg.m4745c(this.f1621n);
    }

    /* renamed from: c */
    public final kbg m1006c() {
        Integer num = this.f1620m;
        if (num != null) {
            return kbg.m4745c(num);
        }
        return kau.f19138a;
    }

    /* renamed from: d */
    public final String m1007d() {
        String valueOf = String.valueOf("com.google.android.apps.camera.gallery.specialtype.SpecialType-");
        String valueOf2 = String.valueOf(name());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: e */
    public final kbg m1008e() {
        if (this.f1621n == null || !this.f1615h.equals(hrb.INTERACT)) {
            return kau.f19138a;
        }
        return kbg.m4745c(this.f1621n);
    }

    /* renamed from: f */
    public final kbg m1009f() {
        if (this.f1621n == null || !this.f1615h.equals(hrb.LAUNCH)) {
            return kau.f19138a;
        }
        return kbg.m4745c(this.f1621n);
    }

    /* renamed from: b */
    private static bve m1003b(String str) {
        return (bve) Enum.valueOf(bve.class, str);
    }
}
