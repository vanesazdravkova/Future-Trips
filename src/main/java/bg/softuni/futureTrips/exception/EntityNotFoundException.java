package bg.softuni.futureTrips.exception;

public class EntityNotFoundException extends RuntimeException{

  public EntityNotFoundException(String entity) {
    super(entity + " not found!");
  }
}
