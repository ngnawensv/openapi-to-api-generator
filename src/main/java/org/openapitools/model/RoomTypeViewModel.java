package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * RoomTypeViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class RoomTypeViewModel {

  private Integer roomTypeId;

  private JsonNullable<String> roomTypeName = JsonNullable.<String>undefined();

  private Integer roomMaxCapacity;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public RoomTypeViewModel roomTypeId(Integer roomTypeId) {
    this.roomTypeId = roomTypeId;
    return this;
  }

  /**
   * Get roomTypeId
   * @return roomTypeId
  */
  
  @Schema(name = "RoomTypeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomTypeId")
  public Integer getRoomTypeId() {
    return roomTypeId;
  }

  public void setRoomTypeId(Integer roomTypeId) {
    this.roomTypeId = roomTypeId;
  }

  public RoomTypeViewModel roomTypeName(String roomTypeName) {
    this.roomTypeName = JsonNullable.of(roomTypeName);
    return this;
  }

  /**
   * Get roomTypeName
   * @return roomTypeName
  */
  
  @Schema(name = "RoomTypeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomTypeName")
  public JsonNullable<String> getRoomTypeName() {
    return roomTypeName;
  }

  public void setRoomTypeName(JsonNullable<String> roomTypeName) {
    this.roomTypeName = roomTypeName;
  }

  public RoomTypeViewModel roomMaxCapacity(Integer roomMaxCapacity) {
    this.roomMaxCapacity = roomMaxCapacity;
    return this;
  }

  /**
   * Get roomMaxCapacity
   * @return roomMaxCapacity
  */
  
  @Schema(name = "RoomMaxCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomMaxCapacity")
  public Integer getRoomMaxCapacity() {
    return roomMaxCapacity;
  }

  public void setRoomMaxCapacity(Integer roomMaxCapacity) {
    this.roomMaxCapacity = roomMaxCapacity;
  }

  public RoomTypeViewModel message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "Message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  public RoomTypeViewModel result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  
  @Schema(name = "Result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Result")
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeViewModel roomTypeViewModel = (RoomTypeViewModel) o;
    return Objects.equals(this.roomTypeId, roomTypeViewModel.roomTypeId) &&
        equalsNullable(this.roomTypeName, roomTypeViewModel.roomTypeName) &&
        Objects.equals(this.roomMaxCapacity, roomTypeViewModel.roomMaxCapacity) &&
        equalsNullable(this.message, roomTypeViewModel.message) &&
        Objects.equals(this.result, roomTypeViewModel.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomTypeId, hashCodeNullable(roomTypeName), roomMaxCapacity, hashCodeNullable(message), result);
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
    sb.append("class RoomTypeViewModel {\n");
    sb.append("    roomTypeId: ").append(toIndentedString(roomTypeId)).append("\n");
    sb.append("    roomTypeName: ").append(toIndentedString(roomTypeName)).append("\n");
    sb.append("    roomMaxCapacity: ").append(toIndentedString(roomMaxCapacity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

