package p000;

import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: PG */
/* renamed from: bev */
final class bev implements iju {
    /* renamed from: a */
    private final /* synthetic */ bfs f10712a;
    /* renamed from: b */
    private final /* synthetic */ bem f10713b;

    bev(bem bem, bfs bfs) {
        this.f10713b = bem;
        this.f10712a = bfs;
    }

    /* renamed from: a */
    private final kpk m7299a(File file, ios ios) {
        kpk a;
        synchronized (this.f10713b.f19931s) {
            if (this.f10713b.f19930r.equals(bey.CLOSED)) {
                String valueOf = String.valueOf(this.f10713b.f19930r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            jri.m13143a(this.f10713b.f19930r.equals(bey.STARTING_RECORD));
            this.f10713b.f19930r = bey.RECORDING;
            long currentTimeMillis = System.currentTimeMillis();
            bem bem = this.f10713b;
            bhj bhj = bem.f19927o;
            bhs bhs = bem.f19928p;
            Surface surface = bem.f19925m;
            Surface surface2 = (Surface) ios.m12335a().mo2081a();
            bem bem2 = this.f10713b;
            bhc bhc = new bhc(bhj, bhs, surface, surface2, bem2.f19914b, bem2.f19924l);
            bic bic = this.f10713b.f19924l;
            Surface surface3 = (Surface) ios.m12335a().mo2081a();
            bem = this.f10713b;
            bib bib = new bib(bic, surface3, bem.f19927o, bem.f19928p);
            kbg kbg = kau.f19138a;
            if (kbg.m4744b(ios.f18445d).mo2084b()) {
                kbg = kbg.m4745c(ParcelFileDescriptor.dup((FileDescriptor) kbg.m4744b(ios.f18445d).mo2081a()));
            }
            kbg kbg2 = kau.f19138a;
            Object obj = this.f10713b;
            obj.f19929q = new bgb(this.f10712a, obj, obj.f19915c, obj.f19927o, obj.f19919g, obj.f19920h, obj.f19921i, obj.f19922j, file, obj.f19917e, obj.f19918f, ios, new hke(), kbg2, currentTimeMillis, bhc, bib, kbg, this.f10713b.f19928p);
            a = kow.m13617a(this.f10713b.f19929q);
        }
        return a;
    }
}
