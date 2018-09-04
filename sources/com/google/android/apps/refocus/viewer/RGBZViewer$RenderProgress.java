package com.google.android.apps.refocus.viewer;

import com.google.android.apps.refocus.processing.ProgressCallback;
import p000.hec;
import p000.icu;

/* compiled from: PG */
public class RGBZViewer$RenderProgress implements ProgressCallback {
    /* renamed from: this$0$9HHMUR9FCTNMUPRCCKNM2RJ4E9NMIP1FC5O70SPFE9IMCRR3ELPIUTJ9CLRMASHFA93K4MIMD5INEPBI7C______0$9HHMUR9FCTNMUPRCCKNM2RJ4E9NMIP1FCTMN6BR2C5PMABQI7C______0 */
    public final /* synthetic */ icu f12366xc6d1e7de;
    public boolean wasCancelled;

    private RGBZViewer$RenderProgress(icu icu) {
        this.f12366xc6d1e7de = icu;
        this.wasCancelled = false;
    }

    public void cancel() {
        this.wasCancelled = true;
    }

    public void setProgress(float f) {
        if (this.f12366xc6d1e7de.f18207o != null) {
            this.f12366xc6d1e7de.f18207o.onProgress(f);
        }
    }

    public void setRange(float f, float f2) {
    }

    private void setStatus(int i) {
    }

    public void setStatus(hec hec) {
    }

    public boolean wasCancelled() {
        return this.wasCancelled;
    }
}
