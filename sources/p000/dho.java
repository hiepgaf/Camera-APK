package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dho */
public final class dho extends dhz {
    /* renamed from: c */
    public static final String f23455c = bli.m862a("SlowMoMod");

    public dho(bag bag, bah bah, bpq bpq, ikd ikd, Resources resources, kwk kwk, ilp ilp, hny hny, bps bps, BottomBarController bottomBarController, hcd hcd, dzh dzh, ecd ecd, ilb ilb, dht dht, bja bja, how how, awr awr, bsn bsn) {
        super(ilb, bag, bah, bpq, ikd, resources, kwk, ilp, hny, bps.f1415a, bottomBarController, hcd, dzh, ecd, dht, bja, how, awr, new bkp(), bsn);
    }

    /* renamed from: a */
    protected final BottomBarListener mo3559a(BottomBarController bottomBarController, hcd hcd) {
        return new dhp(this, bottomBarController);
    }
}
