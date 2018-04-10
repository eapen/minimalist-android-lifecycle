Minimalist class to see LifeCycle events dropped.

`EVENT.ON_ANY` and `EVENT.ON_PAUSE` and `EVENT.ON_STOP` don't seem to map correctly though

`PAUSE is followed by STARTED ??`

`STOP is followed by CREATED ??`

```
D/EventLogger: PAUSE
D/EventLogger: ANY: STARTED
D/EGL_emulation: eglMakeCurrent: 0xe2d05240: ver 3 0 (tinfo 0xe2d03160)
D/EventLogger: CREATE
D/EventLogger: ANY: CREATED
D/EventLogger: START
D/EventLogger: ANY: STARTED
D/EventLogger: RESUME
D/EventLogger: ANY: RESUMED
D/EGL_emulation: eglMakeCurrent: 0xe2d05240: ver 3 0 (tinfo 0xe2d03160)
D/EventLogger: PAUSE
D/EventLogger: ANY: STARTED
D/EGL_emulation: eglMakeCurrent: 0xe2d05240: ver 3 0 (tinfo 0xe2d03160)
D/EventLogger: STOP
D/EventLogger: ANY: CREATED
D/EventLogger: DESTROY
D/EventLogger: ANY: DESTROYED
D/EventLogger: CREATE
D/EventLogger: ANY: CREATED
D/EventLogger: START
D/EventLogger: ANY: STARTED
D/EventLogger: RESUME
D/EventLogger: ANY: RESUMED
D/EGL_emulation: eglMakeCurrent: 0xe2d05240: ver 3 0 (tinfo 0xe2d03160)
```