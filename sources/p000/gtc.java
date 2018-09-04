package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: gtc */
public final class gtc implements gtb, ijk {
    /* renamed from: a */
    private static final String f17307a = bli.m862a("DcimFolderStartTask");
    /* renamed from: b */
    private final WeakReference f17308b;
    /* renamed from: c */
    private final awi f17309c;
    /* renamed from: d */
    private final gsx f17310d = new gte(gtu.m2823a());
    /* renamed from: e */
    private final kpw f17311e = kpw.m18056d();

    public gtc(WeakReference weakReference, awi awi) {
        this.f17308b = weakReference;
        this.f17309c = awi;
    }

    /* renamed from: b */
    public final void mo1626b() {
        if (this.f17310d.mo1625c()) {
            this.f17311e.mo3557a(Boolean.valueOf(true));
            return;
        }
        this.f17311e.mo3557a(Boolean.valueOf(false));
        awi awi = this.f17309c;
        String valueOf = String.valueOf(this.f17310d.mo1624b());
        String str = "Abort startup because camera folder doesn't exist and cannot be created: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        awi.m707a(valueOf);
    }

    /* renamed from: a */
    public final kpk mo385a() {
        boolean z = true;
        if (this.f17310d.mo1625c()) {
            this.f17311e.mo3557a(Boolean.valueOf(true));
        } else {
            String str = f17307a;
            String valueOf = String.valueOf(this.f17310d.mo1624b());
            String str2 = "Informing user camera folder doesn't exist and cannot be created: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
            Activity activity = (Activity) this.f17308b.get();
            if (activity == null || activity.isFinishing()) {
                bli.m873e(f17307a, "Could not display error dialog for Camera Storage Access Failure.");
            } else {
                gsz gsz = new gsz();
                if (gsz.f5680a != null) {
                    z = false;
                }
                jri.m13154b(z, (Object) "Setting listener twice!");
                gsz.f5680a = this;
                gsz.show(activity.getFragmentManager(), "CameraStorageAccessFailureDialog");
            }
        }
        return this.f17311e;
    }
}
