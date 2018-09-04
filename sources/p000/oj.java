package p000;

import android.os.SystemClock;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: oj */
final class oj implements to {
    /* renamed from: a */
    public final /* synthetic */ og f19470a;

    oj(og ogVar) {
        this.f19470a = ogVar;
    }

    /* renamed from: a */
    public final void mo2443a(op opVar, MenuItem menuItem) {
        int i;
        this.f19470a.f22489a.removeCallbacksAndMessages(null);
        int size = this.f19470a.f22490b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (opVar == ((ol) this.f19470a.f22490b.get(i2)).f9002b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            ol olVar;
            i++;
            if (i < this.f19470a.f22490b.size()) {
                olVar = (ol) this.f19470a.f22490b.get(i);
            } else {
                olVar = null;
            }
            this.f19470a.f22489a.postAtTime(new ok(this, olVar, menuItem, opVar), opVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* renamed from: b */
    public final void mo2444b(op opVar, MenuItem menuItem) {
        this.f19470a.f22489a.removeCallbacksAndMessages(opVar);
    }
}
