package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WeddingAllotment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingAllotment {

  private Integer allotId;

  private Integer weddingId;

  private Integer roomId;

  private JsonNullable<String> roomNo = JsonNullable.<String>undefined();

  private Integer createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime checkinDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime checkOutDate;

  private Integer totalGuest;

  private JsonNullable<String> checkinTime = JsonNullable.<String>undefined();

  private JsonNullable<String> checkOutTime = JsonNullable.<String>undefined();

  private JsonNullable<String> bookingId = JsonNullable.<String>undefined();

  private Double rateGiven;

  public WeddingAllotment allotId(Integer allotId) {
    this.allotId = allotId;
    return this;
  }

  /**
   * Get allotId
   * @return allotId
  */
  
  @Schema(name = "AllotId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllotId")
  public Integer getAllotId() {
    return allotId;
  }

  public void setAllotId(Integer allotId) {
    this.allotId = allotId;
  }

  public WeddingAllotment weddingId(Integer weddingId) {
    this.weddingId = weddingId;
    return this;
  }

  /**
   * Get weddingId
   * @return weddingId
  */
  
  @Schema(name = "WeddingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingId")
  public Integer getWeddingId() {
    return weddingId;
  }

  public void setWeddingId(Integer weddingId) {
    this.weddingId = weddingId;
  }

  public WeddingAllotment roomId(Integer roomId) {
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

  public WeddingAllotment roomNo(String roomNo) {
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

  public WeddingAllotment createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "CreatedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedBy")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public WeddingAllotment creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @Valid 
  @Schema(name = "CreationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public WeddingAllotment checkinDate(OffsetDateTime checkinDate) {
    this.checkinDate = checkinDate;
    return this;
  }

  /**
   * Get checkinDate
   * @return checkinDate
  */
  @Valid 
  @Schema(name = "CheckinDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CheckinDate")
  public OffsetDateTime getCheckinDate() {
    return checkinDate;
  }

  public void setCheckinDate(OffsetDateTime checkinDate) {
    this.checkinDate = checkinDate;
  }

  public WeddingAllotment checkOutDate(OffsetDateTime checkOutDate) {
    this.checkOutDate = checkOutDate;
    return this;
  }

  /**
   * Get checkOutDate
   * @return checkOutDate
  */
  @Valid 
  @Schema(name = "CheckOutDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CheckOutDate")
  public OffsetDateTime getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(OffsetDateTime checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public WeddingAllotment totalGuest(Integer totalGuest) {
    this.totalGuest = totalGuest;
    return this;
  }

  /**
   * Get totalGuest
   * @return totalGuest
  */
  
  @Schema(name = "TotalGuest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalGuest")
  public Integer getTotalGuest() {
    return totalGuest;
  }

  public void setTotalGuest(Integer totalGuest) {
    this.totalGuest = totalGuest;
  }

  public WeddingAllotment checkinTime(String checkinTime) {
    this.checkinTime = JsonNullable.of(checkinTime);
    return this;
  }

  /**
   * Get checkinTime
   * @return checkinTime
  */
  
  @Schema(name = "CheckinTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CheckinTime")
  public JsonNullable<String> getCheckinTime() {
    return checkinTime;
  }

  public void setCheckinTime(JsonNullable<String> checkinTime) {
    this.checkinTime = checkinTime;
  }

  public WeddingAllotment checkOutTime(String checkOutTime) {
    this.checkOutTime = JsonNullable.of(checkOutTime);
    return this;
  }

  /**
   * Get checkOutTime
   * @return checkOutTime
  */
  
  @Schema(name = "CheckOutTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CheckOutTime")
  public JsonNullable<String> getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(JsonNullable<String> checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public WeddingAllotment bookingId(String bookingId) {
    this.bookingId = JsonNullable.of(bookingId);
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "BookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingId")
  public JsonNullable<String> getBookingId() {
    return bookingId;
  }

  public void setBookingId(JsonNullable<String> bookingId) {
    this.bookingId = bookingId;
  }

  public WeddingAllotment rateGiven(Double rateGiven) {
    this.rateGiven = rateGiven;
    return this;
  }

  /**
   * Get rateGiven
   * @return rateGiven
  */
  
  @Schema(name = "RateGiven", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RateGiven")
  public Double getRateGiven() {
    return rateGiven;
  }

  public void setRateGiven(Double rateGiven) {
    this.rateGiven = rateGiven;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingAllotment weddingAllotment = (WeddingAllotment) o;
    return Objects.equals(this.allotId, weddingAllotment.allotId) &&
        Objects.equals(this.weddingId, weddingAllotment.weddingId) &&
        Objects.equals(this.roomId, weddingAllotment.roomId) &&
        equalsNullable(this.roomNo, weddingAllotment.roomNo) &&
        Objects.equals(this.createdBy, weddingAllotment.createdBy) &&
        Objects.equals(this.creationDate, weddingAllotment.creationDate) &&
        Objects.equals(this.checkinDate, weddingAllotment.checkinDate) &&
        Objects.equals(this.checkOutDate, weddingAllotment.checkOutDate) &&
        Objects.equals(this.totalGuest, weddingAllotment.totalGuest) &&
        equalsNullable(this.checkinTime, weddingAllotment.checkinTime) &&
        equalsNullable(this.checkOutTime, weddingAllotment.checkOutTime) &&
        equalsNullable(this.bookingId, weddingAllotment.bookingId) &&
        Objects.equals(this.rateGiven, weddingAllotment.rateGiven);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allotId, weddingId, roomId, hashCodeNullable(roomNo), createdBy, creationDate, checkinDate, checkOutDate, totalGuest, hashCodeNullable(checkinTime), hashCodeNullable(checkOutTime), hashCodeNullable(bookingId), rateGiven);
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
    sb.append("class WeddingAllotment {\n");
    sb.append("    allotId: ").append(toIndentedString(allotId)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomNo: ").append(toIndentedString(roomNo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    checkinDate: ").append(toIndentedString(checkinDate)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    totalGuest: ").append(toIndentedString(totalGuest)).append("\n");
    sb.append("    checkinTime: ").append(toIndentedString(checkinTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    rateGiven: ").append(toIndentedString(rateGiven)).append("\n");
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

