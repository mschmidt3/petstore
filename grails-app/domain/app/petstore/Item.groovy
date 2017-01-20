package app.petstore

class Item {
          String     itemid         
          Product    product
          BigDecimal listprice  
          BigDecimal unitcost   
          String     locale         
          String     image          
          String     descn 
          String     attr1 
          String     attr2 
          String     attr3 
          String     attr4 
          String     attr5 
//          constraint pk_item_details primary key (itemid, locale),
//              constraint fk_item_details_1 foreign key (itemid)
//              references item (itemid)

    static constraints = {
          itemid       nullable:false, maxSize:10
          listprice    nullable:false  
          unitcost     nullable:false 
          locale       nullable:true,  maxSize:10 
          image        nullable:true,  maxSize:255 
          descn        nullable:true,  maxSize:255
          attr1        nullable:true,  maxSize:80 
          attr2        nullable:true,  maxSize:80 
          attr3        nullable:true,  maxSize:80 
          attr4        nullable:true,  maxSize:80 
          attr5        nullable:true,  maxSize:80 
    }

    String toString(){ itemid }
    void setItemid ( String val ) { itemid = val.toUpperCase() }
}
