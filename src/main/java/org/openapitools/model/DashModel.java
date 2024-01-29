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
 * DashModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class DashModel {

  private Integer totEnquiry;

  private Integer totResortBooking;

  private Integer totCustomer;

  private Integer totRoom;

  private Integer totRoomBooking;

  private Integer totWeddingBooking;

  public DashModel totEnquiry(Integer totEnquiry) {
    this.totEnquiry = totEnquiry;
    return this;
  }

  /**
   * Get totEnquiry
   * @return totEnquiry
  */
  
  @Schema(name = "TotEnquiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotEnquiry")
  public Integer getTotEnquiry() {
    return totEnquiry;
  }

  public void setTotEnquiry(Integer totEnquiry) {
    this.totEnquiry = totEnquiry;
  }

  public DashModel totResortBooking(Integer totResortBooking) {
    this.totResortBooking = totResortBooking;
    return this;
  }

  /**
   * Get totResortBooking
   * @return totResortBooking
  */
  
  @Schema(name = "TotResortBooking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotResortBooking")
  public Integer getTotResortBooking() {
    return totResortBooking;
  }

  public void setTotResortBooking(Integer totResortBooking) {
    this.totResortBooking = totResortBooking;
  }

  public DashModel totCustomer(Integer totCustomer) {
    this.totCustomer = totCustomer;
    return this;
  }

  /**
   * Get totCustomer
   * @return totCustomer
  */
  
  @Schema(name = "TotCustomer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotCustomer")
  public Integer getTotCustomer() {
    return totCustomer;
  }

  public void setTotCustomer(Integer totCustomer) {
    this.totCustomer = totCustomer;
  }

  public DashModel totRoom(Integer totRoom) {
    this.totRoom = totRoom;
    return this;
  }

  /**
   * Get totRoom
   * @return totRoom
  */
  
  @Schema(name = "TotRoom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotRoom")
  public Integer getTotRoom() {
    return totRoom;
  }

  public void setTotRoom(Integer totRoom) {
    this.totRoom = totRoom;
  }

  public DashModel totRoomBooking(Integer totRoomBooking) {
    this.totRoomBooking = totRoomBooking;
    return this;
  }

  /**
   * Get totRoomBooking
   * @return totRoomBooking
  */
  
  @Schema(name = "TotRoomBooking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotRoomBooking")
  public Integer getTotRoomBooking() {
    return totRoomBooking;
  }

  public void setTotRoomBooking(Integer totRoomBooking) {
    this.totRoomBooking = totRoomBooking;
  }

  public DashModel totWeddingBooking(Integer totWeddingBooking) {
    this.totWeddingBooking = totWeddingBooking;
    return this;
  }

  /**
   * Get totWeddingBooking
   * @return totWeddingBooking
  */
  
  @Schema(name = "TotWeddingBooking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotWeddingBooking")
  public Integer getTotWeddingBooking() {
    return totWeddingBooking;
  }

  public void setTotWeddingBooking(Integer totWeddingBooking) {
    this.totWeddingBooking = totWeddingBooking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashModel dashModel = (DashModel) o;
    return Objects.equals(this.totEnquiry, dashModel.totEnquiry) &&
        Objects.equals(this.totResortBooking, dashModel.totResortBooking) &&
        Objects.equals(this.totCustomer, dashModel.totCustomer) &&
        Objects.equals(this.totRoom, dashModel.totRoom) &&
        Objects.equals(this.totRoomBooking, dashModel.totRoomBooking) &&
        Objects.equals(this.totWeddingBooking, dashModel.totWeddingBooking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totEnquiry, totResortBooking, totCustomer, totRoom, totRoomBooking, totWeddingBooking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashModel {\n");
    sb.append("    totEnquiry: ").append(toIndentedString(totEnquiry)).append("\n");
    sb.append("    totResortBooking: ").append(toIndentedString(totResortBooking)).append("\n");
    sb.append("    totCustomer: ").append(toIndentedString(totCustomer)).append("\n");
    sb.append("    totRoom: ").append(toIndentedString(totRoom)).append("\n");
    sb.append("    totRoomBooking: ").append(toIndentedString(totRoomBooking)).append("\n");
    sb.append("    totWeddingBooking: ").append(toIndentedString(totWeddingBooking)).append("\n");
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

