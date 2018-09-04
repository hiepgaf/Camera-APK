package com.google.android.apps.refocus.processing;

import p000.gkr;
import p000.hci;
import p000.hec;

/* compiled from: PG */
public class ProgressCallbackImpl implements ProgressCallback {
    public final Object lock = new Object();
    public float range = 1.0f;
    public float rangeStart = 0.0f;
    public final gkr session;
    public boolean wasCanceled;

    public ProgressCallbackImpl(gkr gkr) {
        this.session = gkr;
        gkr.mo2875b(0);
        this.wasCanceled = false;
    }

    public void cancel() {
        synchronized (this.lock) {
            this.wasCanceled = true;
        }
    }

    public void setProgress(float f) {
        synchronized (this.lock) {
            if (!this.wasCanceled) {
                this.session.mo2875b((int) (((this.range * f) + this.rangeStart) * 100.0f));
            }
        }
    }

    public void setRange(float f, float f2) {
        this.rangeStart = f;
        this.range = f2 - f;
    }

    private void setStatus(int i) {
        synchronized (this.lock) {
            if (!this.wasCanceled) {
                this.session.mo2871a(hci.m11749a(i, new Object[0]));
            }
        }
    }

    public void setStatus(hec hec) {
        synchronized (this.lock) {
            if (!this.wasCanceled) {
                this.session.mo2871a(hec);
            }
        }
    }

    public boolean wasCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.wasCanceled;
        }
        return z;
    }
}
