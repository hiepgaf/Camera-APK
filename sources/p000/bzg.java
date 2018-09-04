package p000;

import android.os.SystemClock;
import com.google.googlex.gcam.ShotLogData;
import com.google.googlex.gcam.ShotStatusCallback;

/* compiled from: PG */
/* renamed from: bzg */
final class bzg extends ShotStatusCallback {
    /* renamed from: a */
    private final /* synthetic */ int f11526a;
    /* renamed from: b */
    private final /* synthetic */ bku f11527b;
    /* renamed from: c */
    private final /* synthetic */ bmh f11528c;
    /* renamed from: d */
    private final /* synthetic */ grk f11529d;
    /* renamed from: e */
    private final /* synthetic */ bzx f11530e;
    /* renamed from: f */
    private final /* synthetic */ fwa f11531f;
    /* renamed from: g */
    private final /* synthetic */ bze f11532g;

    bzg(bze bze, int i, bku bku, bmh bmh, grk grk, bzx bzx, fwa fwa) {
        this.f11532g = bze;
        this.f11526a = i;
        this.f11527b = bku;
        this.f11528c = bmh;
        this.f11529d = grk;
        this.f11530e = bzx;
        this.f11531f = fwa;
    }

    public final void OnAbort(int i) {
        boolean z = true;
        bli.m869c(bze.f1734a, String.format(null, "HDR+ pipeline reported shotId %d was aborted.", new Object[]{Integer.valueOf(i)}));
        if (this.f11532g.f1752s != go.f5588z) {
            z = false;
        }
        jri.m13153b(z);
        this.f11532g.f1752s = go.f5539C;
        this.f11531f.f4754c.m2405a();
        this.f11531f.f4755d.close();
        this.f11531f.f4752a.f4451g.close();
        this.f11532g.f1751r.close();
        if (this.f11530e.mo603i().mo2084b()) {
            ((cac) this.f11530e.mo603i().mo2081a()).f1785b.f11686h.mo514b("Shot aborted.");
        }
    }

    public final void OnComplete(int i, ShotLogData shotLogData) {
        boolean z;
        grl grl;
        int i2 = 0;
        bli.m863a(bze.f1734a, String.format(null, "HDR+ pipeline reported completion for shotId %d.", new Object[]{Integer.valueOf(i)}));
        if (this.f11532g.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        this.f11532g.f1752s = go.f5537A;
        this.f11532g.f1751r.close();
        int executed_finish_on = shotLogData.getExecuted_finish_on();
        epu epu = new epu(shotLogData, this.f11526a);
        if (this.f11527b != bku.RELEASE) {
            int i3 = this.f11526a;
            if (i3 == 1 && executed_finish_on != 1) {
                bli.m866b(bze.f1734a, "Hexagon failed");
                this.f11528c.m888a("Hexagon failed! Please immediately take and file a bug report.", 1);
            } else if (i3 == 3 && executed_finish_on != 3) {
                String str;
                if (executed_finish_on == 0) {
                    str = "CPU";
                } else {
                    str = "UNKNOWN";
                    if (executed_finish_on == 1) {
                        str = "Hexagon";
                    }
                }
                String str2 = bze.f1734a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
                stringBuilder.append("IPU Finish offload failed (ran on ");
                stringBuilder.append(str);
                stringBuilder.append(" instead)");
                bli.m866b(str2, stringBuilder.toString());
                bmh bmh = this.f11528c;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 91);
                stringBuilder.append("IPU Finish offload failed (ran on ");
                stringBuilder.append(str);
                stringBuilder.append(" instead)! Please immediately take and file a bug report.");
                bmh.m888a(stringBuilder.toString(), 1);
            }
            while (((long) i2) < shotLogData.getFinal_payload_frame_sharpness().size()) {
                if (shotLogData.getFinal_payload_frame_sharpness().get(i2) == 1.0f) {
                    bli.m866b(bze.f1734a, "Black frame detected");
                    this.f11528c.m888a("Black frame detected! Please immediately take and file a bug report.", 1);
                    break;
                }
                i2++;
            }
        }
        grk grk = this.f11529d;
        while (!grk.f5651b.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            epq epq = (epq) grk.f5651b.removeFirst();
            if (uptimeMillis - epq.f4045a <= 60000) {
                grl = new grl();
                grl.f5654b = epq.f4046b;
                grl.f5653a = uptimeMillis - epq.f4045a;
                break;
            }
            bli.m871d(grk.f5650a, "Flushing old Gcam capture time");
        }
        grl = null;
        if (this.f11530e.mo603i().mo2084b()) {
            cac cac = (cac) this.f11530e.mo603i().mo2081a();
            if (grl != null) {
                cac.f1784a.f4753b.mo1482h().mo1515a(epu, Long.valueOf(grl.f5653a), Integer.valueOf(grl.f5654b));
            } else {
                cac.f1784a.f4753b.mo1482h().mo1515a(epu, null, null);
            }
        }
    }

    public final void OnError(int i, String str) {
        boolean z = true;
        bli.m866b(bze.f1734a, String.format(null, "HDR+ pipeline reported error for shotId %d: %s", new Object[]{Integer.valueOf(i), str}));
        if (this.f11532g.f1752s != go.f5588z) {
            z = false;
        }
        jri.m13153b(z);
        jri.m13153b(this.f11530e.mo603i().mo2084b());
        this.f11532g.f1752s = go.f5538B;
        this.f11531f.f4754c.m2405a();
        this.f11531f.f4755d.close();
        this.f11531f.f4752a.f4451g.close();
        this.f11532g.f1751r.close();
        if (this.f11530e.mo603i().mo2084b()) {
            cac cac = (cac) this.f11530e.mo603i().mo2081a();
            cac.f1785b.f11686h.mo513a("Shot threw an error:", new blr(str));
        }
    }
}
