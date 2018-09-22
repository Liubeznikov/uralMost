package uralmost

import grails.gorm.services.Service

@Service(Dish)
interface DishService {

    Dish get(Serializable id)

    List<Dish> list(Map args)

    Long count()

    void delete(Serializable id)

    Dish save(Dish dish)

}