# Build It Bigger

An app with multiple flavors that uses multiple libraries and Google Could Endpoints.
The app will consist of four modules.

1.A Java library that provides jokes

2.A Google Cloud Endpoints (GCE) project that serves those jokes

3.An Android Library containing an activity for displaying jokes 

4.An Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.












### Required Behavior

* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.

### Optional Components

To receive "exceeds specifications", your app must fully implement all of the following items.

* The free app variant displays interstitial ads between the main activity and the joke-displaying activity.
* The app displays a loading indicator while the joke is being fetched from the server.
* The root build.gradle file contains a task that will start up the GCE development server, run all Android tests, then shutdown the development server.
