package p000;

import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.lang.ref.WeakReference;

/* renamed from: hgq */
final /* synthetic */ class hgq implements kbn {
    /* renamed from: a */
    private final WeakReference f17837a;
    /* renamed from: b */
    private final WeakReference f17838b;

    hgq(WeakReference weakReference, WeakReference weakReference2) {
        this.f17837a = weakReference;
        this.f17838b = weakReference2;
    }

    /* renamed from: b */
    public final Object mo605b() {
        boolean z;
        WeakReference weakReference = this.f17837a;
        WeakReference weakReference2 = this.f17838b;
        if (!((View) weakReference.get()).isEnabled()) {
            z = false;
        } else if (((OptionsBarView) weakReference2.get()).isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
