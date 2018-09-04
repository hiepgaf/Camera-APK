package com.google.googlex.gcam.androidutils.camera2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
public class ImageMetadataSynchronizer {
    public static final String TAG = "ImageMetadataSynchronizer";
    public final List mCallbacks = new ArrayList();
    public CaptureCallback mCaptureCallback;
    public boolean mClosed = false;
    public final List mImageReaders = new ArrayList();
    public final List mImagesAcquired = new ArrayList();
    public final LinkedList mPendingCaptureResultQueue = new LinkedList();
    public final List mPendingImageQueues = new ArrayList();

    /* compiled from: PG */
    /* renamed from: com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer$2 */
    class C01172 extends CaptureCallback {
        C01172() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            if (!ImageMetadataSynchronizer.this.mClosed) {
                synchronized (ImageMetadataSynchronizer.this) {
                    ImageMetadataSynchronizer.this.handleCaptureResultLocked(totalCaptureResult);
                }
            }
        }
    }

    /* compiled from: PG */
    public interface Callback {
        void onDataAvailable(Output output);
    }

    /* compiled from: PG */
    public class CaptureRequestTag {
        public ArrayList mTargets;
        public Object mUserTag;

        public CaptureRequestTag() {
            this.mTargets = new ArrayList();
        }

        public CaptureRequestTag(Object obj) {
            this.mTargets = new ArrayList();
            this.mUserTag = obj;
        }

        public CaptureRequestTag(List list) {
            this.mTargets = new ArrayList(list);
        }

        public CaptureRequestTag(List list, Object obj) {
            this.mTargets = new ArrayList(list);
            this.mUserTag = obj;
        }

        public static CaptureRequestTag getCaptureRequestTag(CaptureResult captureResult) {
            if (captureResult == null) {
                return null;
            }
            Object tag = captureResult.getRequest().getTag();
            if (tag == null || !(tag instanceof CaptureRequestTag)) {
                return null;
            }
            return (CaptureRequestTag) tag;
        }

        public static Object getUserTag(CaptureResult captureResult) {
            CaptureRequestTag captureRequestTag = getCaptureRequestTag(captureResult);
            if (captureRequestTag == null) {
                return null;
            }
            return captureRequestTag.mUserTag;
        }

        public static boolean userTagEquals(CaptureResult captureResult, Object obj) {
            CaptureRequestTag captureRequestTag = getCaptureRequestTag(captureResult);
            if (captureRequestTag == null) {
                return false;
            }
            return captureRequestTag.mUserTag.equals(obj);
        }
    }

    /* compiled from: PG */
    public class Output {
        public ArrayList mDroppedImageReaderIndices;
        public ArrayList mImages = new ArrayList();
        public boolean mImagesWereDropped;
        public CaptureResult mResult;
        public final ImageMetadataSynchronizer mSynchronizer;

        Output(int i, ImageMetadataSynchronizer imageMetadataSynchronizer) {
            for (int i2 = 0; i2 < i; i2++) {
                this.mImages.add(null);
            }
            this.mDroppedImageReaderIndices = new ArrayList();
            this.mSynchronizer = imageMetadataSynchronizer;
        }

        public void close() {
            this.mDroppedImageReaderIndices = null;
            for (int i = 0; i < this.mImages.size(); i++) {
                Image image = (Image) this.mImages.get(i);
                if (image != null) {
                    image.close();
                    this.mSynchronizer.notifyImageClosed(i);
                }
            }
            this.mImages.clear();
            this.mResult = null;
        }
    }

    public ImageMetadataSynchronizer(List list, Handler handler) {
        createCaptureCallback();
        this.mImageReaders.addAll(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageReader imageReader = (ImageReader) list.get(i);
            this.mPendingImageQueues.add(new LinkedList());
            this.mImagesAcquired.add(Integer.valueOf(0));
            imageReader.setOnImageAvailableListener(new OnImageAvailableListener() {
                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onImageAvailable(android.media.ImageReader r6) {
                    /*
                    r5 = this;
                    r1 = com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.this;
                    monitor-enter(r1);
                    r0 = com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.this;	 Catch:{ all -> 0x0043 }
                    r0 = r0.mClosed;	 Catch:{ all -> 0x0043 }
                    if (r0 == 0) goto L_0x000d;
                L_0x000b:
                    monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                L_0x000c:
                    return;
                L_0x000d:
                    r0 = com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.this;	 Catch:{ all -> 0x0043 }
                    r0 = r0.mImagesAcquired;	 Catch:{ all -> 0x0043 }
                    r2 = r1;	 Catch:{ all -> 0x0043 }
                    r0 = r0.get(r2);	 Catch:{ all -> 0x0043 }
                    r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0043 }
                    r0 = r0.intValue();	 Catch:{ all -> 0x0043 }
                    r2 = r6.getMaxImages();	 Catch:{ all -> 0x0043 }
                    if (r0 >= r2) goto L_0x0041;
                L_0x0025:
                    r2 = r6.acquireNextImage();	 Catch:{ all -> 0x0043 }
                    r3 = com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.this;	 Catch:{ all -> 0x0043 }
                    r3 = r3.mImagesAcquired;	 Catch:{ all -> 0x0043 }
                    r4 = r1;	 Catch:{ all -> 0x0043 }
                    r0 = r0 + 1;
                    r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0043 }
                    r3.set(r4, r0);	 Catch:{ all -> 0x0043 }
                    r0 = com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.this;	 Catch:{ all -> 0x0043 }
                    r3 = r1;	 Catch:{ all -> 0x0043 }
                    r0.handleImageLocked(r3, r2);	 Catch:{ all -> 0x0043 }
                L_0x0041:
                    monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                    goto L_0x000c;
                L_0x0043:
                    r0 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                    throw r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.googlex.gcam.androidutils.camera2.ImageMetadataSynchronizer.1.onImageAvailable(android.media.ImageReader):void");
                }
            }, handler);
        }
    }

    private static boolean allIndexedImagesNotNull(Output output, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (output.mImages.get(((Integer) obj).intValue()) == null) {
                return false;
            }
        }
        return true;
    }

    public synchronized void close() {
        if (this.mClosed) {
            Log.w(TAG, "Already closed!");
        } else {
            this.mClosed = true;
            for (LinkedList linkedList : this.mPendingImageQueues) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Image) it.next()).close();
                }
                linkedList.clear();
            }
            this.mPendingImageQueues.clear();
            this.mPendingCaptureResultQueue.clear();
            for (ImageReader close : this.mImageReaders) {
                close.close();
            }
        }
    }

    private void createCaptureCallback() {
        this.mCaptureCallback = new C01172();
    }

    protected void finalize() {
        close();
    }

    public CaptureCallback getCaptureCallback() {
        return this.mCaptureCallback;
    }

    public List getImageReaders() {
        return Collections.unmodifiableList(this.mImageReaders);
    }

    private void handleCaptureResultLocked(CaptureResult captureResult) {
        CaptureRequestTag captureRequestTag = CaptureRequestTag.getCaptureRequestTag(captureResult);
        if (captureRequestTag == null) {
            throw new IllegalArgumentException("CaptureResult is missing a CaptureRequestTag.");
        } else if (captureRequestTag.mTargets.size() != 0) {
            this.mPendingCaptureResultQueue.addLast(captureResult);
            sweepQueuesLocked();
        }
    }

    private void handleImageLocked(int i, Image image) {
        ((LinkedList) this.mPendingImageQueues.get(i)).addLast(image);
        sweepQueuesLocked();
    }

    private synchronized void notifyImageClosed(int i) {
        int intValue = ((Integer) this.mImagesAcquired.get(i)).intValue();
        if (intValue <= 0) {
            throw new IllegalStateException("Output.close() called when synchronizer thinks there are none acquired.");
        }
        this.mImagesAcquired.set(i, Integer.valueOf(intValue - 1));
    }

    private void postCallbackWithSynchronizedOutputLocked(final Output output) {
        if (this.mCallbacks.isEmpty()) {
            output.close();
            return;
        }
        for (Pair pair : this.mCallbacks) {
            final Callback callback = (Callback) pair.first;
            if (callback != null) {
                Handler handler = (Handler) pair.second;
                if (handler != null) {
                    handler.post(new Runnable(this) {
                        public void run() {
                            callback.onDataAvailable(output);
                        }
                    });
                } else {
                    callback.onDataAvailable(output);
                }
            }
        }
    }

    public synchronized void registerCallback(Callback callback, Handler handler) {
        this.mCallbacks.add(Pair.create(callback, handler));
    }

    private boolean sweepImageQueues(Output output) {
        int i = 0;
        CaptureResult captureResult = output.mResult;
        CaptureRequestTag captureRequestTag = (CaptureRequestTag) captureResult.getRequest().getTag();
        long longValue = ((Long) captureResult.get(CaptureResult.SENSOR_TIMESTAMP)).longValue();
        ArrayList arrayList = captureRequestTag.mTargets;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            output.mImages.set(intValue, (Image) ((LinkedList) this.mPendingImageQueues.get(intValue)).peekFirst());
            i2 = i3;
        }
        output.mDroppedImageReaderIndices.clear();
        while (allIndexedImagesNotNull(output, captureRequestTag.mTargets)) {
            ArrayList arrayList2 = captureRequestTag.mTargets;
            intValue = arrayList2.size();
            i2 = 0;
            int i4 = 0;
            while (i2 < intValue) {
                i3 = i2 + 1;
                int intValue2 = ((Integer) arrayList2.get(i2)).intValue();
                if (longValue <= ((Image) output.mImages.get(intValue2)).getTimestamp()) {
                    i2 = i3;
                } else {
                    Log.v(TAG, "Dropping Image due to dropped CaptureResult.");
                    ((Image) output.mImages.get(intValue2)).close();
                    ((LinkedList) this.mPendingImageQueues.get(intValue2)).removeFirst();
                    output.mImages.set(intValue2, (Image) ((LinkedList) this.mPendingImageQueues.get(intValue2)).peekFirst());
                    i2 = i3;
                    i4 = true;
                }
            }
            if (i4 == 0) {
                output.mImagesWereDropped = false;
                ArrayList arrayList3 = captureRequestTag.mTargets;
                i4 = arrayList3.size();
                while (i < i4) {
                    i2 = i + 1;
                    i = ((Integer) arrayList3.get(i)).intValue();
                    if (longValue < ((Image) output.mImages.get(i)).getTimestamp()) {
                        output.mDroppedImageReaderIndices.add(Integer.valueOf(i));
                        output.mImages.set(i, null);
                        output.mImagesWereDropped = true;
                        i = i2;
                    } else {
                        ((LinkedList) this.mPendingImageQueues.get(i)).removeFirst();
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void sweepQueuesLocked() {
        int size = this.mPendingImageQueues.size();
        while (!this.mPendingCaptureResultQueue.isEmpty()) {
            CaptureResult captureResult = (CaptureResult) this.mPendingCaptureResultQueue.peekFirst();
            Output output = new Output(size, this);
            output.mResult = captureResult;
            if (sweepImageQueues(output)) {
                this.mPendingCaptureResultQueue.removeFirst();
                postCallbackWithSynchronizedOutputLocked(output);
            } else {
                return;
            }
        }
    }

    public synchronized void unregisterCallback(Callback callback, Handler handler) {
        this.mCallbacks.remove(Pair.create(callback, handler));
    }
}
