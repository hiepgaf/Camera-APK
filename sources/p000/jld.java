package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;
import java.io.Writer;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jld */
public final class jld implements FeatureTable {
    /* renamed from: a */
    public final Writer f18923a;
    /* renamed from: b */
    private final Executor f18924b;
    /* renamed from: c */
    private final FeatureTable f18925c;

    public jld(FeatureTable featureTable, Writer writer, Executor executor) {
        jri.m13152b((Object) featureTable);
        jri.m13152b((Object) writer);
        jri.m13152b((Object) executor);
        this.f18925c = featureTable;
        this.f18923a = writer;
        this.f18924b = executor;
    }

    public final int getAssignmentCount(jza jza) {
        return this.f18925c.getAssignmentCount(jza);
    }

    public final int getCapacity() {
        return this.f18925c.getCapacity();
    }

    public final int getColumnCount() {
        return this.f18925c.getColumnCount();
    }

    public final Feature[] getColumnValues(jza jza) {
        return this.f18925c.getColumnValues(jza);
    }

    public final long getEarliestTimestamp() {
        return this.f18925c.getEarliestTimestamp();
    }

    public final Feature getFeature(long j, jza jza) {
        return this.f18925c.getFeature(j, jza);
    }

    public final int getFeatureCount() {
        return this.f18925c.getFeatureCount();
    }

    public final EnumSet getFeatureTypes() {
        return this.f18925c.getFeatureTypes();
    }

    public final float getFrameRate() {
        return this.f18925c.getFrameRate();
    }

    public final long getLatestValidTimestamp() {
        return this.f18925c.getLatestValidTimestamp();
    }

    public final int getNumRowsWithData() {
        return this.f18925c.getNumRowsWithData();
    }

    public final int getRowCount() {
        return this.f18925c.getRowCount();
    }

    public final jky getRowForTimestamp(long j) {
        return this.f18925c.getRowForTimestamp(j);
    }

    public final jkz getRowIterator(long j) {
        return this.f18925c.getRowIterator(j);
    }

    public final boolean setFeatureValue(long j, Feature feature) {
        boolean featureValue = this.f18925c.setFeatureValue(j, feature);
        this.f18924b.execute(new jle(this, j, feature));
        return featureValue;
    }

    public final String toString() {
        return String.format("[%s: %s]", new Object[]{"LoggingFeatureTable", this.f18925c.toString()});
    }
}
