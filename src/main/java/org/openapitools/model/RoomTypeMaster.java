package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoomTypeMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class RoomTypeMaster {

  private Integer roomTypeId;

  private String roomTypeName;

  private Integer roomMaxCapacity;

  public RoomTypeMaster() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RoomTypeMaster(String roomTypeName, Integer roomMaxCapacity) {
    this.roomTypeName = roomTypeName;
    this.roomMaxCapacity = roomMaxCapacity;
  }

  public RoomTypeMaster roomTypeId(Integer roomTypeId) {
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

  public RoomTypeMaster roomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
    return this;
  }

  /**
   * Get roomTypeName
   * @return roomTypeName
  */
  @NotNull 
  @Schema(name = "RoomTypeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RoomTypeName")
  public String getRoomTypeName() {
    return roomTypeName;
  }

  public void setRoomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
  }

  public RoomTypeMaster roomMaxCapacity(Integer roomMaxCapacity) {
    this.roomMaxCapacity = roomMaxCapacity;
    return this;
  }

  /**
   * Get roomMaxCapacity
   * @return roomMaxCapacity
  */
  @NotNull 
  @Schema(name = "RoomMaxCapacity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RoomMaxCapacity")
  public Integer getRoomMaxCapacity() {
    return roomMaxCapacity;
  }

  public void setRoomMaxCapacity(Integer roomMaxCapacity) {
    this.roomMaxCapacity = roomMaxCapacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeMaster roomTypeMaster = (RoomTypeMaster) o;
    return Objects.equals(this.roomTypeId, roomTypeMaster.roomTypeId) &&
        Objects.equals(this.roomTypeName, roomTypeMaster.roomTypeName) &&
        Objects.equals(this.roomMaxCapacity, roomTypeMaster.roomMaxCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomTypeId, roomTypeName, roomMaxCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeMaster {\n");
    sb.append("    roomTypeId: ").append(toIndentedString(roomTypeId)).append("\n");
    sb.append("    roomTypeName: ").append(toIndentedString(roomTypeName)).append("\n");
    sb.append("    roomMaxCapacity: ").append(toIndentedString(roomMaxCapacity)).append("\n");
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

