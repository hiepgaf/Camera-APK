package com.google.android.libraries.smartburst.filterfw;

import com.google.android.libraries.smartburst.filterfw.FrameQueue.Builder;
import java.lang.reflect.Field;

/* compiled from: PG */
public final class InputPort {
    public boolean mAutoPullEnabled = false;
    public Filter mFilter;
    public PortInfo mInfo;
    public FrameListener mListener = null;
    public String mName;
    public FrameQueue mQueue = null;
    public Builder mQueueBuilder = null;
    public OutputPort mSourceHint = null;
    public boolean mWaitForFrame = true;

    /* compiled from: PG */
    public interface FrameListener {
        void onFrameReceived(InputPort inputPort, Frame frame);
    }

    /* compiled from: PG */
    class FieldBinding implements FrameListener {
        public Field mField;

        public FieldBinding(Field field) {
            this.mField = field;
        }

        public void onFrameReceived(InputPort inputPort, Frame frame) {
            try {
                if (inputPort.mInfo.type.getNumberOfDimensions() > 0) {
                    this.mField.set(InputPort.this.mFilter, frame.asFrameValues().getValues());
                    return;
                }
                this.mField.set(InputPort.this.mFilter, frame.asFrameValue().getValue());
            } catch (Throwable e) {
                String valueOf = String.valueOf(frame);
                String valueOf2 = String.valueOf(this.mField);
                String valueOf3 = String.valueOf(InputPort.this.mFilter);
                int length = String.valueOf(valueOf).length();
                StringBuilder stringBuilder = new StringBuilder(((length + 55) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                stringBuilder.append("Assigning frame ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to field ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(" of filter ");
                stringBuilder.append(valueOf3);
                stringBuilder.append(" caused exception!");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }

    InputPort(Filter filter, String str, PortInfo portInfo) {
        this.mFilter = filter;
        this.mName = str;
        this.mInfo = portInfo;
    }

    private final void assertInAttachmentStage() {
        if (this.mQueueBuilder == null) {
            throw new IllegalStateException("Attempting to attach port while not in attachment stage!");
        }
    }

    public final void attachToOutputPort(OutputPort outputPort) {
        assertInAttachmentStage();
        this.mFilter.openOutputPort(outputPort);
        this.mQueueBuilder.attachQueue(outputPort.getQueue());
    }

    public final void bindToField(Field field) {
        assertInAttachmentStage();
        this.mListener = new FieldBinding(field);
    }

    public final void bindToFieldNamed(String str) {
        Field findFieldNamed = findFieldNamed(str, this.mFilter.getClass());
        if (findFieldNamed == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
            stringBuilder.append("Attempting to bind to unknown field '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        bindToField(findFieldNamed);
    }

    public final void bindToListener(FrameListener frameListener) {
        assertInAttachmentStage();
        this.mListener = frameListener;
    }

    final void clear() {
        FrameQueue frameQueue = this.mQueue;
        if (frameQueue != null) {
            frameQueue.clear();
        }
    }

    final boolean conditionsMet() {
        return !this.mWaitForFrame || hasFrame();
    }

    private final Field findFieldNamed(String str, Class cls) {
        Field declaredField;
        do {
            try {
                declaredField = cls.getDeclaredField(str);
                try {
                    declaredField.setAccessible(true);
                    break;
                } catch (NoSuchFieldException e) {
                }
            } catch (NoSuchFieldException e2) {
                declaredField = null;
                cls = cls.getSuperclass();
                if (cls == null) {
                    return declaredField;
                }
            }
        } while (cls == null);
        return declaredField;
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

    public final OutputPort getSourceHint() {
        return this.mSourceHint;
    }

    public final FrameType getType() {
        return getQueue().getType();
    }

    public final synchronized boolean hasFrame() {
        boolean z;
        FrameQueue frameQueue = this.mQueue;
        z = frameQueue != null && frameQueue.canPull();
        return z;
    }

    public final boolean isAutoPullEnabled() {
        return this.mAutoPullEnabled;
    }

    public final boolean isConnected() {
        return this.mQueue != null;
    }

    final void onOpen(Builder builder) {
        this.mQueueBuilder = builder;
        this.mQueueBuilder.setReadType(this.mInfo.type);
        this.mFilter.onInputPortOpen(this);
    }

    public final synchronized Frame peek() {
        FrameQueue frameQueue;
        frameQueue = this.mQueue;
        if (frameQueue == null) {
            throw new IllegalStateException("Cannot pull frame from closed input port!");
        }
        return frameQueue.peek();
    }

    public final synchronized Frame pullFrame() {
        Frame pullFrame;
        FrameQueue frameQueue = this.mQueue;
        if (frameQueue == null) {
            throw new IllegalStateException("Cannot pull frame from closed input port!");
        }
        pullFrame = frameQueue.pullFrame();
        if (pullFrame != null) {
            FrameListener frameListener = this.mListener;
            if (frameListener != null) {
                frameListener.onFrameReceived(this, pullFrame);
            }
            this.mFilter.addAutoReleaseFrame(pullFrame);
            if (pullFrame.getTimestamp() != -1) {
                this.mFilter.onPulledFrameWithTimestamp(pullFrame.getTimestamp());
            }
        }
        return pullFrame;
    }

    public final void setAutoPullEnabled(boolean z) {
        this.mAutoPullEnabled = z;
    }

    final void setQueue(FrameQueue frameQueue) {
        this.mQueue = frameQueue;
        this.mQueueBuilder = null;
    }

    public final void setSourceHint(OutputPort outputPort) {
        this.mSourceHint = outputPort;
    }

    public final void setWaitsForFrame(boolean z) {
        this.mWaitForFrame = z;
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

    public final boolean waitsForFrame() {
        return this.mWaitForFrame;
    }
}
