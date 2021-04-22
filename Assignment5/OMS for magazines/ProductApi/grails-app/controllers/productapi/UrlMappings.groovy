package productapi

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/product"(controller:"Product", action: "saveProduct")
        "/product/$id"(controller:"Product", action:[DELETE:"deleteProduct",GET:"getProduct"])
        "/allproducts"(controller:"Product", action: "allProducts")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
