class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

//		"/"(view:"/index")    // standard mapping
    "/"(controller: "admin", action: "index")    // Make default view Admin Index and let Admin Filter handle authentication
		"500"(view:'/error')
	}
}
