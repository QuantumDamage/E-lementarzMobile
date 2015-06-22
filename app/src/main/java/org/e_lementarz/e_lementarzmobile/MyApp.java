package org.e_lementarz.e_lementarzmobile;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Administrator on 2015-06-22.
 */
public class MyApp extends Application {
    public static GoogleAnalytics analytics;
    public static Tracker tracker;
    public static GoogleAnalytics analytics() {
        return analytics;
    }
    public static Tracker tracker() {
        return tracker;
    }
    @Override
    public void onCreate()
    {
        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker("UA-64335133-1"); // Replace with actual tracker/property Id
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);
    }

           }