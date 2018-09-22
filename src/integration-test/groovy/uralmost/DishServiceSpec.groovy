package uralmost

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DishServiceSpec extends Specification {

    DishService dishService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Dish(...).save(flush: true, failOnError: true)
        //new Dish(...).save(flush: true, failOnError: true)
        //Dish dish = new Dish(...).save(flush: true, failOnError: true)
        //new Dish(...).save(flush: true, failOnError: true)
        //new Dish(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //dish.id
    }

    void "test get"() {
        setupData()

        expect:
        dishService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Dish> dishList = dishService.list(max: 2, offset: 2)

        then:
        dishList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        dishService.count() == 5
    }

    void "test delete"() {
        Long dishId = setupData()

        expect:
        dishService.count() == 5

        when:
        dishService.delete(dishId)
        sessionFactory.currentSession.flush()

        then:
        dishService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Dish dish = new Dish()
        dishService.save(dish)

        then:
        dish.id != null
    }
}
