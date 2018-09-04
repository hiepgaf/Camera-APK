package com.google.android.libraries.smartburst.filterfw;

import android.os.SystemClock;
import com.google.android.libraries.smartburst.filterfw.FrameQueue.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class Filter {
    public static final int PRIORITY_HIGH = 75;
    public static final int PRIORITY_LOW = 25;
    public static final int PRIORITY_NORMAL = 50;
    public static final int REQUEST_FLAG_CLOSE = 1;
    public static final int REQUEST_FLAG_NONE = 0;
    public ArrayList mAutoReleaseFrames = new ArrayList();
    public InputPort[] mConnectedInputPortArray = null;
    public HashMap mConnectedInputPorts = new HashMap();
    public OutputPort[] mConnectedOutputPortArray = null;
    public HashMap mConnectedOutputPorts = new HashMap();
    public MffContext mContext;
    public long mCurrentTimestamp = -1;
    public FilterGraph mFilterGraph;
    public boolean mIsActive = true;
    public AtomicBoolean mIsSleeping = new AtomicBoolean(false);
    public long mLastScheduleTime = 0;
    public int mMinimumAvailableInputs = 1;
    public int mMinimumAvailableOutputs = 1;
    public String mName;
    public int mRequests = 0;
    public int mScheduleCount = 0;
    public final State mState = new State();

    /* compiled from: PG */
    class State {
        public static final int STATE_CLOSED = 4;
        public static final int STATE_DESTROYED = 5;
        public static final int STATE_OPEN = 3;
        public static final int STATE_PREPARED = 2;
        public static final int STATE_UNPREPARED = 1;
        public int current;

        private State() {
            this.current = 1;
        }

        public synchronized boolean check(int i) {
            return this.current == i;
        }
    }

    public Filter(MffContext mffContext, String str) {
        this.mName = str;
        this.mContext = mffContext;
    }

    public abstract void onProcess();

    public void activate() {
        assertIsPaused();
        if (!this.mIsActive) {
            this.mIsActive = true;
        }
    }

    final void addAutoReleaseFrame(Frame frame) {
        this.mAutoReleaseFrames.add(frame);
    }

    private void assertIsPaused() {
        GraphRunner current = GraphRunner.current();
        if (current != null && !current.isPaused() && !current.isStopped()) {
            throw new RuntimeException("Attempting to modify filter state while runner is executing. Please pause or stop the runner first!");
        }
    }

    private void autoPullInputs() {
        int i = 0;
        while (true) {
            InputPort[] inputPortArr = this.mConnectedInputPortArray;
            if (i < inputPortArr.length) {
                InputPort inputPort = inputPortArr[i];
                if (inputPort.hasFrame() && inputPort.isAutoPullEnabled()) {
                    this.mConnectedInputPortArray[i].pullFrame();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void autoReleaseFrames() {
        for (int i = 0; i < this.mAutoReleaseFrames.size(); i++) {
            ((Frame) this.mAutoReleaseFrames.get(i)).release();
        }
        this.mAutoReleaseFrames.clear();
    }

    public boolean canSchedule() {
        return inSchedulableState() && inputConditionsMet() && outputConditionsMet();
    }

    final void connect(String str, Filter filter, String str2) {
        String valueOf;
        StringBuilder stringBuilder;
        if (getConnectedOutputPort(str) != null) {
            valueOf = String.valueOf(this);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 67) + String.valueOf(valueOf).length());
            stringBuilder.append("Attempting to connect already connected output port '");
            stringBuilder.append(str);
            stringBuilder.append("' of filter ");
            stringBuilder.append(valueOf);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        } else if (filter.getConnectedInputPort(str2) != null) {
            valueOf = String.valueOf(filter);
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 66) + String.valueOf(valueOf).length());
            stringBuilder.append("Attempting to connect already connected input port '");
            stringBuilder.append(str2);
            stringBuilder.append("' of filter ");
            stringBuilder.append(valueOf);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        } else {
            InputPort newInputPort = filter.newInputPort(str2);
            OutputPort newOutputPort = newOutputPort(str);
            newOutputPort.setTarget(newInputPort);
            newInputPort.setSourceHint(newOutputPort);
            filter.onInputPortAttached(newInputPort);
            onOutputPortAttached(newOutputPort);
            updatePortArrays();
        }
    }

    public void deactivate() {
        assertIsPaused();
        if (this.mIsActive) {
            this.mIsActive = false;
        }
    }

    public final void enterSleepState() {
        this.mIsSleeping.set(true);
    }

    final void execute() {
        synchronized (this.mState) {
            autoPullInputs();
            this.mLastScheduleTime = SystemClock.elapsedRealtime();
            if (this.mState.current == 1) {
                onPrepare();
                this.mState.current = 2;
            }
            if (this.mState.current == 2) {
                openPorts();
                onOpen();
                this.mState.current = 3;
            }
            if (this.mState.current == 3) {
                onProcess();
                if (this.mRequests != 0) {
                    processRequests();
                }
            }
        }
        autoReleaseFrames();
        this.mScheduleCount++;
    }

    public final InputPort getConnectedInputPort(String str) {
        return (InputPort) this.mConnectedInputPorts.get(str);
    }

    final Map getConnectedInputPortMap() {
        return this.mConnectedInputPorts;
    }

    public final InputPort[] getConnectedInputPorts() {
        return this.mConnectedInputPortArray;
    }

    public final OutputPort getConnectedOutputPort(String str) {
        return (OutputPort) this.mConnectedOutputPorts.get(str);
    }

    final Map getConnectedOutputPortMap() {
        return this.mConnectedOutputPorts;
    }

    public final OutputPort[] getConnectedOutputPorts() {
        return this.mConnectedOutputPortArray;
    }

    public MffContext getContext() {
        return this.mContext;
    }

    final long getCurrentTimestamp() {
        return this.mCurrentTimestamp;
    }

    public final FrameManager getFrameManager() {
        GraphRunner graphRunner = this.mFilterGraph.mRunner;
        return graphRunner != null ? graphRunner.getFrameManager() : null;
    }

    final long getLastScheduleTime() {
        return this.mLastScheduleTime;
    }

    protected final int getMinimumAvailableInputs() {
        return this.mMinimumAvailableInputs;
    }

    protected final int getMinimumAvailableOutputs() {
        return this.mMinimumAvailableOutputs;
    }

    public String getName() {
        return this.mName;
    }

    final int getScheduleCount() {
        return this.mScheduleCount;
    }

    public int getSchedulePriority() {
        return 50;
    }

    public Signature getSignature() {
        return new Signature();
    }

    public boolean inSchedulableState() {
        return this.mIsActive && !this.mState.check(4);
    }

    public boolean inputConditionsMet() {
        if (this.mConnectedInputPortArray.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                InputPort[] inputPortArr = this.mConnectedInputPortArray;
                if (i >= inputPortArr.length) {
                    break;
                } else if (!inputPortArr[i].conditionsMet()) {
                    return false;
                } else {
                    if (this.mConnectedInputPortArray[i].hasFrame()) {
                        i2++;
                    }
                    i++;
                }
            }
            if (i2 < this.mMinimumAvailableInputs) {
                return false;
            }
        }
        return true;
    }

    final void insertIntoFilterGraph(FilterGraph filterGraph) {
        this.mFilterGraph = filterGraph;
        updatePortArrays();
    }

    public boolean isActive() {
        return this.mIsActive;
    }

    public static boolean isAvailable(String str) {
        return FilterFactory.sharedFactory().isFilterAvailable(str);
    }

    public final boolean isOpen() {
        return this.mState.check(3);
    }

    public final boolean isOpenGLSupported() {
        return this.mFilterGraph.mRunner.isOpenGLSupported();
    }

    public final boolean isRunning() {
        FilterGraph filterGraph = this.mFilterGraph;
        if (filterGraph != null) {
            GraphRunner graphRunner = filterGraph.mRunner;
            if (graphRunner != null && graphRunner.isRunning()) {
                return true;
            }
        }
        return false;
    }

    final boolean isSleeping() {
        return this.mIsSleeping.get();
    }

    private InputPort newInputPort(String str) {
        InputPort inputPort = (InputPort) this.mConnectedInputPorts.get(str);
        if (inputPort != null) {
            return inputPort;
        }
        inputPort = new InputPort(this, str, getSignature().getInputPortInfo(str));
        this.mConnectedInputPorts.put(str, inputPort);
        return inputPort;
    }

    private OutputPort newOutputPort(String str) {
        OutputPort outputPort = (OutputPort) this.mConnectedOutputPorts.get(str);
        if (outputPort != null) {
            return outputPort;
        }
        outputPort = new OutputPort(this, str, getSignature().getOutputPortInfo(str));
        this.mConnectedOutputPorts.put(str, outputPort);
        return outputPort;
    }

    public void onClose() {
    }

    public void onInputPortAttached(InputPort inputPort) {
    }

    public void onInputPortOpen(InputPort inputPort) {
    }

    public void onOpen() {
    }

    public void onOutputPortAttached(OutputPort outputPort) {
    }

    protected void onOutputPortOpen(OutputPort outputPort) {
    }

    public void onPrepare() {
    }

    final void onPulledFrameWithTimestamp(long j) {
        long j2 = this.mCurrentTimestamp;
        if (j > j2 || j2 == -1) {
            this.mCurrentTimestamp = j;
        }
    }

    public void onTearDown() {
    }

    final void openOutputPort(OutputPort outputPort) {
        String str;
        if (outputPort.getQueue() == null) {
            try {
                Builder builder = new Builder();
                InputPort target = outputPort.getTarget();
                outputPort.onOpen(builder);
                target.onOpen(builder);
                Filter filter = target.getFilter();
                String str2 = this.mName;
                String name = outputPort.getName();
                str = filter.mName;
                String name2 = target.getName();
                StringBuilder stringBuilder = new StringBuilder((((String.valueOf(str2).length() + 8) + String.valueOf(name).length()) + String.valueOf(str).length()) + String.valueOf(name2).length());
                stringBuilder.append(str2);
                stringBuilder.append("[");
                stringBuilder.append(name);
                stringBuilder.append("] -> ");
                stringBuilder.append(str);
                stringBuilder.append("[");
                stringBuilder.append(name2);
                stringBuilder.append("]");
                FrameQueue build = builder.build(stringBuilder.toString());
                outputPort.setQueue(build);
                target.setQueue(build);
            } catch (Throwable e) {
                str = String.valueOf(outputPort);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 28);
                stringBuilder2.append("Could not open output port ");
                stringBuilder2.append(str);
                stringBuilder2.append("!");
                throw new RuntimeException(stringBuilder2.toString(), e);
            }
        }
    }

    final void openPorts() {
        for (OutputPort openOutputPort : this.mConnectedOutputPorts.values()) {
            openOutputPort(openOutputPort);
        }
    }

    public boolean outputConditionsMet() {
        if (this.mConnectedOutputPortArray.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                OutputPort[] outputPortArr = this.mConnectedOutputPortArray;
                if (i >= outputPortArr.length) {
                    break;
                } else if (!outputPortArr[i].conditionsMet()) {
                    return false;
                } else {
                    if (this.mConnectedOutputPortArray[i].isAvailable()) {
                        i2++;
                    }
                    i++;
                }
            }
            if (i2 < this.mMinimumAvailableOutputs) {
                return false;
            }
        }
        return true;
    }

    final void performClose() {
        synchronized (this.mState) {
            if (this.mState.current == 3) {
                onClose();
                this.mIsSleeping.set(false);
                this.mState.current = 4;
                this.mCurrentTimestamp = -1;
            }
        }
    }

    protected final boolean performPreparation(Runnable runnable) {
        synchronized (this.mState) {
            if (this.mState.current == 3) {
                return false;
            }
            runnable.run();
            return true;
        }
    }

    final void performTearDown() {
        synchronized (this.mState) {
            int i = this.mState.current;
            if (i == 3) {
                String valueOf = String.valueOf(this);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
                stringBuilder.append("Attempting to tear-down filter ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" which is in an open state!");
                throw new RuntimeException(stringBuilder.toString());
            }
            if (!(i == 5 || i == 1)) {
                onTearDown();
                this.mState.current = 5;
            }
        }
    }

    final void prepareOnly() {
        synchronized (this.mState) {
            if (this.mState.current == 1) {
                onPrepare();
                this.mState.current = 2;
            }
        }
    }

    private void processRequests() {
        if ((this.mRequests & 1) != 0) {
            performClose();
            this.mRequests = 0;
        }
    }

    public final void requestClose() {
        this.mRequests |= 1;
    }

    final void resetScheduleCount() {
        this.mScheduleCount = 0;
    }

    public final void setMinimumAvailableInputs(int i) {
        this.mMinimumAvailableInputs = i;
    }

    protected final void setMinimumAvailableOutputs(int i) {
        this.mMinimumAvailableOutputs = i;
    }

    final void softReset() {
        synchronized (this.mState) {
            performClose();
            State state = this.mState;
            if (state.current == 4) {
                state.current = 2;
            }
        }
    }

    public String toString() {
        String str = this.mName;
        String simpleName = getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(simpleName).length());
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(simpleName);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private void updatePortArrays() {
        Collection values = this.mConnectedInputPorts.values();
        Collection values2 = this.mConnectedOutputPorts.values();
        this.mConnectedInputPortArray = (InputPort[]) values.toArray(new InputPort[values.size()]);
        this.mConnectedOutputPortArray = (OutputPort[]) values2.toArray(new OutputPort[values2.size()]);
    }

    public final void wakeUp() {
        if (this.mIsSleeping.getAndSet(false) && isRunning()) {
            this.mFilterGraph.mRunner.signalWakeUp();
        }
    }
}
