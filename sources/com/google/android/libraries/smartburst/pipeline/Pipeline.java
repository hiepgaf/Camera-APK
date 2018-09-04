package com.google.android.libraries.smartburst.pipeline;

import p000.jaq;

/* compiled from: PG */
public interface Pipeline {
    jaq process();

    void resume();

    void stop();

    void suspend();
}
