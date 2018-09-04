package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class ValueTarget extends Filter {
    public Handler mHandler = null;
    public ValueListener mListener = null;

    /* compiled from: PG */
    public interface ValueListener {
        void onReceivedValue(Object obj);
    }

    public ValueTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("value", 2, FrameType.single()).disallowOtherPorts();
    }

    protected final void onProcess() {
        FrameValue asFrameValue = getConnectedInputPort("value").pullFrame().asFrameValue();
        ValueListener valueListener = this.mListener;
        if (valueListener == null) {
            return;
        }
        if (this.mHandler != null) {
            postValueToUiThread(asFrameValue.getValue());
        } else {
            valueListener.onReceivedValue(asFrameValue.getValue());
        }
    }

    private final void postValueToUiThread(final Object obj) {
        this.mHandler.post(new Runnable() {
            public void run() {
                ValueTarget.this.mListener.onReceivedValue(obj);
            }
        });
    }

    public final void setListener(ValueListener valueListener, boolean z) {
        if (isRunning()) {
            throw new IllegalStateException("Attempting to bind filter to callback while it is running!");
        }
        this.mListener = valueListener;
        if (!z) {
            return;
        }
        if (Looper.myLooper() == null) {
            throw new IllegalArgumentException("Attempting to set callback on thread which has no looper!");
        }
        this.mHandler = new Handler();
    }
}
