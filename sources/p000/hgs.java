package p000;

import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.lang.ref.WeakReference;

/* renamed from: hgs */
final /* synthetic */ class hgs implements kbn {
    /* renamed from: a */
    private final WeakReference f17839a;
    /* renamed from: b */
    private final WeakReference f17840b;

    hgs(WeakReference weakReference, WeakReference weakReference2) {
        this.f17839a = weakReference;
        this.f17840b = weakReference2;
    }

    /* renamed from: b */
    public final Object mo605b() {
        boolean z;
        WeakReference weakReference = this.f17839a;
        WeakReference weakReference2 = this.f17840b;
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
