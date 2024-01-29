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
 * ReqDepartment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ReqDepartment {

  private Integer deptId;

  private String deptName;

  private Integer deptHeadEmpId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public ReqDepartment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReqDepartment(String deptName) {
    this.deptName = deptName;
  }

  public ReqDepartment deptId(Integer deptId) {
    this.deptId = deptId;
    return this;
  }

  /**
   * Get deptId
   * @return deptId
  */
  
  @Schema(name = "deptId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deptId")
  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public ReqDepartment deptName(String deptName) {
    this.deptName = deptName;
    return this;
  }

  /**
   * Get deptName
   * @return deptName
  */
  @NotNull 
  @Schema(name = "deptName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deptName")
  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public ReqDepartment deptHeadEmpId(Integer deptHeadEmpId) {
    this.deptHeadEmpId = deptHeadEmpId;
    return this;
  }

  /**
   * Get deptHeadEmpId
   * @return deptHeadEmpId
  */
  
  @Schema(name = "deptHeadEmpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deptHeadEmpId")
  public Integer getDeptHeadEmpId() {
    return deptHeadEmpId;
  }

  public void setDeptHeadEmpId(Integer deptHeadEmpId) {
    this.deptHeadEmpId = deptHeadEmpId;
  }

  public ReqDepartment createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqDepartment reqDepartment = (ReqDepartment) o;
    return Objects.equals(this.deptId, reqDepartment.deptId) &&
        Objects.equals(this.deptName, reqDepartment.deptName) &&
        Objects.equals(this.deptHeadEmpId, reqDepartment.deptHeadEmpId) &&
        equalsNullable(this.createdDate, reqDepartment.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deptId, deptName, deptHeadEmpId, hashCodeNullable(createdDate));
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
    sb.append("class ReqDepartment {\n");
    sb.append("    deptId: ").append(toIndentedString(deptId)).append("\n");
    sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
    sb.append("    deptHeadEmpId: ").append(toIndentedString(deptHeadEmpId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

