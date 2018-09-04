package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;

/* compiled from: PG */
/* renamed from: jsj */
final class jsj implements Listener {
    /* renamed from: a */
    private final /* synthetic */ jsi f19009a;

    jsj(jsi jsi) {
        this.f19009a = jsi;
    }

    public final void onGraphRunnerError(Exception exception, boolean z) {
        Log.d("BAP", "Error");
        this.f19009a.f21895b.m12762a(jar.m4390a(exception));
        this.f19009a.m16334a();
    }

    public final void onGraphRunnerStopped(GraphRunner graphRunner) {
        Log.d("BAP", "Stopped");
        jsi jsi = this.f19009a;
        jsi.f21895b.m12763a(jsi.f21894a);
        this.f19009a.m16334a();
    }
}
