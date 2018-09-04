package com.google.android.libraries.smartburst.filterfw;

import android.view.View;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.BranchFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.FrameSlotSource;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.FrameSlotTarget;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphInputSource;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.GraphOutputTarget;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.ValueTarget;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.ValueTarget.ValueListener;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.VariableSource;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public class FilterGraph {
    public static final boolean DEBUG = false;
    public MffContext mContext;
    public HashMap mFilterMap;
    public Filter[] mFilters;
    public FilterGraph mParentGraph;
    public GraphRunner mRunner;
    public final HashSet mSubGraphs;
    public final Object mSubGraphsTearDownLock;

    /* compiled from: PG */
    public class Builder {
        public MffContext mContext;
        public HashMap mFilterMap = new HashMap();

        public Builder(MffContext mffContext) {
            this.mContext = mffContext;
        }

        public void addFilter(Filter filter) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.mFilterMap.values().contains(filter)) {
                valueOf = String.valueOf(filter);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
                stringBuilder.append("Attempting to add filter ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" that is in the graph already!");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.mFilterMap.containsKey(filter.getName())) {
                valueOf = filter.getName();
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
                stringBuilder.append("Graph contains filter with name '");
                stringBuilder.append(valueOf);
                stringBuilder.append("' already!");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                this.mFilterMap.put(filter.getName(), filter);
            }
        }

        public FrameSlotSource addFrameSlotSource(String str, String str2) {
            Filter frameSlotSource = new FrameSlotSource(this.mContext, str, str2);
            addFilter(frameSlotSource);
            return frameSlotSource;
        }

        public FrameSlotTarget addFrameSlotTarget(String str, String str2) {
            Filter frameSlotTarget = new FrameSlotTarget(this.mContext, str, str2);
            addFilter(frameSlotTarget);
            return frameSlotTarget;
        }

        public VariableSource addVariable(String str, Object obj) {
            if (getFilter(str) != null) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
                stringBuilder.append("Filter named '");
                stringBuilder.append(str);
                stringBuilder.append("' exists already!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            Filter variableSource = new VariableSource(this.mContext, str);
            addFilter(variableSource);
            if (obj != null) {
                variableSource.setValue(obj);
            }
            return variableSource;
        }

        public VariableSource assignValueToFilterInput(Object obj, String str, String str2) {
            Filter filter = getFilter(str);
            if (filter == null) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
                stringBuilder.append("Unknown filter '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder2.append(str);
            stringBuilder2.append(".");
            stringBuilder2.append(str2);
            String stringBuilder3 = stringBuilder2.toString();
            if (getFilter(stringBuilder3) != null) {
                stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 50) + String.valueOf(str2).length());
                stringBuilder2.append("VariableSource for '");
                stringBuilder2.append(str);
                stringBuilder2.append("' and input '");
                stringBuilder2.append(str2);
                stringBuilder2.append("' exists already!");
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            Filter variableSource = new VariableSource(this.mContext, stringBuilder3);
            addFilter(variableSource);
            try {
                variableSource.connect("value", filter, str2);
                if (obj != null) {
                    variableSource.setValue(obj);
                }
                return variableSource;
            } catch (Throwable e) {
                StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(str2).length() + 58) + String.valueOf(str).length());
                stringBuilder4.append("Could not connect VariableSource to input '");
                stringBuilder4.append(str2);
                stringBuilder4.append("' of filter '");
                stringBuilder4.append(str);
                stringBuilder4.append("'!");
                throw new RuntimeException(stringBuilder4.toString(), e);
            }
        }

        public VariableSource assignVariableToFilterInput(String str, String str2, String str3) {
            Filter filter = getFilter(str2);
            if (filter == null) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 18);
                stringBuilder.append("Unknown filter '");
                stringBuilder.append(str2);
                stringBuilder.append("'!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            Filter filter2 = getFilter(str);
            if (filter2 == null || !(filter2 instanceof VariableSource)) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
                stringBuilder.append("Unknown variable '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            try {
                connectAndBranch(filter2, "value", filter, str3);
                return (VariableSource) filter2;
            } catch (Throwable e) {
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str3).length() + 58) + String.valueOf(str2).length());
                stringBuilder2.append("Could not connect VariableSource to input '");
                stringBuilder2.append(str3);
                stringBuilder2.append("' of filter '");
                stringBuilder2.append(str2);
                stringBuilder2.append("'!");
                throw new RuntimeException(stringBuilder2.toString(), e);
            }
        }

        public FilterGraph build() {
            checkSignatures();
            return buildWithParent(null);
        }

        public FilterGraph buildSubGraph(FilterGraph filterGraph) {
            if (filterGraph == null) {
                throw new NullPointerException("Parent graph must be non-null!");
            }
            checkSignatures();
            return buildWithParent(filterGraph);
        }

        private FilterGraph buildWithParent(FilterGraph filterGraph) {
            FilterGraph filterGraph2 = new FilterGraph(this.mContext, filterGraph);
            Collection values = this.mFilterMap.values();
            filterGraph2.mFilterMap = this.mFilterMap;
            filterGraph2.mFilters = (Filter[]) values.toArray(new Filter[values.size()]);
            for (Entry value : this.mFilterMap.entrySet()) {
                ((Filter) value.getValue()).insertIntoFilterGraph(filterGraph2);
            }
            return filterGraph2;
        }

        private void checkSignatures() {
            FilterGraph.checkSignaturesForFilters(this.mFilterMap.values());
        }

        public void connect(Filter filter, String str, Filter filter2, String str2) {
            filter.connect(str, filter2, str2);
        }

        public void connect(String str, String str2, String str3, String str4) {
            Filter filter = getFilter(str);
            Filter filter2 = getFilter(str3);
            StringBuilder stringBuilder;
            if (filter == null) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
                stringBuilder.append("Unknown filter '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (filter2 == null) {
                stringBuilder = new StringBuilder(String.valueOf(str3).length() + 18);
                stringBuilder.append("Unknown filter '");
                stringBuilder.append(str3);
                stringBuilder.append("'!");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                connect(filter, str2, filter2, str4);
            }
        }

        private void connectAndBranch(Filter filter, String str, Filter filter2, String str2) {
            String name = filter.getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 9) + String.valueOf(str).length());
            stringBuilder.append("__");
            stringBuilder.append(name);
            stringBuilder.append("_");
            stringBuilder.append(str);
            stringBuilder.append("Branch");
            String stringBuilder2 = stringBuilder.toString();
            Filter filter3 = getFilter(stringBuilder2);
            if (filter3 == null) {
                filter3 = new BranchFilter(this.mContext, stringBuilder2, false);
                addFilter(filter3);
                filter.connect(str, filter3, "input");
            }
            stringBuilder2 = filter2.getName();
            StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(stringBuilder2).length() + 3) + String.valueOf(str2).length());
            stringBuilder3.append("to");
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("_");
            stringBuilder3.append(str2);
            filter3.connect(stringBuilder3.toString(), filter2, str2);
        }

        public Filter getFilter(String str) {
            return (Filter) this.mFilterMap.get(str);
        }
    }

    private FilterGraph(MffContext mffContext, FilterGraph filterGraph) {
        this.mFilterMap = new HashMap();
        this.mFilters = null;
        this.mSubGraphs = new HashSet();
        this.mSubGraphsTearDownLock = new Object();
        this.mContext = mffContext;
        this.mContext.addGraph(this);
        if (filterGraph != null) {
            this.mParentGraph = filterGraph;
            this.mParentGraph.mSubGraphs.add(this);
        }
    }

    private void addAllFiltersTo(ArrayList arrayList) {
        arrayList.addAll(Arrays.asList(getFilters()));
        Iterator it = this.mSubGraphs.iterator();
        while (it.hasNext()) {
            ((FilterGraph) it.next()).addAllFiltersTo(arrayList);
        }
    }

    public void attachToRunner(GraphRunner graphRunner) {
        GraphRunner graphRunner2 = this.mRunner;
        if (graphRunner2 == null) {
            Iterator it = this.mSubGraphs.iterator();
            while (it.hasNext()) {
                ((FilterGraph) it.next()).attachToRunner(graphRunner);
            }
            graphRunner.attachGraph(this);
            this.mRunner = graphRunner;
        } else if (graphRunner2 != graphRunner) {
            throw new RuntimeException("Cannot attach FilterGraph to GraphRunner that is already attached to another GraphRunner!");
        }
    }

    public void bindFilterToView(String str, View view) {
        Filter filter = (Filter) this.mFilterMap.get(str);
        if (filter == null || !(filter instanceof ViewFilter)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
            stringBuilder.append("Unknown view filter '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        ((ViewFilter) filter).bindToView(view);
    }

    public void bindValueTarget(String str, ValueListener valueListener, boolean z) {
        Filter filter = (Filter) this.mFilterMap.get(str);
        if (filter == null || !(filter instanceof ValueTarget)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Unknown ValueTarget filter '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        ((ValueTarget) filter).setListener(valueListener, z);
    }

    public void checkSignatures() {
        checkSignaturesForFilters(this.mFilterMap.values());
    }

    static void checkSignaturesForFilters(Collection collection) {
        for (Filter filter : collection) {
            Signature signature = filter.getSignature();
            signature.checkInputPortsConform(filter);
            signature.checkOutputPortsConform(filter);
        }
    }

    public void dumpGraphState(PrintWriter printWriter) {
        for (Filter filter : this.mFilters) {
            String valueOf = String.valueOf(filter);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 8);
            stringBuilder.append("Filter ");
            stringBuilder.append(valueOf);
            stringBuilder.append(":");
            printWriter.println(stringBuilder.toString());
            for (InputPort inputPort : filter.getConnectedInputPorts()) {
                String str;
                String name;
                if (inputPort.hasFrame()) {
                    valueOf = "X";
                } else {
                    valueOf = " ";
                }
                if (inputPort.waitsForFrame() && !inputPort.hasFrame()) {
                    str = " (BLOCKED)";
                } else {
                    str = "";
                }
                OutputPort sourceHint = inputPort.getSourceHint();
                if (sourceHint != null) {
                    String name2 = sourceHint.getFilter().getName();
                    name = sourceHint.getName();
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(name2).length() + 2) + String.valueOf(name).length());
                    stringBuilder2.append(name2);
                    stringBuilder2.append("[");
                    stringBuilder2.append(name);
                    stringBuilder2.append("]");
                    name = stringBuilder2.toString();
                } else {
                    name = "<unknown source>";
                }
                String name3 = inputPort.getName();
                StringBuilder stringBuilder3 = new StringBuilder((((String.valueOf(name).length() + 13) + String.valueOf(valueOf).length()) + String.valueOf(name3).length()) + String.valueOf(str).length());
                stringBuilder3.append("  IN: ");
                stringBuilder3.append(name);
                stringBuilder3.append(" =[");
                stringBuilder3.append(valueOf);
                stringBuilder3.append("]=> ");
                stringBuilder3.append(name3);
                stringBuilder3.append(str);
                printWriter.println(stringBuilder3.toString());
            }
            for (OutputPort outputPort : filter.getConnectedOutputPorts()) {
                if (outputPort.isAvailable()) {
                    valueOf = " ";
                } else {
                    valueOf = "X";
                }
                InputPort target = outputPort.getTarget();
                String name4 = target.getFilter().getName();
                str = target.getName();
                StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(name4).length() + 2) + String.valueOf(str).length());
                stringBuilder4.append(name4);
                stringBuilder4.append("[");
                stringBuilder4.append(str);
                stringBuilder4.append("]");
                name4 = stringBuilder4.toString();
                if (!outputPort.waitsUntilAvailable() || outputPort.isAvailable()) {
                    str = "";
                } else {
                    str = " (BLOCKED)";
                }
                String name5 = outputPort.getName();
                stringBuilder2 = new StringBuilder((((String.valueOf(name5).length() + 14) + String.valueOf(valueOf).length()) + String.valueOf(name4).length()) + String.valueOf(str).length());
                stringBuilder2.append("  OUT: ");
                stringBuilder2.append(name5);
                stringBuilder2.append(" =[");
                stringBuilder2.append(valueOf);
                stringBuilder2.append("]=> ");
                stringBuilder2.append(name4);
                stringBuilder2.append(str);
                printWriter.println(stringBuilder2.toString());
            }
        }
    }

    void flushFrames() {
        for (Filter filter : this.mFilterMap.values()) {
            for (InputPort clear : filter.getConnectedInputPorts()) {
                clear.clear();
            }
            for (OutputPort clear2 : filter.getConnectedOutputPorts()) {
                clear2.clear();
            }
        }
    }

    public List getAllFilters() {
        List arrayList = new ArrayList();
        addAllFiltersTo(arrayList);
        return arrayList;
    }

    public MffContext getContext() {
        return this.mContext;
    }

    public Filter getFilter(String str) {
        return (Filter) this.mFilterMap.get(str);
    }

    public Filter[] getFilters() {
        return this.mFilters;
    }

    public GraphInputSource getGraphInput(String str) {
        Filter filter = (Filter) this.mFilterMap.get(str);
        if (filter != null && (filter instanceof GraphInputSource)) {
            return (GraphInputSource) filter;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 28);
        stringBuilder.append("Unknown source '");
        stringBuilder.append(str);
        stringBuilder.append("' specified!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public GraphOutputTarget getGraphOutput(String str) {
        Filter filter = (Filter) this.mFilterMap.get(str);
        if (filter != null && (filter instanceof GraphOutputTarget)) {
            return (GraphOutputTarget) filter;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 28);
        stringBuilder.append("Unknown target '");
        stringBuilder.append(str);
        stringBuilder.append("' specified!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public GraphRunner getRunner() {
        if (this.mRunner == null) {
            attachToRunner(new GraphRunner(this.mContext));
        }
        return this.mRunner;
    }

    Set getSubGraphs() {
        return this.mSubGraphs;
    }

    public VariableSource getVariable(String str) {
        Filter filter = (Filter) this.mFilterMap.get(str);
        if (filter != null && (filter instanceof VariableSource)) {
            return (VariableSource) filter;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
        stringBuilder.append("Unknown variable '");
        stringBuilder.append(str);
        stringBuilder.append("' specified!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean isRunning() {
        GraphRunner graphRunner = this.mRunner;
        return graphRunner != null && graphRunner.isRunning();
    }

    public boolean isSubGraph() {
        return this.mParentGraph != null;
    }

    private void recursiveTearDown() {
        synchronized (this.mSubGraphsTearDownLock) {
            Iterator it = this.mSubGraphs.iterator();
            while (it.hasNext()) {
                ((FilterGraph) it.next()).recursiveTearDown();
            }
        }
        GraphRunner graphRunner = this.mRunner;
        if (graphRunner != null) {
            graphRunner.tearDownGraph(this);
        }
    }

    public GraphRunner run() {
        GraphRunner runner = getRunner();
        runner.setIsVerbose(false);
        runner.start(this);
        return runner;
    }

    public void tearDown() {
        if (this.mParentGraph != null) {
            throw new RuntimeException("Attempting to tear down sub-graph!");
        }
        recursiveTearDown();
    }

    void wipe() {
        synchronized (this.mSubGraphsTearDownLock) {
            this.mSubGraphs.clear();
        }
        this.mContext.removeGraph(this);
        this.mFilters = null;
        this.mFilterMap = null;
        this.mParentGraph = null;
    }
}
