package lesson27.smallapp.repository;


import lesson27.smallapp.model.User;

public interface UserRepository extends UniversalRepository<User, Long> {
    Long findMaxId();

}
