package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: hmd */
public final class hmd implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ hlz f6361a;

    public hmd(hlz hlz) {
        this.f6361a = hlz;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f6361a.f6345b.mo3078Y();
        }
        return true;
    }
}
