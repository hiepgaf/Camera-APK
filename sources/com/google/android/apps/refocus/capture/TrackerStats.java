package com.google.android.apps.refocus.capture;

/* compiled from: PG */
public class TrackerStats {
    public float averageMotionRatio;
    public float frameAverageMotionRatio;
    public float frameInactiveTracksBoundaryRatio;
    public float frameInactiveTracksRatio;
    public float inactiveTracksBoundaryRatio;
    public float inactiveTracksRatio;
    public int numActiveTracks;
    public int numInactiveTracks;
    public int numInactiveTracksBoundary;
    public int numInitialTracks;

    public void reset() {
        this.numInitialTracks = 0;
        this.numActiveTracks = 0;
        this.numInactiveTracks = 0;
        this.numInactiveTracksBoundary = 0;
        this.inactiveTracksRatio = 0.0f;
        this.inactiveTracksBoundaryRatio = 0.0f;
        this.averageMotionRatio = 0.0f;
        this.frameAverageMotionRatio = 0.0f;
        this.frameInactiveTracksRatio = 0.0f;
        this.frameInactiveTracksBoundaryRatio = 0.0f;
    }
}
