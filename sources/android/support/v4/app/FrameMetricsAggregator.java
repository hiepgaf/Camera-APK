package android.support.v4.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final boolean DBG = false;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    public static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final String TAG = "FrameMetrics";
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    public FrameMetricsBaseImpl mInstance;

    /* compiled from: PG */
    class FrameMetricsBaseImpl {
        private FrameMetricsBaseImpl() {
        }

        public void add(Activity activity) {
        }

        public SparseIntArray[] getMetrics() {
            return null;
        }

        public SparseIntArray[] remove(Activity activity) {
            return null;
        }

        public SparseIntArray[] reset() {
            return null;
        }

        public SparseIntArray[] stop() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface MetricType {
    }

    /* compiled from: PG */
    class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        public static final int NANOS_PER_MS = 1000000;
        public static final int NANOS_ROUNDING_VALUE = 500000;
        public static Handler sHandler = null;
        public static HandlerThread sHandlerThread = null;
        public ArrayList mActivities = new ArrayList();
        public OnFrameMetricsAvailableListener mListener = new C00251();
        public SparseIntArray[] mMetrics = new SparseIntArray[9];
        public int mTrackingFlags;

        /* compiled from: PG */
        /* renamed from: android.support.v4.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1 */
        class C00251 implements OnFrameMetricsAvailableListener {
            C00251() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameMetricsApi24Impl frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 1) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[0], frameMetrics.getMetric(8));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 2) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[1], frameMetrics.getMetric(1));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 4) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[2], frameMetrics.getMetric(3));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 8) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[3], frameMetrics.getMetric(4));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 16) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[4], frameMetrics.getMetric(5));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 64) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[6], frameMetrics.getMetric(7));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 32) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[5], frameMetrics.getMetric(6));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 128) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[7], frameMetrics.getMetric(0));
                }
                frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 256) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[8], frameMetrics.getMetric(2));
                }
            }
        }

        FrameMetricsApi24Impl(int i) {
            super();
            this.mTrackingFlags = i;
        }

        public void add(Activity activity) {
            int i = 0;
            if (sHandlerThread == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                sHandlerThread = handlerThread;
                handlerThread.start();
                sHandler = new Handler(sHandlerThread.getLooper());
            }
            while (i <= 8) {
                SparseIntArray[] sparseIntArrayArr = this.mMetrics;
                if (sparseIntArrayArr[i] == null && (this.mTrackingFlags & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
                i++;
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.mListener, sHandler);
            this.mActivities.add(new WeakReference(activity));
        }

        void addDurationItem(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        public SparseIntArray[] getMetrics() {
            return this.mMetrics;
        }

        public SparseIntArray[] remove(Activity activity) {
            ArrayList arrayList = this.mActivities;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                WeakReference weakReference = (WeakReference) arrayList.get(i);
                if (weakReference.get() == activity) {
                    this.mActivities.remove(weakReference);
                    break;
                }
                i = i2;
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
            return this.mMetrics;
        }

        public SparseIntArray[] reset() {
            SparseIntArray[] sparseIntArrayArr = this.mMetrics;
            this.mMetrics = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public SparseIntArray[] stop() {
            for (int size = this.mActivities.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.mActivities.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
                    this.mActivities.remove(size);
                }
            }
            return this.mMetrics;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        this.mInstance = new FrameMetricsApi24Impl(i);
    }

    public void add(Activity activity) {
        this.mInstance.add(activity);
    }

    public SparseIntArray[] getMetrics() {
        return this.mInstance.getMetrics();
    }

    public SparseIntArray[] remove(Activity activity) {
        return this.mInstance.remove(activity);
    }

    public SparseIntArray[] reset() {
        return this.mInstance.reset();
    }

    public SparseIntArray[] stop() {
        return this.mInstance.stop();
    }
}
