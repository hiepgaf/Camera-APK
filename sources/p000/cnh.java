package p000;

import android.animation.Animator;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: cnh */
final class cnh implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ cne f2208a;
    /* renamed from: b */
    private final /* synthetic */ cng f2209b;

    cnh(cng cng, cne cne) {
        this.f2209b = cng;
        this.f2208a = cne;
    }

    public final void onClick(View view) {
        if (this.f2209b.f20326p.m1200a()) {
            cng cng = this.f2209b;
            cng.f20326p.m1202b(cng.f20327q);
            return;
        }
        Collection c;
        cne cne = this.f2208a;
        cng cng2 = this.f2209b;
        cmg cmg = cng2.f20328r;
        if (cmg == cmg.ALL_ELEMENTS_THUMBNAIL) {
            c = ((cov) cne.f2207a.m8339c().e).m8520c();
        } else if (cmg == cmg.BEST_ELEMENTS_THUMBNAIL) {
            c = ((cov) cne.f2207a.m8339c().e).m8519b();
        } else {
            throw new RuntimeException("Can't zoom in on non-thumbnail section elements.");
        }
        cmp cmp = cne.f2207a.f12167k;
        cmp.f2161b = new ArrayList(c);
        cmp.f2172m.f584d.notifyDataSetChanged();
        cmp.f2167h = cmg;
        BurstImageView burstImageView = cng2.f20329s;
        Animator animator = cmp.f2163d;
        if (animator != null) {
            animator.cancel();
        }
        cmp.f2162c = true;
        int i = 0;
        for (cot cot : cmp.f2161b) {
            if (cot.f12527c.f12515e.f4155h.equals(cng2.f20327q)) {
                cmp.f2172m.m401a(i, false);
                break;
            }
            i++;
        }
        cmp.m1194a(cng2.f20327q);
        cmp.f2160a.f2187a.f12159c.m1173b();
        burstImageView.setAlpha(0.0f);
        cmp.f2169j.setAlpha(0.0f);
        cmp.m1193a(0);
        cmp.f2172m.getViewTreeObserver().addOnPreDrawListener(new cms(cmp, burstImageView));
    }
}
