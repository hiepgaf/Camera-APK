package p000;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cnk */
public final class cnk extends tx {
    /* renamed from: c */
    public final cno f12191c;
    /* renamed from: d */
    public final kbn f12192d;
    /* renamed from: e */
    public final cme f12193e;
    /* renamed from: f */
    private final acm f12194f;
    /* renamed from: g */
    private cne f12195g;

    public cnk(cno cno, kbn kbn, acm acm, cme cme, cne cne) {
        this.f12191c = cno;
        this.f12192d = kbn;
        this.f12194f = acm;
        this.f12193e = cme;
        this.f12195g = cne;
        if (this.f9295a.m5874a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f9296b = true;
    }

    /* renamed from: a */
    public final int mo728a() {
        return this.f12193e.m1178b();
    }

    /* renamed from: a */
    public final long mo729a(int i) {
        long j;
        cmf a = this.f12193e.m1176a(i);
        cqn cqn = a.f2136a;
        if (cqn == null) {
            j = 0;
        } else {
            int parseInt;
            Uri uri = cqn.f12527c.f12515e.f4155h;
            try {
                parseInt = Integer.parseInt(uri.getLastPathSegment());
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Unexpected URI without a content id: ");
                stringBuilder.append(valueOf);
                bli.m866b("GridFramesAdptr", stringBuilder.toString());
                parseInt = uri.hashCode();
            }
            String uri2 = uri.toString();
            j = (long) (parseInt + uri2.substring(0, uri2.lastIndexOf(47)).hashCode());
        }
        return (j * 31) + ((long) a.f2137b.ordinal());
    }

    /* renamed from: b */
    public final int mo732b(int i) {
        return this.f12193e.m1176a(i).m1179a();
    }

    /* renamed from: a */
    public final void mo731a(ux uxVar, int i) {
        cmf a = this.f12193e.m1176a(i);
        int i2;
        if (a.m1179a()) {
            cnn cnn = (cnn) uxVar;
            cmg cmg = a.f2137b;
            int size = this.f12193e.m1177a().m8520c().size();
            switch (cmg.ordinal()) {
                case 0:
                    i2 = R.string.burst_editor_section_header_best;
                    break;
                case 1:
                    i2 = R.string.burst_editor_section_header_all;
                    break;
                default:
                    String valueOf = String.valueOf(cmg);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    stringBuilder.append("Using header for an invalid type: ");
                    stringBuilder.append(valueOf);
                    throw new RuntimeException(stringBuilder.toString());
            }
            cnn.f20334p.setText(i2);
            if (cmg == cmg.ALL_ELEMENTS_HEADER) {
                cnn.f20335q.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(size)}));
                cnn.f20335q.setVisibility(0);
                return;
            }
            cnn.f20335q.setVisibility(8);
            return;
        }
        boolean z;
        cng cng = (cng) uxVar;
        acm acm = this.f12194f;
        if (a.f2136a == this.f12192d.mo605b()) {
            z = true;
        } else {
            z = false;
        }
        cqn cqn = a.f2136a;
        cng.f20327q = cqn.f12527c.f12515e.f4155h;
        cng.f20328r = a.f2137b;
        cng.mo2778b(false);
        cng.m15044a(acm, cqn);
        cng.m15046c(z);
        i2 = a.f2138c;
        BurstImageView burstImageView = cng.f20329s;
        if (burstImageView.f2316a) {
            burstImageView.setContentDescription(burstImageView.getResources().getString(R.string.burst_editor_best_frame_description));
        } else {
            burstImageView.setContentDescription(burstImageView.getResources().getString(R.string.burst_editor_frame_description, new Object[]{Integer.valueOf(i2 + 1)}));
        }
        m5869a(new cnl(this, cng, a));
    }

    /* renamed from: b */
    public final ux mo733b(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new cng(this, (FrameLayout) from.inflate(R.layout.burst_editor_grid_imageview, viewGroup, false), this.f12195g);
        }
        if (i == 1) {
            return new cnn((FrameLayout) from.inflate(R.layout.burst_editor_grid_header, viewGroup, false));
        }
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Unknown view type: ");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo730a(ux uxVar) {
        if (uxVar instanceof cnf) {
            ((cnf) uxVar).mo2778b(false);
        }
    }
}
