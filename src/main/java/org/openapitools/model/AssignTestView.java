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
 * AssignTestView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class AssignTestView {

  private JsonNullable<String> registrationCode = JsonNullable.<String>undefined();

  private Integer testId;

  public AssignTestView registrationCode(String registrationCode) {
    this.registrationCode = JsonNullable.of(registrationCode);
    return this;
  }

  /**
   * Get registrationCode
   * @return registrationCode
  */
  
  @Schema(name = "registrationCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationCode")
  public JsonNullable<String> getRegistrationCode() {
    return registrationCode;
  }

  public void setRegistrationCode(JsonNullable<String> registrationCode) {
    this.registrationCode = registrationCode;
  }

  public AssignTestView testId(Integer testId) {
    this.testId = testId;
    return this;
  }

  /**
   * Get testId
   * @return testId
  */
  
  @Schema(name = "testId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testId")
  public Integer getTestId() {
    return testId;
  }

  public void setTestId(Integer testId) {
    this.testId = testId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignTestView assignTestView = (AssignTestView) o;
    return equalsNullable(this.registrationCode, assignTestView.registrationCode) &&
        Objects.equals(this.testId, assignTestView.testId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(registrationCode), testId);
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
    sb.append("class AssignTestView {\n");
    sb.append("    registrationCode: ").append(toIndentedString(registrationCode)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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

