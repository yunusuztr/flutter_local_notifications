package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.Map;

/**
 * The redacted form shown on a secure lock screen when the notification's visibility is private.
 *
 * <p>Corresponds to {@code Notification.publicVersion}.
 */
@Keep
public class PublicVersionDetails implements Serializable {
  private static final String TITLE = "title";
  private static final String BODY = "body";

  @Nullable public String title;
  @Nullable public String body;

  @Nullable
  static PublicVersionDetails from(@Nullable Map<String, Object> arguments) {
    if (arguments == null) {
      return null;
    }
    PublicVersionDetails details = new PublicVersionDetails();
    details.title = (String) arguments.get(TITLE);
    details.body = (String) arguments.get(BODY);
    return details;
  }
}
