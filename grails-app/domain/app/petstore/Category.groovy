package app.petstore

class Category {

    String catid  
    String name   
    String image  
    String descn  
    String locale 
//          constraint pk_category_details primary key (catid, locale),
//          constraint fk_category_details_1 foreign key (catid)
//          references category (catid))

    static constraints = {
        catid  nullable:false, maxSize:10
        name   nullable:false, maxSize:80
        image  nullable:true,  maxSize:255 
        descn  nullable:true,  maxSize:255 
        locale nullable:true,  maxSize:10  // char(10) not null,
    }
    
    String toString(){ catid }
    void setCatid ( String val ) { catid = val.toUpperCase() }
}
