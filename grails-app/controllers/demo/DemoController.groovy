package demo
import grails.converters.JSON

class DemoController{
	static namespace = 'v1'

	def myService
	def oldSpringService
	def springSecurityService
	def action(DemoCommand cmd){

		println cmd
		if(cmd.hasErrors()){
			throw new IllegalArgumentException()
		}
		Map result = [key: "value"]
		render text: result, contentType: 'application/json', code: 200
	}

	def handleIllegalArgumentException(IllegalArgumentException e){
		withFormat{

			json{
				response.setContentType "application/json; charset=utf-8"
                response.status = 500
				render new ResponseVO(msg: "wrong arg", code: 400) as JSON
			}
			'*'{
				render "Wrong arguments passed"	
			}

		}	
	}

	def useService(){
		render myService.method()
	}
	def useOldSpring(){
		render oldSpringService.hello()
	}
	def currentUser(){
		def user = springSecurityService.currentUser
		render user
	}
}
