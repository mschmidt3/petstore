package petstore
import app.petstore.*

class BootStrap {

    def init = { servletContext ->
        [
          [catid:'CAT',  name: 'Cats'],
          [catid:'DOG',  name: 'Dogs'],
          [catid:'BIRD', name: 'Birds'],
          [catid:'fish', name: 'Fish'],
          [catid:'rept', name: 'Reptiles'],
        ].each{
            new Category(it).save flush:true
        }
    }
    def destroy = {
    }
}
