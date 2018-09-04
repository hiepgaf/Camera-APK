package com.google.android.libraries.smartburst.filterfw.filterpacks.text;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class StringLogger extends Filter {
    public StringLogger(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("string", 2, FrameType.single(String.class)).disallowOtherPorts();
    }

    protected void onProcess() {
        Log.i("StringLogger", (String) getConnectedInputPort("string").pullFrame().asFrameValue().getValue());
    }
}
