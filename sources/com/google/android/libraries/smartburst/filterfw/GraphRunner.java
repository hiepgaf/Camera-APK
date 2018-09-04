package com.google.android.libraries.smartburst.filterfw;

import android.opengl.EGL14;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.libraries.smartburst.filterfw.util.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
import p000.kqg;

/* compiled from: PG */
public final class GraphRunner {
    public static final Event BEGIN_EVENT = new Event(2, null);
    public static final boolean COLLECT_TRACE = false;
    public static final Event FLUSH_EVENT = new Event(10, null);
    public static final Event HALT_EVENT = new Event(7, null);
    public static final Event KILL_EVENT = new Event(12, null);
    public static final Event PAUSE_EVENT = new Event(6, null);
    public static int PRIORITY_SLEEP = -1;
    public static int PRIORITY_STOP = -2;
    public static final Event RELEASE_FRAMES_EVENT = new Event(13, null);
    public static final Event RESTART_EVENT = new Event(9, null);
    public static final Event RESUME_EVENT = new Event(8, null);
    public static final Event STEP_EVENT = new Event(3, null);
    public static final Event STOP_EVENT = new Event(4, null);
    public static final int STRATEGY_FILTER_PRIORITY = 5;
    public static final int STRATEGY_LFU = 3;
    public static final int STRATEGY_LRU = 2;
    public static final int STRATEGY_ONESHOT = 4;
    public static final int STRATEGY_RANDOM = 1;
    public static final String TAG = GraphRunner.class.getSimpleName();
    public static ThreadLocal mThreadRunner = new ThreadLocal();
    public final MffContext mContext;
    public FrameManager mFrameManager;
    public final Set mGraphs;
    public final RunParameters mParams;
    public GraphRunLoop mRunLoop;
    public Thread mRunThread;
    public FilterGraph mRunningGraph;
    public Scheduler mScheduler;

    /* compiled from: PG */
    public class Config {
        public boolean allowOpenGL = true;
        public int threadPriority = 5;
    }

    /* compiled from: PG */
    class Event {
        public static final int BEGIN = 2;
        public static final int EARLY_PREPARE = 14;
        public static final int FLUSH = 10;
        public static final int HALT = 7;
        public static final int KILL = 12;
        public static final int PAUSE = 6;
        public static final int PREPARE = 1;
        public static final int RELEASE_FRAMES = 13;
        public static final int RESTART = 9;
        public static final int RESUME = 8;
        public static final int STEP = 3;
        public static final int STOP = 4;
        public static final int TEARDOWN = 11;
        public int code;
        public Object object;

        public Event(int i, Object obj) {
            this.code = i;
            this.object = obj;
        }
    }

    /* compiled from: PG */
    class FilterTiming {
        public int count;
        public long realTime;
        public long threadTime;

        private FilterTiming() {
        }
    }

    /* compiled from: PG */
    final class GraphRunLoop implements Runnable {
        public final boolean mAllowOpenGL;
        public long mBeginTimeReal;
        public long mBeginTimeThread;
        public Exception mCaughtException = null;
        public boolean mClosedSuccessfully = true;
        public LinkedBlockingQueue mEventQueue = new LinkedBlockingQueue();
        public Map mFilterTimings = new HashMap();
        public Stack mFilters = new Stack();
        public Set mOpenedGraphs = new HashSet();
        public RenderTarget mRenderTarget = null;
        public final ScheduleResult mScheduleResult = new ScheduleResult();
        public final State mState = new State();
        public ConditionVariable mStopCondition = new ConditionVariable(true);
        public Stack mSubListeners = new Stack();

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.GraphRunner$GraphRunLoop$1 */
        class C00691 implements Comparator {
            C00691(GraphRunLoop graphRunLoop) {
            }

            public int compare(Pair pair, Pair pair2) {
                return (int) (((FilterTiming) pair2.second).realTime - ((FilterTiming) pair.second).realTime);
            }
        }

        public GraphRunLoop(boolean z) {
            this.mAllowOpenGL = z;
        }

        public final boolean checkState(int i) {
            return this.mState.check(i);
        }

        private final void cleanUp() {
            this.mState.setState(1);
            if (GraphRunner.this.flushOnClose()) {
                onFlush();
            }
            GraphRunner.this.mScheduler.cleanUp();
            this.mOpenedGraphs.clear();
            this.mFilters.clear();
            GraphRunner.this.onRunnerStopped(this.mCaughtException, this.mClosedSuccessfully);
            this.mStopCondition.open();
        }

        private final void closeAllFilters() {
            for (FilterGraph closeFilters : this.mOpenedGraphs) {
                closeFilters(closeFilters);
            }
        }

        private final void closeFilters(FilterGraph filterGraph) {
            Log.v("GraphRunner", "CLOSING FILTERS");
            Filter[] filters = filterGraph.getFilters();
            boolean isVerbose = GraphRunner.this.isVerbose();
            for (int i = 0; i < filters.length; i++) {
                if (isVerbose) {
                    String valueOf = String.valueOf(filters[i]);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    stringBuilder.append("Closing Filter ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append("!");
                    Log.i("GraphRunner", stringBuilder.toString());
                }
                filters[i].softReset();
            }
        }

        private final Filter[] currentFilters() {
            return (Filter[]) this.mFilters.peek();
        }

        private final void dump(String str, FilterTiming filterTiming, FilterTiming filterTiming2) {
            r0 = new Object[9];
            long j = filterTiming.realTime;
            r0[0] = Long.valueOf(j);
            float f = (float) j;
            int i = filterTiming.count;
            float f2 = (float) i;
            r0[1] = Float.valueOf(f / f2);
            r0[2] = Float.valueOf((f * 100.0f) / ((float) filterTiming2.realTime));
            long j2 = filterTiming.threadTime;
            r0[3] = Long.valueOf(j2);
            float f3 = (float) j2;
            r0[4] = Float.valueOf(f3 / f2);
            f2 = f3 * 100.0f;
            r0[5] = Float.valueOf(f2 / ((float) filterTiming2.threadTime));
            r0[6] = Float.valueOf(f2 / f);
            r0[7] = Integer.valueOf(i);
            r0[8] = str;
            timingLog(String.format("%dms (avg %.2fms) %.4f%% real, %dms (avg %.2fms) %.4f%% thread (%.4f%%) (x%d) - %s", r0));
        }

        private final void dumpTimings(long j, long j2) {
            Map hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            FilterTiming filterTiming = new FilterTiming();
            for (Entry entry : this.mFilterTimings.entrySet()) {
                Filter filter = (Filter) entry.getKey();
                FilterTiming filterTiming2 = (FilterTiming) entry.getValue();
                arrayList.add(new Pair(filter, filterTiming2));
                FilterTiming filterTiming3 = (FilterTiming) hashMap.get(filter.getClass());
                if (filterTiming3 == null) {
                    filterTiming3 = new FilterTiming();
                    hashMap.put(filter.getClass(), filterTiming3);
                }
                r4.threadTime += filterTiming2.threadTime;
                r4.realTime += filterTiming2.realTime;
                r4.count += filterTiming2.count;
                filterTiming.threadTime += filterTiming2.threadTime;
                filterTiming.realTime += filterTiming2.realTime;
                filterTiming.count = filterTiming2.count + filterTiming.count;
            }
            for (Entry entry2 : hashMap.entrySet()) {
                arrayList2.add(new Pair(entry2.getKey(), (FilterTiming) entry2.getValue()));
            }
            Comparator c00691 = new C00691(this);
            Collections.sort(arrayList, c00691);
            Collections.sort(arrayList2, c00691);
            timingLog("\n*** Timings ***\n");
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Long.valueOf(j2);
            float f = (float) j2;
            float f2 = (float) j;
            objArr[2] = Float.valueOf((100.0f * f) / f2);
            timingLog(String.format("Graph time: %dms real, %dms thread (%.4f%%)", objArr));
            objArr = new Object[4];
            long j3 = filterTiming.realTime;
            objArr[0] = Long.valueOf(j3);
            objArr[1] = Float.valueOf((((float) j3) * 100.0f) / f2);
            long j4 = filterTiming.threadTime;
            objArr[2] = Long.valueOf(j4);
            objArr[3] = Float.valueOf((((float) j4) * 100.0f) / f);
            timingLog(String.format("Filter totals: %dms real (%.4f%%), %dms thread (%.4f%%)", objArr));
            timingLog("\n* Individual filters\n");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Pair pair = (Pair) arrayList.get(i);
                dump(pair.first.toString(), (FilterTiming) pair.second, filterTiming);
                i = i2;
            }
            timingLog("\n* Filter types\n");
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                i2 = i + 1;
                pair = (Pair) arrayList2.get(i);
                dump(pair.first.toString(), (FilterTiming) pair.second, filterTiming);
                i = i2;
            }
            this.mFilterTimings.clear();
        }

        public final void enterSubGraph(FilterGraph filterGraph, SubListener subListener) {
            if (this.mState.check(4)) {
                onOpenGraph(filterGraph);
                this.mSubListeners.push(subListener);
            }
        }

        public final ConditionVariable getStopCondition() {
            return this.mStopCondition;
        }

        public final boolean isOpenGLAllowed() {
            return this.mAllowOpenGL;
        }

        private final void loadFilters(FilterGraph filterGraph) {
            this.mFilters.push(filterGraph.getFilters());
        }

        private final void loop() {
            boolean z = false;
            while (!z) {
                try {
                    Event nextEvent = nextEvent();
                    if (nextEvent != null) {
                        boolean z2;
                        switch (nextEvent.code) {
                            case 1:
                                onPrepare((FilterGraph) nextEvent.object);
                                z2 = z;
                                break;
                            case 2:
                                onBegin();
                                z2 = z;
                                break;
                            case 3:
                                onStep();
                                z2 = z;
                                break;
                            case 4:
                                onStop();
                                z2 = z;
                                break;
                            case 6:
                                onPause();
                                z2 = z;
                                break;
                            case 7:
                                onHalt();
                                z2 = z;
                                break;
                            case 8:
                                onResume();
                                z2 = z;
                                break;
                            case 9:
                                onRestart();
                                z2 = z;
                                break;
                            case 10:
                                onFlush();
                                z2 = z;
                                break;
                            case 11:
                                onTearDown((FilterGraph) nextEvent.object);
                                z2 = z;
                                break;
                            case 12:
                                onKill();
                                z2 = true;
                                break;
                            case 13:
                                onReleaseFrames();
                                z2 = z;
                                break;
                            case 14:
                                onEarlyPrepare((FilterGraph) nextEvent.object);
                                z2 = z;
                                break;
                            default:
                                z2 = z;
                                break;
                        }
                        z = z2;
                    }
                } catch (Throwable e) {
                    if (this.mCaughtException == null) {
                        this.mCaughtException = e;
                        this.mClosedSuccessfully = true;
                        kqg.f8420a.mo2210b(e);
                        pushEvent(GraphRunner.STOP_EVENT);
                    } else {
                        this.mClosedSuccessfully = false;
                        this.mEventQueue.clear();
                        cleanUp();
                    }
                }
            }
        }

        private final Event nextEvent() {
            try {
                return (Event) this.mEventQueue.take();
            } catch (InterruptedException e) {
                Log.w("GraphRunner", "Event queue processing was interrupted.");
                return null;
            }
        }

        private final void onBegin() {
            if (this.mState.current() == 2) {
                this.mBeginTimeReal = SystemClock.elapsedRealtime();
                this.mBeginTimeThread = SystemClock.currentThreadTimeMillis();
                this.mState.setState(4);
                pushEvent(GraphRunner.STEP_EVENT);
            }
        }

        private final void onDestroy() {
            GraphRunner.this.mFrameManager.destroyBackings();
            RenderTarget renderTarget = this.mRenderTarget;
            if (renderTarget != null) {
                renderTarget.release();
                this.mRenderTarget = null;
                EGL14.eglReleaseThread();
            }
        }

        private final void onEarlyPrepare(FilterGraph filterGraph) {
            if (this.mState.current() == 1) {
                for (FilterGraph onEarlyPrepare : filterGraph.getSubGraphs()) {
                    onEarlyPrepare(onEarlyPrepare);
                }
                for (Filter prepareOnly : filterGraph.getFilters()) {
                    prepareOnly.prepareOnly();
                }
            }
        }

        private final void onFlush() {
            if (this.mState.check(16) || this.mState.check(1)) {
                for (FilterGraph flushFrames : this.mOpenedGraphs) {
                    flushFrames.flushFrames();
                }
            }
        }

        private final void onHalt() {
            if (this.mState.addState(16) && this.mState.check(4)) {
                closeAllFilters();
            }
        }

        private final void onInit() {
            GraphRunner.mThreadRunner.set(GraphRunner.this);
            GraphRunner.this.mFrameManager.attachManagerToThread();
            if (GraphRunner.this.getContext().isOpenGLSupported()) {
                this.mRenderTarget = RenderTarget.newTarget(1, 1);
                this.mRenderTarget.focus();
            }
        }

        private final void onKill() {
            synchronized (GraphRunner.this.mGraphs) {
                if (GraphRunner.this.mGraphs.isEmpty()) {
                } else {
                    int size = GraphRunner.this.mGraphs.size();
                    StringBuilder stringBuilder = new StringBuilder(70);
                    stringBuilder.append("Attempting to tear down runner with ");
                    stringBuilder.append(size);
                    stringBuilder.append(" graphs still attached!");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }

        private final void onOpenGraph(FilterGraph filterGraph) {
            loadFilters(filterGraph);
            this.mOpenedGraphs.add(filterGraph);
            this.mFilters.push(GraphRunner.this.mScheduler.prepare((Filter[]) this.mFilters.pop()));
            pushEvent(GraphRunner.BEGIN_EVENT);
        }

        private final void onPause() {
            this.mState.addState(8);
        }

        private final void onPrepare(FilterGraph filterGraph) {
            if (this.mState.current() == 1) {
                this.mState.setState(2);
                this.mCaughtException = null;
                onOpenGraph(filterGraph);
            }
        }

        private final void onReleaseFrames() {
            synchronized (GraphRunner.this.mGraphs) {
                if (GraphRunner.this.mGraphs.isEmpty()) {
                } else {
                    int size = GraphRunner.this.mGraphs.size();
                    StringBuilder stringBuilder = new StringBuilder(68);
                    stringBuilder.append("Attempting to release frames with ");
                    stringBuilder.append(size);
                    stringBuilder.append(" graphs still attached!");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            GraphRunner.this.mFrameManager.destroyBackings();
        }

        private final void onRestart() {
            if (this.mState.removeState(16) && this.mState.current() == 4) {
                pushEvent(GraphRunner.STEP_EVENT);
            }
        }

        private final void onResume() {
            if (this.mState.removeState(8) && this.mState.current() == 4) {
                pushEvent(GraphRunner.STEP_EVENT);
            }
        }

        private final void onStarve() {
            this.mFilters.pop();
            if (this.mFilters.empty()) {
                onStop();
                return;
            }
            SubListener subListener = (SubListener) this.mSubListeners.pop();
            if (subListener != null) {
                subListener.onSubGraphRunEnded(GraphRunner.this);
            }
            this.mFilters.push(GraphRunner.this.mScheduler.prepare((Filter[]) this.mFilters.pop()));
            pushEvent(GraphRunner.STEP_EVENT);
        }

        private final void onStep() {
            Trace.beginSection("GraphRunner.onStep()");
            if (this.mState.current() == 4) {
                GraphRunner.this.mScheduler.nextFilter(currentFilters(), this.mScheduleResult);
                if (this.mScheduleResult.priority != ((long) GraphRunner.PRIORITY_SLEEP)) {
                    if (this.mScheduleResult.priority == ((long) GraphRunner.PRIORITY_STOP)) {
                        onStarve();
                    } else {
                        scheduleFilter(this.mScheduleResult.filter);
                        pushEvent(GraphRunner.STEP_EVENT);
                    }
                }
            } else {
                int current = this.mState.current();
                StringBuilder stringBuilder = new StringBuilder(35);
                stringBuilder.append("State is not running! (");
                stringBuilder.append(current);
                stringBuilder.append(")");
                Log.w("GraphRunner", stringBuilder.toString());
            }
            Trace.endSection();
        }

        private final void onStop() {
            if (this.mState.check(4)) {
                if (GraphRunner.this.isVerbose()) {
                    dumpTimings(SystemClock.elapsedRealtime() - this.mBeginTimeReal, SystemClock.currentThreadTimeMillis() - this.mBeginTimeThread);
                }
                if (!this.mState.check(16)) {
                    closeAllFilters();
                }
                cleanUp();
            }
        }

        private final void onTearDown(FilterGraph filterGraph) {
            if (this.mState.check(4)) {
                throw new IllegalStateException("Attempting to teardown graph while running!");
            }
            Filter[] filters = filterGraph.getFilters();
            if (filters != null) {
                for (Filter performTearDown : filters) {
                    performTearDown.performTearDown();
                }
                filterGraph.wipe();
            }
            synchronized (GraphRunner.this.mGraphs) {
                GraphRunner.this.mGraphs.remove(filterGraph);
            }
        }

        public final void pushEvent(int i, Object obj) {
            this.mEventQueue.offer(new Event(i, obj));
        }

        public final void pushEvent(Event event) {
            this.mEventQueue.offer(event);
        }

        public final void pushWakeEvent(Event event) {
            if (this.mEventQueue.isEmpty()) {
                pushEvent(event);
            }
        }

        public final void run() {
            try {
                onInit();
                loop();
                onDestroy();
            } catch (Throwable e) {
                this.mCaughtException = e;
                this.mClosedSuccessfully = true;
                Log.w("GraphRunner", "exception running graph", e);
                cleanUp();
                onDestroy();
            }
        }

        private final void scheduleFilter(Filter filter) {
            long elapsedRealtime;
            long currentThreadTimeMillis;
            if (GraphRunner.this.isVerbose()) {
                elapsedRealtime = SystemClock.elapsedRealtime();
                currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            } else {
                currentThreadTimeMillis = 0;
                elapsedRealtime = 0;
            }
            filter.execute();
            if (GraphRunner.this.isVerbose()) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                FilterTiming filterTiming = (FilterTiming) this.mFilterTimings.get(filter);
                if (filterTiming == null) {
                    filterTiming = new FilterTiming();
                    this.mFilterTimings.put(filter, filterTiming);
                }
                filterTiming.realTime = (elapsedRealtime2 - elapsedRealtime) + filterTiming.realTime;
                filterTiming.threadTime = (currentThreadTimeMillis2 - currentThreadTimeMillis) + filterTiming.threadTime;
                filterTiming.count++;
            }
        }

        private final void timingLog(String str) {
            Log.i(GraphRunner.TAG, str);
        }
    }

    /* compiled from: PG */
    public interface Listener {
        void onGraphRunnerError(Exception exception, boolean z);

        void onGraphRunnerStopped(GraphRunner graphRunner);
    }

    /* compiled from: PG */
    class RunParameters {
        public boolean flushOnClose;
        public boolean isVerbose;
        public Listener listener;

        private RunParameters() {
            this.listener = null;
            this.isVerbose = false;
            this.flushOnClose = true;
        }
    }

    /* compiled from: PG */
    class ScheduleResult {
        public Filter filter;
        public long priority;

        private ScheduleResult() {
        }
    }

    /* compiled from: PG */
    interface Scheduler {
        void cleanUp();

        int getStrategy();

        void nextFilter(Filter[] filterArr, ScheduleResult scheduleResult);

        Filter[] prepare(Filter[] filterArr);
    }

    /* compiled from: PG */
    class State {
        public static final int HALTED = 16;
        public static final int PAUSED = 8;
        public static final int PREPARING = 2;
        public static final int RUNNING = 4;
        public static final int STOPPED = 1;
        public int mCurrent;

        private State() {
            this.mCurrent = 1;
        }

        public synchronized boolean addState(int i) {
            boolean z;
            int i2 = this.mCurrent;
            if ((i2 & i) != i) {
                this.mCurrent = i2 | i;
                z = true;
            } else {
                z = false;
            }
            return z;
        }

        public synchronized boolean check(int i) {
            return (this.mCurrent & i) == i;
        }

        public synchronized int current() {
            return this.mCurrent;
        }

        public synchronized boolean removeState(int i) {
            boolean z;
            int i2 = this.mCurrent;
            if ((i2 & i) == i) {
                z = true;
            } else {
                z = false;
            }
            this.mCurrent = i2 & (i ^ -1);
            return z;
        }

        public synchronized void setState(int i) {
            this.mCurrent = i;
        }
    }

    /* compiled from: PG */
    public interface SubListener {
        void onSubGraphRunEnded(GraphRunner graphRunner);
    }

    /* compiled from: PG */
    class FilterPriorityScheduler implements Scheduler {
        public Set mAlreadySorted;
        public Comparator mFilterComparator;
        public int mNextFilterIndex;

        /* compiled from: PG */
        /* renamed from: com.google.android.libraries.smartburst.filterfw.GraphRunner$FilterPriorityScheduler$1 */
        class C00681 implements Comparator {
            C00681(FilterPriorityScheduler filterPriorityScheduler) {
            }

            public int compare(Filter filter, Filter filter2) {
                return filter2.getSchedulePriority() - filter.getSchedulePriority();
            }
        }

        private FilterPriorityScheduler() {
            this.mNextFilterIndex = 0;
            this.mAlreadySorted = new HashSet();
            this.mFilterComparator = new C00681(this);
        }

        private boolean allDependenciesAdded(List list, Filter filter) {
            for (InputPort sourceHint : filter.getConnectedInputPorts()) {
                OutputPort sourceHint2 = sourceHint.getSourceHint();
                if (sourceHint2 != null) {
                    Filter filter2 = sourceHint2.getFilter();
                    if (!(filter2 == null || list.contains(filter2))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void cleanUp() {
            this.mAlreadySorted.clear();
        }

        public int getStrategy() {
            return 5;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void nextFilter(com.google.android.libraries.smartburst.filterfw.Filter[] r7, com.google.android.libraries.smartburst.filterfw.GraphRunner.ScheduleResult r8) {
            /*
            r6 = this;
            r0 = com.google.android.libraries.smartburst.filterfw.GraphRunner.PRIORITY_STOP;
            r2 = (long) r0;
            r0 = 0;
        L_0x0006:
            r4 = r7.length;
            if (r0 >= r4) goto L_0x002f;
        L_0x0009:
            r5 = r6.mNextFilterIndex;
            r1 = r7[r5];
            r5 = r5 + 1;
            r4 = r5 % r4;
            r6.mNextFilterIndex = r4;
            r4 = r1.isSleeping();
            if (r4 == 0) goto L_0x0021;
        L_0x0019:
            r1 = com.google.android.libraries.smartburst.filterfw.GraphRunner.PRIORITY_SLEEP;
            r2 = (long) r1;
        L_0x001e:
            r0 = r0 + 1;
            goto L_0x0006;
        L_0x0021:
            r4 = r1.canSchedule();
            if (r4 == 0) goto L_0x001e;
        L_0x0027:
            r2 = 0;
            r0 = r1;
        L_0x002a:
            r8.filter = r0;
            r8.priority = r2;
            return;
        L_0x002f:
            r0 = 0;
            goto L_0x002a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.smartburst.filterfw.GraphRunner.FilterPriorityScheduler.nextFilter(com.google.android.libraries.smartburst.filterfw.Filter[], com.google.android.libraries.smartburst.filterfw.GraphRunner$ScheduleResult):void");
        }

        public Filter[] prepare(Filter[] filterArr) {
            this.mNextFilterIndex = 0;
            if (this.mAlreadySorted.contains(filterArr)) {
                return filterArr;
            }
            filterArr = sortFilters(filterArr);
            this.mAlreadySorted.add(filterArr);
            return filterArr;
        }

        private Filter[] sortFilters(Filter[] filterArr) {
            List arrayList = new ArrayList(Arrays.asList(filterArr));
            List arrayList2 = new ArrayList(filterArr.length);
            while (arrayList.size() > 0) {
                Collection arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2;
                    Filter filter = (Filter) arrayList.get(i);
                    if (allDependenciesAdded(arrayList2, filter)) {
                        arrayList3.add(filter);
                        arrayList.remove(i);
                        i2 = size - 1;
                    } else {
                        i2 = size;
                    }
                    i++;
                    size = i2;
                }
                Collections.sort(arrayList3, this.mFilterComparator);
                arrayList2.addAll(arrayList3);
            }
            return (Filter[]) arrayList2.toArray(new Filter[arrayList2.size()]);
        }
    }

    /* compiled from: PG */
    class LruScheduler implements Scheduler {
        public LinkedList mFilterQueue;

        private LruScheduler() {
        }

        public void cleanUp() {
        }

        public int getStrategy() {
            return 2;
        }

        public void nextFilter(Filter[] filterArr, ScheduleResult scheduleResult) {
            scheduleResult.priority = (long) GraphRunner.PRIORITY_STOP;
            ListIterator listIterator = this.mFilterQueue.listIterator();
            while (listIterator.hasNext()) {
                Filter filter = (Filter) listIterator.next();
                if (filter.isSleeping()) {
                    scheduleResult.filter = filter;
                    scheduleResult.priority = (long) GraphRunner.PRIORITY_SLEEP;
                } else if (filter.canSchedule()) {
                    scheduleResult.filter = filter;
                    scheduleResult.priority = 100;
                    listIterator.remove();
                    this.mFilterQueue.add(filter);
                    return;
                }
            }
        }

        public Filter[] prepare(Filter[] filterArr) {
            this.mFilterQueue = new LinkedList(Arrays.asList(filterArr));
            return filterArr;
        }
    }

    /* compiled from: PG */
    abstract class ScoringScheduler implements Scheduler {
        private ScoringScheduler(GraphRunner graphRunner) {
        }

        protected abstract long priorityForFilter(Filter filter);

        public void nextFilter(Filter[] filterArr, ScheduleResult scheduleResult) {
            long access$1300 = (long) GraphRunner.PRIORITY_STOP;
            int length = filterArr.length;
            int i = 0;
            Filter filter = null;
            while (i < length) {
                Filter filter2 = filterArr[i];
                long priorityForFilter = priorityForFilter(filter2);
                if (priorityForFilter > access$1300) {
                    filter = filter2;
                }
                if (priorityForFilter <= access$1300) {
                    priorityForFilter = access$1300;
                }
                i++;
                access$1300 = priorityForFilter;
            }
            scheduleResult.filter = filter;
            scheduleResult.priority = access$1300;
        }
    }

    /* compiled from: PG */
    class LfuScheduler extends ScoringScheduler {
        public static final int MAX_PRIORITY = Integer.MAX_VALUE;

        private LfuScheduler(GraphRunner graphRunner) {
            super();
        }

        public void cleanUp() {
        }

        public int getStrategy() {
            return 3;
        }

        public Filter[] prepare(Filter[] filterArr) {
            for (Filter resetScheduleCount : filterArr) {
                resetScheduleCount.resetScheduleCount();
            }
            return filterArr;
        }

        protected long priorityForFilter(Filter filter) {
            if (filter.isSleeping()) {
                return (long) GraphRunner.PRIORITY_SLEEP;
            }
            int scheduleCount;
            if (filter.canSchedule()) {
                scheduleCount = MAX_PRIORITY - filter.getScheduleCount();
            } else {
                scheduleCount = GraphRunner.PRIORITY_STOP;
            }
            return (long) scheduleCount;
        }
    }

    /* compiled from: PG */
    class OneShotScheduler extends LfuScheduler {
        public int mCurCount;

        private OneShotScheduler(GraphRunner graphRunner) {
            super();
            this.mCurCount = 1;
        }

        public void cleanUp() {
        }

        public int getStrategy() {
            return 4;
        }

        protected long priorityForFilter(Filter filter) {
            if (filter.getScheduleCount() < this.mCurCount) {
                return super.priorityForFilter(filter);
            }
            return (long) GraphRunner.PRIORITY_STOP;
        }
    }

    public GraphRunner(MffContext mffContext) {
        this(mffContext, new Config());
    }

    public GraphRunner(MffContext mffContext, Config config) {
        this(mffContext, config, null);
    }

    public GraphRunner(MffContext mffContext, Config config, Listener listener) {
        this.mRunningGraph = null;
        this.mGraphs = new HashSet();
        this.mRunThread = null;
        this.mFrameManager = null;
        this.mParams = new RunParameters();
        this.mParams.listener = listener;
        this.mContext = mffContext;
        this.mFrameManager = new FrameManager(this, 1);
        createScheduler(2);
        this.mRunLoop = new GraphRunLoop(config.allowOpenGL);
        this.mRunThread = new Thread(this.mRunLoop);
        this.mRunThread.setPriority(config.threadPriority);
        this.mRunThread.start();
        this.mContext.addRunner(this);
    }

    final void attachGraph(FilterGraph filterGraph) {
        synchronized (this.mGraphs) {
            this.mGraphs.add(filterGraph);
        }
    }

    final void begin() {
        this.mRunLoop.pushEvent(BEGIN_EVENT);
    }

    private final void createScheduler(int i) {
        switch (i) {
            case 2:
                this.mScheduler = new LruScheduler();
                return;
            case 3:
                this.mScheduler = new LfuScheduler();
                return;
            case 4:
                this.mScheduler = new OneShotScheduler();
                return;
            case 5:
                this.mScheduler = new FilterPriorityScheduler();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder(47);
                stringBuilder.append("Unknown schedule-strategy constant ");
                stringBuilder.append(i);
                stringBuilder.append("!");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static GraphRunner current() {
        return (GraphRunner) mThreadRunner.get();
    }

    public final synchronized void earlyPrepare(FilterGraph filterGraph) {
        if (filterGraph.mRunner != this) {
            throw new IllegalArgumentException("Graph must be attached to runner!");
        }
        this.mRunLoop.pushEvent(14, filterGraph);
    }

    public final void enterSubGraph(FilterGraph filterGraph, SubListener subListener) {
        if (Thread.currentThread() != this.mRunThread) {
            throw new RuntimeException("enterSubGraph must be called from the runner's thread!");
        }
        this.mRunLoop.enterSubGraph(filterGraph, subListener);
    }

    final void flushFrames() {
        this.mRunLoop.pushEvent(FLUSH_EVENT);
    }

    public final boolean flushOnClose() {
        boolean z;
        synchronized (this.mParams) {
            z = this.mParams.flushOnClose;
        }
        return z;
    }

    public final MffContext getContext() {
        return this.mContext;
    }

    public final FrameManager getFrameManager() {
        return this.mFrameManager;
    }

    public final Listener getListener() {
        Listener listener;
        synchronized (this.mParams) {
            listener = this.mParams.listener;
        }
        return listener;
    }

    public final synchronized FilterGraph getRunningGraph() {
        return this.mRunningGraph;
    }

    public final int getSchedulerStrategy() {
        return this.mScheduler.getStrategy();
    }

    final void halt() {
        this.mRunLoop.pushEvent(HALT_EVENT);
    }

    public final boolean isOpenGLSupported() {
        return this.mRunLoop.isOpenGLAllowed() && this.mContext.isOpenGLSupported();
    }

    public final boolean isPaused() {
        return this.mRunLoop.checkState(8);
    }

    public final boolean isRunning() {
        return this.mRunLoop.checkState(1) ^ 1;
    }

    public final boolean isStopped() {
        return this.mRunLoop.checkState(1);
    }

    public final boolean isVerbose() {
        boolean z;
        synchronized (this.mParams) {
            z = this.mParams.isVerbose;
        }
        return z;
    }

    private final void onRunnerStopped(final Exception exception, final boolean z) {
        this.mRunningGraph = null;
        synchronized (this.mParams) {
            if (this.mParams.listener != null) {
                getContext().postRunnable(new Runnable() {
                    public void run() {
                        if (GraphRunner.this.mParams.listener != null) {
                            if (exception == null) {
                                GraphRunner.this.mParams.listener.onGraphRunnerStopped(GraphRunner.this);
                            } else {
                                GraphRunner.this.mParams.listener.onGraphRunnerError(exception, z);
                            }
                        }
                    }
                });
            } else if (exception != null) {
                Log.e("GraphRunner", "Uncaught exception during graph execution! Stack Trace: ");
                kqg.f8420a.mo2210b(exception);
            }
        }
    }

    public final void pause() {
        this.mRunLoop.pushEvent(PAUSE_EVENT);
    }

    public final void releaseFrames() {
        this.mRunLoop.pushEvent(RELEASE_FRAMES_EVENT);
    }

    final void restart() {
        this.mRunLoop.pushEvent(RESTART_EVENT);
    }

    public final void resume() {
        this.mRunLoop.pushEvent(RESUME_EVENT);
    }

    public final void setFlushOnClose(boolean z) {
        synchronized (this.mParams) {
            this.mParams.flushOnClose = z;
        }
    }

    public final void setIsVerbose(boolean z) {
        synchronized (this.mParams) {
            this.mParams.isVerbose = z;
        }
    }

    public final void setListener(Listener listener) {
        synchronized (this.mParams) {
            this.mParams.listener = listener;
        }
    }

    public final void setSchedulerStrategy(int i) {
        if (isRunning()) {
            throw new RuntimeException("Attempting to change scheduling strategy on running GraphRunner!");
        }
        createScheduler(i);
    }

    public final void setThreadName(String str) {
        this.mRunThread.setName(str);
    }

    final void signalWakeUp() {
        this.mRunLoop.pushWakeEvent(STEP_EVENT);
    }

    public final synchronized void start(FilterGraph filterGraph) {
        if (filterGraph.mRunner != this) {
            throw new IllegalArgumentException("Graph must be attached to runner!");
        }
        this.mRunningGraph = filterGraph;
        this.mRunLoop.getStopCondition().close();
        this.mRunLoop.pushEvent(1, filterGraph);
    }

    public final void stop() {
        this.mRunLoop.pushEvent(STOP_EVENT);
    }

    public final void tearDown() {
        synchronized (this.mGraphs) {
            for (FilterGraph tearDownGraph : this.mGraphs) {
                tearDownGraph(tearDownGraph);
            }
        }
        this.mRunLoop.pushEvent(KILL_EVENT);
        try {
            this.mRunThread.join();
        } catch (InterruptedException e) {
            Log.e("GraphRunner", "Error waiting for runner thread to finish!");
        }
    }

    final void tearDownGraph(FilterGraph filterGraph) {
        if (filterGraph.getRunner() != this) {
            throw new IllegalArgumentException("Attempting to tear down graph with foreign GraphRunner!");
        }
        this.mRunLoop.pushEvent(11, filterGraph);
    }

    public final void waitUntilStop() {
        this.mRunLoop.getStopCondition().block();
    }
}
