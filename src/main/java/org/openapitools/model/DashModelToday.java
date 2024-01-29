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
 * DashModelToday
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class DashModelToday {

  private Integer todayEnquiry;

  private Integer todayWVisit;

  private Integer todayRVisit;

  private Integer todayVisit;

  private Integer todayWedding;

  private Integer todayFoodOrder;

  public DashModelToday todayEnquiry(Integer todayEnquiry) {
    this.todayEnquiry = todayEnquiry;
    return this;
  }

  /**
   * Get todayEnquiry
   * @return todayEnquiry
  */
  
  @Schema(name = "TodayEnquiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayEnquiry")
  public Integer getTodayEnquiry() {
    return todayEnquiry;
  }

  public void setTodayEnquiry(Integer todayEnquiry) {
    this.todayEnquiry = todayEnquiry;
  }

  public DashModelToday todayWVisit(Integer todayWVisit) {
    this.todayWVisit = todayWVisit;
    return this;
  }

  /**
   * Get todayWVisit
   * @return todayWVisit
  */
  
  @Schema(name = "TodayWVisit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayWVisit")
  public Integer getTodayWVisit() {
    return todayWVisit;
  }

  public void setTodayWVisit(Integer todayWVisit) {
    this.todayWVisit = todayWVisit;
  }

  public DashModelToday todayRVisit(Integer todayRVisit) {
    this.todayRVisit = todayRVisit;
    return this;
  }

  /**
   * Get todayRVisit
   * @return todayRVisit
  */
  
  @Schema(name = "TodayRVisit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayRVisit")
  public Integer getTodayRVisit() {
    return todayRVisit;
  }

  public void setTodayRVisit(Integer todayRVisit) {
    this.todayRVisit = todayRVisit;
  }

  public DashModelToday todayVisit(Integer todayVisit) {
    this.todayVisit = todayVisit;
    return this;
  }

  /**
   * Get todayVisit
   * @return todayVisit
  */
  
  @Schema(name = "TodayVisit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayVisit")
  public Integer getTodayVisit() {
    return todayVisit;
  }

  public void setTodayVisit(Integer todayVisit) {
    this.todayVisit = todayVisit;
  }

  public DashModelToday todayWedding(Integer todayWedding) {
    this.todayWedding = todayWedding;
    return this;
  }

  /**
   * Get todayWedding
   * @return todayWedding
  */
  
  @Schema(name = "TodayWedding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayWedding")
  public Integer getTodayWedding() {
    return todayWedding;
  }

  public void setTodayWedding(Integer todayWedding) {
    this.todayWedding = todayWedding;
  }

  public DashModelToday todayFoodOrder(Integer todayFoodOrder) {
    this.todayFoodOrder = todayFoodOrder;
    return this;
  }

  /**
   * Get todayFoodOrder
   * @return todayFoodOrder
  */
  
  @Schema(name = "TodayFoodOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TodayFoodOrder")
  public Integer getTodayFoodOrder() {
    return todayFoodOrder;
  }

  public void setTodayFoodOrder(Integer todayFoodOrder) {
    this.todayFoodOrder = todayFoodOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashModelToday dashModelToday = (DashModelToday) o;
    return Objects.equals(this.todayEnquiry, dashModelToday.todayEnquiry) &&
        Objects.equals(this.todayWVisit, dashModelToday.todayWVisit) &&
        Objects.equals(this.todayRVisit, dashModelToday.todayRVisit) &&
        Objects.equals(this.todayVisit, dashModelToday.todayVisit) &&
        Objects.equals(this.todayWedding, dashModelToday.todayWedding) &&
        Objects.equals(this.todayFoodOrder, dashModelToday.todayFoodOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(todayEnquiry, todayWVisit, todayRVisit, todayVisit, todayWedding, todayFoodOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashModelToday {\n");
    sb.append("    todayEnquiry: ").append(toIndentedString(todayEnquiry)).append("\n");
    sb.append("    todayWVisit: ").append(toIndentedString(todayWVisit)).append("\n");
    sb.append("    todayRVisit: ").append(toIndentedString(todayRVisit)).append("\n");
    sb.append("    todayVisit: ").append(toIndentedString(todayVisit)).append("\n");
    sb.append("    todayWedding: ").append(toIndentedString(todayWedding)).append("\n");
    sb.append("    todayFoodOrder: ").append(toIndentedString(todayFoodOrder)).append("\n");
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

