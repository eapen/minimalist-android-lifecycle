package in.eapen.lifecycleevents;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        // Initialize Logger with the activity for the constructor
        new LifeCycleEventLogger(this);
    }

    static class LifeCycleEventLogger implements LifecycleObserver {

        private final LifecycleOwner lifecycleOwner;

        public LifeCycleEventLogger(LifecycleOwner lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            // subscribe the observer to the owner
            this.lifecycleOwner.getLifecycle().addObserver(this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        void logEvent() {
            Log.d("EventLogger", "ANY: " + String.valueOf(lifecycleOwner.getLifecycle().getCurrentState()));
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        void logResumeEvent() {
            Log.d("EventLogger", "RESUME");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        void logPauseEvent() {
            Log.d("EventLogger", "PAUSE");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        void logCreateEvent() {
            Log.d("EventLogger", "CREATE");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        void logDestroyEvent() {
            Log.d("EventLogger", "DESTROY");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        void logStartEvent() {
            Log.d("EventLogger", "START");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        void logStopEvent() {
            Log.d("EventLogger", "STOP");
        }
    }
}
