package com.google.android.libraries.smartburst.filterfw;

import java.util.Iterator;
import java.util.Vector;

/* compiled from: PG */
class FrameQueue {
    public String mName;
    public QueueImpl mQueueImpl;
    public FrameType mType;

    /* compiled from: PG */
    public class Builder {
        public Vector mAttachedQueues = new Vector();
        public FrameType mReadType = null;
        public FrameType mWriteType = null;

        public void attachQueue(FrameQueue frameQueue) {
            this.mAttachedQueues.add(frameQueue);
        }

        public FrameQueue build(String str) {
            FrameQueue frameQueue = new FrameQueue(buildType(), str);
            buildQueueImpl(frameQueue);
            return frameQueue;
        }

        private void buildQueueImpl(FrameQueue frameQueue) {
            frameQueue.getClass();
            frameQueue.mQueueImpl = new SingleFrameQueueImpl();
        }

        private FrameType buildType() {
            FrameType merge = FrameType.merge(this.mWriteType, this.mReadType);
            Iterator it = this.mAttachedQueues.iterator();
            FrameType frameType = merge;
            while (it.hasNext()) {
                frameType = FrameType.merge(frameType, ((FrameQueue) it.next()).mType);
            }
            return frameType;
        }

        public void setReadType(FrameType frameType) {
            this.mReadType = frameType;
        }

        public void setWriteType(FrameType frameType) {
            this.mWriteType = frameType;
        }
    }

    /* compiled from: PG */
    interface QueueImpl {
        boolean canPull();

        boolean canPush();

        void clear();

        Frame fetchAvailableFrame(int[] iArr);

        Frame peek();

        Frame pullFrame();

        void pushFrame(Frame frame);
    }

    /* compiled from: PG */
    class SingleFrameQueueImpl implements QueueImpl {
        public Frame mFrame;

        private SingleFrameQueueImpl() {
            this.mFrame = null;
        }

        public boolean canPull() {
            return this.mFrame != null;
        }

        public boolean canPush() {
            return this.mFrame == null;
        }

        public void clear() {
            Frame frame = this.mFrame;
            if (frame != null) {
                frame.release();
                this.mFrame = null;
            }
        }

        public Frame fetchAvailableFrame(int[] iArr) {
            return new Frame(FrameQueue.this.mType, iArr, FrameManager.current());
        }

        public Frame peek() {
            return this.mFrame;
        }

        public Frame pullFrame() {
            Frame frame = this.mFrame;
            this.mFrame = null;
            return frame;
        }

        public void pushFrame(Frame frame) {
            this.mFrame = frame.retain();
            this.mFrame.setReadOnly(true);
        }
    }

    private FrameQueue(FrameType frameType, String str) {
        this.mType = frameType;
        this.mName = str;
    }

    public boolean canPull() {
        return this.mQueueImpl.canPull();
    }

    public boolean canPush() {
        return this.mQueueImpl.canPush();
    }

    public void clear() {
        this.mQueueImpl.clear();
    }

    public Frame fetchAvailableFrame(int[] iArr) {
        return this.mQueueImpl.fetchAvailableFrame(iArr);
    }

    public FrameType getType() {
        return this.mType;
    }

    public Frame peek() {
        return this.mQueueImpl.peek();
    }

    public Frame pullFrame() {
        return this.mQueueImpl.pullFrame();
    }

    public void pushFrame(Frame frame) {
        this.mQueueImpl.pushFrame(frame);
    }

    public String toString() {
        return this.mName;
    }
}
