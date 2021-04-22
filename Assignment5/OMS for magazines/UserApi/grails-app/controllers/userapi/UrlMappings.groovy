package userapi

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/products"(controller:"User", action: "products")
        "/save"(controller:"User", action: "save")

        "/"(view:"/index")
        "/customer"(view:"/customer")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
