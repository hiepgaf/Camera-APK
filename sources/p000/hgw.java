package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.VectorDrawable;
import android.widget.ImageButton;

/* renamed from: hgw */
final /* synthetic */ class hgw implements Runnable {
    /* renamed from: a */
    private final hgo f6194a;

    hgw(hgo hgo) {
        this.f6194a = hgo;
    }

    public final void run() {
        fzh fzh = this.f6194a.f17822g.f4984b.f20399d;
        ImageButton imageButton = fzh.f4847i;
        VectorDrawable vectorDrawable = fzh.f4849k;
        AnimatedVectorDrawable animatedVectorDrawable = fzh.f4848j;
        if (imageButton != null && vectorDrawable != null && animatedVectorDrawable != null) {
            animatedVectorDrawable.reset();
            animatedVectorDrawable.start();
            if (fzh.f4850l) {
                fzh.f4846h.cancel();
            } else {
                if (fzh.f4846h.isRunning()) {
                    fzh.f4846h.cancel();
                }
                fzh.f4845g.setTarget(vectorDrawable);
                fzh.f4845g.start();
            }
            fzh.f4850l = true;
        }
    }
}
