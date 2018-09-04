package p000;

import android.graphics.Outline;

/* compiled from: PG */
/* renamed from: cj */
public final class cj extends ci {
    public final void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
