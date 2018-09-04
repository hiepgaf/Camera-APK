package com.google.android.libraries.smartburst.buffers;

import com.google.android.libraries.smartburst.utils.Feature;
import java.util.EnumSet;
import p000.jky;
import p000.jkz;
import p000.jza;

/* compiled from: PG */
public interface FeatureTable {
    int getAssignmentCount(jza jza);

    int getCapacity();

    int getColumnCount();

    Feature[] getColumnValues(jza jza);

    long getEarliestTimestamp();

    Feature getFeature(long j, jza jza);

    int getFeatureCount();

    EnumSet getFeatureTypes();

    float getFrameRate();

    long getLatestValidTimestamp();

    int getNumRowsWithData();

    int getRowCount();

    jky getRowForTimestamp(long j);

    jkz getRowIterator(long j);

    boolean setFeatureValue(long j, Feature feature);
}
