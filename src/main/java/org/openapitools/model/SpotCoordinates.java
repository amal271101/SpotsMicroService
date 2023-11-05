package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SpotCoordinates
 */

@JsonTypeName("Spot_coordinates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-05T15:20:58.426985Z[Etc/UTC]")
public class SpotCoordinates {

  private BigDecimal latitude;

  private BigDecimal longitude;

  public SpotCoordinates latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude of the spot
   * @return latitude
  */
  @Valid 
  @Schema(name = "latitude", description = "Latitude of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public SpotCoordinates longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude of the spot
   * @return longitude
  */
  @Valid 
  @Schema(name = "longitude", description = "Longitude of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpotCoordinates spotCoordinates = (SpotCoordinates) o;
    return Objects.equals(this.latitude, spotCoordinates.latitude) &&
        Objects.equals(this.longitude, spotCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

