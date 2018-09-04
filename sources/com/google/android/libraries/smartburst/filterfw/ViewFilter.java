package com.google.android.libraries.smartburst.filterfw;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.libraries.smartburst.filterfw.InputPort.FrameListener;

/* compiled from: PG */
public abstract class ViewFilter extends Filter {
    public static final int SCALE_FILL = 3;
    public static final int SCALE_FIT = 2;
    public static final int SCALE_STRETCH = 1;
    public float[] mClearColor = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    public boolean mFlipVertically = true;
    public String mRequestedScaleMode = null;
    public int mScaleMode = 2;
    public FrameListener mScaleModeListener = new C01441();

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.ViewFilter$1 */
    class C01441 implements FrameListener {
        C01441() {
        }

        public void onFrameReceived(InputPort inputPort, Frame frame) {
            String str = (String) frame.asFrameValue().getValue();
            if (!str.equals(ViewFilter.this.mRequestedScaleMode)) {
                ViewFilter.this.mRequestedScaleMode = str;
                if (str.equals("stretch")) {
                    ViewFilter.this.mScaleMode = 1;
                } else if (str.equals("fit")) {
                    ViewFilter.this.mScaleMode = 2;
                } else if (str.equals("fill")) {
                    ViewFilter.this.mScaleMode = 3;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
                    stringBuilder.append("Unknown scale-mode '");
                    stringBuilder.append(str);
                    stringBuilder.append("'!");
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }

    public ViewFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public abstract void onBindToView(View view);

    public void bindToView(View view) {
        if (isRunning()) {
            throw new IllegalStateException("Attempting to bind filter to view while it is running!");
        }
        onBindToView(view);
    }

    public void connectViewInputs(InputPort inputPort) {
        if (inputPort.getName().equals("scaleMode")) {
            inputPort.bindToListener(this.mScaleModeListener);
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("flip")) {
            inputPort.bindToFieldNamed("mFlipVertically");
            inputPort.setAutoPullEnabled(true);
        }
    }

    public Signature getSignature() {
        return new Signature().addInputPort("scaleMode", 1, FrameType.single(String.class)).addInputPort("flip", 1, FrameType.single(Boolean.TYPE));
    }

    public RectF getTargetRect(Rect rect, Rect rect2) {
        RectF rectF = new RectF();
        if (rect2.width() > 0 && rect2.height() > 0) {
            float width = (((float) rect2.width()) / ((float) rect2.height())) / (((float) rect.width()) / ((float) rect.height()));
            float f;
            switch (this.mScaleMode) {
                case 1:
                    rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
                    break;
                case 2:
                    if (width <= 1.0f) {
                        f = 0.5f - (width * 0.5f);
                        rectF.set(0.0f, f, 1.0f, width + f);
                        break;
                    }
                    f = 0.5f - (0.5f / width);
                    rectF.set(f, 0.0f, (1.0f / width) + f, 1.0f);
                    break;
                case 3:
                    if (width <= 1.0f) {
                        f = 0.5f - (0.5f / width);
                        rectF.set(f, 0.0f, (1.0f / width) + f, 1.0f);
                        break;
                    }
                    f = 0.5f - (width * 0.5f);
                    rectF.set(0.0f, f, 1.0f, width + f);
                    break;
            }
        }
        return rectF;
    }

    public void setScaleMode(int i) {
        if (isRunning()) {
            throw new IllegalStateException("Attempting to change scale mode while filter is running!");
        }
        this.mScaleMode = i;
    }

    public void setupShader(ImageShader imageShader, Rect rect, Rect rect2) {
        imageShader.setTargetRect(getTargetRect(rect, rect2));
        imageShader.setClearsOutput(true);
        imageShader.setClearColor(this.mClearColor);
        if (this.mFlipVertically) {
            imageShader.setSourceRect(0.0f, 1.0f, 1.0f, -1.0f);
        }
    }
}
