package com.google.android.libraries.smartburst.filterfw.filterpacks.text;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.ViewFilter;

/* compiled from: PG */
public class TextViewTarget extends ViewFilter {
    public TextView mTextView = null;

    public TextViewTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("text", 2, FrameType.single(String.class)).disallowOtherPorts();
    }

    public void onBindToView(View view) {
        if (view instanceof TextView) {
            this.mTextView = (TextView) view;
            return;
        }
        throw new IllegalArgumentException("View must be a TextView!");
    }

    protected void onProcess() {
        final String str = (String) getConnectedInputPort("text").pullFrame().asFrameValue().getValue();
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.post(new Runnable() {
                public void run() {
                    TextViewTarget.this.mTextView.setText(str);
                }
            });
        }
    }
}
