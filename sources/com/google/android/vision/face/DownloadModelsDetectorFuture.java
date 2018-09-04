package com.google.android.vision.face;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
class DownloadModelsDetectorFuture implements Future {

    /* compiled from: PG */
    class DownloadCallbacks implements ModelManagerCallbacks {
        public void onModelDownloadProgressUpdate(int i) {
            throw new NoSuchMethodError();
        }

        public void onModelInstallationFailure(int i) {
            throw new NoSuchMethodError();
        }

        public void onModelInstallationSuccess() {
            throw new NoSuchMethodError();
        }
    }

    public boolean cancel(boolean z) {
        throw new NoSuchMethodError();
    }

    public /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }

    public /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        throw new NoSuchMethodError();
    }

    public boolean isCancelled() {
        throw new NoSuchMethodError();
    }

    public boolean isDone() {
        throw new NoSuchMethodError();
    }
}
