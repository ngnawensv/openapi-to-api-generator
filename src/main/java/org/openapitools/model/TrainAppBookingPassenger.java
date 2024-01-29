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
 * TrainAppBookingPassenger
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TrainAppBookingPassenger {

  private Integer bookingPassengerId;

  private Integer bookingId;

  private JsonNullable<String> passengerName = JsonNullable.<String>undefined();

  private Integer seatNo;

  private Integer age;

  public TrainAppBookingPassenger bookingPassengerId(Integer bookingPassengerId) {
    this.bookingPassengerId = bookingPassengerId;
    return this;
  }

  /**
   * Get bookingPassengerId
   * @return bookingPassengerId
  */
  
  @Schema(name = "bookingPassengerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingPassengerId")
  public Integer getBookingPassengerId() {
    return bookingPassengerId;
  }

  public void setBookingPassengerId(Integer bookingPassengerId) {
    this.bookingPassengerId = bookingPassengerId;
  }

  public TrainAppBookingPassenger bookingId(Integer bookingId) {
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

  public TrainAppBookingPassenger passengerName(String passengerName) {
    this.passengerName = JsonNullable.of(passengerName);
    return this;
  }

  /**
   * Get passengerName
   * @return passengerName
  */
  
  @Schema(name = "passengerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passengerName")
  public JsonNullable<String> getPassengerName() {
    return passengerName;
  }

  public void setPassengerName(JsonNullable<String> passengerName) {
    this.passengerName = passengerName;
  }

  public TrainAppBookingPassenger seatNo(Integer seatNo) {
    this.seatNo = seatNo;
    return this;
  }

  /**
   * Get seatNo
   * @return seatNo
  */
  
  @Schema(name = "seatNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seatNo")
  public Integer getSeatNo() {
    return seatNo;
  }

  public void setSeatNo(Integer seatNo) {
    this.seatNo = seatNo;
  }

  public TrainAppBookingPassenger age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainAppBookingPassenger trainAppBookingPassenger = (TrainAppBookingPassenger) o;
    return Objects.equals(this.bookingPassengerId, trainAppBookingPassenger.bookingPassengerId) &&
        Objects.equals(this.bookingId, trainAppBookingPassenger.bookingId) &&
        equalsNullable(this.passengerName, trainAppBookingPassenger.passengerName) &&
        Objects.equals(this.seatNo, trainAppBookingPassenger.seatNo) &&
        Objects.equals(this.age, trainAppBookingPassenger.age);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingPassengerId, bookingId, hashCodeNullable(passengerName), seatNo, age);
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
    sb.append("class TrainAppBookingPassenger {\n");
    sb.append("    bookingPassengerId: ").append(toIndentedString(bookingPassengerId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    passengerName: ").append(toIndentedString(passengerName)).append("\n");
    sb.append("    seatNo: ").append(toIndentedString(seatNo)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

