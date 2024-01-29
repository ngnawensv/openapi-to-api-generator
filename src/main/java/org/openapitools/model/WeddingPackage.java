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
 * WeddingPackage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingPackage {

  private Integer weddingPackageId;

  private JsonNullable<String> packageName = JsonNullable.<String>undefined();

  private Double withFoodCost;

  private Double withoutFoodCost;

  private Double perPersonCost;

  private JsonNullable<String> rangeOfPeoples = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Boolean isDeleted;

  public WeddingPackage weddingPackageId(Integer weddingPackageId) {
    this.weddingPackageId = weddingPackageId;
    return this;
  }

  /**
   * Get weddingPackageId
   * @return weddingPackageId
  */
  
  @Schema(name = "WeddingPackageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingPackageId")
  public Integer getWeddingPackageId() {
    return weddingPackageId;
  }

  public void setWeddingPackageId(Integer weddingPackageId) {
    this.weddingPackageId = weddingPackageId;
  }

  public WeddingPackage packageName(String packageName) {
    this.packageName = JsonNullable.of(packageName);
    return this;
  }

  /**
   * Get packageName
   * @return packageName
  */
  
  @Schema(name = "PackageName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageName")
  public JsonNullable<String> getPackageName() {
    return packageName;
  }

  public void setPackageName(JsonNullable<String> packageName) {
    this.packageName = packageName;
  }

  public WeddingPackage withFoodCost(Double withFoodCost) {
    this.withFoodCost = withFoodCost;
    return this;
  }

  /**
   * Get withFoodCost
   * @return withFoodCost
  */
  
  @Schema(name = "WithFoodCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WithFoodCost")
  public Double getWithFoodCost() {
    return withFoodCost;
  }

  public void setWithFoodCost(Double withFoodCost) {
    this.withFoodCost = withFoodCost;
  }

  public WeddingPackage withoutFoodCost(Double withoutFoodCost) {
    this.withoutFoodCost = withoutFoodCost;
    return this;
  }

  /**
   * Get withoutFoodCost
   * @return withoutFoodCost
  */
  
  @Schema(name = "WithoutFoodCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WithoutFoodCost")
  public Double getWithoutFoodCost() {
    return withoutFoodCost;
  }

  public void setWithoutFoodCost(Double withoutFoodCost) {
    this.withoutFoodCost = withoutFoodCost;
  }

  public WeddingPackage perPersonCost(Double perPersonCost) {
    this.perPersonCost = perPersonCost;
    return this;
  }

  /**
   * Get perPersonCost
   * @return perPersonCost
  */
  
  @Schema(name = "PerPersonCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PerPersonCost")
  public Double getPerPersonCost() {
    return perPersonCost;
  }

  public void setPerPersonCost(Double perPersonCost) {
    this.perPersonCost = perPersonCost;
  }

  public WeddingPackage rangeOfPeoples(String rangeOfPeoples) {
    this.rangeOfPeoples = JsonNullable.of(rangeOfPeoples);
    return this;
  }

  /**
   * Get rangeOfPeoples
   * @return rangeOfPeoples
  */
  
  @Schema(name = "RangeOfPeoples", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RangeOfPeoples")
  public JsonNullable<String> getRangeOfPeoples() {
    return rangeOfPeoples;
  }

  public void setRangeOfPeoples(JsonNullable<String> rangeOfPeoples) {
    this.rangeOfPeoples = rangeOfPeoples;
  }

  public WeddingPackage description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public WeddingPackage createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public WeddingPackage isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  
  @Schema(name = "IsDeleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingPackage weddingPackage = (WeddingPackage) o;
    return Objects.equals(this.weddingPackageId, weddingPackage.weddingPackageId) &&
        equalsNullable(this.packageName, weddingPackage.packageName) &&
        Objects.equals(this.withFoodCost, weddingPackage.withFoodCost) &&
        Objects.equals(this.withoutFoodCost, weddingPackage.withoutFoodCost) &&
        Objects.equals(this.perPersonCost, weddingPackage.perPersonCost) &&
        equalsNullable(this.rangeOfPeoples, weddingPackage.rangeOfPeoples) &&
        equalsNullable(this.description, weddingPackage.description) &&
        Objects.equals(this.createdDate, weddingPackage.createdDate) &&
        Objects.equals(this.isDeleted, weddingPackage.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(weddingPackageId, hashCodeNullable(packageName), withFoodCost, withoutFoodCost, perPersonCost, hashCodeNullable(rangeOfPeoples), hashCodeNullable(description), createdDate, isDeleted);
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
    sb.append("class WeddingPackage {\n");
    sb.append("    weddingPackageId: ").append(toIndentedString(weddingPackageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    withFoodCost: ").append(toIndentedString(withFoodCost)).append("\n");
    sb.append("    withoutFoodCost: ").append(toIndentedString(withoutFoodCost)).append("\n");
    sb.append("    perPersonCost: ").append(toIndentedString(perPersonCost)).append("\n");
    sb.append("    rangeOfPeoples: ").append(toIndentedString(rangeOfPeoples)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

