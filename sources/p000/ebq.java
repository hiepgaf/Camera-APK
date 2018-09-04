package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Parcelable;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: ebq */
public final class ebq implements emm, eol {
    /* renamed from: a */
    public static final String f14940a = bli.m862a("Photos1UpLauncher");
    /* renamed from: b */
    public final kwa f14941b;
    /* renamed from: c */
    public boolean f14942c = false;
    /* renamed from: d */
    public Activity f14943d;
    /* renamed from: e */
    private final Context f14944e;
    /* renamed from: f */
    private final boolean f14945f;
    /* renamed from: g */
    private final edb f14946g;
    /* renamed from: h */
    private final bmb f14947h;
    /* renamed from: i */
    private final bkv f14948i;
    /* renamed from: j */
    private final awr f14949j;
    /* renamed from: k */
    private final gmv f14950k;
    /* renamed from: l */
    private final irh f14951l;
    /* renamed from: m */
    private final irs f14952m;
    /* renamed from: n */
    private final hco f14953n;
    /* renamed from: o */
    private final hjy f14954o;

    static {
        bsb bsb = new bsb("camera.closeonphotos");
    }

    public ebq(Context context, boolean z, kwa kwa, edb edb, bmb bmb, bkv bkv, awr awr, gmv gmv, irs irs, irh irh, bsn bsn, Activity activity, hco hco, enr enr, ikd ikd, hjy hjy) {
        this.f14944e = context;
        this.f14945f = z;
        this.f14941b = kwa;
        this.f14946g = edb;
        this.f14947h = bmb;
        this.f14948i = bkv;
        this.f14949j = awr;
        this.f14950k = gmv;
        this.f14951l = irh;
        this.f14952m = irs;
        this.f14953n = hco;
        this.f14943d = activity;
        this.f14954o = hjy;
        eio.m1756a(ikd, enr, this);
    }

    /* renamed from: a */
    final err m9633a(hfz hfz) {
        for (int i = 0; i < hfz.mo1016c(); i++) {
            err a = hfz.mo1000a(i);
            if (a == null) {
                String str = f14940a;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("filmstrip item not found at ");
                stringBuilder.append(i);
                bli.m866b(str, stringBuilder.toString());
            } else {
                Uri uri = a.mo1033g().f4155h;
                String str2 = f14940a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 55);
                stringBuilder2.append("getting filmstrip item at index ");
                stringBuilder2.append(i);
                stringBuilder2.append(" with uri = ");
                stringBuilder2.append(valueOf);
                bli.m871d(str2, stringBuilder2.toString());
                if ((this.f14950k.f17093a.contains(uri) ^ 1) != 0) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    final void m9635a(csp csp, hfz hfz, err err) {
        int i;
        String str;
        glw glw;
        Uri uri;
        glw glw2;
        eqi eqi;
        String str2;
        boolean z = this.f14945f;
        int d = hfz.mo1019d();
        String str3 = f14940a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("number of items in secure session ");
        stringBuilder.append(d);
        bli.m863a(str3, stringBuilder.toString());
        Collection arrayList = new ArrayList();
        for (int i2 = 0; i2 < d; i2++) {
            err a = hfz.mo1000a(i2);
            if (a != null) {
                ken a2 = a.mo1033g().mo995a();
                if (a2.isEmpty()) {
                    arrayList.add(Long.valueOf(a.mo1033g().f4149b));
                } else {
                    int size = a2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        i = i3 + 1;
                        Long l = (Long) a2.get(i3);
                        if (l.longValue() != -1) {
                            arrayList.add(l);
                            i3 = i;
                        } else {
                            i3 = i;
                        }
                    }
                }
            }
        }
        long[] a3 = khx.m4943a(arrayList);
        String str4 = f14940a;
        i = arrayList.size();
        String arrays = Arrays.toString(a3);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(arrays).length() + 45);
        stringBuilder2.append("Returning ");
        stringBuilder2.append(i);
        stringBuilder2.append(" items from mediastore. ");
        stringBuilder2.append(arrays);
        bli.m863a(str4, stringBuilder2.toString());
        Intent intent = new Intent("com.android.camera.action.REVIEW");
        intent.setPackage("com.google.android.apps.photos");
        intent.addFlags(1);
        if (z) {
            intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            if (a3.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", a3);
            }
        }
        long a4 = this.f14952m.mo1566a();
        jri.m13145a(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (a4 == 0) {
            str = "0";
        } else if (a4 > 0) {
            str = Long.toString(a4, 10);
        } else {
            char[] cArr = new char[64];
            long j = (a4 >>> 1) / 5;
            cArr[63] = Character.forDigit((int) (a4 - (10 * j)), 10);
            i = 63;
            while (j > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j % 10), 10);
                j /= 10;
            }
            str = new String(cArr, i, 64 - i);
        }
        intent.putExtra("external_session_id", str);
        eri k = err.mo1037k();
        if (k != null) {
            erj erj = k.f4114b;
            if (erj.f4128n) {
                glw = glw.PORTRAIT;
            } else if (erj.f4124j || erj.f4127m || erj.f4126l) {
                glw = glw.BURST;
            } else if (erj.f4123i) {
                glw = glw.LENS_BLUR;
            } else if (erj.f4120f) {
                glw = glw.PANORAMA;
            } else if (erj.f4121g) {
                glw = glw.PHOTOSPHERE;
            } else if (erj.f4117c > 0 && erj.f4119e > 0 && erj.f4118d > 0 && erj.f4116b.length() > 0) {
                glw = glw.VIDEO;
            }
            uri = err.mo1033g().f4155h;
            if (uri.getScheme().equals("camera_session")) {
                intent.setData(uri);
                glw2 = glw;
            } else {
                eqi = (eqi) this.f14950k.f17094b.get(uri);
                if (eqi != null) {
                    glw = eqi.mo1265d();
                }
                if (eqi == null) {
                    uri = eqi.mo1264c();
                } else {
                    uri = err.mo1033g().e_();
                }
                intent.setDataAndType(uri, ixx.JPEG.f7545i);
                str2 = f14940a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder3.append("Intent.setDataAndType: uri=");
                stringBuilder3.append(valueOf);
                bli.m863a(str2, stringBuilder3.toString());
                Parcelable build = new Builder().scheme("content").authority(this.f14948i.f1254b).appendPath("processing").appendPath(uri.getLastPathSegment()).build();
                intent.putExtra("processing_uri_intent_extra", build);
                str2 = f14940a;
                str3 = String.valueOf(build);
                stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 56);
                stringBuilder2.append("Intent.putExtra: name=processing_uri_intent_extra value=");
                stringBuilder2.append(str3);
                bli.m863a(str2, stringBuilder2.toString());
                glw2 = glw;
            }
            str4 = f14940a;
            str2 = String.valueOf(intent);
            stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 7);
            stringBuilder2.append("intent ");
            stringBuilder2.append(str2);
            bli.m869c(str4, stringBuilder2.toString());
            if (intent.resolveActivity(this.f14944e.getPackageManager()) == null) {
                this.f14946g.mo3425y();
                this.f14952m.mo1590a(str, err.mo1033g().f4156i, glw2);
                if (this.f14954o.m3215a("3.9")) {
                    this.f14949j.m720a(intent, R.anim.on_photos_enter, R.anim.on_camera_exit);
                } else {
                    this.f14949j.m720a(intent, R.anim.photos_transition_noanim, R.anim.photos_transition_noanim);
                }
                bli.m873e(f14940a, "Disconnecting the camera device because we are launching filmstrip.");
                this.f14951l.m4082a(false);
            }
            bli.m869c(f14940a, "no component found to handle google photos review intent.");
            this.f14942c = false;
            csp.mo768l();
            return;
        }
        glw = glw.UNKNOWN;
        uri = err.mo1033g().f4155h;
        if (uri.getScheme().equals("camera_session")) {
            intent.setData(uri);
            glw2 = glw;
        } else {
            eqi = (eqi) this.f14950k.f17094b.get(uri);
            if (eqi != null) {
                glw = eqi.mo1265d();
            }
            if (eqi == null) {
                uri = err.mo1033g().e_();
            } else {
                uri = eqi.mo1264c();
            }
            intent.setDataAndType(uri, ixx.JPEG.f7545i);
            str2 = f14940a;
            String valueOf2 = String.valueOf(uri);
            StringBuilder stringBuilder32 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
            stringBuilder32.append("Intent.setDataAndType: uri=");
            stringBuilder32.append(valueOf2);
            bli.m863a(str2, stringBuilder32.toString());
            Parcelable build2 = new Builder().scheme("content").authority(this.f14948i.f1254b).appendPath("processing").appendPath(uri.getLastPathSegment()).build();
            intent.putExtra("processing_uri_intent_extra", build2);
            str2 = f14940a;
            str3 = String.valueOf(build2);
            stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 56);
            stringBuilder2.append("Intent.putExtra: name=processing_uri_intent_extra value=");
            stringBuilder2.append(str3);
            bli.m863a(str2, stringBuilder2.toString());
            glw2 = glw;
        }
        str4 = f14940a;
        str2 = String.valueOf(intent);
        stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 7);
        stringBuilder2.append("intent ");
        stringBuilder2.append(str2);
        bli.m869c(str4, stringBuilder2.toString());
        if (intent.resolveActivity(this.f14944e.getPackageManager()) == null) {
            bli.m869c(f14940a, "no component found to handle google photos review intent.");
            this.f14942c = false;
            csp.mo768l();
            return;
        }
        this.f14946g.mo3425y();
        this.f14952m.mo1590a(str, err.mo1033g().f4156i, glw2);
        if (this.f14954o.m3215a("3.9")) {
            this.f14949j.m720a(intent, R.anim.on_photos_enter, R.anim.on_camera_exit);
        } else {
            this.f14949j.m720a(intent, R.anim.photos_transition_noanim, R.anim.photos_transition_noanim);
        }
        bli.m873e(f14940a, "Disconnecting the camera device because we are launching filmstrip.");
        this.f14951l.m4082a(false);
    }

    /* renamed from: J */
    public final boolean mo1208J() {
        bli.m863a(f14940a, "onBackPressed");
        return this.f14942c ? ((csp) ((FragmentManager) jri.m13152b(this.f14943d.getFragmentManager())).findFragmentById(R.id.filmstrip_fragment)).mo759c().mo773b() : false;
    }

    /* renamed from: a */
    public final void m9634a(csp csp) {
        ikd.m12259a();
        ArrayList c = khb.m4895c(this.f14953n.f5988b);
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((hcn) c.get(i)).close();
            i = i2;
        }
        if (!this.f14947h.m884b()) {
            csp.mo768l();
        } else if (this.f14942c) {
            bli.m869c(f14940a, "Already animating");
        } else {
            this.f14942c = true;
            csp.mo757a(new ebs(this, csp));
        }
    }
}
