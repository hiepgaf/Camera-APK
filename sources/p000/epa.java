package p000;

import android.content.Context;
import android.location.Location;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: epa */
public final class epa implements enk, enl, enn, eol, hjw {
    /* renamed from: a */
    public static final String f15325a = bli.m862a("LocationManager");
    /* renamed from: b */
    private final Context f15326b;
    /* renamed from: c */
    private final gos f15327c;
    /* renamed from: d */
    private final kwk f15328d;
    /* renamed from: e */
    private final ilp f15329e;
    /* renamed from: f */
    private final ird f15330f;
    /* renamed from: g */
    private kpk f15331g;
    /* renamed from: h */
    private boolean f15332h = false;
    /* renamed from: i */
    private eox f15333i;

    public epa(Context context, gos gos, kwk kwk, ilp ilp, ird ird) {
        this.f15326b = context;
        this.f15327c = gos;
        this.f15328d = kwk;
        this.f15329e = ilp;
        this.f15330f = ird;
    }

    /* renamed from: d */
    public final Location mo1244d() {
        Throwable e;
        ird ird = null;
        if (this.f15333i == null || this.f15331g == null) {
            return null;
        }
        try {
            this.f15330f.mo1903a("Location#getCurrent");
            if (((Boolean) this.f15331g.get(250, TimeUnit.MILLISECONDS)).booleanValue()) {
                Location b = this.f15333i.mo1239b();
                this.f15330f.mo1904b();
                return b;
            }
            this.f15330f.mo1904b();
            return ird;
        } catch (InterruptedException e2) {
            e = e2;
            try {
                bli.m874e(f15325a, "Failed to get current location.", e);
                return ird;
            } finally {
                ird = this.f15330f;
                ird.mo1904b();
            }
        } catch (ExecutionException e3) {
            e = e3;
            bli.m874e(f15325a, "Failed to get current location.", e);
            return ird;
        } catch (TimeoutException e4) {
            e = e4;
            bli.m874e(f15325a, "Failed to get current location.", e);
            return ird;
        }
    }

    /* renamed from: a */
    public final void mo1241a() {
        if (this.f15333i != null) {
            this.f15330f.mo1903a("Location#pause");
            this.f15333i.mo1237a(false);
            this.f15330f.mo1904b();
        }
    }

    /* renamed from: b */
    public final void mo1242b() {
        if (this.f15326b.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && this.f15326b.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.f15332h = this.f15327c.mo1535a("default_scope", "pref_camera_recordlocation_key");
            if (this.f15332h && !((Boolean) this.f15329e.mo2860b()).booleanValue()) {
                Toast makeText = Toast.makeText(this.f15326b, this.f15326b.getResources().getString(R.string.record_location_notification), 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
            this.f15329e.mo348a(Boolean.valueOf(this.f15332h));
        } else {
            this.f15327c.mo1540b("default_scope", "pref_camera_recordlocation_key", false);
            this.f15332h = false;
        }
        if (this.f15333i == null && this.f15332h) {
            if (hud.m11988b(this.f15326b) == 0) {
                bli.m863a(f15325a, "Using fused location provider.");
                this.f15333i = new eos(this.f15326b, new eoy(this));
                this.f15330f.mo1904b();
            } else {
                m9796e();
            }
        }
        if (this.f15333i != null) {
            this.f15330f.mo1903a("Location#startRecordingLocation");
            this.f15331g = this.f15333i.mo1237a(this.f15332h);
            this.f15330f.mo1904b();
        }
    }

    /* renamed from: c */
    public final void mo1243c() {
        if (this.f15333i != null) {
            bli.m871d(f15325a, "Disconnecting location controller.");
            this.f15330f.mo1903a("Location#disconnect");
            this.f15333i.mo1238a();
            this.f15333i = null;
            this.f15330f.mo1904b();
        }
    }

    /* renamed from: e */
    final void m9796e() {
        if (this.f15333i != null) {
            bli.m871d(f15325a, "Disconnecting location controller.");
            this.f15333i.mo1238a();
            this.f15333i = null;
        }
        if (this.f15332h) {
            bli.m863a(f15325a, "Using legacy location provider.");
            this.f15333i = new eov(this.f15328d);
        }
    }
}
