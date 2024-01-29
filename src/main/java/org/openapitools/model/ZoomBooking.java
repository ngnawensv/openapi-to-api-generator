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
 * ZoomBooking
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZoomBooking {

  private Integer bookingId;

  private Integer customerId;

  private Integer fromLocationId;

  private Integer toLocationId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime travelDate;

  private JsonNullable<String> startTime = JsonNullable.<String>undefined();

  private Integer carId;

  private JsonNullable<String> pickupAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> alternateContactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> invoiceNo = JsonNullable.<String>undefined();

  private Boolean isComplete;

  public ZoomBooking() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZoomBooking(Integer customerId, Integer toLocationId) {
    this.customerId = customerId;
    this.toLocationId = toLocationId;
  }

  public ZoomBooking bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "bookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public ZoomBooking customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @NotNull 
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public ZoomBooking fromLocationId(Integer fromLocationId) {
    this.fromLocationId = fromLocationId;
    return this;
  }

  /**
   * Get fromLocationId
   * @return fromLocationId
  */
  
  @Schema(name = "fromLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromLocationId")
  public Integer getFromLocationId() {
    return fromLocationId;
  }

  public void setFromLocationId(Integer fromLocationId) {
    this.fromLocationId = fromLocationId;
  }

  public ZoomBooking toLocationId(Integer toLocationId) {
    this.toLocationId = toLocationId;
    return this;
  }

  /**
   * Get toLocationId
   * @return toLocationId
  */
  @NotNull 
  @Schema(name = "toLocationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toLocationId")
  public Integer getToLocationId() {
    return toLocationId;
  }

  public void setToLocationId(Integer toLocationId) {
    this.toLocationId = toLocationId;
  }

  public ZoomBooking travelDate(OffsetDateTime travelDate) {
    this.travelDate = travelDate;
    return this;
  }

  /**
   * Get travelDate
   * @return travelDate
  */
  @Valid 
  @Schema(name = "travelDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("travelDate")
  public OffsetDateTime getTravelDate() {
    return travelDate;
  }

  public void setTravelDate(OffsetDateTime travelDate) {
    this.travelDate = travelDate;
  }

  public ZoomBooking startTime(String startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public JsonNullable<String> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<String> startTime) {
    this.startTime = startTime;
  }

  public ZoomBooking carId(Integer carId) {
    this.carId = carId;
    return this;
  }

  /**
   * Get carId
   * @return carId
  */
  
  @Schema(name = "carId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carId")
  public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  public ZoomBooking pickupAddress(String pickupAddress) {
    this.pickupAddress = JsonNullable.of(pickupAddress);
    return this;
  }

  /**
   * Get pickupAddress
   * @return pickupAddress
  */
  
  @Schema(name = "pickupAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupAddress")
  public JsonNullable<String> getPickupAddress() {
    return pickupAddress;
  }

  public void setPickupAddress(JsonNullable<String> pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public ZoomBooking alternateContactNo(String alternateContactNo) {
    this.alternateContactNo = JsonNullable.of(alternateContactNo);
    return this;
  }

  /**
   * Get alternateContactNo
   * @return alternateContactNo
  */
  
  @Schema(name = "alternateContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternateContactNo")
  public JsonNullable<String> getAlternateContactNo() {
    return alternateContactNo;
  }

  public void setAlternateContactNo(JsonNullable<String> alternateContactNo) {
    this.alternateContactNo = alternateContactNo;
  }

  public ZoomBooking invoiceNo(String invoiceNo) {
    this.invoiceNo = JsonNullable.of(invoiceNo);
    return this;
  }

  /**
   * Get invoiceNo
   * @return invoiceNo
  */
  
  @Schema(name = "invoiceNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceNo")
  public JsonNullable<String> getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(JsonNullable<String> invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public ZoomBooking isComplete(Boolean isComplete) {
    this.isComplete = isComplete;
    return this;
  }

  /**
   * Get isComplete
   * @return isComplete
  */
  
  @Schema(name = "isComplete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isComplete")
  public Boolean getIsComplete() {
    return isComplete;
  }

  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomBooking zoomBooking = (ZoomBooking) o;
    return Objects.equals(this.bookingId, zoomBooking.bookingId) &&
        Objects.equals(this.customerId, zoomBooking.customerId) &&
        Objects.equals(this.fromLocationId, zoomBooking.fromLocationId) &&
        Objects.equals(this.toLocationId, zoomBooking.toLocationId) &&
        Objects.equals(this.travelDate, zoomBooking.travelDate) &&
        equalsNullable(this.startTime, zoomBooking.startTime) &&
        Objects.equals(this.carId, zoomBooking.carId) &&
        equalsNullable(this.pickupAddress, zoomBooking.pickupAddress) &&
        equalsNullable(this.alternateContactNo, zoomBooking.alternateContactNo) &&
        equalsNullable(this.invoiceNo, zoomBooking.invoiceNo) &&
        Objects.equals(this.isComplete, zoomBooking.isComplete);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, customerId, fromLocationId, toLocationId, travelDate, hashCodeNullable(startTime), carId, hashCodeNullable(pickupAddress), hashCodeNullable(alternateContactNo), hashCodeNullable(invoiceNo), isComplete);
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
    sb.append("class ZoomBooking {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    fromLocationId: ").append(toIndentedString(fromLocationId)).append("\n");
    sb.append("    toLocationId: ").append(toIndentedString(toLocationId)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    carId: ").append(toIndentedString(carId)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    alternateContactNo: ").append(toIndentedString(alternateContactNo)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
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

