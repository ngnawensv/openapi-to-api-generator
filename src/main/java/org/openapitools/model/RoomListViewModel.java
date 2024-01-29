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
 * RoomListViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class RoomListViewModel {

  private Integer roomId;

  private JsonNullable<String> roomTypeName = JsonNullable.<String>undefined();

  private JsonNullable<String> roomNo = JsonNullable.<String>undefined();

  private Integer totalBed;

  private Integer roomCapacity;

  private JsonNullable<String> roomExtensionNo = JsonNullable.<String>undefined();

  private Integer roomStatus;

  private JsonNullable<String> roomStatusName = JsonNullable.<String>undefined();

  public RoomListViewModel roomId(Integer roomId) {
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

  public RoomListViewModel roomTypeName(String roomTypeName) {
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

  public RoomListViewModel roomNo(String roomNo) {
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

  public RoomListViewModel totalBed(Integer totalBed) {
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

  public RoomListViewModel roomCapacity(Integer roomCapacity) {
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

  public RoomListViewModel roomExtensionNo(String roomExtensionNo) {
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

  public RoomListViewModel roomStatus(Integer roomStatus) {
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

  public RoomListViewModel roomStatusName(String roomStatusName) {
    this.roomStatusName = JsonNullable.of(roomStatusName);
    return this;
  }

  /**
   * Get roomStatusName
   * @return roomStatusName
  */
  
  @Schema(name = "RoomStatusName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoomStatusName")
  public JsonNullable<String> getRoomStatusName() {
    return roomStatusName;
  }

  public void setRoomStatusName(JsonNullable<String> roomStatusName) {
    this.roomStatusName = roomStatusName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomListViewModel roomListViewModel = (RoomListViewModel) o;
    return Objects.equals(this.roomId, roomListViewModel.roomId) &&
        equalsNullable(this.roomTypeName, roomListViewModel.roomTypeName) &&
        equalsNullable(this.roomNo, roomListViewModel.roomNo) &&
        Objects.equals(this.totalBed, roomListViewModel.totalBed) &&
        Objects.equals(this.roomCapacity, roomListViewModel.roomCapacity) &&
        equalsNullable(this.roomExtensionNo, roomListViewModel.roomExtensionNo) &&
        Objects.equals(this.roomStatus, roomListViewModel.roomStatus) &&
        equalsNullable(this.roomStatusName, roomListViewModel.roomStatusName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, hashCodeNullable(roomTypeName), hashCodeNullable(roomNo), totalBed, roomCapacity, hashCodeNullable(roomExtensionNo), roomStatus, hashCodeNullable(roomStatusName));
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
    sb.append("class RoomListViewModel {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomTypeName: ").append(toIndentedString(roomTypeName)).append("\n");
    sb.append("    roomNo: ").append(toIndentedString(roomNo)).append("\n");
    sb.append("    totalBed: ").append(toIndentedString(totalBed)).append("\n");
    sb.append("    roomCapacity: ").append(toIndentedString(roomCapacity)).append("\n");
    sb.append("    roomExtensionNo: ").append(toIndentedString(roomExtensionNo)).append("\n");
    sb.append("    roomStatus: ").append(toIndentedString(roomStatus)).append("\n");
    sb.append("    roomStatusName: ").append(toIndentedString(roomStatusName)).append("\n");
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

