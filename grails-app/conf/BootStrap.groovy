import demo.*
class BootStrap {

    def init = { servletContext ->

		(0..10).each{
			def q = new Quiz(name: "test $it", description : "desc $it").save()
			(0..5).each{

			new Question(body: "question $it", quiz: q).save()
			}
		}
    }
    def destroy = {
    }
}
