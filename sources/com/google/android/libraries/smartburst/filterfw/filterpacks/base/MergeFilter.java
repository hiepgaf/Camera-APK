package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import android.os.SystemClock;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class MergeFilter extends Filter {
    public static final int MODE_LFU = 2;
    public static final int MODE_LRU = 1;
    public int mMode = 1;
    public long[] mPortScores = null;

    public MergeFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addOutputPort("output", 2, FrameType.any()).disallowOtherOutputs();
    }

    private final void initScores() {
        this.mPortScores = new long[getConnectedInputPorts().length];
        int i = 0;
        while (true) {
            long[] jArr = this.mPortScores;
            if (i < jArr.length) {
                jArr[i] = Long.MIN_VALUE;
                i++;
            } else {
                return;
            }
        }
    }

    public final void onInputPortAttached(InputPort inputPort) {
        inputPort.setWaitsForFrame(false);
    }

    public final void onInputPortOpen(InputPort inputPort) {
        inputPort.attachToOutputPort(getConnectedOutputPort("output"));
    }

    protected final void onOpen() {
        initScores();
    }

    protected final void onProcess() {
        InputPort[] connectedInputPorts = getConnectedInputPorts();
        long j = Long.MIN_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < connectedInputPorts.length; i2++) {
            if (connectedInputPorts[i2].hasFrame()) {
                long j2 = this.mPortScores[i2];
                if (j2 >= j) {
                    i = i2;
                    j = j2;
                }
            }
        }
        if (i >= 0) {
            getConnectedOutputPort("output").pushFrame(connectedInputPorts[i].pullFrame());
            updateScore(i);
        }
    }

    public final void setMergeMode(int i) {
        if (isRunning()) {
            throw new IllegalStateException("Cannot update merge mode while running!");
        }
        this.mMode = i;
    }

    private final void updateScore(int i) {
        int i2 = this.mMode;
        switch (i2) {
            case 1:
                this.mPortScores[i] = -SystemClock.elapsedRealtime();
                return;
            case 2:
                long[] jArr = this.mPortScores;
                jArr[i] = jArr[i] - 1;
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown merge mode ");
                stringBuilder.append(i2);
                stringBuilder.append("!");
                throw new RuntimeException(stringBuilder.toString());
        }
    }
}
