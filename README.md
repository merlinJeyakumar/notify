# Notify Android

Notify Android is a Java Android library for creating and displaying application notifications through a compact builder-style flow. It is useful when an app needs to configure notification content, channels, actions, icons, images, and cancellation behavior without repeating the same setup across screens.

## What it can do

- Create and show a notification with a title, message, colour, and notification ID.
- Configure auto-cancel behavior and an action intent for a notification tap.
- Use a small icon, large icon, circular large icon, or big-picture image.
- Use image resources already bundled with the app.
- Accept image URLs for large-image and big-picture presentation.
- Configure notification-channel ID, name, and description.
- Set notification importance and vibration behavior.
- Build a notification before posting it.
- Cancel one notification by ID.
- Cancel all notifications created by the app.

## Notification channels

On Android versions that use notification channels, Notify can create and configure a channel from the values supplied to the builder.

Channel configuration includes:

- Channel ID
- Channel name
- Channel description
- Importance
- Vibration enablement and vibration pattern

If the expected default channel string resources are not available, the library falls back to built-in defaults.

## Images and presentation

| Presentation | Supported use |
| --- | --- |
| Small icon | Standard notification status-bar icon. |
| Large icon | Larger image shown in the notification content. |
| Circular large icon | Rounded profile-style image. |
| Big picture | Expanded notification image. |
| Resource image | Image packaged with the Android application. |
| URL image | Image supplied from a remote URL. |

## Use from source

The reusable Android library module is `notify`.

1. Clone this repository or include the `notify` module in an existing Android build.
2. Add the module as a project dependency.
3. Configure a small icon, notification content, and a channel where the target Android version requires one.
4. Request runtime notification permission from the host app where Android requires it.

Build the library module from the repository root:

```bash
./gradlew :notify:assembleDebug
```

On Windows:

```bat
gradlew.bat :notify:assembleDebug
```

## Project layout

| Path | Purpose |
| --- | --- |
| `notify/` | Reusable notification builder library. |
| `app/` | Sample app that demonstrates notification images, icons, and posting behavior. |

## Current scope

- The library is configured for Android `minSdk 19`, `compileSdk 31`, and `targetSdk 31`.
- Android 13 and later notification permission handling belongs to the consuming application.
- Android channel settings are controlled by the platform after a channel is created; later builder changes may not update a user’s existing channel settings.
- URL-based images are fetched synchronously by the current implementation. Prepare remote images carefully and avoid treating this path as asynchronous image loading.
- The repository’s automated tests are basic scaffold tests; validate notification permission, channel, image, and action behavior in the host application.

## License

This project is distributed under the [MIT License](LICENSE).