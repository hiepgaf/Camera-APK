package p000;

import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: djr */
public final class djr extends hkv {
    public djr(gvt gvt, View view, Resources resources, LayoutInflater layoutInflater, gtl gtl, eij eij, BottomBarController bottomBarController, gxz gxz, how how) {
        super(gvt, view, resources, layoutInflater, gtl, eij, bottomBarController, gxz, how);
    }

    /* renamed from: a */
    protected final OnClickListener mo1156a() {
        return new djs(this);
    }

    /* renamed from: b */
    protected final OnClickListener mo1158b() {
        return new djt(this);
    }

    /* renamed from: a */
    protected final void mo1157a(boolean z) {
    }

    /* renamed from: c */
    public final void mo1159c() {
        this.f6321g.m9610c(hhx.SLOW_MOTION);
    }
}
