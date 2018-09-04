package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: aww */
public final class aww implements awv, emu, eol {
    /* renamed from: f */
    private static final String f10461f = bli.m862a("PermissionsChecker");
    /* renamed from: a */
    public final Activity f10462a;
    /* renamed from: b */
    public final awi f10463b;
    /* renamed from: c */
    public final Resources f10464c;
    /* renamed from: d */
    public final awr f10465d;
    /* renamed from: e */
    public OnClickListener f10466e = new awx(this);
    /* renamed from: g */
    private final KeyguardManager f10467g;
    /* renamed from: h */
    private final gos f10468h;
    /* renamed from: i */
    private final axc f10469i;
    /* renamed from: j */
    private final ikd f10470j;
    /* renamed from: k */
    private int f10471k;
    /* renamed from: l */
    private int f10472l;
    /* renamed from: m */
    private int f10473m;
    /* renamed from: n */
    private int f10474n;
    /* renamed from: o */
    private int f10475o;
    /* renamed from: p */
    private boolean f10476p;
    /* renamed from: q */
    private boolean f10477q;
    /* renamed from: r */
    private boolean f10478r;
    /* renamed from: s */
    private boolean f10479s;
    /* renamed from: t */
    private boolean f10480t;
    /* renamed from: u */
    private kpw f10481u;

    public aww(Activity activity, awi awi, gos gos, KeyguardManager keyguardManager, axc axc, Resources resources, awr awr, ikd ikd) {
        this.f10462a = activity;
        this.f10463b = awi;
        this.f10468h = gos;
        this.f10467g = keyguardManager;
        this.f10469i = axc;
        this.f10464c = resources;
        this.f10465d = awr;
        this.f10475o = 0;
        this.f10470j = ikd;
    }

    /* renamed from: a */
    public final kpk mo383a() {
        int i = 0;
        this.f10475o = 0;
        bli.m869c(f10461f, "Checking for critical permissions.");
        if (this.f10481u == null) {
            this.f10481u = kpw.m18056d();
        }
        this.f10476p = m7113a("android.permission.CAMERA");
        this.f10477q = m7113a("android.permission.RECORD_AUDIO");
        this.f10478r = m7113a("android.permission.READ_EXTERNAL_STORAGE");
        this.f10479s = m7113a("android.permission.WRITE_EXTERNAL_STORAGE");
        if (m7115c()) {
            this.f10480t = true;
        } else {
            this.f10480t = false;
            this.f10475o += 2;
        }
        if (this.f10476p && this.f10478r && this.f10479s && this.f10477q && this.f10480t) {
            return kow.m13617a(Boolean.valueOf(true));
        }
        if (!this.f10467g.isKeyguardLocked()) {
            Object obj = new String[this.f10475o];
            if (!this.f10476p) {
                obj[0] = "android.permission.CAMERA";
                i = 1;
            }
            if (!this.f10477q) {
                obj[i] = "android.permission.RECORD_AUDIO";
                this.f10471k = i;
                i++;
            }
            if (!this.f10478r) {
                obj[i] = "android.permission.READ_EXTERNAL_STORAGE";
                this.f10472l = i;
                i++;
            }
            if (!this.f10479s) {
                obj[i] = "android.permission.WRITE_EXTERNAL_STORAGE";
                this.f10472l = i;
                i++;
            }
            if (!(this.f10480t || m7115c())) {
                obj[i] = "android.permission.ACCESS_COARSE_LOCATION";
                this.f10473m = i;
                i++;
                obj[i] = "android.permission.ACCESS_FINE_LOCATION";
                this.f10474n = i;
            }
            axc axc = this.f10469i;
            jri.m13152b(obj);
            axc.f996a.requestPermissions(obj, 1);
            return this.f10481u;
        } else if (this.f10476p && this.f10477q && this.f10478r && this.f10479s) {
            knk knk = this.f10481u;
            if (knk != null) {
                knk.mo3557a(Boolean.valueOf(true));
                this.f10481u = null;
            }
            return kow.m13617a(Boolean.valueOf(true));
        } else {
            m7112a((int) R.string.error_permissions_keyguard_updated, true);
            return this.f10481u;
        }
    }

    /* renamed from: a */
    private final boolean m7113a(String str) {
        if (this.f10462a.checkSelfPermission(str) == 0) {
            return true;
        }
        this.f10475o++;
        return false;
    }

    /* renamed from: a */
    private static boolean m7114a(int[] iArr, int i) {
        return iArr[i] == 0;
    }

    /* renamed from: b */
    final void m7118b() {
        jri.m13152b(this.f10481u);
        this.f10481u.mo3557a(Boolean.valueOf(false));
        this.f10463b.m707a("Required camera permissions were not granted.");
    }

    /* renamed from: c */
    private final boolean m7115c() {
        boolean a = this.f10468h.mo1535a("default_scope", "pref_has_seen_permissions_dialogs");
        boolean z;
        if (this.f10462a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2;
        if (this.f10462a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (a && r0 == r3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo384a(int i, String[] strArr, int[] iArr) {
        jri.m13152b((Object) strArr);
        jri.m13152b((Object) iArr);
        if (i == 1) {
            int length = strArr.length;
            if (length != 0) {
                int length2 = iArr.length;
                if (length2 != 0) {
                    boolean z;
                    if (length == length2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jri.m13153b(z);
                    if (!this.f10476p) {
                        this.f10476p = aww.m7114a(iArr, 0);
                    }
                    if (!this.f10477q) {
                        this.f10477q = aww.m7114a(iArr, this.f10471k);
                    }
                    if (!this.f10478r) {
                        this.f10478r = aww.m7114a(iArr, this.f10472l);
                    }
                    if (!this.f10479s) {
                        this.f10479s = aww.m7114a(iArr, this.f10472l);
                    }
                    if (!(m7115c() || this.f10480t)) {
                        this.f10468h.mo1540b("default_scope", "pref_has_seen_permissions_dialogs", true);
                        if (!aww.m7114a(iArr, this.f10474n)) {
                            z = false;
                        } else if (aww.m7114a(iArr, this.f10473m)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f10480t = z;
                        this.f10468h.mo1540b("default_scope", "pref_camera_recordlocation_key", this.f10480t);
                    }
                    if (this.f10476p && this.f10477q && this.f10478r && this.f10479s) {
                        jri.m13152b(this.f10481u);
                        this.f10481u.mo3557a(Boolean.valueOf(true));
                        return;
                    }
                    m7112a((int) R.string.error_permissions_updated, false);
                    return;
                }
            }
            mo383a();
        }
    }

    /* renamed from: a */
    private final void m7112a(int i, boolean z) {
        this.f10470j.execute(new awy(this, i, z));
    }
}
