package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbg */
public final class hbg extends ViewOutlineProvider {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f5905a;

    public hbg(ShutterButton shutterButton) {
        this.f5905a = shutterButton;
    }

    public final void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        this.f5905a.buttonRect.round(rect);
        outline.setRoundRect(rect, (float) this.f5905a.currentSpec.m3064h());
    }
}
