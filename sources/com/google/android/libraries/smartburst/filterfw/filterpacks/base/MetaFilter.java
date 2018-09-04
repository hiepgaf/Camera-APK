package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.SubListener;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import java.util.HashMap;
import java.util.Map.Entry;

/* compiled from: PG */
public class MetaFilter extends Filter implements SubListener {
    public static final boolean DEBUG = false;
    public FilterGraph mCurrentGraph;
    public FilterGraphProvider mGraphProvider;
    public HashMap mInputFrames = new HashMap();
    public final State mState = new State();

    /* compiled from: PG */
    public interface FilterGraphProvider {
        FilterGraph getFilterGraph(HashMap hashMap);
    }

    /* compiled from: PG */
    public class State {
        public static final int PROCESSING = 1;
        public static final int PULLINPUT = 0;
        public static final int PUSHOUTPUT = 2;
        public int state = 0;

        protected State() {
        }
    }

    /* compiled from: PG */
    public class DefaultGraphProvider implements FilterGraphProvider {
        public FilterGraph mGraph;

        public DefaultGraphProvider(FilterGraph filterGraph) {
            this.mGraph = filterGraph;
        }

        public FilterGraph getFilterGraph(HashMap hashMap) {
            return this.mGraph;
        }
    }

    public MetaFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected void assignInput(GraphInputSource graphInputSource, Frame frame) {
        graphInputSource.pushFrame(frame);
    }

    protected void assignInputs() {
        this.mCurrentGraph = this.mGraphProvider.getFilterGraph(this.mInputFrames);
        for (Entry entry : this.mInputFrames.entrySet()) {
            assignInput(this.mCurrentGraph.getGraphInput((String) entry.getKey()), (Frame) entry.getValue());
        }
    }

    protected boolean canSchedule() {
        return schedulePolicy();
    }

    protected void onClose() {
        this.mState.state = 0;
    }

    protected void onOpen() {
        this.mState.state = 0;
    }

    protected void onProcess() {
        int i = this.mState.state;
        if (i == 0) {
            pullInputs();
            processGraph();
        } else if (i == 2) {
            pushOutputs();
        }
    }

    public void onSubGraphRunEnded(GraphRunner graphRunner) {
        State state = this.mState;
        if (state.state == 1) {
            state.state = 2;
        }
    }

    protected void processGraph() {
        this.mState.state = 1;
        GraphRunner.current().enterSubGraph(this.mCurrentGraph, this);
    }

    protected void pullInputs() {
        this.mInputFrames.clear();
        for (InputPort inputPort : getConnectedInputPorts()) {
            this.mInputFrames.put(inputPort.getName(), inputPort.pullFrame());
        }
        assignInputs();
    }

    protected void pushOutput(Frame frame, OutputPort outputPort) {
        outputPort.pushFrame(frame);
    }

    protected void pushOutputs() {
        for (OutputPort outputPort : getConnectedOutputPorts()) {
            Frame pullFrame = this.mCurrentGraph.getGraphOutput(outputPort.getName()).pullFrame();
            if (pullFrame != null) {
                pushOutput(pullFrame, outputPort);
                pullFrame.release();
            }
        }
        this.mState.state = 0;
    }

    protected boolean schedulePolicy() {
        if (inSchedulableState() && ((inputConditionsMet() || this.mState.state == 2) && outputConditionsMet())) {
            return true;
        }
        return false;
    }

    public void setGraph(FilterGraph filterGraph) {
        if (isRunning()) {
            throw new IllegalStateException("Cannot set FilterGraphProvider while MetaFilter is running!");
        }
        this.mGraphProvider = new DefaultGraphProvider(filterGraph);
    }

    public void setGraphProvider(FilterGraphProvider filterGraphProvider) {
        if (isRunning()) {
            throw new IllegalStateException("Cannot set FilterGraphProvider while MetaFilter is running!");
        }
        this.mGraphProvider = filterGraphProvider;
    }
}
