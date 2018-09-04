package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: os */
final class os implements OnClickListener, OnDismissListener, OnKeyListener, pf {
    /* renamed from: a */
    public op f19503a;
    /* renamed from: b */
    public mb f19504b;
    /* renamed from: c */
    public om f19505c;

    public os(op opVar) {
        this.f19503a = opVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f19503a.m14249a((ot) this.f19505c.m14236b().getItem(i), null, 0);
    }

    /* renamed from: a */
    public final void mo2353a(op opVar, boolean z) {
        if (z || opVar == this.f19503a) {
            mb mbVar = this.f19504b;
            if (mbVar != null) {
                mbVar.dismiss();
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f19505c.mo2436a(this.f19503a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f19504b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f19504b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f19503a.m14248a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f19503a.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final boolean mo2354a(op opVar) {
        return false;
    }
}
