package uralmost

import grails.converters.JSON

class DishController {
    static scaffold = Dish

    def findAllBy(int price){
        def dishes = Dish.findAll()
        return render(dishes) as JSON
    }
}
