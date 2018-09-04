package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csn */
final class csn implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ csl f2657a;

    csn(csl csl) {
        this.f2657a = csl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.f2657a.m8711b(true);
        csl csl = this.f2657a;
        csl.f12611d.announceForAccessibility(csl.f12609b.getString(R.string.filmstrip_item_undeleted));
        this.f2657a.m8709a(true);
        return true;
    }
}
