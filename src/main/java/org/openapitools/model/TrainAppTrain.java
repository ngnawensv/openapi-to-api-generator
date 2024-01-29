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
 * TrainAppTrain
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TrainAppTrain {

  private Integer trainId;

  private Integer trainNo;

  private JsonNullable<String> trainName = JsonNullable.<String>undefined();

  private Integer departureStationId;

  private Integer arrivalStationId;

  private JsonNullable<String> departureTime = JsonNullable.<String>undefined();

  private JsonNullable<String> arrivalTime = JsonNullable.<String>undefined();

  private JsonNullable<Integer> totalSeats = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime departureDate;

  public TrainAppTrain trainId(Integer trainId) {
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

  public TrainAppTrain trainNo(Integer trainNo) {
    this.trainNo = trainNo;
    return this;
  }

  /**
   * Get trainNo
   * @return trainNo
  */
  
  @Schema(name = "trainNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainNo")
  public Integer getTrainNo() {
    return trainNo;
  }

  public void setTrainNo(Integer trainNo) {
    this.trainNo = trainNo;
  }

  public TrainAppTrain trainName(String trainName) {
    this.trainName = JsonNullable.of(trainName);
    return this;
  }

  /**
   * Get trainName
   * @return trainName
  */
  
  @Schema(name = "trainName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trainName")
  public JsonNullable<String> getTrainName() {
    return trainName;
  }

  public void setTrainName(JsonNullable<String> trainName) {
    this.trainName = trainName;
  }

  public TrainAppTrain departureStationId(Integer departureStationId) {
    this.departureStationId = departureStationId;
    return this;
  }

  /**
   * Get departureStationId
   * @return departureStationId
  */
  
  @Schema(name = "departureStationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("departureStationId")
  public Integer getDepartureStationId() {
    return departureStationId;
  }

  public void setDepartureStationId(Integer departureStationId) {
    this.departureStationId = departureStationId;
  }

  public TrainAppTrain arrivalStationId(Integer arrivalStationId) {
    this.arrivalStationId = arrivalStationId;
    return this;
  }

  /**
   * Get arrivalStationId
   * @return arrivalStationId
  */
  
  @Schema(name = "arrivalStationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrivalStationId")
  public Integer getArrivalStationId() {
    return arrivalStationId;
  }

  public void setArrivalStationId(Integer arrivalStationId) {
    this.arrivalStationId = arrivalStationId;
  }

  public TrainAppTrain departureTime(String departureTime) {
    this.departureTime = JsonNullable.of(departureTime);
    return this;
  }

  /**
   * Get departureTime
   * @return departureTime
  */
  
  @Schema(name = "departureTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("departureTime")
  public JsonNullable<String> getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(JsonNullable<String> departureTime) {
    this.departureTime = departureTime;
  }

  public TrainAppTrain arrivalTime(String arrivalTime) {
    this.arrivalTime = JsonNullable.of(arrivalTime);
    return this;
  }

  /**
   * Get arrivalTime
   * @return arrivalTime
  */
  
  @Schema(name = "arrivalTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arrivalTime")
  public JsonNullable<String> getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(JsonNullable<String> arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public TrainAppTrain totalSeats(Integer totalSeats) {
    this.totalSeats = JsonNullable.of(totalSeats);
    return this;
  }

  /**
   * Get totalSeats
   * @return totalSeats
  */
  
  @Schema(name = "totalSeats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSeats")
  public JsonNullable<Integer> getTotalSeats() {
    return totalSeats;
  }

  public void setTotalSeats(JsonNullable<Integer> totalSeats) {
    this.totalSeats = totalSeats;
  }

  public TrainAppTrain departureDate(OffsetDateTime departureDate) {
    this.departureDate = departureDate;
    return this;
  }

  /**
   * Get departureDate
   * @return departureDate
  */
  @Valid 
  @Schema(name = "departureDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("departureDate")
  public OffsetDateTime getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(OffsetDateTime departureDate) {
    this.departureDate = departureDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainAppTrain trainAppTrain = (TrainAppTrain) o;
    return Objects.equals(this.trainId, trainAppTrain.trainId) &&
        Objects.equals(this.trainNo, trainAppTrain.trainNo) &&
        equalsNullable(this.trainName, trainAppTrain.trainName) &&
        Objects.equals(this.departureStationId, trainAppTrain.departureStationId) &&
        Objects.equals(this.arrivalStationId, trainAppTrain.arrivalStationId) &&
        equalsNullable(this.departureTime, trainAppTrain.departureTime) &&
        equalsNullable(this.arrivalTime, trainAppTrain.arrivalTime) &&
        equalsNullable(this.totalSeats, trainAppTrain.totalSeats) &&
        Objects.equals(this.departureDate, trainAppTrain.departureDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainId, trainNo, hashCodeNullable(trainName), departureStationId, arrivalStationId, hashCodeNullable(departureTime), hashCodeNullable(arrivalTime), hashCodeNullable(totalSeats), departureDate);
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
    sb.append("class TrainAppTrain {\n");
    sb.append("    trainId: ").append(toIndentedString(trainId)).append("\n");
    sb.append("    trainNo: ").append(toIndentedString(trainNo)).append("\n");
    sb.append("    trainName: ").append(toIndentedString(trainName)).append("\n");
    sb.append("    departureStationId: ").append(toIndentedString(departureStationId)).append("\n");
    sb.append("    arrivalStationId: ").append(toIndentedString(arrivalStationId)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
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

