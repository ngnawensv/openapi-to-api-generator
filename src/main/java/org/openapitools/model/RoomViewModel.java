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
 * RoomViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class RoomViewModel {

  private Integer roomId;

  private Integer roomTypeId;

  private JsonNullable<String> roomNo = JsonNullable.<String>undefined();

  private Integer totalBed;

  private Integer roomCapacity;

  private JsonNullable<String> roomExtensionNo = JsonNullable.<String>undefined();

  private Integer roomStatus;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public RoomViewModel roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  
  @Schema(name = "RoomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomId")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public RoomViewModel roomTypeId(Integer roomTypeId) {
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

  public RoomViewModel roomNo(String roomNo) {
    this.roomNo = JsonNullable.of(roomNo);
    return this;
  }

  /**
   * Get roomNo
   * @return roomNo
  */
  
  @Schema(name = "RoomNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomNo")
  public JsonNullable<String> getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(JsonNullable<String> roomNo) {
    this.roomNo = roomNo;
  }

  public RoomViewModel totalBed(Integer totalBed) {
    this.totalBed = totalBed;
    return this;
  }

  /**
   * Get totalBed
   * @return totalBed
  */
  
  @Schema(name = "TotalBed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalBed")
  public Integer getTotalBed() {
    return totalBed;
  }

  public void setTotalBed(Integer totalBed) {
    this.totalBed = totalBed;
  }

  public RoomViewModel roomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
    return this;
  }

  /**
   * Get roomCapacity
   * @return roomCapacity
  */
  
  @Schema(name = "RoomCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomCapacity")
  public Integer getRoomCapacity() {
    return roomCapacity;
  }

  public void setRoomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
  }

  public RoomViewModel roomExtensionNo(String roomExtensionNo) {
    this.roomExtensionNo = JsonNullable.of(roomExtensionNo);
    return this;
  }

  /**
   * Get roomExtensionNo
   * @return roomExtensionNo
  */
  
  @Schema(name = "RoomExtensionNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomExtensionNo")
  public JsonNullable<String> getRoomExtensionNo() {
    return roomExtensionNo;
  }

  public void setRoomExtensionNo(JsonNullable<String> roomExtensionNo) {
    this.roomExtensionNo = roomExtensionNo;
  }

  public RoomViewModel roomStatus(Integer roomStatus) {
    this.roomStatus = roomStatus;
    return this;
  }

  /**
   * Get roomStatus
   * @return roomStatus
  */
  
  @Schema(name = "RoomStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomStatus")
  public Integer getRoomStatus() {
    return roomStatus;
  }

  public void setRoomStatus(Integer roomStatus) {
    this.roomStatus = roomStatus;
  }

  public RoomViewModel message(String message) {
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

  public RoomViewModel result(Boolean result) {
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
    RoomViewModel roomViewModel = (RoomViewModel) o;
    return Objects.equals(this.roomId, roomViewModel.roomId) &&
        Objects.equals(this.roomTypeId, roomViewModel.roomTypeId) &&
        equalsNullable(this.roomNo, roomViewModel.roomNo) &&
        Objects.equals(this.totalBed, roomViewModel.totalBed) &&
        Objects.equals(this.roomCapacity, roomViewModel.roomCapacity) &&
        equalsNullable(this.roomExtensionNo, roomViewModel.roomExtensionNo) &&
        Objects.equals(this.roomStatus, roomViewModel.roomStatus) &&
        equalsNullable(this.message, roomViewModel.message) &&
        Objects.equals(this.result, roomViewModel.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, roomTypeId, hashCodeNullable(roomNo), totalBed, roomCapacity, hashCodeNullable(roomExtensionNo), roomStatus, hashCodeNullable(message), result);
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
    sb.append("class RoomViewModel {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomTypeId: ").append(toIndentedString(roomTypeId)).append("\n");
    sb.append("    roomNo: ").append(toIndentedString(roomNo)).append("\n");
    sb.append("    totalBed: ").append(toIndentedString(totalBed)).append("\n");
    sb.append("    roomCapacity: ").append(toIndentedString(roomCapacity)).append("\n");
    sb.append("    roomExtensionNo: ").append(toIndentedString(roomExtensionNo)).append("\n");
    sb.append("    roomStatus: ").append(toIndentedString(roomStatus)).append("\n");
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

