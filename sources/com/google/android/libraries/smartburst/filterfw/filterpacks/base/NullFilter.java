package com.google.android.libraries.smartburst.filterfw.filterpacks.base;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class NullFilter extends Filter {
    public NullFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("input", 2, FrameType.any()).disallowOtherInputs();
    }

    protected final void onProcess() {
        getConnectedInputPort("input").pullFrame();
    }
}
