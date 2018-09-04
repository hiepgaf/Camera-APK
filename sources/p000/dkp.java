package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dkp */
public final class dkp extends dhz {
    /* renamed from: c */
    public static final String f23456c = bli.m862a("VidMod");
    /* renamed from: p */
    private final iqt f23457p = new dkq(this);

    public dkp(bag bag, bah bah, bpq bpq, ikd ikd, Resources resources, kwk kwk, ilp ilp, hny hny, gpa gpa, bps bps, BottomBarController bottomBarController, hcd hcd, dzh dzh, ecd ecd, div div, dht dht, bja bja, how how, awr awr, bkg bkg, bsn bsn) {
        super(div, bag, bah, bpq, ikd, resources, kwk, ilp, hny, bps.f1415a, bottomBarController, hcd, dzh, ecd, dht, bja, how, awr, bkg, bsn);
        if (gpa != null) {
            this.f.mo1879a(gpa.mo2859a(this.f23457p, ikd));
        }
    }

    /* renamed from: a */
    protected final BottomBarListener mo3559a(BottomBarController bottomBarController, hcd hcd) {
        return new dkr(this, bottomBarController, hcd);
    }
}
