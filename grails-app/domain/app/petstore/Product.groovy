package app.petstore

class Product {
    String   productid 
    Category category 
    String   locale 
    String   name 
    String   image 
    String   descn

    static constraints = {
        productid     nullable:false, maxSize:10
        locale        nullable:true,  maxSize:10 
        name          nullable:true,  maxSize:80
        image         nullable:true,  maxSize:255 
        descn         nullable:true,  maxSize:255 
//     constraint pk_product_details primary key (productid, locale),
//         constraint fk_product_details_1 foreign key (productid)
//        references product (productid))
    }

    String toString(){ productid }
    void setProductid ( String val ) { productid = val.toUpperCase() }
}
