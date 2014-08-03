class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

		"/api/$action?(.$format)" (version: '1.0', namespace: 'v1', controller: 'demo')
		"/api/$action?(.$format)" (version: '2.0', namespace: 'v2', controller: 'demo')


		'/mvc/test'(uri:"/mvc/test.dispatch")
	}
}
