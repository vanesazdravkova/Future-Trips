package bg.softuni.futureTrips.data;

public class GetFutureTripDTO {

  private Long id;
  private String name;
  private String destination;
  private String company;
  private Integer days;
  private Integer price;

  public Long getId() {
    return id;
  }

  public GetFutureTripDTO setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetFutureTripDTO setName(String name) {
    this.name = name;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public GetFutureTripDTO setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public GetFutureTripDTO setCompany(String company) {
    this.company = company;
    return this;
  }

  public Integer getDays() {
    return days;
  }

  public GetFutureTripDTO setDays(Integer days) {
    this.days = days;
    return this;
  }

  public Integer getPrice() {
    return price;
  }

  public GetFutureTripDTO setPrice(Integer price) {
    this.price = price;
    return this;
  }
}
