package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrainAppBookingPassenger;
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
 * TrainAppBookingView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TrainAppBookingView {

  private Integer bookingId;

  private Integer trainId;

  private Integer passengerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime travelDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingDate;

  private Integer totalSeats;

  @Valid
  private JsonNullable<List<@Valid TrainAppBookingPassenger>> trainAppBookingPassengers = JsonNullable.<List<@Valid TrainAppBookingPassenger>>undefined();

  public TrainAppBookingView bookingId(Integer bookingId) {
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

  public TrainAppBookingView trainId(Integer trainId) {
    this.trainId = trainId;
    return this;
  }

  /**
   * Get trainId
   * @return trainId
  */
  
  @Schema(name = "trainId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainId")
  public Integer getTrainId() {
    return trainId;
  }

  public void setTrainId(Integer trainId) {
    this.trainId = trainId;
  }

  public TrainAppBookingView passengerId(Integer passengerId) {
    this.passengerId = passengerId;
    return this;
  }

  /**
   * Get passengerId
   * @return passengerId
  */
  
  @Schema(name = "passengerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passengerId")
  public Integer getPassengerId() {
    return passengerId;
  }

  public void setPassengerId(Integer passengerId) {
    this.passengerId = passengerId;
  }

  public TrainAppBookingView travelDate(OffsetDateTime travelDate) {
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

  public TrainAppBookingView bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @Valid 
  @Schema(name = "bookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingDate")
  public OffsetDateTime getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  public TrainAppBookingView totalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
    return this;
  }

  /**
   * Get totalSeats
   * @return totalSeats
  */
  
  @Schema(name = "totalSeats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSeats")
  public Integer getTotalSeats() {
    return totalSeats;
  }

  public void setTotalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
  }

  public TrainAppBookingView trainAppBookingPassengers(List<@Valid TrainAppBookingPassenger> trainAppBookingPassengers) {
    this.trainAppBookingPassengers = JsonNullable.of(trainAppBookingPassengers);
    return this;
  }

  public TrainAppBookingView addTrainAppBookingPassengersItem(TrainAppBookingPassenger trainAppBookingPassengersItem) {
    if (this.trainAppBookingPassengers == null || !this.trainAppBookingPassengers.isPresent()) {
      this.trainAppBookingPassengers = JsonNullable.of(new ArrayList<>());
    }
    this.trainAppBookingPassengers.get().add(trainAppBookingPassengersItem);
    return this;
  }

  /**
   * Get trainAppBookingPassengers
   * @return trainAppBookingPassengers
  */
  @Valid 
  @Schema(name = "TrainAppBookingPassengers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrainAppBookingPassengers")
  public JsonNullable<List<@Valid TrainAppBookingPassenger>> getTrainAppBookingPassengers() {
    return trainAppBookingPassengers;
  }

  public void setTrainAppBookingPassengers(JsonNullable<List<@Valid TrainAppBookingPassenger>> trainAppBookingPassengers) {
    this.trainAppBookingPassengers = trainAppBookingPassengers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainAppBookingView trainAppBookingView = (TrainAppBookingView) o;
    return Objects.equals(this.bookingId, trainAppBookingView.bookingId) &&
        Objects.equals(this.trainId, trainAppBookingView.trainId) &&
        Objects.equals(this.passengerId, trainAppBookingView.passengerId) &&
        Objects.equals(this.travelDate, trainAppBookingView.travelDate) &&
        Objects.equals(this.bookingDate, trainAppBookingView.bookingDate) &&
        Objects.equals(this.totalSeats, trainAppBookingView.totalSeats) &&
        equalsNullable(this.trainAppBookingPassengers, trainAppBookingView.trainAppBookingPassengers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, trainId, passengerId, travelDate, bookingDate, totalSeats, hashCodeNullable(trainAppBookingPassengers));
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
    sb.append("class TrainAppBookingView {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    trainId: ").append(toIndentedString(trainId)).append("\n");
    sb.append("    passengerId: ").append(toIndentedString(passengerId)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
    sb.append("    trainAppBookingPassengers: ").append(toIndentedString(trainAppBookingPassengers)).append("\n");
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

