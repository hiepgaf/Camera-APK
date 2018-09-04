package com.google.android.libraries.smartburst.filterfw;

import com.google.android.libraries.smartburst.filterfw.FrameQueue.Builder;

/* compiled from: PG */
public final class OutputPort {
    public Filter mFilter;
    public PortInfo mInfo;
    public String mName;
    public FrameQueue mQueue = null;
    public Builder mQueueBuilder = null;
    public InputPort mTarget = null;
    public boolean mWaitsUntilAvailable = true;

    OutputPort(Filter filter, String str, PortInfo portInfo) {
        this.mFilter = filter;
        this.mName = str;
        this.mInfo = portInfo;
    }

    final void clear() {
        FrameQueue frameQueue = this.mQueue;
        if (frameQueue != null) {
            frameQueue.clear();
        }
    }

    final boolean conditionsMet() {
        return !this.mWaitsUntilAvailable || isAvailable();
    }

    public final Frame fetchAvailableFrame(int[] iArr) {
        Frame fetchAvailableFrame = getQueue().fetchAvailableFrame(iArr);
        if (fetchAvailableFrame != null) {
            this.mFilter.addAutoReleaseFrame(fetchAvailableFrame);
        }
        return fetchAvailableFrame;
    }

    public final Filter getFilter() {
        return this.mFilter;
    }

    public final String getName() {
        return this.mName;
    }

    final FrameQueue getQueue() {
        return this.mQueue;
    }

    public final InputPort getTarget() {
        return this.mTarget;
    }

    public final boolean isAvailable() {
        FrameQueue frameQueue = this.mQueue;
        return frameQueue == null || frameQueue.canPush();
    }

    public final boolean isConnected() {
        return this.mTarget != null;
    }

    final boolean isOpen() {
        return this.mQueue != null;
    }

    final void onOpen(Builder builder) {
        this.mQueueBuilder = builder;
        this.mQueueBuilder.setWriteType(this.mInfo.type);
        this.mFilter.onOutputPortOpen(this);
    }

    public final void pushFrame(Frame frame) {
        if (frame.getTimestamp() == -1) {
            frame.setTimestamp(this.mFilter.getCurrentTimestamp());
        }
        getQueue().pushFrame(frame);
    }

    final void setQueue(FrameQueue frameQueue) {
        this.mQueue = frameQueue;
        this.mQueueBuilder = null;
    }

    final void setTarget(InputPort inputPort) {
        this.mTarget = inputPort;
    }

    public final void setWaitsUntilAvailable(boolean z) {
        this.mWaitsUntilAvailable = z;
    }

    public final String toString() {
        String name = this.mFilter.getName();
        String str = this.mName;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(name);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final boolean waitsUntilAvailable() {
        return this.mWaitsUntilAvailable;
    }
}
