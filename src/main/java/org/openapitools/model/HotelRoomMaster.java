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
 * HotelRoomMaster
 */

@JsonTypeName("hotelRoomMaster")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class HotelRoomMaster {

  private Integer roomId;

  private JsonNullable<String> roomName = JsonNullable.<String>undefined();

  private Boolean isAcAvailable;

  private Integer roomCapacity;

  private Boolean isActive;

  private Double roomTariff;

  private JsonNullable<String> extensionNo = JsonNullable.<String>undefined();

  public HotelRoomMaster roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
  */
  
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomId")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public HotelRoomMaster roomName(String roomName) {
    this.roomName = JsonNullable.of(roomName);
    return this;
  }

  /**
   * Get roomName
   * @return roomName
  */
  
  @Schema(name = "roomName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomName")
  public JsonNullable<String> getRoomName() {
    return roomName;
  }

  public void setRoomName(JsonNullable<String> roomName) {
    this.roomName = roomName;
  }

  public HotelRoomMaster isAcAvailable(Boolean isAcAvailable) {
    this.isAcAvailable = isAcAvailable;
    return this;
  }

  /**
   * Get isAcAvailable
   * @return isAcAvailable
  */
  
  @Schema(name = "isAcAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAcAvailable")
  public Boolean getIsAcAvailable() {
    return isAcAvailable;
  }

  public void setIsAcAvailable(Boolean isAcAvailable) {
    this.isAcAvailable = isAcAvailable;
  }

  public HotelRoomMaster roomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
    return this;
  }

  /**
   * Get roomCapacity
   * @return roomCapacity
  */
  
  @Schema(name = "roomCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomCapacity")
  public Integer getRoomCapacity() {
    return roomCapacity;
  }

  public void setRoomCapacity(Integer roomCapacity) {
    this.roomCapacity = roomCapacity;
  }

  public HotelRoomMaster isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public HotelRoomMaster roomTariff(Double roomTariff) {
    this.roomTariff = roomTariff;
    return this;
  }

  /**
   * Get roomTariff
   * @return roomTariff
  */
  
  @Schema(name = "roomTariff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomTariff")
  public Double getRoomTariff() {
    return roomTariff;
  }

  public void setRoomTariff(Double roomTariff) {
    this.roomTariff = roomTariff;
  }

  public HotelRoomMaster extensionNo(String extensionNo) {
    this.extensionNo = JsonNullable.of(extensionNo);
    return this;
  }

  /**
   * Get extensionNo
   * @return extensionNo
  */
  
  @Schema(name = "extensionNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensionNo")
  public JsonNullable<String> getExtensionNo() {
    return extensionNo;
  }

  public void setExtensionNo(JsonNullable<String> extensionNo) {
    this.extensionNo = extensionNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRoomMaster hotelRoomMaster = (HotelRoomMaster) o;
    return Objects.equals(this.roomId, hotelRoomMaster.roomId) &&
        equalsNullable(this.roomName, hotelRoomMaster.roomName) &&
        Objects.equals(this.isAcAvailable, hotelRoomMaster.isAcAvailable) &&
        Objects.equals(this.roomCapacity, hotelRoomMaster.roomCapacity) &&
        Objects.equals(this.isActive, hotelRoomMaster.isActive) &&
        Objects.equals(this.roomTariff, hotelRoomMaster.roomTariff) &&
        equalsNullable(this.extensionNo, hotelRoomMaster.extensionNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, hashCodeNullable(roomName), isAcAvailable, roomCapacity, isActive, roomTariff, hashCodeNullable(extensionNo));
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
    sb.append("class HotelRoomMaster {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
    sb.append("    isAcAvailable: ").append(toIndentedString(isAcAvailable)).append("\n");
    sb.append("    roomCapacity: ").append(toIndentedString(roomCapacity)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    roomTariff: ").append(toIndentedString(roomTariff)).append("\n");
    sb.append("    extensionNo: ").append(toIndentedString(extensionNo)).append("\n");
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

