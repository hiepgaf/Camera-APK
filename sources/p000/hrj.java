package p000;

import com.google.android.apps.refocus.processing.SelectedFrame;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: hrj */
public final class hrj {
    /* renamed from: a */
    public int f6495a = 10;
    /* renamed from: b */
    public final ArrayList f6496b = new ArrayList();
    /* renamed from: c */
    public final SelectedFrame f6497c = new SelectedFrame(0.0f, 0.0f);

    static {
        bli.m862a("FrameSelection");
    }

    public hrj() {
        this.f6496b.ensureCapacity(10);
    }

    /* renamed from: a */
    public final ArrayList m3307a() {
        Collections.sort(this.f6496b);
        return this.f6496b;
    }
}
