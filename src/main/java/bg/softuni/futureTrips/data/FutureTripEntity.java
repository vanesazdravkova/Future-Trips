package bg.softuni.futureTrips.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "future_trips")
public class FutureTripEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "The name cannot be empty.")
  private String name;

  @NotBlank(message = "The destination cannot be empty.")
  private String destination;

  @NotBlank(message = "The company cannot be empty.")
  private String company;

  @NotNull
  @Positive
  private Integer days;

  @NotNull
  @Positive
  private Integer price;

  public Long getId() {
    return id;
  }

  public FutureTripEntity setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public FutureTripEntity setName(String name) {
    this.name = name;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public FutureTripEntity setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public FutureTripEntity setCompany(String company) {
    this.company = company;
    return this;
  }

  public Integer getDays() {
    return days;
  }

  public FutureTripEntity setDays(Integer days) {
    this.days = days;
    return this;
  }

  public Integer getPrice() {
    return price;
  }

  public FutureTripEntity setPrice(Integer price) {
    this.price = price;
    return this;
  }
}
