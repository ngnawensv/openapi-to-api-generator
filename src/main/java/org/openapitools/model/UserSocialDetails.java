package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserSocialDetails
 */

@JsonTypeName("userSocialDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class UserSocialDetails {

  private JsonNullable<String> facebookProfileUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> linkdinProfileUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> instagramHandle = JsonNullable.<String>undefined();

  private JsonNullable<String> twitterHandle = JsonNullable.<String>undefined();

  public UserSocialDetails facebookProfileUrl(String facebookProfileUrl) {
    this.facebookProfileUrl = JsonNullable.of(facebookProfileUrl);
    return this;
  }

  /**
   * Get facebookProfileUrl
   * @return facebookProfileUrl
  */
  
  @Schema(name = "facebookProfileUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookProfileUrl")
  public JsonNullable<String> getFacebookProfileUrl() {
    return facebookProfileUrl;
  }

  public void setFacebookProfileUrl(JsonNullable<String> facebookProfileUrl) {
    this.facebookProfileUrl = facebookProfileUrl;
  }

  public UserSocialDetails linkdinProfileUrl(String linkdinProfileUrl) {
    this.linkdinProfileUrl = JsonNullable.of(linkdinProfileUrl);
    return this;
  }

  /**
   * Get linkdinProfileUrl
   * @return linkdinProfileUrl
  */
  
  @Schema(name = "linkdinProfileUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkdinProfileUrl")
  public JsonNullable<String> getLinkdinProfileUrl() {
    return linkdinProfileUrl;
  }

  public void setLinkdinProfileUrl(JsonNullable<String> linkdinProfileUrl) {
    this.linkdinProfileUrl = linkdinProfileUrl;
  }

  public UserSocialDetails instagramHandle(String instagramHandle) {
    this.instagramHandle = JsonNullable.of(instagramHandle);
    return this;
  }

  /**
   * Get instagramHandle
   * @return instagramHandle
  */
  
  @Schema(name = "instagramHandle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instagramHandle")
  public JsonNullable<String> getInstagramHandle() {
    return instagramHandle;
  }

  public void setInstagramHandle(JsonNullable<String> instagramHandle) {
    this.instagramHandle = instagramHandle;
  }

  public UserSocialDetails twitterHandle(String twitterHandle) {
    this.twitterHandle = JsonNullable.of(twitterHandle);
    return this;
  }

  /**
   * Get twitterHandle
   * @return twitterHandle
  */
  
  @Schema(name = "twitterHandle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterHandle")
  public JsonNullable<String> getTwitterHandle() {
    return twitterHandle;
  }

  public void setTwitterHandle(JsonNullable<String> twitterHandle) {
    this.twitterHandle = twitterHandle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSocialDetails userSocialDetails = (UserSocialDetails) o;
    return equalsNullable(this.facebookProfileUrl, userSocialDetails.facebookProfileUrl) &&
        equalsNullable(this.linkdinProfileUrl, userSocialDetails.linkdinProfileUrl) &&
        equalsNullable(this.instagramHandle, userSocialDetails.instagramHandle) &&
        equalsNullable(this.twitterHandle, userSocialDetails.twitterHandle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(facebookProfileUrl), hashCodeNullable(linkdinProfileUrl), hashCodeNullable(instagramHandle), hashCodeNullable(twitterHandle));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSocialDetails {\n");
    sb.append("    facebookProfileUrl: ").append(toIndentedString(facebookProfileUrl)).append("\n");
    sb.append("    linkdinProfileUrl: ").append(toIndentedString(linkdinProfileUrl)).append("\n");
    sb.append("    instagramHandle: ").append(toIndentedString(instagramHandle)).append("\n");
    sb.append("    twitterHandle: ").append(toIndentedString(twitterHandle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

